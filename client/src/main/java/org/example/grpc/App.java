package org.example.grpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) throws InterruptedException {

        CountDownLatch finishLatch = new CountDownLatch(1);
        int firstValue = 0;
        int lastValue = 30;
        AtomicInteger[] currentVal = {new AtomicInteger(0)};
        ManagedChannel channel = ManagedChannelBuilder.forTarget("localhost:8080")
                .usePlaintext()
                .build();

        logger.info("Клиент запущен.");

        NumberServiceGrpc.NumberServiceStub stub = NumberServiceGrpc.newStub(channel);

        NumberServiceOuterClass.Request request = NumberServiceOuterClass.Request.newBuilder()
                .setFirstValue(firstValue)
                .setLastValue(lastValue)
                .build();


        stub.generateNumbers(request, new StreamObserver<NumberServiceOuterClass.Response>() {
            @Override
            public void onNext(NumberServiceOuterClass.Response response) {
                if (response.getGenerateValue() == 0) {
                    currentVal[0].incrementAndGet();
                } else {
                    currentVal[0].set(currentVal[0].getAndIncrement() + response.getGenerateValue());
                }
                logger.info("new value: {}", response.getGenerateValue());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                logger.info("currentVal: {}", currentVal);
            }

            @Override
            public void onError(Throwable throwable) {
                logger.error("Error occurred, cause {}", throwable.getMessage());
                finishLatch.countDown();
            }

            @Override
            public void onCompleted() {
                logger.info("Stream completed");
                finishLatch.countDown();
            }
        });

        finishLatch.await(1, TimeUnit.MINUTES);
        channel.shutdownNow();
    }
}

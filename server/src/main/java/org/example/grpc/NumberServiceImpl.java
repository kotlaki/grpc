package org.example.grpc;

import io.grpc.stub.StreamObserver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.stream.IntStream;

public class NumberServiceImpl extends NumberServiceGrpc.NumberServiceImplBase {

    private static final Logger logger = LoggerFactory.getLogger(NumberServiceImpl.class);

    @Override
    public void generateNumbers(NumberServiceOuterClass.Request request, StreamObserver<NumberServiceOuterClass.Response> responseObserver) {
        logger.info("Получен запрос: firstValue = {}, lastValue = {}", request.getFirstValue(), request.getLastValue());

        IntStream.range(request.getFirstValue() + 1, request.getLastValue())
                .forEach(s -> {
                            NumberServiceOuterClass.Response response = NumberServiceOuterClass.Response.newBuilder()
                                    .setGenerateValue(s)
                                    .build();
                            logger.info("Отправленно число: {}", s);
                            responseObserver.onNext(response);
                            try {
                                Thread.sleep(2000);
                            } catch (InterruptedException e) {
                                logger.error("Произошла ошибка при отправке");
                                throw new RuntimeException(e);
                            }
                        }
                );
        responseObserver.onCompleted();
    }
}

package org.example.grpc;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) throws IOException, InterruptedException {

        Server server = ServerBuilder.forPort(8080)
                .addService(new NumberServiceImpl())
                .build();

        server.start();
        logger.info("Сервер запущен на порту: {}", server.getPort());
        server.awaitTermination();
    }
}

package com.kone.pbdemo.test;

import com.kone.pbdemo.service.TestCertChainImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;

/**
 * @author Kone
 * @date 2022/2/7
 */
public class PbServer {
    public static void main(String[] args) throws Exception {
        int port = 9091;
        Server server = ServerBuilder
                .forPort(port)
                .addService(new TestCertChainImpl())
                .build()
                .start();
        System.out.println("server started, port : " + port);
        server.awaitTermination();
    }
}

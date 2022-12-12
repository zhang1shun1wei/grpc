package com.kone.pbdemo.service;

import com.google.protobuf.ByteString;
import com.google.protobuf.Empty;
import com.kone.pbdemo.protocol.Para;
import com.kone.pbdemo.protocol.Para2;
import com.kone.pbdemo.protocol.TestCertChainGrpc;
import io.grpc.stub.StreamObserver;

import java.io.UnsupportedEncodingException;

public class TestCertChainImpl extends TestCertChainGrpc.TestCertChainImplBase {

    @Override
    public void generateSignature(Para2 request, StreamObserver<Para2> responseObserver) {
        byte[] bytes = request.getArr().toByteArray();
        String s = null;
        try {
            s = new String(bytes,"UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("-------------------------->" + s);
        String value = "zsw**********";
        try {
            byte[] bytes1 = value.getBytes("UTF-8");
            Para2 para2 = Para2.newBuilder()
                    .setArr(ByteString.copyFrom(bytes1))
                    .build();
            responseObserver.onNext(para2);
            responseObserver.onCompleted();
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void getIdentityCert(Empty request, StreamObserver<Para> responseObserver) {
        Para para = Para.newBuilder()
                .setCert("zsw&&&&&&&&&&&&&&&&&")
                .build();
        responseObserver.onNext(para);
        responseObserver.onCompleted();
    }

    @Override
    public void getX509CertChain(Empty request, StreamObserver<Para> responseObserver) {
        Para para = Para.newBuilder()
                .setCert("zsw&&&&&&&&&&&&&&&&&")
                .build();
        responseObserver.onNext(para);
        responseObserver.onCompleted();
    }

}

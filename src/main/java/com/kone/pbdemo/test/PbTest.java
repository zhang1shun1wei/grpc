package com.kone.pbdemo.test;

import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import com.kone.pbdemo.protocol.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.io.UnsupportedEncodingException;
import java.util.Iterator;

/**
 * @author Kone
 * @date 2022/1/29
 */
public class PbTest {
    public static void main(String[] args) {
        FileOuterClass.File file = FileOuterClass.File.newBuilder()
                .setName("fileName")
                .setSize(200)
                .build();

        Para2 para2;
        String s = "zsw1111kkkk";
        try {
            byte[] bytes = s.getBytes("UTF-8");
            para2 = Para2.newBuilder()
                    .setArr(ByteString.copyFrom(bytes))
                    .build();
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }


        try {
            FileOuterClass.File fileNew = FileOuterClass.File.parseFrom(file.toByteArray());
            System.out.println(fileNew);
        } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
        }

        String host = "127.0.0.1";
        int port = 9091;
        ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();


        TestCertChainGrpc.TestCertChainBlockingStub testCertChainBlockingStub = TestCertChainGrpc.newBlockingStub(channel);
        Para2 para21 = testCertChainBlockingStub.generateSignature(para2);
        byte[] bytes = para21.getArr().toByteArray();
        try {
            String value = new String(bytes, "UTF-8");
            System.out.printf("&&&&&&&&&&&&&&&&&&---->" + value + "\n");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }

        channel.shutdown();
    }
}

package com.wangcan.design.pattern.decorator;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * @author: wangcan
 * @date: 2021/7/4 10:41
 */
public class DecoratorTest {

    public static void main(String[] args) {
//        public class BufferedReader extends Reader
//        BufferedReader in = new BufferedReader(new FileReader("filename.txt"));
//        String s = in.readLine();

        IRead read=new XmlRead();
        XmlCacheReadDecorator readDecorator=new XmlCacheReadDecorator(read);
        readDecorator.read();
    }
}

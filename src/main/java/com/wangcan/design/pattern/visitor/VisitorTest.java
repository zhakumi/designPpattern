package com.wangcan.design.pattern.visitor;

/**
 * @Author: wangcan
 * @Date: 2021/7/8 19:51
 */
public class VisitorTest {

    public static void main(String[] args) {
        Computer computer=new Computer();
        ComputerPartDisplayVisitor visitor=new ComputerPartDisplayVisitor();
        computer.accept(visitor);
    }
}

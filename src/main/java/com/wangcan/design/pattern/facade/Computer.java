package com.wangcan.design.pattern.facade;

/**
 * @author: wangcan
 * @date: 2021/7/4 16:52
 */
public class Computer {

    private Cpu cpu;
    private Memory memory;

    public Computer(Cpu cpu, Memory memory) {
        this.cpu = cpu;
        this.memory = memory;
    }

    public void start() {

        this.cpu.start();
        this.memory.start();
        System.out.println("computer start");
    }

    public static void main(String[] args) {
        Cpu cpu = new Cpu();
        Memory memory = new Memory();
        Computer computer = new Computer(cpu, memory);
        computer.start();
    }
}

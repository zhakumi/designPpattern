package com.wangcan.design.pattern.factory;

/**
 * @author: wangcan
 * @date: 2021/7/3 13:54
 */
public class Singleton {

    private static Singleton singleton = null;

    private Singleton() {

    }

    /**
     * synchronized关键字锁住的是这个对象，这样的用法，在性能上会有所下降，因为每次调用getInstance()，都要对对象上锁，
     * 事实上，只有在第一次创建对象的时候需要加锁，之后就不需要了
     *
     * @return
     */
//    public static synchronized Singleton getSingleton() {
//        if (singleton == null) {
//            singleton = new Singleton();
//        }
//        return singleton;
//    }

    /**
     * 想对比上面 在进入方法之后 且singleton==null的情况下加锁，如果不是null 就不会加锁 但是 singleton = new
     * Singleton();在Java指令中创建对象和赋值操作是分开进行的  JVM执行不保证顺序 有可能先从内存中创建了singleton
     * 并赋值给singleton，再去初始化，此时就会出问题 AB 线程并发，A 先加锁，执行singleton = new Singleton(); 并没有初始化 B线程加锁后
     * 发现singleton 已经有了，直接去用 但是没有初始化
     *
     * @return
     */
//    public static Singleton getSingleton() {
//        if (singleton == null) {
//            synchronized (singleton) {
//                if (singleton == null) {
//                    singleton = new Singleton();
//                }
//            }
//        }
//        return singleton;
//    }

    /**
     * singleton = new Singleton() 优化 加锁最终实现
     *
     * @return
     */
    public static Singleton getSingleton() {
        if (singleton == null) {
            synchronizedInit();
        }
        return singleton;
    }

    /**
     * 初始化方法加锁 让创建和赋值同步，synchronized 可以让JVM 不做乱序执行
     */
    private static synchronized void synchronizedInit() {
        if (singleton == null) {
            singleton = new Singleton();
        }
    }

    /**
     * 静态内部类方式 JVM内部的机制能够保证当一个类被加载的时候，这个类的加载过程是线程互斥的。 这样当我们第一次调用getInstance的时候，JVM能够帮我们保证instance只被创建一次，
     * 并且会保证把赋值给instance的内存初始化完毕，这样我们就不用担心上面的问题。 缺点：第一次加载就初始化了，不是按需加载，静态类不能实现接口 单例 可以实现接口 拓展，可以按需加载
     */
    private static class SingletonFactory {

        private static final Singleton instance = new Singleton();
    }

//    public static Singleton getSingleton() {
//        return SingletonFactory.instance;
//    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Singleton.getSingleton());
                }
            }).run();
        }
    }
}

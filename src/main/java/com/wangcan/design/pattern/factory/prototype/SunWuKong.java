package com.wangcan.design.pattern.factory.prototype;

/**
 * @author: wangcan
 * @date: 2021/7/3 16:57
 */
public class SunWuKong implements Cloneable {

    private Stick stick;
    private Cap cap;

    public SunWuKong(Stick stick, Cap cap) {
        this.stick = stick;
        this.cap = cap;
        System.out.println("i am swk");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("孙悟空复制成功！");
        // 潜复制 没有包含cap
        SunWuKong sunWuKong = (SunWuKong) super.clone();
        // 深复制
        sunWuKong.cap = (Cap) cap.clone();
        return sunWuKong;
    }

    public Stick getStick() {
        return stick;
    }

    public Cap getCap() {
        return cap;
    }

    /**
     * 用孙悟空 复制小猴子
     *
     * @param args
     * @throws CloneNotSupportedException
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        Stick stick = new Stick();
        Cap cap = new Cap();
        SunWuKong sunWuKong = new SunWuKong(stick, cap);
        SunWuKong monk1 = (SunWuKong) sunWuKong.clone();
        SunWuKong monk2 = (SunWuKong) sunWuKong.clone();
        System.out.println("monk1 equals sunwukong:" + sunWuKong.equals(monk1));
        System.out.println("monk2 equals sunwukong:" + sunWuKong.equals(monk2));
        System.out.println(
            "monk2 浅复制 棍子 equals sunwukong 棍子:" + sunWuKong.getStick().equals(monk2.getStick()));
        System.out.println(
            "monk2 深复制 帽子 equals sunwukong 帽子:" + sunWuKong.getCap().equals(monk2.getCap()));
    }
}

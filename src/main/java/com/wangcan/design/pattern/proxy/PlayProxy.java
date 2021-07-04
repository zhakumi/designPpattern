package com.wangcan.design.pattern.proxy;

/**
 * @author: wangcan
 * @date: 2021/7/4 8:17 男孩代理类
 */
public class PlayProxy implements IPlay{

    private IPlay iPlay;

    public PlayProxy(IPlay iPlay) {
        this.iPlay = iPlay;
    }

    @Override
    public void play() {
        befor();
        iPlay.play();
        after();
    }

    private void befor() {
        System.out.println("befor");
    }
    private void after() {
        System.out.println("after");
    }

    public static void main(String[] args) {
        IPlay play=new Boy();
        PlayProxy proxy=new PlayProxy(play);
        proxy.play();
    }
}

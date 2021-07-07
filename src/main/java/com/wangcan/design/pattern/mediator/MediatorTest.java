package com.wangcan.design.pattern.mediator;

/**
 * @Author: wangcan
 * @Date: 2021/7/7 9:44
 */
public class MediatorTest {

    public static void main(String[] args) {

        WTOMediator wtoMediator = new WTOMediator();
        China chain = new China(wtoMediator);
        American american = new American(wtoMediator);
        wtoMediator.setAmerican(american);
        wtoMediator.setChina(chain);

        chain.send("fuck", american);
        chain.send("yes", chain);

    }
}

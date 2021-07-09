package com.wangcan.design.pattern.observe.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * @author: wangcan
 * @date: 2021/7/7 21:35
 */
public class EmailSendObserver implements Observer {

    private String newspaperName = "email";

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("'" + newspaperName + "'读取拉取信息:" + ((MessageObservable)o).getMessage());
    }
}

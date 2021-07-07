package com.wangcan.design.pattern.observe;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: wangcan
 * @date: 2021/7/7 21:45
 */
public abstract class AbstractMessageObservable {
    List<IMessageSendObserve> sends=new ArrayList<>(10);

    public void add(IMessageSendObserve send){
        sends.add(send);
    }

    public  abstract void notice(String message);
}

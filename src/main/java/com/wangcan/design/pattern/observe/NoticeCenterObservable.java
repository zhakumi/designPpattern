package com.wangcan.design.pattern.observe;

/**
 * @author: wangcan
 * @date: 2021/7/7 21:17
 */
public class NoticeCenterObservable extends AbstractMessageObservable {

    @Override
    public void notice(String message) {
        sends.forEach(x -> {
            x.send(message);
        });
    }

    public static void main(String[] args) {
        EmailSendObserve emailSend = new EmailSendObserve();
        WechatSendObserve wechatSend = new WechatSendObserve();
        NoticeCenterObservable noticeCenterObservable = new NoticeCenterObservable();
        noticeCenterObservable.add(wechatSend);
        noticeCenterObservable.add(emailSend);
        noticeCenterObservable.notice("error");
    }
}

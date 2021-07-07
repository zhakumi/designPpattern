package com.wangcan.design.pattern.observe;

/**
 * @author: wangcan
 * @date: 2021/7/7 21:17
 */
public  class NoticeCenter extends AbstractMessageObservable {

    @Override
    public void notice(String message) {
        sends.forEach(x->{
            x.send(message);
        });
    }

    public static void main(String[] args) {
        EmailSendObserve emailSend=new EmailSendObserve();
        WchatSendObserve wchatSend=new WchatSendObserve();
        NoticeCenter noticeCenter=new NoticeCenter();
        noticeCenter.add(wchatSend);
        noticeCenter.add(emailSend);
        noticeCenter.notice("error");
    }
}

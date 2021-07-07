package com.wangcan.design.pattern.observe;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: wangcan
 * @date: 2021/7/7 21:17
 */
public  class NoticeCenter {

    List<IMessageSendObserve> sends=new ArrayList<>(10);

    public void add(IMessageSendObserve send){
        sends.add(send);
    }

    public void notice(String message){
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

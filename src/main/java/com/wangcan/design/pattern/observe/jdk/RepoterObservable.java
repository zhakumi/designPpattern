package com.wangcan.design.pattern.observe.jdk;

import java.util.Observable;

/**
 * @author: wangcan
 * @date: 2021/7/7 21:35
 * 主题
 */
public class RepoterObservable extends Observable {
    private String news;

    public String getNews() {
        return news;
    }
    public void setNews(String news) {
        this.news = news;
        setChanged();  // 必须调用这个方法来通知Observer状态发生了改变
        notifyObservers("you");
    }

    public static void main(String[] args) {
        RepoterObservable subject = new RepoterObservable();
        PeopleDailyNewspaperObserver observer1 = new PeopleDailyNewspaperObserver();
        XinhuaNewspaperObserver observer2 = new XinhuaNewspaperObserver();

        subject.addObserver(observer1);
        subject.addObserver(observer2);

        subject.setNews("日韩贸易战最新消息,韩方一再要求撤回贸易管制 日方无松动迹象...");
    }
}

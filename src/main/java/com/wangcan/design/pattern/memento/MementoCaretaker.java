package com.wangcan.design.pattern.memento;

import java.util.ArrayList;

/**
 * @Author: wangcan
 * @Date: 2021/7/8 9:42
 * 负责人
 */
public class MementoCaretaker {
    //定义一个集合来存储备忘录
    private ArrayList mementolist = new ArrayList();


    public ChessmanMemento getMemento(int i) {
        return (ChessmanMemento) mementolist.get(i);
    }

    public void addMemento(ChessmanMemento memento) {
        mementolist.add(memento);
    }

}

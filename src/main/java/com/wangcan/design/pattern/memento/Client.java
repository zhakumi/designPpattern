package com.wangcan.design.pattern.memento;

/**
 * @Author: wangcan
 * @Date: 2021/7/8 9:43
 */
public class Client {
    private static int index = -1;
    private static MementoCaretaker mc = new MementoCaretaker();

    public static void main(String args[]) {
        Chessman chess = new Chessman("车", 1, 1);
        play(chess);
        chess.setY(4);
        play(chess);
        chess.setX(5);
        play(chess);
        undo(chess, index);
        undo(chess, index);
        redo(chess, index);
        redo(chess, index);
    }

    //下棋，同时保存备忘录
    public static void play(Chessman chess) {
        mc.addMemento(chess.save());
        index++;
        chess.show();
    }

    //悔棋，撤销到上一个备忘录
    public static void undo(Chessman chess, int i) {
        System.out.println("******悔棋******");
        index--;
        chess.restore(mc.getMemento(i - 1));
        chess.show();
    }

    //撤销悔棋，恢复到下一个备忘录
    public static void redo(Chessman chess, int i) {
        System.out.println("******撤销悔棋******");
        index++;
        chess.restore(mc.getMemento(i + 1));
        chess.show();
    }

}

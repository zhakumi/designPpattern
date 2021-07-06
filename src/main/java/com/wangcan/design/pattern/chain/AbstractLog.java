package com.wangcan.design.pattern.chain;

/**
 * @Author: wangcan
 * @Date: 2021/7/5 9:15
 * 持有下一个接受者的引用
 */
public abstract class AbstractLog {

    public static int INFO = 1;
    public static int ERROR = 2;

    protected int level;

    /**
     * 责任链中的下一个元素
     */
    protected AbstractLog nextLog;

    public void logMessage(int level, String message) {
        if (this.level <= level) {
            write(message);
        }
        if (nextLog != null) {
            nextLog.logMessage(level, message);
        }
    }

    abstract protected void write(String message);

    public AbstractLog getNextLog() {
        return nextLog;
    }

    public void setNextLog(AbstractLog nextLog) {
        this.nextLog = nextLog;
    }
}

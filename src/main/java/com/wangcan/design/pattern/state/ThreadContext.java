package com.wangcan.design.pattern.state;

/**
 * @Author: wangcan
 * @Date: 2021/7/8 17:06
 */
public class ThreadContext {

    private AbstractThreadState state;

    public ThreadContext(){
        this.state=new NewState();
    }

    public AbstractThreadState  getState() {
        return state;
    }

    public void setState(AbstractThreadState state) {
        this.state = state;
    }

    public void start() {
        ((NewState) state).start(this);
    }
    public void run() {
        ((RunnableState) state).runnable(this);
    }
    public void suspend() {
        ((RunningState) state).suspend(this);
    }
    public void stop() {
        ((RunningState) state).stop(this);
    }
    public void resume() {
        ((BlockedState) state).resume(this);
    }

    public static void main(String[] args) {
        ThreadContext context = new ThreadContext();
        context.start();
        context.run();
        context.suspend();
        context.resume();
        context.run();
        context.stop();
    }
}

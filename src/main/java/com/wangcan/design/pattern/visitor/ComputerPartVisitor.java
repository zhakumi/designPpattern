package com.wangcan.design.pattern.visitor;


/**
 * @Author: wangcan
 * @Date: 2021/7/8 19:43
 * 电脑组件访问者
 */
public interface ComputerPartVisitor {
     void visit(Computer computer);
     void visit(Mouse mouse);
     void visit(Keyboard keyboard);
}

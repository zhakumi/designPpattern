package com.wangcan.design.pattern.visitor;

/**
 * @Author: wangcan
 * @Date: 2021/7/8 19:43
 * 电脑组件
 */
public interface ComputerPart {
     void accept(ComputerPartVisitor computerPartVisitor);
}

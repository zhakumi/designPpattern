package com.wangcan.design.pattern.visitor;

/**
 * @Author: wangcan
 * @Date: 2021/7/8 19:44
 */
public class Mouse implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}

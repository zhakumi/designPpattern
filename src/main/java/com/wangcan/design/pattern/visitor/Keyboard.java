package com.wangcan.design.pattern.visitor;

import java.util.List;

/**
 * @Author: wangcan
 * @Date: 2021/7/8 19:44
 */
public class Keyboard implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }


}

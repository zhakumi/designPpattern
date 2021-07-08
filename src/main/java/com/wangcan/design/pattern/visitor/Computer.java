package com.wangcan.design.pattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: wangcan
 * @Date: 2021/7/8 19:44
 */
public class Computer implements ComputerPart {

    List<ComputerPart> computerParts;

    public Computer() {
        computerParts = new ArrayList<>(3);
        computerParts.add(new Keyboard());
        computerParts.add(new Mouse());
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerParts.forEach(x -> x.accept(computerPartVisitor));
        computerPartVisitor.visit(this);
    }
}

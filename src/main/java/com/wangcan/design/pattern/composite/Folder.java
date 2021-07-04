package com.wangcan.design.pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: wangcan
 * @date: 2021/7/4 20:05
 */
public class Folder implements Component{
    private String name;
    private List<Component> componentList = new ArrayList<Component>();

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void add(Component component) {
       this.componentList.add(component);

    }

    @Override
    public void remove(Component component) {
        this.componentList.remove(component);
    }

    @Override
    public void print() {
        System.out.println(this.getName());
        for (Component component : this.componentList) {
            component.print();
        }
    }
}

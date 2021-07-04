package com.wangcan.design.pattern.composite;

/**
 * @author: wangcan
 * @date: 2021/7/4 20:06
 */
public class File implements Component {

    private String name;
    private String content;

    public File(String name, String content) {
        this.name = name;
        this.content = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void print() {
        System.out.println(this.name);
    }

    @Override
    public String getContent() {
        return "body";
    }
}

package com.wangcan.design.pattern.mvc;

/**
 * @Author: wangcan
 * @Date: 2021/7/8 20:06
 */
public class Model {
    private String input;

    public Model(){
        this.input="init";
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }
}

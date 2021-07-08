package com.wangcan.design.pattern.mvc;

/**
 * @Author: wangcan
 * @Date: 2021/7/8 20:08
 */
public class Controller {

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }



    public void updateView() {
        view.print(model.getInput());
    }

    public void setInput(String message) {
        this.model.setInput(message);
    }
}

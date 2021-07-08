package com.wangcan.design.pattern.mvc;

/**
 * @Author: wangcan
 * @Date: 2021/7/8 20:14
 */
public class MvcTest {

    public static void main(String[] args) {
        //从数据库获取学生记录
        Model model  = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        controller.updateView();
        //更新模型数据
        controller.setInput("John");
        controller.updateView();
    }
}

package com.wangcan.design.pattern.template;

import java.util.List;

/**
 * @Author: wangcan
 * @Date: 2021/7/5 20:25
 */
public abstract class AbstractExport {

    public void export() {
        System.out.println("获取数据");
        getData();
        System.out.println("写入数据");
    }

    public abstract void getData();


}

package com.wangcan.design.pattern.flyweight;

/**
 * @author: wangcan
 * @date: 2021/7/4 17:05
 * 数据库链接 自有属性 当前状态  是否只读 是非享原属性
 */
public class Connection {

    private String status;

    private boolean readOnly;

    public void query() {
        System.out.println("query  select * from a");
    }
}

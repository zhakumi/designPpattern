package com.wangcan.design.pattern.composite;

/**
 * @author: wangcan
 * @date: 2021/7/4 20:04
 */
public interface Component {
     default String getName() {
        throw new UnsupportedOperationException("不支持获取名称操作");
    }

     default void add(Component component) {
        throw new UnsupportedOperationException("不支持添加操作");
    }

     default void remove(Component component) {
        throw new UnsupportedOperationException("不支持删除操作");
    }

     default void print() {
        throw new UnsupportedOperationException("不支持打印操作");
    }

     default String getContent() {
        throw new UnsupportedOperationException("不支持获取内容操作");
    }
}

package com.wangcan.design.pattern.flyweight;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * @author: wangcan
 * @date: 2021/7/4 17:02 数据库链接池 共享属性 用户名 密码 链接类
 */
public class ConnectionPool {

    private List<Connection> pool;
    /**
     * 享元 属性
     */
    private String url;
    private String name;
    private String password;
    private String type;

    private int poolSize = 100;
    private static ConnectionPool instance = null;
    Connection conn = null;

    private ConnectionPool() {
        pool = new ArrayList<>(poolSize);
        // 初始化时 提前创建好需要的链接数
        for (int i = 0; i < poolSize; i++) {
            // 创建数据库链接
            conn = null;
            pool.add(conn);
        }
    }

    public synchronized void release() {
        pool.add(conn);
    }

    /**
     * 从上面的 连接池获取
     *
     * @return
     */
    public synchronized Connection getConnection() {
        if (pool.size() > 0) {
            Connection conn = pool.get(0);
            pool.remove(conn);
            return conn;
        } else {
            return null;
        }
    }
}

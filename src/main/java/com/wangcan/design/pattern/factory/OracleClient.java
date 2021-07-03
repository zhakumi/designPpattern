package com.wangcan.design.pattern.factory;

/**
 * @author: wangcan
 * @date: 2021/7/3 10:15
 */
public class OracleClient implements IJdbc{

    @Override
    public void query() {
        System.out.println("oracle");
    }
}

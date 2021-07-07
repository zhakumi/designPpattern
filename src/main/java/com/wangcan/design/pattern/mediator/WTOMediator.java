package com.wangcan.design.pattern.mediator;

/**
 * @Author: wangcan
 * @Date: 2021/7/7 9:36 wto 组织
 */
public class WTOMediator extends CountryMediator {

    public China china;
    public American american;


    public void setChina(China china) {
        this.china = china;
    }

    public void setAmerican(American american) {
        this.american = american;
    }

    @Override
    public void send(String message, Country country) {
        if (country == china) {
            china.show(message);
        }
        if (country == american) {
            american.show(message);
        }
    }
}

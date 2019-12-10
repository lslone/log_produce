package com.lsl.bean;

/**
 * @program: logproduce
 * @description:用户后台活跃
 * @author: lsl
 * @create: 2019-12-10 10:58
 **/
public class AppActive_background {
    private String active_source;//1=upgrade,2=download(下载),3=plugin_upgrade

    public String getActive_source() {
        return active_source;
    }

    public void setActive_source(String active_source) {
        this.active_source = active_source;
    }
}

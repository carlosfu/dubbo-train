package com.sohu.tv.dubbo.train.api.bean;

import java.io.Serializable;

/**
 * @author leifu
 * @Date 2016年2月15日
 * @Time 下午3:16:19
 */
public class VideoInfo implements Serializable {

    private long id;

    private String name;

    private String info;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "VideoInfo [id=" + id + ", name=" + name + ", info=" + info + "]";
    }

}

package com.sohu.tv.dubbo.train.api;

import com.sohu.tv.dubbo.train.api.bean.VideoInfo;

/**
 * 视频信息接口
 * 
 * @author leifu
 * @Date 2016年2月15日
 * @Time 下午3:14:48
 */
public interface VideoService {

    /**
     * 通过视频id获取视频信息
     * 
     * @param id
     * @return
     */
    VideoInfo get(long id);

}

package com.sohu.tv.dubbo.train.provider.mock;

import com.sohu.tv.dubbo.train.api.bean.VideoInfo;

/**
 * redisMock视频信息
 * @author leifu
 * @Date 2016年2月15日
 * @Time 下午3:23:50
 */
public class RedisVideoInfoMock {

    /**
     * 通过id获取视频信息
     * @param id
     * @return
     */
    public VideoInfo get(long id) {
        VideoInfo videoInfo = new VideoInfo();
        videoInfo.setId(id);
        videoInfo.setName("视频名:" + id);
        videoInfo.setInfo("视频描述:" + id);
        return videoInfo;
    }

}

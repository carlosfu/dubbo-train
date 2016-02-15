package com.sohu.tv.dubbo.train.provider.service.impl;

import com.sohu.tv.dubbo.train.api.VideoService;
import com.sohu.tv.dubbo.train.api.bean.VideoInfo;
import com.sohu.tv.dubbo.train.provider.mock.RedisVideoInfoMock;

/**
 * 视频信息实现
 * @author leifu
 * @Date 2016年2月15日
 * @Time 下午3:22:11
 */
public class VideoServiceImpl implements VideoService {

    private RedisVideoInfoMock redisVideoInfoMock;

    @Override
    public VideoInfo get(long id) {
        return redisVideoInfoMock.get(id);
    }

    public void setRedisVideoInfoMock(RedisVideoInfoMock redisVideoInfoMock) {
        this.redisVideoInfoMock = redisVideoInfoMock;
    }


}

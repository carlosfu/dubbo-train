package com.sohu.tv.dubbo.train.consumer.action;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sohu.tv.dubbo.train.api.VideoService;
import com.sohu.tv.dubbo.train.api.bean.VideoInfo;

/**
 * 消费者
 * @author leifu
 * @Date 2016年2月15日
 * @Time 下午3:54:16
 */
public class TrainConsumerAction {
    
    private Logger logger = LoggerFactory.getLogger(TrainConsumerAction.class);
    
    private VideoService videoService;

    public void start() throws Exception {
        while (true) {
            try {
                long id = new Random().nextLong();
                VideoInfo videoInfo = videoService.get(id);
                System.out.println(videoInfo);
                logger.info(videoInfo.toString());
                TimeUnit.SECONDS.sleep(1);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void setVideoService(VideoService videoService) {
        this.videoService = videoService;
    }

}
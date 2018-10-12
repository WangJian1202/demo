package com.example.demo.scheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: WangJian
 * @Date: 2018/10/12 13:55
 */
@Component
@EnableScheduling
public class TimeQuartz {

    private Logger logger = LoggerFactory.getLogger(TimeQuartz.class);

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Scheduled(cron = "0/1 * * * * ? ")   //每1秒执行一次
    public void testCron1() {

        logger.info(dateFormat.format(new Date()) + "*********每1秒执行一次");
    }

    @Scheduled(cron = "0/2 * * * * ? ")   //每2秒执行一次
    public void testCron2() {

        logger.info(dateFormat.format(new Date()) + "*********每2秒执行一次");
    }

    @Scheduled(cron = "0/3 * * * * ? ")   //每3秒执行一次
    public void testCron3() {

        logger.info(dateFormat.format(new Date()) + "*********每3秒执行一次");
    }

    @Scheduled(cron = "0/4 * * * * ? ")   //每4秒执行一次
    public void testCron4() {

        logger.info(dateFormat.format(new Date()) + "*********每4秒执行一次");
    }


}

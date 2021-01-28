package com.ruoyi.quartz.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

import java.time.Instant;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xw
 * @version 1.0
 * @date 2021/1/14 17:00
 */
//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = IInterfaceHostsService.class)
//@Transactional
//@Commit
public class IInterfaceHostsServiceTest {
//
//    @Resource
//    private IInterfaceHostsService service;

    @Test
    public void insert() {
        long epochSecond = Instant.now().getEpochSecond();
        System.out.println(epochSecond);
    }
}
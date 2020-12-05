package com.mgtv.ft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 描述:
 *
 * @Author: zhangchao
 **/
@SpringBootApplication
public class FtBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(FtBootApplication.class, args);
        preheatCache();
    }

    /**
     * 进行缓存预热,预热失败则服务启动失败
     */
    private static void preheatCache() {
        // ...
    }

}

package com.weiguofu.esjpademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

/**
 * @Description: TODO
 * @Author: guofuwei
 * @Date: 2020/8/16 22:19
 * @Version 1.0
 */
@EnableElasticsearchRepositories(basePackages = "com.weiguofu.esjpademo.repo")
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(new Application().getClass(),args);
    }
}

package cn.accp;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <功能描述>
 *
 * @author liuchen@550820335.com
 * @createTime 2020/11/26
 */
@SpringBootApplication
@EnableDubbo

public class MyConsumerApp {
    public static void main(String[] args) {
        SpringApplication.run(MyConsumerApp.class);
    }
}

package com.f.springboot;

import com.alibaba.druid.pool.DruidDataSource;
import com.f.springboot.config.ServerConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Springboot10ConfigurationApplication {

    @Bean
    @ConfigurationProperties(prefix = "datasource")
    public DruidDataSource druidDataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        return druidDataSource;
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Springboot10ConfigurationApplication.class, args);
        ServerConfig serverConfig = context.getBean(ServerConfig.class);
        System.out.println(serverConfig);
        //DruidDataSource druidDataSource = context.getBean(DruidDataSource.class);
        //System.out.println(druidDataSource.getDriverClassName());
    }

}

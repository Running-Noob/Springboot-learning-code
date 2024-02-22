package com.f.springboot.pojo;

/**
 * @author fzy
 * @date 2024/2/22 15:44
 */

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 1. 定义数据模型封装yaml文件中对应的数据
 * 2. 将其定义为spring容器管理的bean
 * 3. 指定要加载yaml文件中的什么数据 @ConfigurationProperties
 */
@Component
@ConfigurationProperties(prefix = "datasource")
public class DataSource {
    private String driver;
    private String url;
    private String username;
    private String password;

    public DataSource() {
    }

    public DataSource(String driver, String url, String username, String password) {
        this.driver = driver;
        this.url = url;
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "DataSource{" +
                "driver='" + driver + '\'' +
                ", url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

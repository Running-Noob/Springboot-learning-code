package com.f.springboot.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.convert.DataSizeUnit;
import org.springframework.boot.convert.DurationUnit;
import org.springframework.stereotype.Component;
import org.springframework.util.unit.DataSize;
import org.springframework.util.unit.DataUnit;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

/**
 * @author fzy
 * @date 2024/2/29 19:03
 */
@Data
@Component
@ConfigurationProperties(prefix = "serverconfig")
public class ServerConfig {
    private String ipAddress;
    private int port;
    private long timeout;
    @DurationUnit(ChronoUnit.HOURS)
    private Duration serverTimeout;
    @DataSizeUnit(DataUnit.MEGABYTES)
    private DataSize dataSize;
}

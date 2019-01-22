package com.hongghe.server;

import com.zaxxer.hikari.HikariDataSource;
import com.zaxxer.hikari.metrics.prometheus.PrometheusMetricsTrackerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

/**
 * 初始化的设置
 *
 * @author hongghe 03/08/2018
 */
public class ServerInitializer {

    @Autowired
    private DataSource dataSource;

    @PostConstruct
    public void init() {
        if (dataSource instanceof HikariDataSource) {
            ((HikariDataSource)this.dataSource).setMetricsTrackerFactory(new PrometheusMetricsTrackerFactory());
        }
    }
}

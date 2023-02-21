//package com.kane.kanebe.config.db.props;
//
//import com.zaxxer.hikari.HikariConfig;
//import lombok.Data;
//import org.springframework.beans.factory.annotation.Value;
//
//@Data
//public class DefaultDataSourceProperty {
//
//    @Value("${spring.mysql.datasource.driver-class-name}")
//    private String driverClassName;
//
//    private String endpoint;
//    private String username;
//    private String password;
//    private String dbname;
//    private int minimumIdle;
//    private int maximumPoolSize;
//    private String validationQuery;
//
//    public String dataSourceUrl() {
//        return "";
//    }
//
//    public HikariConfig createHikariConfig() {
//        HikariConfig config = new HikariConfig();
//        config.setDriverClassName(driverClassName);
//        config.setJdbcUrl(dataSourceUrl());
//        config.setUsername(getUsername());
//        config.setPassword(getPassword());
//        config.setMaximumPoolSize(getMaximumPoolSize());
//        config.setMinimumIdle(getMinimumIdle());
//        config.setConnectionTestQuery(getValidationQuery());
//        return config;
//    }
//}

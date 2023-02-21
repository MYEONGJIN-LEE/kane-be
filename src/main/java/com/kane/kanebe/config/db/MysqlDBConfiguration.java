//package com.kane.kanebe.config.db;
//
//import com.kane.kanebe.config.db.props.MasterDataSourceDataSourceProperty;
//import com.kane.kanebe.config.db.props.SlaveDataSourceDataSourceProperty;
//import com.zaxxer.hikari.HikariConfig;
//import com.zaxxer.hikari.HikariDataSource;
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.autoconfigure.flyway.FlywayDataSource;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.DependsOn;
//import org.springframework.context.annotation.Primary;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;
//import org.springframework.jdbc.datasource.LazyConnectionDataSourceProxy;
//import org.springframework.transaction.PlatformTransactionManager;
//
//import javax.sql.DataSource;
//import java.util.HashMap;
//import java.util.Map;
//
//@Slf4j
//@Configuration
//@RequiredArgsConstructor
//public class MysqlDBConfiguration {
//
//    private final MasterDataSourceDataSourceProperty master;
//    private final SlaveDataSourceDataSourceProperty slave;
//
//    public static final String MASTER_DATASOURCE = "masterDataSource";
//    public static final String SLAVE_DATASOURCE = "slaveDataSource";
//    public static final String ROUTING_DATASOURCE = "routingDataSource";
//
//    @Bean(MASTER_DATASOURCE)
//    @FlywayDataSource
//    public DataSource writeDataSource() {
//        HikariConfig config = master.createHikariConfig();
//        return new HikariDataSource(config);
//    }
//
//    @Bean(SLAVE_DATASOURCE)
//    public DataSource readDataSource() {
//        HikariConfig config = slave.createHikariConfig();
//        return new HikariDataSource(config);
//    }
//
//    @Bean(ROUTING_DATASOURCE)
//    @Primary
//    @DependsOn({MASTER_DATASOURCE, SLAVE_DATASOURCE})
//    public DataSource routingDataSource(
//            @Qualifier(MASTER_DATASOURCE) DataSource masterDataSource,
//            @Qualifier(SLAVE_DATASOURCE) DataSource slaveDataSource) {
//
//        RoutingDataSource routingDataSource = new RoutingDataSource();
//
//        Map<Object, Object> datasourceMap = new HashMap<>();
//        datasourceMap.put("MASTER", masterDataSource);
//        datasourceMap.put("SLAVE", slaveDataSource);
//
//        routingDataSource.setTargetDataSources(datasourceMap);
//        routingDataSource.setDefaultTargetDataSource(masterDataSource);
//        return routingDataSource;
//    }
//
//    @Bean("routingLazyDataSource")
//    public DataSource routingLazyDataSource(@Qualifier(ROUTING_DATASOURCE) DataSource dataSource) {
//        return new LazyConnectionDataSourceProxy(dataSource);
//    }
//
//    @Bean("mysqlTxManager")
//    @Primary
//    PlatformTransactionManager mysqlTxManager(
//            @Qualifier("routingLazyDataSource") DataSource dataSource) {
//        return new DataSourceTransactionManager(dataSource);
//    }
//
//    // Aop 로깅 처리를 위해 mybatis interceptor 적용
////    @Bean
////    public MybatisQueryLogInterceptor mybatisInterceptor() {
////        return new MybatisQueryLogInterceptor();
////    }
//}

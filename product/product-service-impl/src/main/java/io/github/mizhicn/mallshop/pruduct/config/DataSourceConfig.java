package io.github.mizhicn.mallshop.pruduct.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@MapperScan("io.github.mizhicn.mallshop.pruduct.dao") //// 扫描对应的 Mapper 接口
@EnableTransactionManagement(proxyTargetClass = true)
public class DataSourceConfig {

    @Value("${spring.application.name}")
    private String applicationId;

    @Value("${seata.tx-service-group}")
    private String txServiceGroup;


    @ConfigurationProperties("spring.datasource.druid")
    @Bean("druidDataSource")
    public DruidDataSource druidDataSource() {
        return DruidDataSourceBuilder.create().build();
    }

    //Seata 是通过代理数据源实现事务分支，所以需要先配置一个数据源的代理，否则事务不会回滚。
//    @ConfigurationProperties(prefix = "spring.datasource")
//    @Primary
//    @Bean("dataSource")
//    @DependsOn("druidDataSource") // 解决多数据源，循环依赖的问题。主要发生点在 DataSourceInitializerInvoker
//    public DataSource dataSource() {
//        DruidDataSource druidDataSource = druidDataSource();
//        return new DataSourceProxy(druidDataSource);
//    }

    //还需要配置全局事务扫描器。有两个参数，一个是应用名称，一个是事务分组。
//    @Bean
//    public GlobalTransactionScanner globalTransactionScanner() {
//        return new GlobalTransactionScanner(applicationId, txServiceGroup);
//    }

}

package com.wf.mybatisplus.mybatisplus;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * @author wf
 * @create 2020-05-23 22:00
 * @desc
 **/
public class Main {

    public static void main(String[] args) {
        AutoGenerator autoGenerator = new AutoGenerator();
        // 数据源配置
        DataSourceConfig config = new DataSourceConfig();
        config.setDbType(DbType.MYSQL);
        config.setUrl("jdbc:mysql://localhost:3306/springcloud2020?useUnicode=true&characterEncoding=utf-8&" +
                "useSSL=false&serverTimezone=GMT%2B8");
        config.setUsername("root");
        config.setPassword("root");
        config.setDriverName("com.mysql.cj.jdbc.Driver");
        autoGenerator.setDataSource(config);
        // 全局配置
        GlobalConfig globalConfig = new GlobalConfig();
        globalConfig.setOutputDir(System.getProperty("user.dir") + "/src/main/java");
        globalConfig.setOpen(false);
        globalConfig.setAuthor("wf");
        globalConfig.setServiceName("%sService");
        autoGenerator.setGlobalConfig(globalConfig);
        // 包信息
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent("com.wf.mybatisplus.mybatisplus");
        packageConfig.setModuleName("gengerator");
        packageConfig.setController("controller");
        packageConfig.setService("service");
        packageConfig.setServiceImpl("service.impl");
        packageConfig.setMapper("mapper");
        packageConfig.setEntity("entity");
        autoGenerator.setPackageInfo(packageConfig);
        // 配置策略
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig.setEntityLombokModel(true);
        // strategyConfig.setInclude("user");
        strategyConfig.setNaming(NamingStrategy.underline_to_camel);
        strategyConfig.setColumnNaming(NamingStrategy.underline_to_camel);
        autoGenerator.setStrategy(strategyConfig);

        autoGenerator.execute();
    }
}

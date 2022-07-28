package com.dzh.datasource;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.datasource.pooled.PooledDataSourceFactory;

/**
 * 自定义数据源
 */
public class MyDruidDataSourceFactory extends PooledDataSourceFactory {
    public MyDruidDataSourceFactory() {
        // 替换默认的数据源
        this.dataSource = new DruidDataSource();
    }
}
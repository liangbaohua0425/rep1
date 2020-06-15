package spring02.my.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class DataSourceConfigeration {
    @Value("${jdbc.driver}")
    private String driver;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.userName}")
    private String userName;
    @Value("${jdbc.passWord}")
    private String password;


    @Bean("dataSource")
    //获取数据库连接池数据
    public DataSource getDataSource() {
        //创建连接池对象
        DruidDataSource dataSource = new DruidDataSource();
        //设置数据库驱动
        dataSource.setDriverClassName(driver);
        //设置数据库相关信息
        dataSource.setUrl(url);
        dataSource.setUsername(userName);
        dataSource.setPassword(password);
        return dataSource;
    }
}

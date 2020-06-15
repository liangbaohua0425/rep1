package spring02.my.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;


@Configuration
@ComponentScan("spring02.my")
@PropertySource("classpath:JDBC.properties")
@Import({DataSourceConfigeration.class})
public class UserConfigeration {
}

package spring02.my.web;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring02.my.config.UserConfigeration;
import spring02.my.service.IUserService;

public class WebDemo {
    public static void main(String[] args) {
        ApplicationContext app =
                new AnnotationConfigApplicationContext(UserConfigeration.class);
        IUserService bean = app.getBean(IUserService.class);
        bean.getUserName();

    }
}

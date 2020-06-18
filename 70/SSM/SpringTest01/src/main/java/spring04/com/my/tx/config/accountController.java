package spring04.com.my.tx.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class accountController {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(txConfigration.class);
        IAccountService bean = app.getBean(IAccountService.class);
        bean.sendMoney();
    }
}

import com.dzh.controller.AccountController;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AccountTest {

    /**
     * 事务测试
     */
    @Test
    public void accountTransfer() {

        ClassPathXmlApplicationContext ac =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountController accountController = (AccountController) ac.getBean("accountController");

        accountController.transfer(1,2,1000d);

    }

    /**
     * 注解方式的配置文件测试
     */
    @Test
    public void accountTransferBeanXml() {

        ClassPathXmlApplicationContext ac =
                new ClassPathXmlApplicationContext("bean.xml");
        AccountController accountController = (AccountController) ac.getBean("accountController");

        accountController.transfer(2,1,1000d);

    }
}

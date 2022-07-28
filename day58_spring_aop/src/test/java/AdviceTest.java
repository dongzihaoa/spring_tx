import com.dzh.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AdviceTest {

    @Test
    public void testUserService() {
        ClassPathXmlApplicationContext ac =
                new ClassPathXmlApplicationContext("bean.xml");
        UserService userService = (UserService) ac.getBean("userService");

        userService.addUser();
        System.out.println("-------------");
        userService.deleteUser();
    }
}

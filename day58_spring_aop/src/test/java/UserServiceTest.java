import com.dzh.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceTest {

    @Test
    public void testUserService() {
        //引入spring配置文件
        ClassPathXmlApplicationContext ac =
                new ClassPathXmlApplicationContext("applicationContext.xml.bak");
        //获取容器中的对象
        UserService userService = (UserService) ac.getBean("userService");

        userService.addUser();
//        userService.deleteUser();

    }

}

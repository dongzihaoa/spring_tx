import com.dzh.entity.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    @Test
    public void testSpring() {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        User user = (User) context.getBean("user");

        System.out.println(user);
        context.close();
    }
}

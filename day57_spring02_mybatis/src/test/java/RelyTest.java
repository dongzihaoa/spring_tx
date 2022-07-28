import com.dzh.entity.User01;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RelyTest {
    @Test
    public void relyTest01() {
        ClassPathXmlApplicationContext ac =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        User01 user01 = (User01) ac.getBean("user01");

        System.out.println(user01);


    }
}




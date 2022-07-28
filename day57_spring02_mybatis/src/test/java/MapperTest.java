import com.dzh.controller.UserController;
import com.dzh.entity.Users;
import com.dzh.utils.JsonResult;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class MapperTest {

    @Test
    public void mapperTest() {
        ClassPathXmlApplicationContext ac =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        UserController userController = (UserController)ac.getBean("userController");

        JsonResult<PageInfo<Users>> byPage = userController.findByPage(8, 1);

        System.out.println("======byPage=======");
        System.out.println(byPage);
        System.out.println(byPage.getMsg()+"========" +byPage.getCode());
        System.out.println(byPage.getData());
        System.out.println("=============");
        System.out.println(Arrays.toString(byPage.getData().getNavigatepageNums()));

    }
}

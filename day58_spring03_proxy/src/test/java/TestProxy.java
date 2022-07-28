import com.dzh.proxy.demo01.JdkProxyRent;
import com.dzh.proxy.demo01.LandLoad;
import com.dzh.proxy.demo01.Rent;
import org.junit.Test;

public class TestProxy {
    @Test
    public void testProxy() {
        LandLoad landLoad = new LandLoad();

        JdkProxyRent jdkProxyRent = new JdkProxyRent();
        jdkProxyRent.setRent(landLoad);

        Rent rent = jdkProxyRent.creatRentProxy();
        rent.rent();
        rent.test();

    }
}

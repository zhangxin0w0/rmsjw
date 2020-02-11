import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

/**
 * ClassName: DemoTest
 * 日期: 2020/2/11 16:08
 *
 * @author Air张
 * @since JDK 1.8
 */
public class DemoTest {

    @Test
    public void test1() {
        Calendar c = Calendar.getInstance();
        Date d= new Date();
        c.setTime(d);
        int i = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(i);
    }
}

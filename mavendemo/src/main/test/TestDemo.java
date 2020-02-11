import com.itdr.controller.IndexController;
import com.itdr.pojo.Car;
import com.itdr.pojo.Users;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.util.List;
import java.util.Map;

/**
 * ClassName: TestDemo
 * 日期: 2020/2/5 10:44
 *
 * @author Air张
 * @since JDK 1.8
 */
public class TestDemo {

    @Test
    public void test1() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        Users u = (Users) ac.getBean("users");
        System.out.println(u);

        u.setAge(20);

        Users u2 = (Users) ac.getBean("users");
        System.out.println(u2);

    }

    @Test
    public void test2(){
//        DriverManagerDataSource dm = new DriverManagerDataSource();
//        dm.setDriverClassName("com.mysql.jdbc.Driver");
//        dm.setUrl("jdbc:mysql://127.0.0.1:3306/itdr11");
//        dm.setUsername("root");
//        dm.setPassword("123456");

        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");

        JdbcTemplate jtl = ac.getBean("jdbcTemplate",JdbcTemplate.class);
        String sql="SELECT * FROM neuedu_user";

        List<Map<String, Object>> maps = jtl.queryForList(sql);
        for (Map<String, Object> map : maps) {
            for (String s : map.keySet()) {
                System.out.println(map.get(s));
            }
        }
    }

    @Test
    public void test3(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        IndexController in = ac.getBean(IndexController.class);
        String zz = in.zz("zx", "zx2", 10);

//        in.zz2("zx", "zx2", 10);

//        System.out.println(zz);
    }
}

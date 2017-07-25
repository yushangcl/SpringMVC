package win.likie.mvc;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by huahui.wu on 2017/7/25.
 * 所有单元测试需要继承该类
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:config/spring-mvc-test.xml")
public class BaseTest {
}

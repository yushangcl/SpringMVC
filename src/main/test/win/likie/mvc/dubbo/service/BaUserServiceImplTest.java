package win.likie.mvc.dubbo.service;

import org.junit.Test;
import win.likie.mvc.BaseTest;
import win.likie.mvc.entity.BaUser;

import javax.annotation.Resource;

/**
 * Created by huahui.wu on 2017/7/25.
 */
public class BaUserServiceImplTest extends BaseTest {

    @Resource
    private BaUserService baUserService;

    @Test
    public void getUserInfo() throws Exception {
        BaUser baUser = baUserService.getUserInfo(1);
        System.out.println(baUser);
    }

}
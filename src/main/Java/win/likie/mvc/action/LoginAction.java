package win.likie.mvc.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import win.likie.mvc.dubbo.service.BaUserService;
import win.likie.mvc.entity.BaUser;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by huahui.wu on 2017/7/25.
 */
@Controller
@ResponseBody
@RequestMapping(value = "api")
public class LoginAction extends BasicAction {
    @Resource
    private BaUserService baUserService;

    @RequestMapping(value = "/index")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public BaUser login(HttpServletRequest request) {
        return baUserService.getUserInfo(1);
    }
}


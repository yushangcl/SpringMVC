package win.likie.mvc.dubbo.service;

import win.likie.mvc.entity.BaUser;

/**
 * Created by huahui.wu on 2017/7/25.
 */
public interface BaUserService extends IBasicService<BaUser>{

    BaUser getUserInfo(Integer userId);
}

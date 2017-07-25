package win.likie.mvc.dubbo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import win.likie.mvc.dao.IBasicDao;
import win.likie.mvc.dubbo.service.BaUserService;
import win.likie.mvc.entity.BaUser;
import win.likie.mvc.mapper.BaUserMapper;


/**
 * Created by huahui.wu on 2017/7/25.
 */
@Service
public class BaUserServiceImpl extends BasicService<BaUser> implements BaUserService {

    @Autowired
    private BaUserMapper baUserMapper;

    @Override
    public IBasicDao<BaUser> getDao() {
        return baUserMapper;
    }

    @Override
    public BaUser getUserInfo(Integer userId) {
        return baUserMapper.selectByPrimaryKey(userId);
    }
}

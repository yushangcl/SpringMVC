package win.likie.mvc.mapper;

import win.likie.mvc.dao.IBasicDao;
import win.likie.mvc.entity.BaUser;

public interface BaUserMapper extends IBasicDao<BaUser> {
    int deleteByPrimaryKey(Integer userId);

    int insert(BaUser record);

    int insertSelective(BaUser record);

    BaUser selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(BaUser record);

    int updateByPrimaryKey(BaUser record);
}
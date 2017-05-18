package win.likie.mvc.mapper;

import win.likie.mvc.entity.User;

public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);
}
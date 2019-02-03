package  com.xdbigdata.cxcy.service.impl;

import org.springframework.stereotype.Service;

import com.xdbigdata.cxcy.mapper.UserMapper;
import com.xdbigdata.cxcy.model.domain.User;
import com.xdbigdata.cxcy.service.UserService;

import lombok.extern.slf4j.Slf4j;
import com.xdbigdata.framework.service.BaseServiceImpl;

/**
 * User service implement
 * 
 * @author lshaci
 */
@Service
@Slf4j
public class UserServiceImpl extends BaseServiceImpl<User, UserMapper> implements UserService {


    @Override
    public User login(String userName, String password) {
        User user = new User();
        user.setNo(userName);
        user.setPwd(password);
        User u = getByCondition(user);
        return u;
    }
}

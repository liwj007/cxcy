package com.xdbigdata.cxcy.service;

import com.xdbigdata.cxcy.mapper.UserMapper;
import com.xdbigdata.cxcy.model.domain.User;

import com.xdbigdata.framework.service.BaseService;

/**
 * User service interface
 *
 * @author lshaci
 */
public interface UserService extends BaseService<User, UserMapper> {

    User login(String userName, String password);
}
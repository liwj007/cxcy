package com.xdbigdata.cxcy.web.controller;

import com.xdbigdata.cxcy.model.domain.User;
import com.xdbigdata.cxcy.model.vo.LoginUser;
import com.xdbigdata.cxcy.service.UserService;
import com.xdbigdata.framework.web.annotation.IgnoreRole;
import com.xdbigdata.framework.web.annotation.NeedRole;
import com.xdbigdata.framework.web.model.JsonResponse;
import com.xdbigdata.framework.web.utils.SessionUserUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    public UserService userService;

    @IgnoreRole
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public JsonResponse userLogin(@RequestParam(value = "username") String userName,
                                     @RequestParam(value = "password") String password) {
        User user = userService.login(userName,password);
        if (user!=null){
            SessionUserUtils.setUserRoleInSession(user.getIdentity());
            SessionUserUtils.setUserInSession(user);
            LoginUser loginUser = new LoginUser(user);
            return  JsonResponse.success(loginUser);
        }
       return JsonResponse.failure("登录失败");
    }

    @NeedRole("测试用户")
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public JsonResponse test() {

        return  JsonResponse.success(null);
    }
}

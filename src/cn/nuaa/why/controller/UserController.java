package cn.nuaa.why.controller;

import cn.nuaa.why.entity.ResultCause;
import cn.nuaa.why.entity.UserEntity;
import cn.nuaa.why.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;


@Controller
@RequestMapping("/api")
public class UserController extends CommonController {
    @Resource
    private IUserService userService;

    @RequestMapping(value = "/addUser", method = {RequestMethod.GET,RequestMethod.POST})
    public @ResponseBody
    ResultCause addUser(UserEntity user){
        return userService.registerUser(user);
    }


    @RequestMapping(value = "/modify",method = {RequestMethod.GET,RequestMethod.POST})
    public @ResponseBody
    ResultCause modify(UserEntity user) {
        return userService.modifyUser(user);
    }

    @RequestMapping(value = "/getUser",method = {RequestMethod.GET,RequestMethod.POST})
    public @ResponseBody
    List<UserEntity> getUser()
    {
        return userService.getUser();

    }

    @RequestMapping(value = "/deleteUser",method = {RequestMethod.GET,RequestMethod.POST})
    public @ResponseBody
    ResultCause deleteUser(UserEntity user)
    {
        return userService.deleteUser(user);
    }
}

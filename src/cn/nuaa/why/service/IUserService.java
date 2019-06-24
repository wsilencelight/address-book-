package cn.nuaa.why.service;

import cn.nuaa.why.entity.ResultCause;
import cn.nuaa.why.entity.UserEntity;

import java.util.List;


public interface IUserService {

    //增加联系人
    public ResultCause registerUser(UserEntity user);

//    //通过用户名获取用户信息(包括签名等)
//    public UserEntity getUserInfo(String name);
    //直接获取
    public List<UserEntity> getUser();
    //修改信息
    public ResultCause modifyUser(UserEntity user);
    //删除信息
    public ResultCause deleteUser(UserEntity user);


}

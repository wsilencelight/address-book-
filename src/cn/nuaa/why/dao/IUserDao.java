package cn.nuaa.why.dao;

import cn.nuaa.why.entity.UserEntity;

import java.util.List;

public interface IUserDao {

     //保存用户信息用户

    public void saveUser(String sql, UserEntity user);


    // 根据条件获取用户列表

    public List<UserEntity> listUsers(String sql, Object[] keys);
}

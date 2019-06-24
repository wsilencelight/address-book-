package cn.nuaa.why.dao.impl;

import cn.nuaa.why.dao.DaoHelper;
import cn.nuaa.why.dao.IUserDao;
import cn.nuaa.why.entity.UserEntity;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class UserDaoImpl extends DaoHelper implements IUserDao{
    @Override
    public void saveUser(String sql, UserEntity user) {
        this.insertByBean(sql,user);
    }

    @Override
    public List<UserEntity> listUsers(String sql, Object[] keys) {
        return this.query(sql,keys,UserEntity.class);
    }
}

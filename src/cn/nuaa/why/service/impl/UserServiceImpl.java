package cn.nuaa.why.service.impl;

import cn.nuaa.why.dao.IUserDao;
import cn.nuaa.why.entity.ResultCause;
import cn.nuaa.why.entity.UserEntity;
import cn.nuaa.why.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.List;



@Service
public class UserServiceImpl implements IUserService{
    @Resource
    private IUserDao userDao;
    @Override
    public  ResultCause modifyUser(UserEntity user)
    {
        String sql = "update user1 set phonenumber = :phonenumber,email = :email,name = :name where id = :id";
        userDao.saveUser(sql,user);
        return new ResultCause(ResultCause.SUCCESS_CODE,"修改成功");
    }


    @Override
    public ResultCause registerUser(UserEntity user) {
        if (getTargetUser(user.getName()) != null){
            return new ResultCause(ResultCause.FAIL_CODE,"联系人已存在");
        }else {
            //设置注册时间
            user.setTime(new Timestamp(System.currentTimeMillis()));
            //id为自增字段，所以不需要在这里设置
            String sql = "insert into user1 (name,phonenumber,email,time) values (:name,:phonenumber,:email,:time)";
            userDao.saveUser(sql,user);
        }
        return new ResultCause(ResultCause.SUCCESS_CODE,"添加成功");
    }

//    @Override
//    public UserEntity getUserInfo(String name) {
//        String sql = "select name,id ,password,email,signature from user1 where name = ?";
//        return userDao.listUsers(sql,new Object[]{name}).get(0);
//    }
    @Override
    public List<UserEntity> getUser()
    {
        String sql="select * from user1";
        return userDao.listUsers(sql,new Object[]{});
    }
    @Override
    public ResultCause  deleteUser(UserEntity user)
    {
        String sql = "delete from user1 where id = :id";
        userDao.saveUser(sql,user);
        return new ResultCause(ResultCause.SUCCESS_CODE,"用户删除成功");
    }


    /**
     * 根据用户名查找用户，因为本系统用户名唯一，所以用户名查找到的结果为单个用户对象
     * 同时，因为在登录验证和注册查重中均有查询用户对象的需求，所以将这部分代码拿出，
     * 进行复用
     * @param name
     * @return 如果查询结果非空，返回唯一的结果，否则返回空值
     */
    private UserEntity getTargetUser(String name){
        String sql = "select * from user1 where name = ?";
        List<UserEntity> userEntities = userDao.listUsers(sql,new Object[]{name});
        return (userEntities!=null&&userEntities.size()>0)?userEntities.get(0):null;
    }
}

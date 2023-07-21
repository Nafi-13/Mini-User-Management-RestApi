package com.nafi.app.rest.Service;

import com.nafi.app.rest.Entities.User;
import com.nafi.app.rest.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;
    public List<User> getAllUsers()
    {
        return userDao.findAll();
    }

    public User getSingleUser(long id)
    {
        return userDao.findById(id).get();
    }

    public User createNewUser(User user)
    {
        return userDao.save(user);
    }

    public void deleteOneUser(long id)
    {
        userDao.deleteById(id);
        //return "Deleted :(";
    }

    public User updateUser(User user)
    {
        return userDao.save(user);
    }
}

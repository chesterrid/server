package System.service;


import System.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDao userDao ;

    public List getAllUsers (){
        return userDao.getAllUsers();

    }
}

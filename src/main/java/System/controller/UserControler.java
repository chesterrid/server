package System.controller;


import System.model.User;
import System.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserControler{

    @Autowired
    private UserService userService;
    public @ResponseBody
    List<User> getAllUsers (){
        return userService.getAllUsers();
    }



    @Test

    public void oneTest(){
        System.out.println("тест успешно залит");
    }
}

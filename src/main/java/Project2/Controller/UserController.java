package Project2.Controller;

import Project2.Model.User;
import Project2.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {
    UserService userService;
    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }
    @GetMapping
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    @GetMapping("name/{name}")
    public User getUsername(@PathVariable String name){
        return userService.getUsername(name);
    }
    @GetMapping("id/{id}")
    public User getUserById(@PathVariable int id){
        return userService.getUserById(id);
    }

    @GetMapping("url/{avatarurl}")
    public User getAvatarURL(@PathVariable String name){
        return userService.getAvatarURL(name);
    }

    @GetMapping("password/{password}")
    public User getPassword(@PathVariable String name){
        return userService.getPassword(name);
    }
    @GetMapping("tryId/{tryId}")
    public User getTryId(@PathVariable int id){
        return userService.getTryId(id);
    }
    @PostMapping
    public void createUser(@RequestBody User u){
        userService.createUser(u);
    }
}

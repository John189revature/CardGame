package Project2.Service;

import Project2.DAO.UserRepository;
import Project2.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class UserService{
    UserRepository userRepository;
    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    public List<User> getAllUser(){
        return userRepository.findAll();
    }
    public User getUserById(int id){
        return userRepository.findUserById(id);
    }
    public User getUsername(String name){
        return userRepository.findUsername(name);
    }
    public User getAvatarURL(String name){
        return userRepository.findAvatarURL(name);
    }
    public User getPassword(String name){
        return userRepository.findPassword(name);
    }
    public User getTryId(int id){
        return userRepository.findTryId(id);
    }
    public void createUser(User u){
        userRepository.save(u);
    }
}

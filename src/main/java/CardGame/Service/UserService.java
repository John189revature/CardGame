package CardGame.Service;

import CardGame.DAO.UserRepository;
import CardGame.Model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


@Component
public class UserService{
    UserRepository userRepository;
    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    public List<Users> getAllUser(){
        return userRepository.findAll();
    }
    public Users getUserById(String id){
        return userRepository.findUserById(id);
    }
    public Users getUsername(String name){
        return userRepository.findUsername(name);
    }
    public Users getPassword(String name){
        return userRepository.findPassword(name);
    }
    public Users getTryId(int id){
        return userRepository.findTryId(id);
    }
    public void createUser(Users u){
        userRepository.save(u);
    }
    public void update(Users users) {
        userRepository.save(users);
    }

/*
    public String updateUsers(Users users) {
        Users updateUserID=userRepository.findUserById(users.getUserId());
        Users emailCheck=userRepository.getUserByEmail(users.getEmail());
        Users usernameCheck=userRepository.getUserByUsername(users.getUsername());
        if (updateUserID!=null){
            System.out.println("step1");
            if (usernameCheck!=null&&usernameCheck.getUserById()!=updateUserID.getUserById()) {
                return "User info cannot be updated because username already exists!";
            }else if(emailCheck!=null&&emailCheck.getUserById()!=updateUserID.getUserById()){
                return "User info cannot be updated because the Email already exists for an account. If you own this email, try changing the password.";
            }else if (updateUserID.getUserById()==users.getUserById()){
                userRepository.save(users);
                return "User info successfully updated!";
            }
        }else{
            return "Could not update the users. Please fill out the form correctly";
        }
        return "unknown error";
    }

 */
}

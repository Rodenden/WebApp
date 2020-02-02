package service;

import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import repository.UserRepo;

import java.util.List;

@Service
@Transactional
public class UserService{
    @Autowired
    private UserRepo repository;

    public UserService() {
    }

    public List<User> getAllUsers(){
        return (List<User>) repository.findAll();
    }

    public void addUser(User user){
        repository.save(user);
    }
}

package service;

import entity.User;
import java.util.*;
import api.UserService;

public class UserServiceImp implements UserService {
        List<User> users;

        public UserServiceImp(){
            this.users= new ArrayList<User>();
        }
        public UserServiceImp(List<User> users){
            this.users = users;
        }
        public List<User> getAllUsers(){
            return users;
        }
        public void addUser(User user){
            users.add(user);
        }
        public void removeUserById(long userId){
            for (int i = 0; i<users.size();i++){
                User userFromList = users.get(i);
                if(userFromList.getId()==userId){
                    users.remove(i);
                    break;
                }
            }
        }

}

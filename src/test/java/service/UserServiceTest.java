package service;

import entity.User;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class UserServiceTest {
    @Test
    public void testGetAllUsers() {
        //is
        List<User> users = new ArrayList<User>();
        users.add(new User(1l, "admin", "admin"));
        users.add(new User(2l, "pablo", "admin"));
        //then
        UserServiceImp userService = new UserServiceImp(users);
        List<User> usersFromTestClass = userService.getAllUsers();
        //expected
        Assert.assertEquals(users, usersFromTestClass);
    }
    @Test
    public void testAddUser() {
        //is
        List<User> users = new ArrayList<User>();
        User user = new User(1, "admin", "admin");
        users.add(user);
        //then
        UserServiceImp userService = new UserServiceImp();
        userService.addUser(user);
        List<User> usersFromTestClass = userService.getAllUsers();
        //expected
        Assert.assertEquals(users, usersFromTestClass);
    }
    @Test
    public void testRemoveUser() {
        //is
        List<User> users = new ArrayList<User>();
        User admin = new User(1, "admin", "admin");
        User pablo = new User(2, "pablo", "admin");
        users.add(admin);
        users.add(pablo);
        //then
        UserServiceImp userService = new UserServiceImp(users);
        userService.removeUserById(1l);
        users.remove(admin);
        List<User> usersFromTestClass = userService.getAllUsers();
        //expected
        Assert.assertEquals(users, usersFromTestClass);
    }

}

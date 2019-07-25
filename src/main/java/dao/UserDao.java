package dao;

import bean.User;

public class UserDao {
    private User user;
    public void show(){
        System.out.println(user);
    }

    public void setUser(User user) {
        this.user = user;
    }
}

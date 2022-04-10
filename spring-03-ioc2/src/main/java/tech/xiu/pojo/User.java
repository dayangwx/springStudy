package tech.xiu.pojo;

import lombok.Data;

//@Data
public class User {


    private String username;

    private String hobby;

    private User(String username,String hobby) {
        this.username = username;
        this.hobby = hobby;
    }

    public void getUser() {
        System.out.println("姓名："+this.username);
        System.out.println("爱好："+this.hobby);
    }
}

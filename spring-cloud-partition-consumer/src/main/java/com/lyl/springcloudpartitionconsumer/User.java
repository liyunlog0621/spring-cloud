package com.lyl.springcloudpartitionconsumer;

/**
 * ClassName User
 * Author liyunlong
 * Data 上午 9:31
 * Version 1.0
 **/
public class User {

    private int  id;

    private int  age;

    private String username;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", username='" + username + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public User(int id, int age, String username) {
        this.id = id;
        this.age = age;
        this.username = username;
    }
}

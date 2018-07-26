package com.example.demo.domain;

import java.util.Objects;

public class User {
    private Integer Id;

    private String UserName;

    private Integer Age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(Id, user.Id) &&
                Objects.equals(UserName, user.UserName) &&
                Objects.equals(Age, user.Age);
    }

    @Override
    public int hashCode() {

        return Objects.hash(Id, UserName, Age);
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "Id=" + Id +
                ", UserName='" + UserName + '\'' +
                ", Age=" + Age +
                '}';
    }
}

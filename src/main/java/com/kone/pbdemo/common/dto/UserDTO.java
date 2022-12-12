package com.kone.pbdemo.common.dto;

/**
 * @author Kone
 * @date 2022/6/23
 */
public class UserDTO {
    private String username;
    private Integer userId;
    private String name;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "username='" + username + '\'' +
                ", userId=" + userId +
                ", name='" + name + '\'' +
                '}';
    }
}

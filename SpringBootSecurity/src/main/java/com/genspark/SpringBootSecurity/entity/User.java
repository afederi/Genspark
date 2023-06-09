package com.genspark.SpringBootSecurity.entity;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;


/**
 * The entity class is what is used to set up the table and its columns
 */
@Entity
@Table(name="tbl_users")
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userID;
    private String username;
    private String password;

    private String role="NORMAL";


    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}

package com.genspark.SpringBootSecurity.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_users")
public class User {

    @Id
    private String userName;
    private String passowrd;





}

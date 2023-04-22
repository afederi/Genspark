package org.genspark.entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name="tbl_users")
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //This needs the {TableName}_seq for it to work. So for if you truncate, you need to drop it because it won't populate
    private long user_id;

    private String username;

    private String password;

    private String role;

    public User(String username, String password, String role){
        this.username = username;
        this.password = password;
        this.role = role;
    }

}

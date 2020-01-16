package model;

import javax.persistence.*;

@Entity
@Table
public class User {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long userId;
@Column
private String username;
@Column
private String password;
@Column
private Integer balance;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
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

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

}

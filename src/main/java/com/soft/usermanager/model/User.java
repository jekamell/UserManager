package com.soft.usermanager.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="User")
@Table(name="user")
public class User {
    @Id
    private Long id;
    private String login;
    private String password;
    @Column(name = "name_first")
    private String nameFirst;
    @Column(name = "name_last")
    private String nameLast;
    private String email;
    @Column(name = "phone")
    private Long phoneNumber;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNameFirst() {
        return nameFirst;
    }

    public void setNameFirst(String nameFirst) {
        this.nameFirst = nameFirst;
    }

    public String getNameLast() {
        return nameLast;
    }

    public void setNameLast(String nameLast) {
        this.nameLast = nameLast;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

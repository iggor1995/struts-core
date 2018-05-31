package com.epam.igor.model;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "USERS")
public class User extends BaseEntity{

    //@Column(name = "BIRTHDAY")
   // @Convert(converter = DateTimeConverter.class)
   // private LocalDate birthday;
    @Column(name = "EMAIL")
    private String    email;
    @Column(name = "NAME")
    private String    name;
    @Column(name = "PASSWORD")
    private String password;
    //@Column(name = "ROLE")
   // private Role role = Role.ROLE_REGISTERED_USER;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public LocalDate getBirthday() {
//        return birthday;
//    }
//
//    public void setBirthday(LocalDate birthday) {
//        this.birthday = birthday;
//    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    public Role getRole() {
//        return role;
//    }
//
//    public void setRole(Role role) {
//        this.role = role;
//    }

    @Override
    public String toString() {
        return "User{" +
               // "birthday=" + birthday +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

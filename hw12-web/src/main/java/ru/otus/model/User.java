package ru.otus.model;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_id_seq")
    @Column(name = "id")
    public Long id;

    @Column(name = "name")
    public String name;

    @Column(name = "login")
    public String login;

    @Column(name = "password")
    public String password;

    @Column(name = "role")
    public String role;

    public User(){}

    public User(Long id, String name, String login, String password, String role) {
        this.id = id;
        this.name = name;
        this.login = login;
        this.password = password;
        this.role = role;
    }
}

package ru.otus.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    public User(){}

    public User(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_id_seq")
    @Column(name = "id")
    public Integer id;

    @Column(name = "name")
    public String name;

    @Column(name = "age")
    public Integer age;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    public AddressInfo address;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    public List<PhoneDataSet> phones;

    @Override
    public String toString() {
        return "User id = " + this.id + ", name = " +
                this.name + ", age = " + this.age;
    }

}

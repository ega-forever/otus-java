package ru.otus.models;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name = "accounts")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "account_id_seq")
    @Column(name = "id")
    public BigInteger id;

    @Column(name = "type")
    public String type;

    @Column(name = "rest")
    public Integer rest;

    @Override
    public String toString() {
        return "User id = " + this.id + ", type = " +
                this.type + ", rest = " + this.rest;
    }

}

package ru.otus.models;

import javax.persistence.*;

@Entity
@Table(name = "phone_data_set")
public class PhoneDataSet {

    public PhoneDataSet(){}

    public PhoneDataSet(String number){
        this.number = number;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "phone_data_set_id_seq")
    @Column(name = "id")
    public Integer id;

    @Column(name = "phone")
    public String number;

}

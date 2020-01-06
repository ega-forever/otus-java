package ru.otus.models;

import javax.persistence.*;

@Entity
@Table(name = "address_data_set")
public class AddressDataSet {

    public AddressDataSet(){}

    public AddressDataSet(String street){
        this.street = street;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "address_data_set_id_seq")
    @Column(name = "id")
    public Integer id;

    @Column(name = "street")
    public String street;
}

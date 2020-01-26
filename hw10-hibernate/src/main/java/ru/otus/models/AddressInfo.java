package ru.otus.models;

import javax.persistence.*;

@Entity
@Table(name = "address_info")
public class AddressInfo {

    public AddressInfo(){}

    public AddressInfo(String street){
        this.street = street;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "address_info_id_seq")
    @Column(name = "id")
    public Integer id;

    @Column(name = "street")
    public String street;
}

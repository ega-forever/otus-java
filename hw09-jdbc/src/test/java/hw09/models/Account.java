package hw09.models;

import ru.otus.orm.annotations.*;

import java.math.BigInteger;

@Table(name = "my_account_table")
public class Account {

    @Id
    @BigInt
    public BigInteger id;

    @Varchar(size = 255)
    public String type;

    @Int(size = 3)
    public Integer rest;

    @Override
    public String toString() {
        return "User id = " + this.id + ", type = " +
                this.type + ", rest = " + this.rest;
    }

}

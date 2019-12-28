package ru.otus.main.models;

import ru.otus.orm.annotations.Id;
import ru.otus.orm.annotations.Int;
import ru.otus.orm.annotations.Table;
import ru.otus.orm.annotations.Varchar;

@Table(name = "my_user_table")
public class User {

    @Id
    public Integer id;

    @Varchar(size = 255)
    public String name;

    @Int(size = 3)
    public Integer age;

    @Override
    public String toString() {
        return "User id = " + this.id + ", name = " +
                this.name + ", age = " + this.age;
    }

}

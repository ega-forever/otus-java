package ru.otus.orm.constants;

public enum Types {
    INTEGER("int"),
    BIGINTEGER("bigint"),
    LONG("long"),
    VARCHAR("varchar");

    private String currentType;

    Types(String s) {
        this.currentType = s;
    }

    public String getType(){
        return this.currentType;
    }
}

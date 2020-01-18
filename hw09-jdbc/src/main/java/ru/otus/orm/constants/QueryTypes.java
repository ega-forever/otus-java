package ru.otus.orm.constants;

public enum QueryTypes {
    CREATE("CREATE"),
    UPDATE("UPDATE"),
    SELECT("SELECT");

    private String currentType;

    QueryTypes(String s) {
        this.currentType = s;
    }

    public String getType(){
        return this.currentType;
    }
}

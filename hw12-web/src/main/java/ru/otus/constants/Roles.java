package ru.otus.constants;

public enum Roles {
    USER("USER"),
    ADMIN("ADMIN");

    private String type;

    Roles(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

}

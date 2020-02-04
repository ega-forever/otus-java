package ru.otus.constants;

public enum SessionAttributes {
    ROLE("ROLE"),
    USER_ID("USER_ID");

    private String type;

    SessionAttributes(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

}

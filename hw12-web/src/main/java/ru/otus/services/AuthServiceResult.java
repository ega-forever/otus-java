package ru.otus.services;

public class AuthServiceResult {

    private Object id;
    private String role;

    public AuthServiceResult(Object id, String role) {
        this.id = id;
        this.role = role;
    }

    public Object getId() {
        return this.id;
    }

    public String getRole() {
        return this.role;
    }

}

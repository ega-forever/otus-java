package ru.otus.services;

public class AuthServiceResult {

    public Object id;
    public String role;

    public AuthServiceResult(Object id, String role) {
        this.id = id;
        this.role = role;
    }

}

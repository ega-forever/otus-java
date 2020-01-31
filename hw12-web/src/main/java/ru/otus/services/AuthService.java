package ru.otus.services;

public interface AuthService {
    AuthServiceResult authenticate(String login, String password);
}

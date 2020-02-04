package ru.otus.server;

public interface AppWebServer {
    void start() throws Exception;

    void join() throws Exception;

    void stop() throws Exception;
}

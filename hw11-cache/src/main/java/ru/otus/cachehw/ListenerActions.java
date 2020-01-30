package ru.otus.cachehw;

public enum ListenerActions {
    INSERT("INSERT"),
    SELECT("SELECT"),
    DELETE("DELETE");

    private String action;

    ListenerActions(String action) {
        this.action = action;
    }

    public String getAction() {
        return this.action;
    }

}

package com.test.designPattern.behaviour.memento;

// Memento class - stores the state
public class ConfigurationMemento {
    private final String theme;
    private final int fontSize;
    private final boolean notificationsEnabled;
    private final String language;


    public ConfigurationMemento(String theme, int fontSize, boolean notificationsEnabled, String language) {
        this.theme = theme;
        this.fontSize = fontSize;
        this.notificationsEnabled = notificationsEnabled;
        this.language = language;
    }

    public String getTheme() {
        return theme;
    }

    public int getFontSize() {
        return fontSize;
    }

    public boolean isNotificationsEnabled() {
        return notificationsEnabled;
    }

    public String getLanguage() {
        return language;
    }

    @Override
    public String toString() {
        return "ConfigurationMemento{" +
                "theme='" + theme + '\'' +
                ", fontSize=" + fontSize +
                ", notificationsEnabled=" + notificationsEnabled +
                ", language='" + language + '\'' +
                '}';
    }
}

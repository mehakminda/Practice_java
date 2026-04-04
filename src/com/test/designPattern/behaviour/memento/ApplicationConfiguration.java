package com.test.designPattern.behaviour.memento;

// Originator class - creates and restores from mementos
public class ApplicationConfiguration {
    // State
    private String theme;
    private int fontSize;
    private boolean notificationsEnabled;
    private String language;

    public ApplicationConfiguration(String theme, int fontSize, boolean notificationsEnabled, String language) {
        this.theme = theme;
        this.fontSize = fontSize;
        this.notificationsEnabled = notificationsEnabled;
        this.language = language;
    }

    // Create a memento with current state
    public ConfigurationMemento save(){
        System.out.println("[+] Saving configuration state...");
        return new ConfigurationMemento(theme, fontSize, notificationsEnabled, language);
    }

    // Restore state from memento
    public void restore(ConfigurationMemento memento){
        this.theme = memento.getTheme();
        this.fontSize = memento.getFontSize();
        this.language = memento.getLanguage();
        this.notificationsEnabled =  memento.isNotificationsEnabled();
    }

    // Setters to modify state

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public void setNotificationsEnabled(boolean notificationsEnabled) {
        this.notificationsEnabled = notificationsEnabled;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "ApplicationConfiguration{" +
                "theme='" + theme + '\'' +
                ", fontSize=" + fontSize +
                ", notificationsEnabled=" + notificationsEnabled +
                ", language='" + language + '\'' +
                '}';
    }
}

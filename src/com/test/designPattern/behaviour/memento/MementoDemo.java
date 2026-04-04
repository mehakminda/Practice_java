package com.test.designPattern.behaviour.memento;

public class MementoDemo {
    static void main() {
        ConfigurationManager configManager =new ConfigurationManager();
        ApplicationConfiguration appConfig = new ApplicationConfiguration("world",10,true,"English");
        configManager.saveState(appConfig);

        appConfig.setLanguage("Spanish");
        appConfig.setTheme("peace");
        configManager.saveState(appConfig);

        appConfig.setNotificationsEnabled(false);
        configManager.saveState(appConfig);

        appConfig.setLanguage("French");
        configManager.saveState(appConfig);


        configManager.undo(appConfig);
        configManager.undo(appConfig);
        configManager.undo(appConfig);
        configManager.undo(appConfig);
        configManager.undo(appConfig);



    }
}

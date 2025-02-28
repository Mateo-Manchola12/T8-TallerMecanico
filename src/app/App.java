package app;

import app.menu.MenuController;

public class App {
    public static void main(String[] args) throws Exception {
        MenuController menuController = new MenuController();
        menuController.start();
    }
}
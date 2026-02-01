/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dev.ivanrodrigues.medflow.controller;

import dev.ivanrodrigues.medflow.ui.AppUI;
import dev.ivanrodrigues.medflow.ui.layouts.Main;

/**
 *
 * @author ivan8505
 */
public class AppUIController {

    private final Main main;
    private final AppUI app;
    public static final byte ACCESS_ADMIN_ROLE = 0;
    public static final byte ACCESS_USER_ROLE = 1;

    public AppUIController(Main main, AppUI app) {
        this.main = main;
        this.app = app;
    }

    public void showLogin() {
        main.show("LOGIN");
    }

    public void showDashboard() {
        main.show("DASHBOARD");
    }

    public void logout() {
        main.show("LOGIN");
    }

    public void setTitleAppUI(String title) {
        app.setTitle(title);
    }

    public void setAccessLevel(byte access) {

        if (access == ACCESS_ADMIN_ROLE) {
            app.accessAdmin();
        } else if (access == ACCESS_USER_ROLE){
            app.accessUser();
        }

        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

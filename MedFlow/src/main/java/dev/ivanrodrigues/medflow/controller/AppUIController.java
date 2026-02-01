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

    public void setUser(String admin) {

        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

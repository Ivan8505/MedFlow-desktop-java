package dev.ivanrodrigues.medflow.controller;

import dev.ivanrodrigues.medflow.infraestrutura.SessionsUsersDTO;
import dev.ivanrodrigues.medflow.objects.UsersDTO;
import dev.ivanrodrigues.medflow.rules.contracts.AuthenticationRule;
import dev.ivanrodrigues.medflow.rules.contracts.NavigationRules;
import dev.ivanrodrigues.medflow.rules.services.AuthenticationService;
import dev.ivanrodrigues.medflow.ui.AppUI;
import dev.ivanrodrigues.medflow.ui.layouts.Login;
import javax.swing.JMenuItem;

/**
 *
 * @author ivan8505
 */
public class AppUIController {

    private final AppUI app;

    public AppUIController(AppUI app) {
        this.app = app;
    }

    public void setSessionsMenuBar(String access, SessionsUsersDTO session) {

        app.cleanSessionMenuBar();

        if (access.equals("all")) {
            app.setMenuBarVisible(true);
        }

        for (UsersDTO user : session.getSessions()) {
            JMenuItem item = new JMenuItem(user.getUsername());
            app.setSessionMenuBar(item);
        }

    }

    public void login(NavigationRules navR, LoginUIController logC) {
        setTitle("Med Flow - Login");
        Login log = new Login(navR, logC);
        navR.registerPanels("Login", log);
        navR.showPanel("Login");
    }

    public void logout(NavigationRules navR, LoginUIController logC, SessionsUsersDTO session) {
        Login log = new Login(navR, logC);
        navR.removePanel(log);
        login(navR, logC);
        session.delSession("admin");
    }

    public void setTitle(String title) {
        app.setTitle(title);
    }

    public UsersDTO firstLogin(NavigationRules navR, LoginUIController logC) {
        login(navR, logC);
        AuthenticationRule authr = new AuthenticationService();
        return authr.firstLogin();
    }

}

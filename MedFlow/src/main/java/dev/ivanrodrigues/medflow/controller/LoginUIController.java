package dev.ivanrodrigues.medflow.controller;

import dev.ivanrodrigues.medflow.objects.LoginDTO;
import dev.ivanrodrigues.medflow.rules.contracts.AuthenticationRule;
import dev.ivanrodrigues.medflow.rules.services.Authentication;
import dev.ivanrodrigues.medflow.ui.layouts.Dashboard;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ivan8505
 */
public class LoginUIController {

    private final AppUIController appc;

    public LoginUIController(AppUIController appc) {
        this.appc = appc;
    }

    public void Login(String username, char[] passwdUser, JPanel loginUi) {

        if (passwdUser.length == 0 || "".equals(username)) {
            JOptionPane.showMessageDialog(loginUi, "Username and password are required");
        } else {
            LoginDTO loginDto = new LoginDTO(username, passwdUser);
            AuthenticationRule authr = new Authentication();
            boolean authSucess = authr.login(loginDto);
            if (authSucess) {
                JOptionPane.showMessageDialog(loginUi, "Welcome");

                appc.removePanel(loginUi);
                appc.registerPanels("DASHBOARD", new Dashboard(appc));
                appc.showPanel("Dashboard");
                appc.setTitleAppUI("Med Flow - Dashboard");
                appc.setAccessLevel((byte) AppUIController.ACCESS_ADMIN_ROLE);
                appc.setSessions("admin");
            } else {
                JOptionPane.showMessageDialog(loginUi, "Incorrect username or password");
            }
        }
    }
}

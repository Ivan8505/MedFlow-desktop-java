package dev.ivanrodrigues.medflow.controller;

import dev.ivanrodrigues.medflow.objects.LoginDTO;
import dev.ivanrodrigues.medflow.objects.UsersDTO;
import dev.ivanrodrigues.medflow.rules.contracts.AuthenticationRule;
import dev.ivanrodrigues.medflow.rules.contracts.NavigationRules;
import dev.ivanrodrigues.medflow.rules.services.Authentication;
import dev.ivanrodrigues.medflow.ui.layouts.Dashboard;
import javax.swing.JPanel;

/**
 *
 * @author ivan8505
 */
public class LoginUIController {

    private final NavigationRules navR;
    private UsersDTO userDTO;

    public LoginUIController(NavigationRules navC) {
        this.navR = navC;
    }

    public String login(String username, char[] passwdUser, JPanel loginUi) {

        if (passwdUser.length == 0 || "".equals(username)) {
            return "Username and password are required";
        } else {
            LoginDTO loginDto = new LoginDTO(username, passwdUser);
            AuthenticationRule authr = new Authentication();
            userDTO = authr.login(loginDto);
            if (userDTO != null) {
                registerSession(userDTO);
                return "Welcome";
            } else {
                return "Incorrect username or password";
            }
        }
    }

    private void registerSession(UsersDTO usersDTO) {
        navR.session(usersDTO);
        navR.registerPanels("Dashboard", new Dashboard(navR));
        navR.showPanel("Dashboard");
        navR.setTitle("Med Flow - Dashboard");
    }
}
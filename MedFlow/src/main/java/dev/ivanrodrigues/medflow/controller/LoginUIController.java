package dev.ivanrodrigues.medflow.controller;

import dev.ivanrodrigues.medflow.infraestrutura.database.DataBaseUsersDTO;
import dev.ivanrodrigues.medflow.objects.LoginDTO;
import dev.ivanrodrigues.medflow.objects.UsersDTO;
import dev.ivanrodrigues.medflow.rules.contracts.AuthenticationRule;
import dev.ivanrodrigues.medflow.rules.contracts.NavigationRules;
import dev.ivanrodrigues.medflow.rules.services.AuthenticationService;
import dev.ivanrodrigues.medflow.ui.layouts.Dashboard;
import javax.swing.JPanel;

/**
 *
 * @author ivan8505
 */
public class LoginUIController {

    private final NavigationRules navR;
    private UsersDTO userDTO;
    private final DataBaseUsersDTO dbusersDTO;

    public LoginUIController(NavigationRules navC, DataBaseUsersDTO dbusersDTO) {
        this.navR = navC;
        this.dbusersDTO = dbusersDTO;
    }

    public String login(String username, char[] passwdUser, JPanel loginUi) {

        if (passwdUser.length == 0 || "".equals(username)) {
            return "Username and password are required";
        } else {
            LoginDTO loginDto = new LoginDTO(username, passwdUser);
            AuthenticationRule authr = new AuthenticationService();
            userDTO = authr.login(loginDto, findUser(dbusersDTO, loginDto.getUsername()));
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

    private UsersDTO findUser(DataBaseUsersDTO dbusersDTO, String username) {

        for (UsersDTO user : dbusersDTO.getUsersDTO()) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

}

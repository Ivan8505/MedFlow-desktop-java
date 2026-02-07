package dev.ivanrodrigues.medflow.rules.services;

import dev.ivanrodrigues.medflow.objects.LoginDTO;
import dev.ivanrodrigues.medflow.objects.UsersDTO;
import dev.ivanrodrigues.medflow.rules.contracts.AuthenticationRule;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author ivan8505
 */
public class AuthenticationService implements AuthenticationRule {

    @Override
    public UsersDTO login(LoginDTO loginDTO, UsersDTO usersDTO) {

        boolean isValidUsername = loginDTO.getUsername().equals(usersDTO.getUsername());
        boolean isValidPassword = Arrays.equals(loginDTO.getPasswdUser(), usersDTO.getPassword());
        boolean isValiduser = isValidPassword && isValidUsername;

        if (isValiduser) {
            UsersDTO userDTO = new UsersDTO();
            userDTO.setUsername(loginDTO.getUsername());
            userDTO.setPassword(loginDTO.getPasswdUser());
            userDTO.setFullName("Administrator");
            userDTO.setAccess(new ArrayList<>(Arrays.asList("ADMINISTRATOR", "DOCTOR")));
            return userDTO;
        }

        return null;
    }

    public UsersDTO firstLogin() {
        UsersDTO usersDTO = new UsersDTO();
        String username = "admin";
        char[] password = {'1', '2', '3', '4', '5', '6'};
        usersDTO.setUsername(username);
        usersDTO.setFullName("Administrator");
        usersDTO.setPassword(password.clone());
        usersDTO.setSetor("Admin");
        return usersDTO;
    }
}

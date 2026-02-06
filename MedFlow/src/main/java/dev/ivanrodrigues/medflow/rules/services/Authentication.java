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
public class Authentication implements AuthenticationRule {

    private final String validUser = "admin";
    private final char[] validPassword = {'1', '2', '3', '4'};

    @Override
    public UsersDTO login(LoginDTO loginDTO) {

        boolean isValidUsername = loginDTO.getUsername().equals(validUser);
        boolean isValidPassword = Arrays.equals(loginDTO.getPasswdUser(), validPassword);
        boolean isValiduser = isValidPassword && isValidUsername;

        if (isValiduser) {
            UsersDTO userDTO = new UsersDTO();
            userDTO.setUsername(loginDTO.getUsername());
            userDTO.setFullName("Administrator");
            userDTO.setAccess(new ArrayList<>(Arrays.asList("ADMINISTRATOR")));
            return userDTO;
        }

        return null;
    }

}

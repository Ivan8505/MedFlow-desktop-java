package dev.ivanrodrigues.medflow.rules.contracts;

import dev.ivanrodrigues.medflow.objects.LoginDTO;
import dev.ivanrodrigues.medflow.objects.UsersDTO;

/**
 *
 * @author ivan8505
 */
public interface AuthenticationRule {

    UsersDTO login(LoginDTO loginDTO, UsersDTO usersDTO);
    
    UsersDTO firstLogin();

}

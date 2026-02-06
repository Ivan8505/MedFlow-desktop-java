package dev.ivanrodrigues.medflow.rules.services;

import dev.ivanrodrigues.medflow.objects.UsersDTO;
import dev.ivanrodrigues.medflow.rules.contracts.AccessConfigRule;
import java.util.Set;

/**
 *
 * @author ivan8505
 */
public class AccessConfigService implements AccessConfigRule {

    @Override
    public Set<String> resolvePages(UsersDTO user) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

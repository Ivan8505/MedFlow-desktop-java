package dev.ivanrodrigues.medflow.rules.contracts;

import dev.ivanrodrigues.medflow.objects.UsersDTO;
import java.util.Set;

/**
 *
 * @author ivan8505
 */
public interface AccessConfigRule {
    
    
    public Set<String> resolvePages(UsersDTO user);
    
}

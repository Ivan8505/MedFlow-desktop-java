package dev.ivanrodrigues.medflow.rules.contracts;

import dev.ivanrodrigues.medflow.objects.UsersDTO;
import javax.swing.JPanel;

/**
 *
 * @author ivan8505
 */
public interface NavigationRules {
    
    void registerPanels(String name,JPanel panel);
    
    void showPanel(String panel);
    
    void removePanel(JPanel panel);
    
    void session(UsersDTO usersDTO);
    
    void setTitle(String title);    
            
}

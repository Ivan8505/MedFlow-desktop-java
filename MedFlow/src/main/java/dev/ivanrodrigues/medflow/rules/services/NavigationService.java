package dev.ivanrodrigues.medflow.rules.services;

import dev.ivanrodrigues.medflow.SessionsUsers;
import dev.ivanrodrigues.medflow.objects.UsersDTO;
import dev.ivanrodrigues.medflow.rules.contracts.NavigationRules;
import dev.ivanrodrigues.medflow.ui.layouts.Main;
import javax.swing.JPanel;

/**
 *
 * @author ivan8505
 */
public class NavigationService implements NavigationRules{

    private final Main main;
    private final SessionsUsers sessions;

    public NavigationService(Main main, SessionsUsers sessions) {
        this.main = main;
        this.sessions = sessions;
    }

    public void registerPanels(String name, JPanel panel) {
        main.add(panel, name);
    }

    public void showPanel(String panel) {
        main.show(panel);
    }

    public void removePanel(JPanel panel) {
        main.remove(panel);
    }
    
    public void session(UsersDTO usersDTO){
        sessions.addSession(usersDTO);
    }

}

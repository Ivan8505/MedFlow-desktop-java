package dev.ivanrodrigues.medflow.rules.services;

import dev.ivanrodrigues.medflow.infraestrutura.SessionsUsersDTO;
import dev.ivanrodrigues.medflow.controller.AppUIController;
import dev.ivanrodrigues.medflow.objects.UsersDTO;
import dev.ivanrodrigues.medflow.rules.contracts.NavigationRules;
import dev.ivanrodrigues.medflow.ui.layouts.Main;
import javax.swing.JPanel;

/**
 *
 * @author ivan8505
 */
public class NavigationService implements NavigationRules {

    private final Main main;
    private final SessionsUsersDTO sessions;
    private final AppUIController appC;

    public NavigationService(Main main, SessionsUsersDTO sessions, AppUIController appC) {
        this.main = main;
        this.sessions = sessions;
        this.appC = appC;
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

    public void session(UsersDTO usersDTO) {
        sessions.addSession(usersDTO);
        setAccess(usersDTO);
    }

    public void setTitle(String title) {
        appC.setTitle(title);
    }

    private void setAccess(UsersDTO usersDTO) {
        usersDTO.getAccess();

        for (String access : usersDTO.getAccess()) {
            switch (access) {
                case "ADMINISTRATOR" -> {
                    appC.setSessionsMenuBar("all", sessions);
                    System.out.println("Admin");
                    return;
                }

                case "DOCTOR" ->
                    System.out.println("Doctor");

                case "RECEPTIONIST" ->
                    System.out.println("Receptionist");
            }
        }

    }

}

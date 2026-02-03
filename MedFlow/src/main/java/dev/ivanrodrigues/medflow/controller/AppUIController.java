package dev.ivanrodrigues.medflow.controller;

import dev.ivanrodrigues.medflow.ui.AppUI;
import dev.ivanrodrigues.medflow.ui.layouts.EditProfile;
import dev.ivanrodrigues.medflow.ui.layouts.Main;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author ivan8505
 */
public class AppUIController {

    private final Main main;
    private final AppUI app;
    private final ArrayList<String> sessions = new ArrayList<>();
    public static final byte ACCESS_ADMIN_ROLE = 0;
    public static final byte ACCESS_USER_ROLE = 1;

    public AppUIController(Main main, AppUI app) {
        this.sessions.add("other user");
        this.main = main;
        this.app = app;
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

    public void setTitleAppUI(String title) {
        app.setTitle(title);
    }

    public void setAccessLevel(byte access) {

        if (access == ACCESS_ADMIN_ROLE) {
            app.accessAdmin();
        } else if (access == ACCESS_USER_ROLE) {
            //app.accessUser();
        }
    }

    public void editPassword() {
        main.show("Edit Profile");
        setTitleAppUI("Edit Password");
        registerPanels("Edit Profile", new EditProfile(this));
        showPanel("Edit Profile");
    }

    public void setSessions(String username) {
        sessions.add(username);
        app.setSessionMenuBar(sessions);
    }

}

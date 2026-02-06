package dev.ivanrodrigues.medflow;

import dev.ivanrodrigues.medflow.objects.UsersDTO;
import java.util.ArrayList;

/**
 *
 * @author ivan8505
 */
public class SessionsUsers {

    private ArrayList<UsersDTO> sessions;

    public SessionsUsers() {
        this.sessions = new ArrayList<>();
    }

    public ArrayList<UsersDTO> getSessions() {
        return sessions;
    }

    public void setSessions(ArrayList<UsersDTO> sessions) {
        this.sessions = sessions;
    }

    public void addSession(UsersDTO user) {
        sessions.add(user);
    }

}

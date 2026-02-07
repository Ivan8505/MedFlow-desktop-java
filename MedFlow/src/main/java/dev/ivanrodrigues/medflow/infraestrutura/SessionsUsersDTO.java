package dev.ivanrodrigues.medflow.infraestrutura;

import dev.ivanrodrigues.medflow.objects.UsersDTO;
import java.util.ArrayList;

/**
 *
 * @author ivan8505
 */
public class SessionsUsersDTO {

    private ArrayList<UsersDTO> sessions;

    public SessionsUsersDTO() {
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
    
    public void delSession(String username){
        sessions.removeIf(user -> user.getUsername().equals(username));
    }

}

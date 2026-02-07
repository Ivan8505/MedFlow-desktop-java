package dev.ivanrodrigues.medflow.infraestrutura.database;

import dev.ivanrodrigues.medflow.objects.UsersDTO;
import java.util.ArrayList;

/**
 *
 * @author ivan8505
 */
public class DataBaseUsersDTO {

    private ArrayList<UsersDTO> usersDTO;
    
    public DataBaseUsersDTO(){
        this.usersDTO = new ArrayList();
    }

    public ArrayList<UsersDTO> getUsersDTO() {
        return usersDTO;
    }

    public void setUsersDTO(ArrayList<UsersDTO> usersDTO) {
        this.usersDTO = usersDTO;
    }

    public void addUserDB(UsersDTO user) {
        usersDTO.add(user);
    }

    public void delSession(String username) {
        usersDTO.removeIf(user -> user.getUsername().equals(username));
    }

}

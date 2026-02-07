package dev.ivanrodrigues.medflow.objects;

import java.util.ArrayList;

/**
 *
 * @author ivan8505
 */
public class UsersDTO {

    private String username;
    private char[] password;
    private String fullName;
    private String setor;
    private ArrayList<String> access;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public char[] getPassword() {
        return password;
    }

    public void setPassword(char[] password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public ArrayList<String> getAccess() {
        return access;
    }

    public void setAccess(ArrayList<String> access) {
        this.access = access;
    }

}

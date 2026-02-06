package dev.ivanrodrigues.medflow.objects;

/**
 *
 * @author ivan8505
 */

public class LoginDTO {

    private String nomeUser;
    private char[] passwdUser;
    
    public String getUsername() {
        return nomeUser;
    }

    public void setUsername(String nomeUser) {
        this.nomeUser = nomeUser;
    }

    public char[] getPasswdUser() {
        return passwdUser;
    }

    public void setPasswdUser(char[] passwdUser) {
        this.passwdUser = passwdUser;
    }

    public LoginDTO(String nomeUser, char[] passwdUser) {
        this.nomeUser = nomeUser;
        this.passwdUser = passwdUser;
    }



}

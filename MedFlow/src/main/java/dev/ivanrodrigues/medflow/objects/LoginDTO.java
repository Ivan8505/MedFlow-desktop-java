/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package dev.ivanrodrigues.medflow.objects;

/**
 *
 * @author ivan8505
 */

public class LoginDTO {

    private String nomeUser;
    private char[] passwdUser;
    
    public String getNomeUser() {
        return nomeUser;
    }

    public void setNomeUser(String nomeUser) {
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

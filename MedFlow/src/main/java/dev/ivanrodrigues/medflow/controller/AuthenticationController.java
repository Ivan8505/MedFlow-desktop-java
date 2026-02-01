/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package dev.ivanrodrigues.medflow.controller;

import dev.ivanrodrigues.medflow.rules.Authentication;
import dev.ivanrodrigues.medflow.rules.contracts.AuthenticationRule;

/**
 *
 * @author ivan8505
 */

public class AuthenticationController {

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

    public AuthenticationController(String nomeUser, char[] passwdUser) {
        this.nomeUser = nomeUser;
        this.passwdUser = passwdUser;
    }

    public boolean Login() {
        //System.out.println(getNomeUser() + getPasswdUser());
        AuthenticationRule auth = new Authentication();
        boolean authSucess = auth.login(nomeUser, passwdUser);
        return authSucess;



    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package dev.ivanrodrigues.medflow.controller;

import dev.ivanrodrigues.medflow.rules.AuthenticationRule;

/**
 *
 * @author ivan8505
 */

public class AuthenticationController {
    
    private String nomeUser;
    private String passwdUser;

    public String getNomeUser() {
        return nomeUser;
    }

    public void setNomeUser(String nomeUser) {
        this.nomeUser = nomeUser;
    }

    public String getPasswdUser() {
        return passwdUser;
    }

    public void setPasswdUser(String passwdUser) {
        this.passwdUser = passwdUser;
    }

    public AuthenticationController(String nomeUser, String passwdUser) {
        this.nomeUser = nomeUser;
        this.passwdUser = passwdUser;
    }
    
    public void Login(){
        System.out.println(getNomeUser()+getPasswdUser());
        /*AuthenticationRule authr = new AuthenticationRule() {
            @Override
            private boolean login() {
                return super.login(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
            }
        }*/
        
    }
    
    
}

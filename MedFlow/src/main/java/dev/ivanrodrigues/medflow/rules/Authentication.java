/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package dev.ivanrodrigues.medflow.rules;

import dev.ivanrodrigues.medflow.rules.contracts.AuthenticationRule;
import java.util.Arrays;

/**
 *
 * @author ivan8505
 */

public class Authentication implements AuthenticationRule {
    
    private final String validUser = "admin";
    private final char[] validPassword = {'1', '2', '3', '4'};
    private boolean username;
    private boolean password;

    @Override
    public boolean login(String username, char[] password) {
        this.username = validUser.equals(username);
        this.password = Arrays.equals(password, validPassword);    
        return this.username && this.password;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean creatUser(String username, char[] password) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean deleteUser(String username, char[] password) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
}

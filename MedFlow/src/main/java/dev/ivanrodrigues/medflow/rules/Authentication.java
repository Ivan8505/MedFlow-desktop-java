/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package dev.ivanrodrigues.medflow.rules;

/**
 *
 * @author ivan8505
 */

public class Authentication implements AuthenticationRule {
    
    private final String validUser = "admin";
    private final String validPassword = "1234";
    private boolean username;
    private boolean password;

    @Override
    public boolean login(String username, String password) {
        this.username = validUser.equals(username);
        this.password = validPassword.equals(password);    
        return this.username && this.password;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean creatUser(String username, String password) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean deleteUser(String username, String password) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
}

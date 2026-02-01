/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dev.ivanrodrigues.medflow.rules.contracts;

/**
 *
 * @author ivan8505
 */
public interface AuthenticationRule {
    
    boolean login(String username, char[] password);
    boolean creatUser(String username, char[] password);
    boolean deleteUser(String username, char[] password);
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dev.ivanrodrigues.medflow.rules.contracts;

import dev.ivanrodrigues.medflow.objects.LoginDTO;

/**
 *
 * @author ivan8505
 */
public interface AuthenticationRule {

    boolean login(LoginDTO loginDTO);

}

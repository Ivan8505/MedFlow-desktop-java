/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dev.ivanrodrigues.medflow.rules.services;

import dev.ivanrodrigues.medflow.objects.LoginDTO;
import dev.ivanrodrigues.medflow.rules.contracts.AuthenticationRule;
import java.util.Arrays;

/**
 *
 * @author ivan8505
 */
public class Authentication implements AuthenticationRule {

    private final String validUser = "admin";
    private final char[] validPassword = {'1', '2', '3', '4'};

    @Override
    public boolean login(LoginDTO loginDTO) {

        boolean isValidUser = loginDTO.getNomeUser().equals(validUser);
        boolean isValidPassword = Arrays.equals(loginDTO.getPasswdUser(), validPassword);
        return isValidPassword && isValidUser;
    }

}

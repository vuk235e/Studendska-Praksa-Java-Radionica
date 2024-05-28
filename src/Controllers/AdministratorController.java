/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Daos.AdministratorDAO;
import Models.Administrator;
import java.util.List;

/**
 *
 * @author student2
 */
public class AdministratorController {
    
    private AdministratorDAO adminDAO;
    
    public boolean checkUser(String email, String password) {
        adminDAO = new AdministratorDAO();
        List<Administrator> lista = adminDAO.getAllAdministrators();
        for (Administrator a : lista) {
        if (a.getEmail()==email && a.getSifra()==password) {
            return true;
        }
    }
      return false;  
    }
    
    public boolean insertAdmin(String email, String password) {
        adminDAO = new AdministratorDAO();
        Administrator a = new Administrator(email, password);
        if (adminDAO.addAdministrator(a)) {
            return true;
        }
        else return false;
    }
    
}

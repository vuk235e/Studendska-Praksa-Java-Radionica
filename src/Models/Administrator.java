/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author student2
 */
public class Administrator {
    
    private int id;
    private String email;
    private String sifra;

    public Administrator() {
    }

    
    
    public Administrator(String email, String sifra) {
        Random random = new Random();
        this.id = ThreadLocalRandom.current().nextInt(10000, 100000);
        this.email = email;
        this.sifra = sifra;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    

    public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSifra() {
        return sifra;
    }

    public void setSifra(String sifra) {
        this.sifra = sifra;
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author student2
 */
public class Kompanija {
    private String nazivKompanije;
    private String mesto;
    private int pib;
    private String webAdresa;
    private int zipCode;
    

    public String getNazivKompanije() {
        return nazivKompanije;
    }

    public void setNazivKompanije(String naziv) {
        this.nazivKompanije = naziv;
    }

    public String getMesto() {
        return mesto;
    }

    public void setMesto(String mesto) {
        this.mesto = mesto;
    }

    public int getPib() {
        return pib;
    }

    public void setPib(int pib) {
        this.pib = pib;
    }

    public String getWebAdresa() {
        return webAdresa;
    }

    public void setWebAdresa(String webAdresa) {
        this.webAdresa = webAdresa;
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.time.LocalDate;

/**
 *
 * @author student2
 */
public class Student {
    
    private String ime;
    private String prezime;
    private String indeks;
    private int godinaUpisa;
    private LocalDate datumRodjenja;
    private String nivoStudija;
    private String fonEmail;
    private String licniEmail;
    private int idModula;

    public int getIdModula() {
        return idModula;
    }

    public void setIdModula(int idModula) {
        this.idModula = idModula;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getIndeks() {
        return indeks;
    }

    public void setIndeks(String indeks) {
        this.indeks = indeks;
    }

    public int getGodinaUpisa() {
        return godinaUpisa;
    }

    public void setGodinaUpisa(int godinaUpisa) {
        this.godinaUpisa = godinaUpisa;
    }

    public LocalDate getDatumRodjenja() {
        return datumRodjenja;
    }

    public void setDatumRodjenja(LocalDate datumRodjenja) {
        this.datumRodjenja = datumRodjenja;
    }

    public String getNivoStudija() {
        return nivoStudija;
    }

    public void setNivoStudija(String nivoStudija) {
        this.nivoStudija = nivoStudija;
    }

    public String getFonEmail() {
        return fonEmail;
    }

    public void setFonEmail(String fonEmail) {
        this.fonEmail = fonEmail;
    }

    public String getLicniEmail() {
        return licniEmail;
    }

    public void setLicniEmail(String licniEmail) {
        this.licniEmail = licniEmail;
    }
    
    
    
}


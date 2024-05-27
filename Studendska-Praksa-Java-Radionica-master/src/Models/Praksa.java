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
public class Praksa {
    private int idPrakse;
    private int pib;
    private String nazivPrakse;
    private LocalDate datumOd;
    private LocalDate datumDo;
    private int godinaStudija;

    public int getIdPrakse() {
        return idPrakse;
    }

    public void setIdPrakse(int idPrakse) {
        this.idPrakse = idPrakse;
    }

    public int getPib() {
        return pib;
    }

    public void setPib(int pib) {
        this.pib = pib;
    }

    public String getNazivPrakse() {
        return nazivPrakse;
    }

    public void setNazivPrakse(String nazivPrakse) {
        this.nazivPrakse = nazivPrakse;
    }

    public LocalDate getDatumOd() {
        return datumOd;
    }

    public void setDatumOd(LocalDate datumOd) {
        this.datumOd = datumOd;
    }

    public LocalDate getDatumDo() {
        return datumDo;
    }

    public void setDatumDo(LocalDate datumDo) {
        this.datumDo = datumDo;
    }

    public int getGodinaStudija() {
        return godinaStudija;
    }

    public void setGodinaStudija(int godinaStudija) {
        this.godinaStudija = godinaStudija;
    }
    
    
}

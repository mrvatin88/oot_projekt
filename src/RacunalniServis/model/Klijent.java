package RacunalniServis.model;

public class Klijent {

    public Integer sifraKlijenta;

    public String imeKlijenta;

    public String prezimeKlijenta;

    public String eMail;

    public Integer brojTelefona;

    @Override()
    public String toString(){
        return imeKlijenta + " " + prezimeKlijenta;
    }
    
    public Integer getSifraKlijenta() {
        return sifraKlijenta;
    }

    public void setSifraKlijenta(Integer sifraKlijenta) {
        this.sifraKlijenta = sifraKlijenta;
    }

    public String getImeKlijenta() {
        return imeKlijenta;
    }

    public void setImeKlijenta(String imeKlijenta) {
        this.imeKlijenta = imeKlijenta;
    }

    public String getPrezimeKlijenta() {
        return prezimeKlijenta;
    }

    public void setPrezimeKlijenta(String prezimeKlijenta) {
        this.prezimeKlijenta = prezimeKlijenta;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public Integer getBrojTelefona() {
        return brojTelefona;
    }

    public void setBrojTelefona(Integer brojTelefona) {
        this.brojTelefona = brojTelefona;
    }
    
    
}

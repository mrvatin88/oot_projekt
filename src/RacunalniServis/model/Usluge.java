package RacunalniServis.model;

public class Usluge {

    public Integer sifraUsluge;

    public String nazivUsluge;

    public Double cijenaUsluge;

    public Integer getSifraUsluge() {
        return sifraUsluge;
    }

    public void setSifraUsluge(Integer sifraUsluge) {
        this.sifraUsluge = sifraUsluge;
    }

    public String getNazivUsluge() {
        return nazivUsluge;
    }

    public void setNazivUsluge(String nazivUsluge) {
        this.nazivUsluge = nazivUsluge;
    }

    public Double getCijenaUsluge() {
        return cijenaUsluge;
    }

    public void setCijenaUsluge(Double cijenaUsluge) {
        this.cijenaUsluge = cijenaUsluge;
    }
    
     @Override()
    public String toString(){
        return nazivUsluge;
    }
    
}

package RacunalniServis.model;

import RacunalniServis.controller.SQLController;
import java.awt.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public class Narudzba {

    public Integer sifraNarudzbe;

    public String odabraneUsluge;
    
    public ArrayList<Usluge> usluge = new ArrayList<Usluge>();
    
    private Integer klijent = -1;

    public Integer getKlijent() {
        return klijent;
    }

    public void setKlijent(Integer klijent) {
        this.klijent = klijent;
    }

    public void setUsluge(String usluge){
        SQLController sql = new SQLController();
        ArrayList<Usluge> _usluge = new ArrayList<Usluge>();
        JSONArray arr;
        try {
            arr = new JSONArray(usluge);
            for(int i=0;i<arr.length();i++){
                Usluge u = sql.usluga(arr.getInt(i));
                _usluge.add(u);
            }
        } catch (JSONException ex) {
            Logger.getLogger(Narudzba.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.usluge = _usluge;
    }
    
    public void dodajUslugu(Usluge u){
        this.usluge.add(u);
    }
    
    public String getUsluge(){
        JSONArray arr = new JSONArray();
        for(Usluge u:this.usluge){
            arr.put(u.getSifraUsluge());
        }
       
        return arr.toString();
    }
    public Integer getSifraNarudzbe() {
        return sifraNarudzbe;
    }

    public void setSifraNarudzbe(Integer sifraNarudzbe) {
        this.sifraNarudzbe = sifraNarudzbe;
    }
/*
    public String getOdabraneUsluge() {
        //return this.getUsluge();
    }

    public void setOdabraneUsluge(String odabraneUsluge) {
        this.odabraneUsluge = odabraneUsluge;
    }
  */  
    
}

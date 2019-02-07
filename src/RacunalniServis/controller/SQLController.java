/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RacunalniServis.controller;

import RacunalniServis.model.Klijent;
import RacunalniServis.model.Narudzba;
import RacunalniServis.model.Usluge;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marko
 */
    public class SQLController {
    private static String mID = "mhrvatin" ;
    private static String table = "Klijent";
    public SQLController(){
      
    }
    
    private static Connection spajanje(){
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection("jdbc:mysql://ucka.veleri.hr/mhrvatin", "mhrvatin", "11");

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SQLController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(SQLController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(SQLController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SQLController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
    
    public void unosKlijenta(Klijent klijent){
        try {
            
            Connection conn = spajanje();
            String sql = "INSERT INTO Klijent (imeKlijenta, prezimeKlijenta, eMail, brojTelefona) VALUES(?,?,?,?);";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, klijent.getImeKlijenta());
            stmt.setString(2, klijent.getPrezimeKlijenta());
            stmt.setString(3, klijent.geteMail());
            stmt.setInt(4, klijent.getBrojTelefona());
            stmt.execute();
            
            conn.close();
        }catch (Exception ex){
            System.out.println("Greška kod spremanja klijenta... "+ex.toString());
        }
    }
    
    public ArrayList<Klijent> listaKlijenta(){
        ArrayList<Klijent> lista = new ArrayList<Klijent>();
        try {
            Connection conn = spajanje();
            String sql = "SELECT Klijent.sifraKlijenta, Klijent.imeKlijenta, Klijent.prezimeKlijenta, Klijent.eMail, Klijent.brojTelefona FROM Klijent;";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            while (rs.next()){
                Klijent klijent = new Klijent();
                klijent.setSifraKlijenta(rs.getInt("sifraKlijenta"));
                klijent.setImeKlijenta(rs.getString("imeKlijenta"));
                klijent.setPrezimeKlijenta(rs.getString("prezimeKlijenta"));
                klijent.seteMail(rs.getString("eMail"));
                klijent.setBrojTelefona(rs.getInt("brojTelefona")); 
                lista.add(klijent);
            }            
            conn.close();
            return lista;

        }catch (Exception ex){
            System.out.println("Greška kod prikaza... "+ex.toString());
            return null;
        }
    }
    
    public ArrayList<Usluge> listaUsluga(){
        ArrayList<Usluge> lista = new ArrayList<Usluge>();
        try {
            Connection conn = spajanje();
            String sql = "SELECT Usluga.sifraUsluge, Usluga.nazivUsluge, Usluga.cijenaUsluge FROM Usluga;";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            while (rs.next()){
                Usluge usluge = new Usluge();
                usluge.setSifraUsluge(rs.getInt("sifraUsluge"));
                usluge.setNazivUsluge(rs.getString("nazivUsluge")); 
                usluge.setCijenaUsluge(rs.getDouble("cijenaUsluge"));
                lista.add(usluge);
            }            
            conn.close();
            return lista;

        }catch (Exception ex){
            System.out.println("Greška kod prikaza... "+ex.toString());
            return null;
        }
    }
    
    public static void izmjenaKlijenta(Klijent klijent){
        try {
            Connection conn = spajanje();
            PreparedStatement stmt = conn.prepareStatement("UPDATE Klijent SET imeKlijenta = ?, "
                    + "prezimeKlijenta = ?, eMail = ?, brojTelefona = ? WHERE sifraKlijenta = ?");
            stmt.setString(1,klijent.getImeKlijenta());
            stmt.setString(2,klijent.getPrezimeKlijenta());
            stmt.setString(3,klijent.geteMail());
            stmt.setInt(4,klijent.getBrojTelefona());
            stmt.setInt(5,klijent.getSifraKlijenta());
            stmt.executeUpdate();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(SQLController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void unosUsluge(String naziv, Double cijena){
        try{
            Connection conn = spajanje();
            String sql = "INSERT INTO Usluga (NazivUsluge, CijenaUsluge) VALUES(?,?);";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, naziv);
            stmt.setDouble(2, cijena);
          
            stmt.execute();
            
            conn.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public static void izmjenaUsluge(Usluge u){
        try {
            Connection conn = spajanje();
            PreparedStatement stmt = conn.prepareStatement("UPDATE Usluga SET NazivUsluge= ?, "
                    + "CijenaUsluge = ? WHERE SifraUsluge = ?");
            stmt.setString(1,u.getNazivUsluge());
            stmt.setDouble(2,u.getCijenaUsluge());
            stmt.setInt(3, u.getSifraUsluge());
            stmt.executeUpdate();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(SQLController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    public static void brisanjeUsluge(Integer sifra){
        try {
            Connection conn = spajanje();
            PreparedStatement stmt = conn.prepareStatement("DELETE FROM Usluga WHERE SifraUsluge= ?");
            stmt.setInt(1,sifra);
          
            stmt.executeUpdate();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(SQLController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Usluge usluga(Integer sifra){
        Usluge usluge = new Usluge();
         try {
            Connection conn = spajanje();
            PreparedStatement stmt = conn.prepareStatement( "SELECT Usluga.SifraUsluge, Usluga.NazivUsluge, Usluga.CijenaUsluge FROM Usluga WHERE SifraUsluge= ?;");
            stmt.setInt(1, sifra);
            ResultSet set = stmt.executeQuery();
            usluge.setSifraUsluge(sifra);
            usluge.setNazivUsluge(set.getString("NazivUsluge"));
            usluge.setCijenaUsluge(set.getDouble("CijenaUsluge"));
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(SQLController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return usluge;
    }
     public void unosNarudzbe(Narudzba n){
        try {
            
            Connection conn = spajanje();
            String sql = "INSERT INTO Narudzbe (SifraKlijenta, OdabraneUsluge) VALUES(?,?);";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, n.getKlijent());
            stmt.setString(2, n.getUsluge());
           
            stmt.execute();
            
            conn.close();
        }catch (Exception ex){
            System.out.println("Greška kod spremanja narudzbe... "+ex.toString());
        }
    }
    
}

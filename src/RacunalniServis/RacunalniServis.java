/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RacunalniServis;

import RacunalniServis.view.GlavniIzbornik;

/**
 *
 * @author Marko
 */
public class RacunalniServis {
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                new GlavniIzbornik().setVisible(true);
            }
        });
    }
    
}

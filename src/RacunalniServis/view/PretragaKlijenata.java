/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RacunalniServis.view;

import RacunalniServis.controller.SQLController;
import RacunalniServis.model.Klijent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Student
 */
public class PretragaKlijenata extends javax.swing.JFrame {

    /**
     * Creates new form PretragaKlijenata
     */
    public PretragaKlijenata() {
        initComponents();
        tabKlijent.getColumnModel().getColumn(0).setPreferredWidth(15);
        tabKlijent.getColumnModel().getColumn(3).setPreferredWidth(150);
        ArrayList<Klijent> lista  = control.listaKlijenta();
        DefaultTableModel model = (DefaultTableModel) tabKlijent.getModel();
        for (Klijent klijent: lista){
            model.addRow(new Object[]{klijent.getSifraKlijenta(),klijent.getImeKlijenta(), klijent.getPrezimeKlijenta(), klijent.geteMail(), klijent.getBrojTelefona()});
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabKlijent = new javax.swing.JTable();
        btnOdustani = new javax.swing.JToggleButton();
        txtIme = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPrezime = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTel = new javax.swing.JTextField();
        txtEMail = new javax.swing.JTextField();
        btnPretrazi = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabPrikazKlijenata = new javax.swing.JTable();
        btnIzmjeni = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabKlijent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Šifra klijenta", "Ime", "Prezime", "E-Mail", "Broj telefona"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabKlijent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabKlijentMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabKlijent);

        jScrollPane2.setViewportView(jScrollPane1);

        btnOdustani.setText("Odustani");
        btnOdustani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOdustaniActionPerformed(evt);
            }
        });

        txtIme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtImeActionPerformed(evt);
            }
        });

        jLabel1.setText("Ime:");

        jLabel2.setText("Prezime:");

        jLabel3.setText("E-Mail:");

        jLabel4.setText("Broj Telefona:");

        btnPretrazi.setText("Pretraži");
        btnPretrazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPretraziActionPerformed(evt);
            }
        });

        tabPrikazKlijenata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Šifra klijenta", "Ime", "Prezime", "E-mail", "Broj telefona"
            }
        ));
        tabPrikazKlijenata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabPrikazKlijenataMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tabPrikazKlijenata);

        btnIzmjeni.setText("Izmjeni");
        btnIzmjeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzmjeniActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 637, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtIme, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEMail, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTel)
                                    .addComponent(txtPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(265, 265, 265)
                                .addComponent(btnOdustani, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(204, 204, 204)
                                .addComponent(btnPretrazi, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnIzmjeni, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtEMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPretrazi)
                    .addComponent(btnIzmjeni))
                .addGap(18, 18, 18)
                .addComponent(btnOdustani)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtImeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtImeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtImeActionPerformed

    private void btnOdustaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOdustaniActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        dispose();
    }//GEN-LAST:event_btnOdustaniActionPerformed

    private void tabKlijentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabKlijentMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tabKlijentMouseClicked

    private void btnPretraziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPretraziActionPerformed
        // TODO add your handling code here:
        pretraziKlijente();
        DefaultTableModel klijenti=(DefaultTableModel)tabPrikazKlijenata.getModel();
        if(txtIme.getText().isEmpty() || txtPrezime.getText().isEmpty() || txtEMail.getText().isEmpty() || txtTel.getText().isEmpty()){
            akoJePrazan();
        }
        else{
        String ime=txtIme.getText();
        String prezime=txtPrezime.getText();
        String eMail=txtEMail.getText();
        Integer tel = Integer.parseInt(txtTel.getText());
        TableRowSorter<DefaultTableModel> model = new TableRowSorter<DefaultTableModel>(klijenti);
        tabPrikazKlijenata.setRowSorter(model);
        model.setRowFilter(RowFilter.regexFilter(ime));
        model.setRowFilter(RowFilter.regexFilter(prezime));
        model.setRowFilter(RowFilter.regexFilter(eMail));
        model.setRowFilter(RowFilter.regexFilter(""+tel));
        }
        
    }//GEN-LAST:event_btnPretraziActionPerformed

    private void tabPrikazKlijenataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabPrikazKlijenataMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tabPrikazKlijenataMouseClicked

    private void btnIzmjeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzmjeniActionPerformed
        // TODO add your handling code here:
        Klijent klijent = new Klijent();
        int red = tabPrikazKlijenata.getSelectedRow();
        klijent.setSifraKlijenta((Integer.parseInt(tabPrikazKlijenata.getValueAt(red, 0).toString())));
        klijent.setImeKlijenta((tabPrikazKlijenata.getValueAt(red, 1).toString()));
        klijent.setPrezimeKlijenta((tabPrikazKlijenata.getValueAt(red, 2).toString()));
        klijent.seteMail((tabPrikazKlijenata.getValueAt(red, 3).toString()));
        klijent.setBrojTelefona((Integer.parseInt(tabPrikazKlijenata.getValueAt(red, 4).toString())));
        SQLController.izmjenaKlijenta(klijent);
        PretragaKlijenata main = new PretragaKlijenata();    
        main.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnIzmjeniActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PretragaKlijenata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PretragaKlijenata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PretragaKlijenata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PretragaKlijenata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PretragaKlijenata().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIzmjeni;
    private javax.swing.JToggleButton btnOdustani;
    private javax.swing.JButton btnPretrazi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tabKlijent;
    private javax.swing.JTable tabPrikazKlijenata;
    private javax.swing.JTextField txtEMail;
    private javax.swing.JTextField txtIme;
    private javax.swing.JTextField txtPrezime;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables

    SQLController control = new SQLController();
    
    private void pretraziKlijente() {
        
        ((DefaultTableModel)tabPrikazKlijenata.getModel()).setNumRows(0);
        ArrayList <Klijent> lista = control.listaKlijenta();
        for (Klijent klijent : lista){
            Object[] model = {klijent.getSifraKlijenta(),klijent.getImeKlijenta(), klijent.getPrezimeKlijenta(), klijent.geteMail(), klijent.getBrojTelefona()};           
            ((DefaultTableModel)tabPrikazKlijenata.getModel()).addRow(model);
        }
    }
    
    private void akoJePrazan(){
        DefaultTableModel klijenti=(DefaultTableModel)tabPrikazKlijenata.getModel();
        TableRowSorter<DefaultTableModel> model = new TableRowSorter<DefaultTableModel>(klijenti);
        tabPrikazKlijenata.setRowSorter(model);
        if(txtIme.getText().isEmpty()){
            if(txtPrezime.getText().isEmpty()){
                if(txtEMail.getText().isEmpty()){
                    if(txtTel.getText().isEmpty()){
                        JOptionPane.showMessageDialog(null,"Niste unijeli niti jedan upit za pretraživanje!","Upozorenje!",JOptionPane.ERROR_MESSAGE);
                    }
                    else{
                        Integer tel = Integer.parseInt(txtTel.getText());
                        model.setRowFilter(RowFilter.regexFilter(""+tel));
                    }
                }
                else if(txtTel.getText().isEmpty()){
                    String eMail = txtEMail.getText();
                    model.setRowFilter(RowFilter.regexFilter(eMail));
                }
                else{
                    String eMail = txtEMail.getText();
                    Integer tel = Integer.parseInt(txtTel.getText());
                    model.setRowFilter(RowFilter.regexFilter(eMail));
                    model.setRowFilter(RowFilter.regexFilter(""+tel));
                }
            }
            else if(txtEMail.getText().isEmpty() || txtTel.getText().isEmpty()){
                if(txtEMail.getText().isEmpty() && txtTel.getText().isEmpty()){
                    String prezime = txtPrezime.getText();
                    model.setRowFilter(RowFilter.regexFilter(prezime));
                }
                else if(txtEMail.getText().isEmpty()){
                    if(txtTel.getText().isEmpty()){
                        String prezime = txtPrezime.getText();
                        model.setRowFilter(RowFilter.regexFilter(prezime));
                    }
                    else{
                        String prezime = txtPrezime.getText();
                        Integer tel = Integer.parseInt(txtTel.getText());
                        model.setRowFilter(RowFilter.regexFilter(prezime));
                        model.setRowFilter(RowFilter.regexFilter(""+tel));
                    }
                }
                else if(txtTel.getText().isEmpty()){
                    if(txtEMail.getText().isEmpty()){
                        String prezime = txtPrezime.getText();
                        model.setRowFilter(RowFilter.regexFilter(prezime));
                    }
                    else{
                        String prezime = txtPrezime.getText();
                        String email = txtEMail.getText();
                        model.setRowFilter(RowFilter.regexFilter(prezime));
                        model.setRowFilter(RowFilter.regexFilter(email));
                    }
                }
            }
            else{
                String prezime = txtPrezime.getText();
                String email = txtEMail.getText();
                Integer tel = Integer.parseInt(txtTel.getText());
                model.setRowFilter(RowFilter.regexFilter(prezime));
                model.setRowFilter(RowFilter.regexFilter(email));
                model.setRowFilter(RowFilter.regexFilter(""+tel));
            }
        }
        else if(txtPrezime.getText().isEmpty() || txtEMail.getText().isEmpty() || txtTel.getText().isEmpty()){
            if(txtPrezime.getText().isEmpty()){
                if(txtEMail.getText().isEmpty()){
                    if(txtTel.getText().isEmpty()){
                        String ime = txtIme.getText();
                        model.setRowFilter(RowFilter.regexFilter(ime));
                    }
                    else{
                        Integer tel = Integer.parseInt(txtTel.getText());
                        String ime = txtIme.getText();
                        model.setRowFilter(RowFilter.regexFilter(""+tel));
                        model.setRowFilter(RowFilter.regexFilter(ime));
                    }
                }
                else if(txtTel.getText().isEmpty()){
                    String ime = txtIme.getText();
                    String eMail = txtEMail.getText();
                    model.setRowFilter(RowFilter.regexFilter(ime));
                    model.setRowFilter(RowFilter.regexFilter(eMail));
                }
                else{
                    String eMail = txtEMail.getText();
                    Integer tel = Integer.parseInt(txtTel.getText());
                    String ime = txtIme.getText();
                    model.setRowFilter(RowFilter.regexFilter(ime));
                    model.setRowFilter(RowFilter.regexFilter(eMail));
                    model.setRowFilter(RowFilter.regexFilter(""+tel));
                }
            }
            else if(txtEMail.getText().isEmpty() || txtTel.getText().isEmpty()){
                if(txtEMail.getText().isEmpty() && txtTel.getText().isEmpty()){
                    String prezime = txtPrezime.getText();
                    String ime = txtIme.getText();
                    model.setRowFilter(RowFilter.regexFilter(prezime));
                    model.setRowFilter(RowFilter.regexFilter(ime));
                }
                else if(txtEMail.getText().isEmpty()){
                    if(txtTel.getText().isEmpty()){
                        String ime = txtIme.getText();
                        model.setRowFilter(RowFilter.regexFilter(ime));
                        String prezime = txtPrezime.getText();
                        model.setRowFilter(RowFilter.regexFilter(prezime));
                    }
                    else{
                        String prezime = txtPrezime.getText();
                        Integer tel = Integer.parseInt(txtTel.getText());
                        String ime = txtIme.getText();
                        model.setRowFilter(RowFilter.regexFilter(ime));
                        model.setRowFilter(RowFilter.regexFilter(prezime));
                        model.setRowFilter(RowFilter.regexFilter(""+tel));
                    }
                }
                else if(txtTel.getText().isEmpty()){
                    if(txtEMail.getText().isEmpty()){
                        String prezime = txtPrezime.getText();
                        String ime = txtIme.getText();
                        model.setRowFilter(RowFilter.regexFilter(ime));
                        model.setRowFilter(RowFilter.regexFilter(prezime));
                    }
                    else{
                        String prezime = txtPrezime.getText();
                        String email = txtEMail.getText();
                        String ime = txtIme.getText();
                        model.setRowFilter(RowFilter.regexFilter(ime));
                        model.setRowFilter(RowFilter.regexFilter(prezime));
                        model.setRowFilter(RowFilter.regexFilter(email));
                    }
                }
            }
        }
        else{
            String ime = txtIme.getText();
            String prezime = txtPrezime.getText();
            String email = txtEMail.getText();
            Integer tel = Integer.parseInt(txtTel.getText());
            model.setRowFilter(RowFilter.regexFilter(prezime));
            model.setRowFilter(RowFilter.regexFilter(email));
            model.setRowFilter(RowFilter.regexFilter(""+tel));
            model.setRowFilter(RowFilter.regexFilter(ime));
        }
    }
}

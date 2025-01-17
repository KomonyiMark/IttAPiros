/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ittapiros;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Win10
 */
public class Ablak extends javax.swing.JFrame {

    private int golyo;
    private boolean jo;

    /**
     * Creates new form Ablak
     */
    public Ablak() {
        // initComponents();
        haromPohar();
        // negyPohar();
        setLocationRelativeTo(this);
        setTitle("Itt a piros, hol a piros");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        elsoPohar = new javax.swing.JButton();
        masodikPohar = new javax.swing.JButton();
        harmadikPohar = new javax.swing.JButton();
        visszajelzesCim = new javax.swing.JLabel();
        visszajelzes = new javax.swing.JLabel();
        ujHely = new javax.swing.JCheckBox();
        menuBar = new javax.swing.JMenuBar();
        jatekFile = new javax.swing.JMenu();
        ujJatek = new javax.swing.JMenuItem();
        mentes = new javax.swing.JMenuItem();
        betoltes = new javax.swing.JMenuItem();
        jatekMenu = new javax.swing.JMenu();
        hPohar = new javax.swing.JMenuItem();
        nPohar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        elsoPohar.setText("1");
        elsoPohar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elsoPoharActionPerformed(evt);
            }
        });

        masodikPohar.setText("2");
        masodikPohar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masodikPoharActionPerformed(evt);
            }
        });

        harmadikPohar.setText("3");
        harmadikPohar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                harmadikPoharActionPerformed(evt);
            }
        });

        visszajelzesCim.setText("Visszajelzés:");

        ujHely.setText("Új hely");
        ujHely.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ujHelyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ujHely)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(elsoPohar)
                        .addGap(18, 18, 18)
                        .addComponent(masodikPohar)
                        .addGap(18, 18, 18)
                        .addComponent(harmadikPohar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(visszajelzesCim)
                        .addGap(18, 18, 18)
                        .addComponent(visszajelzes)))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elsoPohar)
                    .addComponent(masodikPohar)
                    .addComponent(harmadikPohar))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(visszajelzesCim)
                    .addComponent(visszajelzes))
                .addGap(18, 18, 18)
                .addComponent(ujHely)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jatekFile.setText("File");

        ujJatek.setText("Új játék");
        ujJatek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ujJatekActionPerformed(evt);
            }
        });
        jatekFile.add(ujJatek);

        mentes.setText("Mentés");
        mentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mentesActionPerformed(evt);
            }
        });
        jatekFile.add(mentes);

        betoltes.setText("Betöltés");
        betoltes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                betoltesActionPerformed(evt);
            }
        });
        jatekFile.add(betoltes);

        menuBar.add(jatekFile);

        jatekMenu.setText("Játék");

        hPohar.setText("3 pohár");
        hPohar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hPoharActionPerformed(evt);
            }
        });
        jatekMenu.add(hPohar);

        nPohar.setText("4 pohár");
        nPohar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nPoharActionPerformed(evt);
            }
        });
        jatekMenu.add(nPohar);

        menuBar.add(jatekMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hPoharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hPoharActionPerformed
        haromPohar();
        JOptionPane.showMessageDialog(this, "Három poháros mód");
    }//GEN-LAST:event_hPoharActionPerformed

    private void ujJatekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ujJatekActionPerformed
        visszajelzes.setText("");
        elhelyez();
        ujHely.setSelected(false);
        jo = false;

        haromPohar();
    }//GEN-LAST:event_ujJatekActionPerformed

    private void mentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mentesActionPerformed
        try {
            ment();
              JOptionPane.showMessageDialog(this, "Sikeres mentés!");
        } catch (IOException ex) {
           JOptionPane.showMessageDialog(this, "Sikertelen mentés!");
        }
    }//GEN-LAST:event_mentesActionPerformed

    private void nPoharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nPoharActionPerformed
        JOptionPane.showMessageDialog(this, "Ez a mód jelenleg nem elérhető!");
    }//GEN-LAST:event_nPoharActionPerformed

    private void elsoPoharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elsoPoharActionPerformed
        talalt_E(elsoPohar);
    }//GEN-LAST:event_elsoPoharActionPerformed

    private void masodikPoharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masodikPoharActionPerformed
        talalt_E(masodikPohar);
    }//GEN-LAST:event_masodikPoharActionPerformed

    private void harmadikPoharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_harmadikPoharActionPerformed
        talalt_E(harmadikPohar);
    }//GEN-LAST:event_harmadikPoharActionPerformed

    private void ujHelyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ujHelyActionPerformed
        if (ujHely.isSelected()) {
            elhelyez();
        }
    }//GEN-LAST:event_ujHelyActionPerformed

    private void betoltesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_betoltesActionPerformed
        try {
            betoltes();
            JOptionPane.showMessageDialog(this, "Sikeres betöltés");
        } catch (IOException ex) {
         JOptionPane.showMessageDialog(this, "Sikertelen betöltés");  
        }
    }//GEN-LAST:event_betoltesActionPerformed

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
            java.util.logging.Logger.getLogger(Ablak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ablak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ablak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ablak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ablak().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem betoltes;
    private javax.swing.JButton elsoPohar;
    private javax.swing.JMenuItem hPohar;
    private javax.swing.JButton harmadikPohar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu jatekFile;
    private javax.swing.JMenu jatekMenu;
    private javax.swing.JButton masodikPohar;
    private javax.swing.JMenuItem mentes;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem nPohar;
    private javax.swing.JCheckBox ujHely;
    private javax.swing.JMenuItem ujJatek;
    private javax.swing.JLabel visszajelzes;
    private javax.swing.JLabel visszajelzesCim;
    // End of variables declaration//GEN-END:variables

    private void elhelyez() {
        int szam = (int) (Math.random() * 3) + 1;
        golyo = szam;
        jo = false;
    }

    private void haromPohar() {
        initComponents();
        elhelyez();

    }

//    private void negyPohar() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    private void talalt_E(JButton gombok) {
        int szam = Integer.parseInt(gombok.getText());
        if (szam == golyo) {
            jo = true;
            visszajelzes.setText("Eltaláltad");
        } else {
            visszajelzes.setText("Nem találtad el");
        }
    }

    private void ment() throws IOException {
        StringBuilder sb = new StringBuilder();
       // boolean ujhely = ujHely.isSelected();
        sb.append(golyo+";");
        sb.append(visszajelzes.getText()+";");
        sb.append(ujHely.isSelected());
        Files.write(Paths.get("config.txt"), sb.toString().getBytes());
    }

    private void betoltes() throws IOException {
        List<String> sorok = Files.readAllLines(Paths.get("config.txt"));
       ArrayList<Visszatolt> adatok = new ArrayList<>();
        for (int i = 0; i < sorok.size(); i++) {
            String sor = sorok.get(i);
            adatok.add(new Visszatolt(sor));
        }
       Visszatolt vissza = adatok.get(0);
       golyo = vissza.getPozicio();
       visszajelzes.setText(vissza.getTalalt_E());
       ujHely.setSelected(vissza.isKeveres());
        
    }
}

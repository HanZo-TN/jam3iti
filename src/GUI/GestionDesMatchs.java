/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import Metier.Match;
import DAO.MatchDao;
import java.awt.Dialog;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;


/**
 *
 * @author rmh
 */
public class GestionDesMatchs extends javax.swing.JFrame {

    /**
     * Creates new form GestionDesMatchs
     */
        MatchDao  mat;
        Match ma;
    public GestionDesMatchs() {
        initComponents();
       
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldGesMatchEquipeA = new javax.swing.JTextField();
        jTextFieldGesMatchEquipeB = new javax.swing.JTextField();
        jTextFieldGesMatchScoreA = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButtonjButtonGestMatchModif = new javax.swing.JButton();
        jButtonGestMatchSupp = new javax.swing.JButton();
        jButtonGestMatchRech = new javax.swing.JButton();
        jButtonGestMatchAjout = new javax.swing.JButton();
        jTextFieldGesMatchId = new javax.swing.JTextField();
        jFormattedTextFieldGesMatchDate = new javax.swing.JFormattedTextField();
        jTextFieldGesMatchScoreB = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("EquipeA :");

        jLabel2.setText("EquipeB :");

        jLabel4.setText("Date :");

        jLabel5.setText("id Match");

        jButtonjButtonGestMatchModif.setText("Modifier");
        jButtonjButtonGestMatchModif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonjButtonGestMatchModifActionPerformed(evt);
            }
        });

        jButtonGestMatchSupp.setText("Supprimer");
        jButtonGestMatchSupp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGestMatchSuppActionPerformed(evt);
            }
        });

        jButtonGestMatchRech.setText("Rechercher");
        jButtonGestMatchRech.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGestMatchRechActionPerformed(evt);
            }
        });

        jButtonGestMatchAjout.setText("Ajouter");
        jButtonGestMatchAjout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGestMatchAjoutActionPerformed(evt);
            }
        });

        jFormattedTextFieldGesMatchDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        jFormattedTextFieldGesMatchDate.setText("dd/MM/yy");

        jLabel3.setText("Gestions Des Matchs :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButtonGestMatchRech, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonGestMatchAjout, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonjButtonGestMatchModif, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jButtonGestMatchSupp, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(82, 82, 82)
                                .addComponent(jTextFieldGesMatchId, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldGesMatchEquipeA, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldGesMatchScoreA)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldGesMatchScoreB, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldGesMatchEquipeB, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(167, 167, 167)
                .addComponent(jFormattedTextFieldGesMatchDate, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(218, 218, 218))
            .addGroup(layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldGesMatchId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldGesMatchEquipeB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldGesMatchEquipeA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldGesMatchScoreA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldGesMatchScoreB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel4)
                        .addGap(71, 71, 71))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextFieldGesMatchDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGestMatchSupp)
                    .addComponent(jButtonjButtonGestMatchModif)
                    .addComponent(jButtonGestMatchAjout)
                    .addComponent(jButtonGestMatchRech))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGestMatchAjoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGestMatchAjoutActionPerformed
          mat = MatchDao.getInstance();
          SimpleDateFormat sdf = new SimpleDateFormat();
         
          
          Date date = null;
            try {
                date = new Date(new SimpleDateFormat("dd/MM/yy", Locale.ENGLISH).parse(jFormattedTextFieldGesMatchDate.getText()).getTime());
            } catch (ParseException ex) {
                Logger.getLogger(GestionDesMatchs.class.getName()).log(Level.SEVERE, null, ex);
            }
            
          ma = new Match(jTextFieldGesMatchEquipeA.getText(), jTextFieldGesMatchEquipeB.getText(), Integer.parseInt(jTextFieldGesMatchScoreA.getText()) , Integer.parseInt(jTextFieldGesMatchScoreB.getText()), date );
          System.out.println("test"+date);
          mat.insert(ma);
          ma=mat.findId(ma);
          jTextFieldGesMatchId.setText(""+ma.getId());
            
        
    }//GEN-LAST:event_jButtonGestMatchAjoutActionPerformed

    private void jButtonjButtonGestMatchModifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonjButtonGestMatchModifActionPerformed
         mat = MatchDao.getInstance();
          SimpleDateFormat sdf = new SimpleDateFormat();
         
          
          Date date = null;
            try {
                date = new Date(new SimpleDateFormat("dd/MM/yy", Locale.ENGLISH).parse(jFormattedTextFieldGesMatchDate.getText()).getTime());
            } catch (ParseException ex) {
                Logger.getLogger(GestionDesMatchs.class.getName()).log(Level.SEVERE, null, ex);
            }
            
          ma = new Match(Integer.parseInt(jTextFieldGesMatchId.getText()),jTextFieldGesMatchEquipeA.getText(), jTextFieldGesMatchEquipeB.getText(), Integer.parseInt(jTextFieldGesMatchScoreA.getText()) , Integer.parseInt(jTextFieldGesMatchScoreB.getText()), date );
          System.out.println("test"+date);
          mat.update(ma);
            
    }//GEN-LAST:event_jButtonjButtonGestMatchModifActionPerformed

    private void jButtonGestMatchSuppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGestMatchSuppActionPerformed
         mat = MatchDao.getInstance();
          
         
          
          
            
          ma = new Match(Integer.parseInt(jTextFieldGesMatchId.getText()),jTextFieldGesMatchEquipeA.getText(), jTextFieldGesMatchEquipeB.getText(), Integer.parseInt(jTextFieldGesMatchScoreA.getText()) , Integer.parseInt(jTextFieldGesMatchScoreB.getText()) );
          System.out.println("test");
          mat.delete(ma);
          jTextFieldGesMatchEquipeA.setText("");
          jTextFieldGesMatchEquipeB.setText("");
          jTextFieldGesMatchId.setText("");
          jTextFieldGesMatchScoreA.setText("");
          jTextFieldGesMatchScoreB.setText("");
          jFormattedTextFieldGesMatchDate.setText("");
    }//GEN-LAST:event_jButtonGestMatchSuppActionPerformed

    private void jButtonGestMatchRechActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGestMatchRechActionPerformed
         mat = MatchDao.getInstance();
          
          ma=mat.find(Integer.parseInt(jTextFieldGesMatchId.getText()));
          if(ma != null){
          jTextFieldGesMatchEquipeA.setText(ma.getEquipeA());
          jTextFieldGesMatchEquipeB.setText(ma.getEquipeB());
          jTextFieldGesMatchId.setText(""+ma.getId());
          jTextFieldGesMatchScoreA.setText(""+ma.getScoreA());
          jTextFieldGesMatchScoreB.setText(""+ma.getScoreB());
          jFormattedTextFieldGesMatchDate.setText(""+ma.getDatematch());}
          else{
             AuthDialog ad = new AuthDialog();
             ad.showDialog();
             
              
              
              
          }
              
          
          
    }//GEN-LAST:event_jButtonGestMatchRechActionPerformed

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
            java.util.logging.Logger.getLogger(GestionDesMatchs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionDesMatchs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionDesMatchs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionDesMatchs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionDesMatchs().setVisible(true);
            }
        });
    }
    
    private class AuthDialog extends JDialog {
    
        HashMap result = new HashMap<String, String>();
        javax.swing.JPanel panel = new JPanel();
        
        javax.swing.JDialog loginDialog = new JDialog(this);
        
        javax.swing.JLabel emailLabel = new JLabel("Match non existant");
        
        
        javax.swing.JButton loginButton = new JButton("Ok");
        
        public AuthDialog() {
            setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL); // Pour bloquer la dialog lorsque setVisible est à true !
            
            loginButton.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent ae) {
                    
                    setVisible(false);
                    dispose();
                }
            });
            loginButton.setSize(50, 15);
            setTitle("Authentification");
            setSize(300, 200);
            panel.setLayout(new GridLayout(3, 2));
            panel.add(emailLabel);
           
            panel.add(loginButton);
            this.add(panel);
        }
        
        public HashMap showDialog() {
            setVisible(true);
            return result;
        }
        
        
        

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGestMatchAjout;
    private javax.swing.JButton jButtonGestMatchRech;
    private javax.swing.JButton jButtonGestMatchSupp;
    private javax.swing.JButton jButtonjButtonGestMatchModif;
    private javax.swing.JFormattedTextField jFormattedTextFieldGesMatchDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextFieldGesMatchEquipeA;
    private javax.swing.JTextField jTextFieldGesMatchEquipeB;
    private javax.swing.JTextField jTextFieldGesMatchId;
    private javax.swing.JTextField jTextFieldGesMatchScoreA;
    private javax.swing.JTextField jTextFieldGesMatchScoreB;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Charts.SondageChart;
import DAO.MembreDao;
import Metier.Membre;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author rednaks
 */
public class PageAdministrateur extends javax.swing.JFrame {

    /**
     * Creates new form PageAdministrateur
     */
    public PageAdministrateur() {
        if(authentification())
            initComponents();
        else {
            this.setVisible(false);
            this.dispose();
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

        jButtonGestionMatchs = new javax.swing.JButton();
        jButtonGestionJoueurs = new javax.swing.JButton();
        jButtonGestionPalmares = new javax.swing.JButton();
        jButtonGestionStaff = new javax.swing.JButton();
        jButtonGestionSondage = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Administration");
        setPreferredSize(new java.awt.Dimension(800, 600));

        jButtonGestionMatchs.setText("Gestion Des Matchs");
        jButtonGestionMatchs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGestionMatchsActionPerformed(evt);
            }
        });

        jButtonGestionJoueurs.setText("Gestion des joueurs");

        jButtonGestionPalmares.setText("Gestion des Palmares");

        jButtonGestionStaff.setText("Gestion du Staff");

        jButtonGestionSondage.setText("Gestion des Sondages");
        jButtonGestionSondage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGestionSondageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(322, 322, 322)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonGestionMatchs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonGestionJoueurs, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonGestionPalmares, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonGestionStaff, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonGestionSondage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(327, 327, 327))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jButtonGestionMatchs, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonGestionJoueurs, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonGestionPalmares, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonGestionStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonGestionSondage, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(218, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGestionMatchsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGestionMatchsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonGestionMatchsActionPerformed

    private void jButtonGestionSondageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGestionSondageActionPerformed
        GestionSondage gs = new GestionSondage();
        gs.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonGestionSondageActionPerformed

    private boolean authentification(){
        
        int essai = 3;
        
        AuthDialog ad = new AuthDialog();
        MembreDao md = MembreDao.getInstance();
        Membre m = new Membre();
        while( essai > 0){
            HashMap res = ad.showDialog();
            m.setEmail(res.get("login").toString());
            m.setMdp(res.get("password").toString());
            m.setStatus("admin");
            if(md.checkAuth(m))
                return true;
          essai--;
        }
        return false;
        
        
    }
    
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
            java.util.logging.Logger.getLogger(PageAdministrateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PageAdministrateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PageAdministrateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PageAdministrateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PageAdministrateur().setVisible(true);
            }
        });
    }
    private class AuthDialog extends JDialog {
    
        HashMap result = new HashMap<String, String>();
        javax.swing.JPanel panel = new JPanel();
        
        javax.swing.JDialog loginDialog = new JDialog(this);
        
        javax.swing.JLabel emailLabel = new JLabel("Email");
        javax.swing.JTextField emailTextField = new JTextField();

        javax.swing.JLabel passwordLabel = new JLabel("Mot de passe");
        javax.swing.JPasswordField passwordTextField = new JPasswordField();
        
        javax.swing.JButton loginButton = new JButton("Login");
        
        public AuthDialog() {
            setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
            setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL); // Pour bloquer la dialog lorsque setVisible est à true !
            
            loginButton.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent ae) {
                    result.put("login", emailTextField.getText());
                    result.put("password", passwordTextField.getText());
                    setVisible(false);
                    dispose();
                }
            });
            loginButton.setSize(50, 15);
            setTitle("Authentification");
            setSize(300, 200);
            panel.setLayout(new GridLayout(3, 2));
            panel.add(emailLabel);
            panel.add(emailTextField);
            panel.add(passwordLabel);
            panel.add(passwordTextField);
            panel.add(loginButton);
            this.add(panel);
        }
        
        public HashMap showDialog() {
            setVisible(true);
            return result;
        }
        
        
        

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGestionJoueurs;
    private javax.swing.JButton jButtonGestionMatchs;
    private javax.swing.JButton jButtonGestionPalmares;
    private javax.swing.JButton jButtonGestionSondage;
    private javax.swing.JButton jButtonGestionStaff;
    // End of variables declaration//GEN-END:variables
}

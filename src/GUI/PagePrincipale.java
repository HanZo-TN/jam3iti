/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
 

/**
 *
 * @author rmh
 */
public class PagePrincipale extends javax.swing.JFrame {

    /**
     * Creates new form PagePrincipale
     */
    public PagePrincipale() {
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

        buttonGroupSondageChoix = new javax.swing.ButtonGroup();
        jButtonNextMatch = new javax.swing.JButton();
        jButtonLastMatch = new javax.swing.JButton();
        jButtonClassement = new javax.swing.JButton();
        jButtonCalendrier = new javax.swing.JButton();
        jPanelSondage = new javax.swing.JPanel();
        jLabelSondage = new javax.swing.JLabel();
        jRadioButtonSondageChoix1 = new javax.swing.JRadioButton();
        jRadioButtonSondageChoix2 = new javax.swing.JRadioButton();
        jRadioButtonSondageChoix3 = new javax.swing.JRadioButton();
        jButtonVote = new javax.swing.JButton();
        jButtonRes = new javax.swing.JButton();
        jLabelSondageQuestion = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuAcceuil = new javax.swing.JMenu();
        jMenuFoot = new javax.swing.JMenu();
        jMenuItemFootChampionnat = new javax.swing.JMenuItem();
        jMenuBaske = new javax.swing.JMenu();
        jMenuStaff = new javax.swing.JMenu();
        jMenuItemStaffEntreneur = new javax.swing.JMenuItem();
        jMenuItemStaffEducateur = new javax.swing.JMenuItem();
        jMenuPresse = new javax.swing.JMenu();
        jMenuContact = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonNextMatch.setText("Prochain Match");

        jButtonLastMatch.setText("Dernier Match");

        jButtonClassement.setText("Classement");

        jButtonCalendrier.setText("Calendrier");

        jLabelSondage.setText("Sondage");

        buttonGroupSondageChoix.add(jRadioButtonSondageChoix1);
        jRadioButtonSondageChoix1.setText("Choix 1");

        buttonGroupSondageChoix.add(jRadioButtonSondageChoix2);
        jRadioButtonSondageChoix2.setText("Choix 2");

        jRadioButtonSondageChoix3.setText("Choix 3");

        jButtonVote.setText("Vote");

        jButtonRes.setText("Resultat");

        jLabelSondageQuestion.setText("Question ?");

        javax.swing.GroupLayout jPanelSondageLayout = new javax.swing.GroupLayout(jPanelSondage);
        jPanelSondage.setLayout(jPanelSondageLayout);
        jPanelSondageLayout.setHorizontalGroup(
            jPanelSondageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSondageLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSondageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSondageLayout.createSequentialGroup()
                        .addComponent(jButtonVote)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonRes))
                    .addComponent(jRadioButtonSondageChoix2)
                    .addComponent(jRadioButtonSondageChoix3)
                    .addGroup(jPanelSondageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabelSondageQuestion)
                        .addComponent(jRadioButtonSondageChoix1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSondageLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelSondage)
                .addGap(33, 33, 33))
        );
        jPanelSondageLayout.setVerticalGroup(
            jPanelSondageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSondageLayout.createSequentialGroup()
                .addComponent(jLabelSondage)
                .addGap(7, 7, 7)
                .addComponent(jLabelSondageQuestion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonSondageChoix1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonSondageChoix2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonSondageChoix3)
                .addGap(18, 18, 18)
                .addGroup(jPanelSondageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVote)
                    .addComponent(jButtonRes))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenuAcceuil.setText("Acceuil");
        jMenuAcceuil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuAcceuilMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuAcceuil);

        jMenuFoot.setText("FootBall");

        jMenuItemFootChampionnat.setText("Championnat");
        jMenuItemFootChampionnat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFootChampionnatActionPerformed(evt);
            }
        });
        jMenuFoot.add(jMenuItemFootChampionnat);

        jMenuBar1.add(jMenuFoot);

        jMenuBaske.setText("BasketBall");
        jMenuBar1.add(jMenuBaske);

        jMenuStaff.setText("Staff");

        jMenuItemStaffEntreneur.setText("Entreneur");
        jMenuStaff.add(jMenuItemStaffEntreneur);

        jMenuItemStaffEducateur.setText("educateur Physique");
        jMenuStaff.add(jMenuItemStaffEducateur);

        jMenuBar1.add(jMenuStaff);

        jMenuPresse.setText("Presse");
        jMenuBar1.add(jMenuPresse);

        jMenuContact.setText("Contact");
        jMenuBar1.add(jMenuContact);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonNextMatch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonLastMatch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonClassement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCalendrier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 291, Short.MAX_VALUE)
                .addComponent(jPanelSondage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jButtonNextMatch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonLastMatch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonClassement)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonCalendrier))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jPanelSondage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuAcceuilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuAcceuilMouseClicked
            // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenuAcceuilMouseClicked

    private void jMenuItemFootChampionnatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFootChampionnatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemFootChampionnatActionPerformed

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
            java.util.logging.Logger.getLogger(PagePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PagePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PagePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PagePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PagePrincipale().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupSondageChoix;
    private javax.swing.JButton jButtonCalendrier;
    private javax.swing.JButton jButtonClassement;
    private javax.swing.JButton jButtonLastMatch;
    private javax.swing.JButton jButtonNextMatch;
    private javax.swing.JButton jButtonRes;
    private javax.swing.JButton jButtonVote;
    private javax.swing.JLabel jLabelSondage;
    private javax.swing.JLabel jLabelSondageQuestion;
    private javax.swing.JMenu jMenuAcceuil;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuBaske;
    private javax.swing.JMenu jMenuContact;
    private javax.swing.JMenu jMenuFoot;
    private javax.swing.JMenuItem jMenuItemFootChampionnat;
    private javax.swing.JMenuItem jMenuItemStaffEducateur;
    private javax.swing.JMenuItem jMenuItemStaffEntreneur;
    private javax.swing.JMenu jMenuPresse;
    private javax.swing.JMenu jMenuStaff;
    private javax.swing.JPanel jPanelSondage;
    private javax.swing.JRadioButton jRadioButtonSondageChoix1;
    private javax.swing.JRadioButton jRadioButtonSondageChoix2;
    private javax.swing.JRadioButton jRadioButtonSondageChoix3;
    // End of variables declaration//GEN-END:variables
}
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
 
import com.sun.xml.internal.ws.api.pipe.NextAction;
import java.awt.GridLayout;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextPane;


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
        initMainPanels();
        initFootPanels();
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
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
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
        jPanelBaseContainer = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuAcceuil = new javax.swing.JMenu();
        jMenuMembre = new javax.swing.JMenu();
        jMenuAdmin = new javax.swing.JMenu();
        jMenuFoot = new javax.swing.JMenu();
        jMenuItemFootChampionnat = new javax.swing.JMenuItem();
        jMenuItemFootCoupe = new javax.swing.JMenuItem();
        jMenuItemFootCL = new javax.swing.JMenuItem();
        jMenuItemFootListJoueur = new javax.swing.JMenuItem();
        jMenuItemFootPalmares = new javax.swing.JMenuItem();
        jMenuBaske = new javax.swing.JMenu();
        jMenuItemBaskeChampionnat1 = new javax.swing.JMenuItem();
        jMenuItemBaskeCoupe1 = new javax.swing.JMenuItem();
        jMenuItemBaskeCL1 = new javax.swing.JMenuItem();
        jMenuItemBaskeListJoueur = new javax.swing.JMenuItem();
        jMenuItemBaskePalmares1 = new javax.swing.JMenuItem();
        jMenuStaff = new javax.swing.JMenu();
        jMenuItemStaffPresident = new javax.swing.JMenuItem();
        jMenuItemStaffEntreneur = new javax.swing.JMenuItem();
        jMenuItemStaffEducateur = new javax.swing.JMenuItem();
        jMenuPresse = new javax.swing.JMenu();
        jMenuContact = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonNextMatch.setText("Prochain Match");
        jButtonNextMatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNextMatchActionPerformed(evt);
            }
        });

        jButtonLastMatch.setText("Dernier Match");
        jButtonLastMatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLastMatchActionPerformed(evt);
            }
        });

        jButtonClassement.setText("Classement");
        jButtonClassement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClassementActionPerformed(evt);
            }
        });

        jButtonCalendrier.setText("Calendrier");

        jLabelSondage.setText("Sondage");

        buttonGroupSondageChoix.add(jRadioButtonSondageChoix1);
        jRadioButtonSondageChoix1.setText("Choix 1");

        buttonGroupSondageChoix.add(jRadioButtonSondageChoix2);
        jRadioButtonSondageChoix2.setText("Choix 2");

        buttonGroupSondageChoix.add(jRadioButtonSondageChoix3);
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

        javax.swing.GroupLayout jPanelBaseContainerLayout = new javax.swing.GroupLayout(jPanelBaseContainer);
        jPanelBaseContainer.setLayout(jPanelBaseContainerLayout);
        jPanelBaseContainerLayout.setHorizontalGroup(
            jPanelBaseContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 372, Short.MAX_VALUE)
        );
        jPanelBaseContainerLayout.setVerticalGroup(
            jPanelBaseContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 514, Short.MAX_VALUE)
        );

        jMenuAcceuil.setText("Acceuil");
        jMenuAcceuil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuAcceuilMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuAcceuil);

        jMenuMembre.setText("Espace membre");
        jMenuBar1.add(jMenuMembre);

        jMenuAdmin.setText("Espace administration");
        jMenuAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuAdminMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuAdmin);

        jMenuFoot.setText("FootBall");

        jMenuItemFootChampionnat.setText("Championnat");
        jMenuItemFootChampionnat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFootChampionnatActionPerformed(evt);
            }
        });
        jMenuFoot.add(jMenuItemFootChampionnat);

        jMenuItemFootCoupe.setText("Coupe");
        jMenuFoot.add(jMenuItemFootCoupe);

        jMenuItemFootCL.setText("Ligue des champions");
        jMenuFoot.add(jMenuItemFootCL);

        jMenuItemFootListJoueur.setText("Liste des joueurs");
        jMenuFoot.add(jMenuItemFootListJoueur);

        jMenuItemFootPalmares.setText("Palmares");
        jMenuFoot.add(jMenuItemFootPalmares);

        jMenuBar1.add(jMenuFoot);

        jMenuBaske.setText("BasketBall");

        jMenuItemBaskeChampionnat1.setText("Championnat");
        jMenuItemBaskeChampionnat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemBaskeChampionnat1ActionPerformed(evt);
            }
        });
        jMenuBaske.add(jMenuItemBaskeChampionnat1);

        jMenuItemBaskeCoupe1.setText("Coupe");
        jMenuBaske.add(jMenuItemBaskeCoupe1);

        jMenuItemBaskeCL1.setText("Ligue des champions");
        jMenuBaske.add(jMenuItemBaskeCL1);

        jMenuItemBaskeListJoueur.setText("Liste des joueurs");
        jMenuBaske.add(jMenuItemBaskeListJoueur);

        jMenuItemBaskePalmares1.setText("Palmares");
        jMenuBaske.add(jMenuItemBaskePalmares1);

        jMenuBar1.add(jMenuBaske);

        jMenuStaff.setText("Staff");

        jMenuItemStaffPresident.setText("President");
        jMenuStaff.add(jMenuItemStaffPresident);

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
                .addGap(18, 18, 18)
                .addComponent(jPanelBaseContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCalendrier))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelSondage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelBaseContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuAcceuilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuAcceuilMouseClicked
        jPanelBaseContainer.setVisible(false);
        jPanelBaseContainer.removeAll();
        jPanelBaseContainer.add(panelHome);
        jPanelBaseContainer.setVisible(true);
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenuAcceuilMouseClicked

    private void jMenuItemFootChampionnatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFootChampionnatActionPerformed
        // TODO add your handling code here:
        jPanelBaseContainer.setVisible(false);
        jPanelBaseContainer.removeAll();
        jPanelBaseContainer.add(panelChampionatFootBaseContainer);
        panelChampionatFootBaseContainer.setVisible(true);
        jPanelBaseContainer.setVisible(true);
    }//GEN-LAST:event_jMenuItemFootChampionnatActionPerformed

    private void jMenuItemBaskeChampionnat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemBaskeChampionnat1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemBaskeChampionnat1ActionPerformed

    private void jMenuAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuAdminMouseClicked
    
        // TODO add your handling code here:
        PageAdministrateur pa = new PageAdministrateur();
        pa.setVisible(true);
        
    }//GEN-LAST:event_jMenuAdminMouseClicked

    private void jButtonNextMatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNextMatchActionPerformed
      jPanelBaseContainer.setVisible(false); // pour actualiser on doit le cacher, le rempir puis le faire apparaitre
      jPanelBaseContainer.removeAll();
      System.out.println("Setting nextMatchPanel");
      jPanelBaseContainer.add(panelNextMatch);
      jPanelBaseContainer.setVisible(true);
      // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNextMatchActionPerformed

    private void jButtonLastMatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLastMatchActionPerformed
      jPanelBaseContainer.setVisible(false); // pour actualiser on doit le cacher, le rempir puis le faire apparaitre
      jPanelBaseContainer.removeAll();
      System.out.println("Setting lastMatchPanel");
      jPanelBaseContainer.add(panelLastMatch);
      jPanelBaseContainer.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonLastMatchActionPerformed

    private void jButtonClassementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClassementActionPerformed
      jPanelBaseContainer.setVisible(false); // pour actualiser on doit le cacher, le rempir puis le faire apparaitre
      jPanelBaseContainer.removeAll();
      System.out.println("Setting Panel Classement");
      jPanelBaseContainer.add(panelClassement);
      jPanelBaseContainer.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonClassementActionPerformed

    /**
     * @param args the command line arguments
     */
    /******************  Main Panels BEGIN ************************************/
    private void initMainPanels(){
        initHomePanel();
        System.out.println("Adding Home panel");
        jPanelBaseContainer.setLayout(new GridLayout(1, 1));
        jPanelBaseContainer.add(panelHome);
        jPanelBaseContainer.setVisible(true);
        initNextMatchPanel();
        initLastMatchPanel();
        initClassementPanel();
    
        
    }
    
    private void initHomePanel(){
        panelHome = new JPanel();
        panelHome.setLayout(new GridLayout(2, 1));
        
        tableNews = new JTable(new Object[][]
                {{"«Blow Up» : nouveau single pour Kid Francescoli","18/05/2013 13:03"},
                 {"La réserve dans le sprint final","18/05/2013 08:28"},
                 {"Avec passion dans le Chaudron","17/05/2013 18:29"}
                }
                , new String[]{"Titre", "Date"} );
        scrollPane = new JScrollPane(tableNews);
        synopsysPane = new JTextPane();
        synopsysPane.setEditable(false);
        synopsysPane.setText("La CFA2 olympienne reçoit Aubagne ce samedi au stade Paul-Le Cesne (18h) dans un match décisif pour la montée.");
        panelHome.add(scrollPane);
        panelHome.add(synopsysPane);
        panelHome.setVisible(true);
    }

    private void initNextMatchPanel(){
        panelNextMatch = new JPanel();
        nextMatchTextPane = new JTextPane();
        nextMatchTextPane.setText("OM vs PSG 12/12/2013");
        nextMatchTextPane.setEditable(false);
        panelNextMatch.setLayout(new GridLayout(1,1));
        panelNextMatch.add(nextMatchTextPane);
        
    }
    
    private void initLastMatchPanel(){
        panelLastMatch = new JPanel();
        lastMatchTextPane = new JTextPane();
        lastMatchTextPane.setText("OM vs Lyon 15/03/2013");
        lastMatchTextPane.setEditable(false);
        panelLastMatch.setLayout(new GridLayout(1,1));
        panelLastMatch.add(lastMatchTextPane);
    }
    
    private void initClassementPanel(){
        panelClassement = new JPanel();
        panelClassement.setLayout(new GridLayout(1, 1));
        
        tableClassement = new JTable(new Object[][]
                {{"1","OM", "5", "2", "1", "2","4", "1","0"},
                 {"2","OL", "5", "2", "1", "2","4", "1","0"},
                 {"3","PSG", "5", "2", "1", "2","4", "1","3"},
                 {"4","CA", "5", "2", "1", "2","4", "1","0"}
                }
                //equipe/#/PT/G/N/P/B.M/B.C/D.B
                , new String[]{"#", "Equipe", "PT", "G", "N", "P", "B.M", "B.C", "D.B"} );
        scrollPaneClassement = new JScrollPane(tableClassement);
        panelClassement.add(scrollPaneClassement);
        panelClassement.setVisible(true);
    }
    
    /************************* MainPanels END *********************************/
    
    /************************* FootPanels BEGIN **************************/ 
    private void initFootPanels(){
        initChampionatPanel();
    }
    
    private void initChampionatPanel(){
        /*panelChampionatFootBaseContainer = new JPanel();
        javax.swing.GroupLayout layoutChampionatFootBase = new GroupLayout(panelChampionatFootBaseContainer);
        
        buttonChampFootClassementEquipe = new JButton();
        buttonChampFootCalendar = new JButton();
        buttonChampFootClassementJoueur = new JButton();
        panelChampionatFootContainer = new JPanel();
        buttonChampFootClassementEquipe.setText("Classement");
        buttonChampFootCalendar.setText("Calendar");
        buttonChampFootClassementJoueur.setText("# Joueurs");
        */
        panelChampionatFootBaseContainer = new javax.swing.JPanel();
        panelChampionatFootBaseContainer.setVisible(false);
                
        buttonChampFootClassementEquipe = new javax.swing.JButton();
        buttonChampFootCalendar = new javax.swing.JButton();
        buttonChampFootClassementJoueur = new javax.swing.JButton();
        panelChampionatFootContainer = new javax.swing.JPanel();

        buttonChampFootClassementEquipe.setText("Classement");

        buttonChampFootCalendar.setText("Calendar");

        buttonChampFootClassementJoueur.setText("# Joueur");

        javax.swing.GroupLayout panelChampionatFootContainerLayout = new javax.swing.GroupLayout(panelChampionatFootContainer);
        panelChampionatFootContainer.setLayout(panelChampionatFootContainerLayout);
        panelChampionatFootContainerLayout.setHorizontalGroup(
            panelChampionatFootContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelChampionatFootContainerLayout.setVerticalGroup(
            panelChampionatFootContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 188, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelChampionatFootBaseContainerLayout = new javax.swing.GroupLayout(panelChampionatFootBaseContainer);
        panelChampionatFootBaseContainer.setLayout(panelChampionatFootBaseContainerLayout);
        panelChampionatFootBaseContainerLayout.setHorizontalGroup(
            panelChampionatFootBaseContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChampionatFootBaseContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelChampionatFootBaseContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelChampionatFootContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelChampionatFootBaseContainerLayout.createSequentialGroup()
                        .addComponent(buttonChampFootClassementEquipe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonChampFootCalendar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonChampFootClassementJoueur)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelChampionatFootBaseContainerLayout.setVerticalGroup(
            panelChampionatFootBaseContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChampionatFootBaseContainerLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panelChampionatFootBaseContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonChampFootClassementEquipe)
                    .addComponent(buttonChampFootCalendar)
                    .addComponent(buttonChampFootClassementJoueur))
                .addGap(18, 18, 18)
                .addComponent(panelChampionatFootContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(panelChampionatFootBaseContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(panelChampionatFootBaseContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );
        
        buttonChampFootClassementEquipe.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                System.out.println("[Championnat-foot] Affichage du classement équipe foot");
            }
        });
        
        buttonChampFootCalendar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                System.out.println("[Championnat-foot] Affichage du calendrier");
            }
        });
        
        buttonChampFootClassementJoueur.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                System.out.println("[Championat-foot] Affichage Classement Joueur");
            }
        });
        
    }
    /************************* FootPanels END ****************************/
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
    // Le contenu pour jPanelBaseContainer 
    
    /* Home Begin*/
    private javax.swing.JPanel panelHome;
    private javax.swing.JTable tableNews;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTextPane synopsysPane;
    /* Home End*/
    
    // Begin : Pour Les 4 boutons à gauche
    private javax.swing.JPanel panelNextMatch;
    private javax.swing.JPanel panelLastMatch;
    private javax.swing.JPanel panelClassement;
    private javax.swing.JPanel panelCalendar;
    // End : Pour Les 4 boutons à gauche
    
    // NextMatch Begin
    private javax.swing.JTextPane nextMatchTextPane;
    // NextMatch END
    
    // LastMatch Begin
    private javax.swing.JTextPane lastMatchTextPane;
    // LastMatch END
    
    // Classement Begin
    private javax.swing.JTable tableClassement;
    private javax.swing.JScrollPane scrollPaneClassement;
    // Classement END
    
    // FootBall Begin
    // Championat Begin
    private javax.swing.JPanel panelChampionatFootBaseContainer;
    
    private javax.swing.JButton buttonChampFootClassementEquipe;
    private javax.swing.JButton buttonChampFootCalendar;
    private javax.swing.JButton buttonChampFootClassementJoueur;
    
    private javax.swing.JPanel panelChampionatFootContainer;
    private javax.swing.JScrollPane scrollPaneFootClassement;
    private javax.swing.JTable tableFootClassement;
    private javax.swing.JScrollPane scrollPaneFootCalendar;
    private javax.swing.JTable talbeFootCalendar;
    private javax.swing.JScrollPane scrollPaneFootClassementJoueur;
    private javax.swing.JTable tableFootClassementJoueur;
    // Championat END
    // FootBall END.
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
    private javax.swing.JMenu jMenuAdmin;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuBaske;
    private javax.swing.JMenu jMenuContact;
    private javax.swing.JMenu jMenuFoot;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItemBaskeCL1;
    private javax.swing.JMenuItem jMenuItemBaskeChampionnat1;
    private javax.swing.JMenuItem jMenuItemBaskeCoupe1;
    private javax.swing.JMenuItem jMenuItemBaskeListJoueur;
    private javax.swing.JMenuItem jMenuItemBaskePalmares1;
    private javax.swing.JMenuItem jMenuItemFootCL;
    private javax.swing.JMenuItem jMenuItemFootChampionnat;
    private javax.swing.JMenuItem jMenuItemFootCoupe;
    private javax.swing.JMenuItem jMenuItemFootListJoueur;
    private javax.swing.JMenuItem jMenuItemFootPalmares;
    private javax.swing.JMenuItem jMenuItemStaffEducateur;
    private javax.swing.JMenuItem jMenuItemStaffEntreneur;
    private javax.swing.JMenuItem jMenuItemStaffPresident;
    private javax.swing.JMenu jMenuMembre;
    private javax.swing.JMenu jMenuPresse;
    private javax.swing.JMenu jMenuStaff;
    private javax.swing.JPanel jPanelBaseContainer;
    private javax.swing.JPanel jPanelSondage;
    private javax.swing.JRadioButton jRadioButtonSondageChoix1;
    private javax.swing.JRadioButton jRadioButtonSondageChoix2;
    private javax.swing.JRadioButton jRadioButtonSondageChoix3;
    // End of variables declaration//GEN-END:variables
}

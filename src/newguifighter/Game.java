/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

 * Warriors Configuration
 *          Shield  Attack  Life
 * Paladin  100     70      100
 * Fighter  70      20      100
 * Ranger   70      20      100



 */
package newguifighter;

import javax.swing.DefaultListModel;

/**
 *
 * @author arias
 */
public class Game extends javax.swing.JFrame {

    /**
     * Creates new form Game
     */
    public Game() {
        initComponents();
        DefaultListModel<Warrior> list1 = new DefaultListModel<>();
        DefaultListModel<Warrior> list2 = new DefaultListModel<>();
        
        lstUnits1.setModel(list1);
        lstUnits2.setModel(list2);
        
        for (int i = 0; i < 3; i++) {
            list1.addElement(new Warrior("No Name" + (i + 1), 100, 20, 100));
            list2.addElement(new Warrior("No Name" + (i + 1), 100, 20, 100));
            
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

        rdgWarriorType1 = new javax.swing.ButtonGroup();
        rdgWarriorType2 = new javax.swing.ButtonGroup();
        panSetup = new javax.swing.JPanel();
        panArmy1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtLordName1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstUnits1 = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rdbPaladin1 = new javax.swing.JRadioButton();
        rdbFighter1 = new javax.swing.JRadioButton();
        rdbRanger1 = new javax.swing.JRadioButton();
        cmdChangeWarrior1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtCurrentWarriorName1 = new javax.swing.JTextField();
        panArmy3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtLordName2 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstUnits2 = new javax.swing.JList<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        rdbPaladin2 = new javax.swing.JRadioButton();
        rdbFighter2 = new javax.swing.JRadioButton();
        rdbRanger2 = new javax.swing.JRadioButton();
        cmdChangeWarrior2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtCurrentWarriorName2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fighter Game");

        panSetup.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Setup Game"));
        panSetup.setLayout(new javax.swing.BoxLayout(panSetup, javax.swing.BoxLayout.X_AXIS));

        panArmy1.setBorder(javax.swing.BorderFactory.createTitledBorder("Army 1"));

        jLabel1.setLabelFor(txtLordName1);
        jLabel1.setText("Lord's Name:");

        txtLordName1.setText("Alexander");

        jScrollPane1.setViewportView(lstUnits1);

        jLabel3.setText("Army's Units:");

        jLabel5.setText("Select your Warrior Type:");

        rdgWarriorType1.add(rdbPaladin1);
        rdbPaladin1.setSelected(true);
        rdbPaladin1.setText("Paladin");

        rdgWarriorType1.add(rdbFighter1);
        rdbFighter1.setText("Fighter");

        rdgWarriorType1.add(rdbRanger1);
        rdbRanger1.setText("Ranger");

        cmdChangeWarrior1.setText("Change Selected Warrior");
        cmdChangeWarrior1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdChangeWarrior1ActionPerformed(evt);
            }
        });

        jLabel7.setText("Unit's Name:");

        javax.swing.GroupLayout panArmy1Layout = new javax.swing.GroupLayout(panArmy1);
        panArmy1.setLayout(panArmy1Layout);
        panArmy1Layout.setHorizontalGroup(
            panArmy1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panArmy1Layout.createSequentialGroup()
                .addGroup(panArmy1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cmdChangeWarrior1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panArmy1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panArmy1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panArmy1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCurrentWarriorName1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panArmy1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(panArmy1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rdbFighter1)
                                    .addComponent(rdbPaladin1)
                                    .addComponent(rdbRanger1)))
                            .addGroup(panArmy1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLordName1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panArmy1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(45, 45, 45)
                                .addComponent(jLabel5)))))
                .addGap(0, 75, Short.MAX_VALUE))
        );
        panArmy1Layout.setVerticalGroup(
            panArmy1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panArmy1Layout.createSequentialGroup()
                .addGroup(panArmy1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtLordName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panArmy1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panArmy1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panArmy1Layout.createSequentialGroup()
                        .addComponent(rdbPaladin1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdbFighter1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdbRanger1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panArmy1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCurrentWarriorName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdChangeWarrior1)
                .addGap(19, 19, 19))
        );

        panSetup.add(panArmy1);

        panArmy3.setBorder(javax.swing.BorderFactory.createTitledBorder("Army 2"));

        jLabel8.setLabelFor(txtLordName1);
        jLabel8.setText("Lord's Name:");

        txtLordName2.setText("Genghis Khan");

        jScrollPane3.setViewportView(lstUnits2);

        jLabel9.setText("Army's Units:");

        jLabel10.setText("Select your Warrior Type:");

        rdgWarriorType2.add(rdbPaladin2);
        rdbPaladin2.setSelected(true);
        rdbPaladin2.setText("Paladin");

        rdgWarriorType2.add(rdbFighter2);
        rdbFighter2.setText("Fighter");

        rdgWarriorType2.add(rdbRanger2);
        rdbRanger2.setText("Ranger");

        cmdChangeWarrior2.setText("Change Selected Warrior");

        jLabel11.setText("Unit's Name:");

        javax.swing.GroupLayout panArmy3Layout = new javax.swing.GroupLayout(panArmy3);
        panArmy3.setLayout(panArmy3Layout);
        panArmy3Layout.setHorizontalGroup(
            panArmy3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panArmy3Layout.createSequentialGroup()
                .addGroup(panArmy3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cmdChangeWarrior2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panArmy3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panArmy3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panArmy3Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCurrentWarriorName2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panArmy3Layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(panArmy3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rdbFighter2)
                                    .addComponent(rdbPaladin2)
                                    .addComponent(rdbRanger2)))
                            .addGroup(panArmy3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLordName2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panArmy3Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(45, 45, 45)
                                .addComponent(jLabel10)))))
                .addGap(0, 75, Short.MAX_VALUE))
        );
        panArmy3Layout.setVerticalGroup(
            panArmy3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panArmy3Layout.createSequentialGroup()
                .addGroup(panArmy3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtLordName2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panArmy3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panArmy3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panArmy3Layout.createSequentialGroup()
                        .addComponent(rdbPaladin2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdbFighter2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdbRanger2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panArmy3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtCurrentWarriorName2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdChangeWarrior2)
                .addGap(19, 19, 19))
        );

        panSetup.add(panArmy3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panSetup, javax.swing.GroupLayout.DEFAULT_SIZE, 769, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panSetup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdChangeWarrior1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdChangeWarrior1ActionPerformed
        int selectedIndex = lstUnits1.getSelectedIndex();
        if (selectedIndex < 0){
            return;
        }
        DefaultListModel<Warrior> list = (DefaultListModel<Warrior>)lstUnits1.getModel();
        String name;
        if (txtCurrentWarriorName1.getText().trim().equals("")){
            name = "No Name";
        }else{
            name = txtCurrentWarriorName1.getText();
        }
        if (rdbFighter1.isSelected()){            
            list.set(selectedIndex, Warrior.createFighter(name));
        }else if (rdbPaladin1.isSelected()){
            list.set(selectedIndex, Warrior.createPaladin(name));
        }else if (rdbRanger1.isSelected()){
            list.set(selectedIndex, Warrior.createRanger(name));
        }
        
        
        
        
        
    }//GEN-LAST:event_cmdChangeWarrior1ActionPerformed

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
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game().setVisible(true);
            }
        });
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdChangeWarrior1;
    private javax.swing.JButton cmdChangeWarrior2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<Warrior> lstUnits1;
    private javax.swing.JList<Warrior> lstUnits2;
    private javax.swing.JPanel panArmy1;
    private javax.swing.JPanel panArmy3;
    private javax.swing.JPanel panSetup;
    private javax.swing.JRadioButton rdbFighter1;
    private javax.swing.JRadioButton rdbFighter2;
    private javax.swing.JRadioButton rdbPaladin1;
    private javax.swing.JRadioButton rdbPaladin2;
    private javax.swing.JRadioButton rdbRanger1;
    private javax.swing.JRadioButton rdbRanger2;
    private javax.swing.ButtonGroup rdgWarriorType1;
    private javax.swing.ButtonGroup rdgWarriorType2;
    private javax.swing.JTextField txtCurrentWarriorName1;
    private javax.swing.JTextField txtCurrentWarriorName2;
    private javax.swing.JTextField txtLordName1;
    private javax.swing.JTextField txtLordName2;
    // End of variables declaration//GEN-END:variables
}

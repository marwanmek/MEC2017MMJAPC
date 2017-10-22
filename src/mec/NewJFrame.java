/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mec;

/**
 *
 * @author Marwan
 */
public class NewJFrame extends javax.swing.JFrame {
    public static int current = 0;
    SoilSensor tomatoS = new SoilSensor();
    SoilSensor cornS = new SoilSensor();
    SoilSensor riceS = new SoilSensor();
    
    WateringDevice w = new WateringDevice();
    
    Thermometer tomatoT = new Thermometer();
    Thermometer cornT = new Thermometer();
    Thermometer riceT = new Thermometer();
    
    public int water(Crop crop){
        if(crop.soilSensor.waterLevel<crop.waterLevel){
            crop.soilSensor.waterLevel++;
            return 0;
        }else{
            return 1;
        }
    }
    
    public void updateText(){
        jTextPane5.setText(tomato.type+"\nPreffered Water Level: "+tomato.waterLevel+"\nPreffered Temperature: "+tomato.getPrefferedTemperature()/*+"\nCurrent Water Level: "+tomato.soilSensor.waterLevel+"\nCurrent Temperature: "+tomato.thermometer.temperature*/);
        jTextPane3.setText(corn.type+"\nPreffered Water Level: "+corn.waterLevel+"\nPreffered Temperature: "+corn.getPrefferedTemperature()/*+"\nCurrent Water Level: "+corn.soilSensor.waterLevel+"\nCurrent Temperature: "+corn.thermometer.temperature*/);
        jTextPane1.setText(rice.type+"\nPreffered Water Level: "+rice.waterLevel+"\nPreffered Temperature: "+rice.getPrefferedTemperature()/*+"\nCurrent Water Level: "+rice.soilSensor.waterLevel+"\nCurrent Temperature: "+rice.thermometer.temperature*/);
    }
    
    Crop tomato = new Crop("Tomato", 5, 21, tomatoT, tomatoS, w);
    Crop rice = new Crop("Rice", 100, 26, riceT, riceS, w);
    Crop corn = new Crop("Corn", 4, 23, cornT, cornS, w);
    
    Crop crops[] = {tomato, rice, corn};
    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
        jTextPane1.hide();
        jTextPane3.hide();
        jTextPane5.hide();
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
        jTextPane2 = new javax.swing.JTextPane();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane3 = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextPane5 = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jScrollPane2.setViewportView(jTextPane2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Crops");

        jTextPane1.setEditable(false);
        jScrollPane1.setViewportView(jTextPane1);

        jTextPane3.setEditable(false);
        jScrollPane3.setViewportView(jTextPane3);

        jTextPane5.setEditable(false);
        jTextPane5.setBorder(null);
        jScrollPane5.setViewportView(jTextPane5);

        jButton1.setText("Water");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Add Crops");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Auto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane5)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        switch (current){
            case 0:
                jTextPane5.setVisible(rootPaneCheckingEnabled);
                jTextPane5.setText(tomato.type+"\nPreffered Water Level: "+tomato.waterLevel+"\nPreffered Temperature: "+tomato.getPrefferedTemperature()/*+"\nCurrent Water Level: "/*+tomato.soilSensor.getLevel()+"\nCurrent Temperature: "/*+tomato.thermometer.temperature*/);
                break;
            case 1:
                jTextPane3.setVisible(rootPaneCheckingEnabled);
                jTextPane3.setText(corn.type+"\nPreffered Water Level: "+corn.waterLevel+"\nPreffered Temperature: "+corn.getPrefferedTemperature()/*+"\nCurrent Water Level: "/*+corn.soilSensor.waterLevel+"\nCurrent Temperature: "+corn.thermometer.temperature*/);
                break;
            case 2:
                jTextPane1.setVisible(rootPaneCheckingEnabled);
                jTextPane1.setText(rice.type+"\nPreffered Water Level: "+rice.waterLevel+"\nPreffered Temperature: "+rice.getPrefferedTemperature()/*+"\nCurrent Water Level: "+rice.soilSensor.waterLevel+"\nCurrent Temperature: "+rice.thermometer.temperature*/);
                
        }
        current++;
                
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        boolean allWatered = false;
        int watered = 0;
        while(watered<3){
            watered = 0;
            for(int i = 0; i < crops.length; i++){
                watered += water(crops[i]);
            }
            updateText();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        //jTextPane1.hide();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JTextPane jTextPane3;
    private javax.swing.JTextPane jTextPane5;
    // End of variables declaration//GEN-END:variables
}
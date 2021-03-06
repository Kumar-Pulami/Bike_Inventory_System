
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kumar
 */
public class Insert extends javax.swing.JFrame {

    /**
     * Creates new form Insert
     */
    public Insert() {
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

        insertPanel = new javax.swing.JPanel();
        bikeIDLabel = new javax.swing.JLabel();
        manufacturerLabel = new javax.swing.JLabel();
        modelLabel = new javax.swing.JLabel();
        categoryLabel = new javax.swing.JLabel();
        colourLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        bikeIDText = new javax.swing.JTextField();
        manufacturerText = new javax.swing.JTextField();
        modelText = new javax.swing.JTextField();
        colourText = new javax.swing.JTextField();
        priceText = new javax.swing.JTextField();
        insertButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        categoryComboBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Insert New Bike Information");

        insertPanel.setLayout(null);

        bikeIDLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bikeIDLabel.setForeground(new java.awt.Color(255, 255, 255));
        bikeIDLabel.setText("Bike ID");
        insertPanel.add(bikeIDLabel);
        bikeIDLabel.setBounds(50, 60, 60, 17);

        manufacturerLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        manufacturerLabel.setForeground(new java.awt.Color(255, 255, 255));
        manufacturerLabel.setText("Manufacturer");
        insertPanel.add(manufacturerLabel);
        manufacturerLabel.setBounds(50, 110, 100, 17);

        modelLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        modelLabel.setForeground(new java.awt.Color(255, 255, 255));
        modelLabel.setText("Model");
        insertPanel.add(modelLabel);
        modelLabel.setBounds(50, 160, 50, 17);

        categoryLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        categoryLabel.setForeground(new java.awt.Color(255, 255, 255));
        categoryLabel.setText("Category");
        insertPanel.add(categoryLabel);
        categoryLabel.setBounds(50, 210, 70, 17);

        colourLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        colourLabel.setForeground(new java.awt.Color(255, 255, 255));
        colourLabel.setText("Colour");
        insertPanel.add(colourLabel);
        colourLabel.setBounds(50, 260, 50, 17);

        priceLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        priceLabel.setForeground(new java.awt.Color(255, 255, 255));
        priceLabel.setText("Price");
        insertPanel.add(priceLabel);
        priceLabel.setBounds(50, 310, 60, 17);
        insertPanel.add(bikeIDText);
        bikeIDText.setBounds(170, 50, 130, 30);
        insertPanel.add(manufacturerText);
        manufacturerText.setBounds(170, 100, 130, 30);
        insertPanel.add(modelText);
        modelText.setBounds(170, 150, 130, 30);
        insertPanel.add(colourText);
        colourText.setBounds(170, 250, 130, 30);
        insertPanel.add(priceText);
        priceText.setBounds(170, 300, 130, 30);

        insertButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        insertButton.setText("Insert");
        insertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertButtonActionPerformed(evt);
            }
        });
        insertPanel.add(insertButton);
        insertButton.setBounds(135, 360, 80, 30);

        clearButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
        insertPanel.add(clearButton);
        clearButton.setBounds(250, 360, 80, 30);

        categoryComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Street", "Sports", "Nacked", "Cruisers", "Off-Road" }));
        categoryComboBox.setToolTipText("");
        insertPanel.add(categoryComboBox);
        categoryComboBox.setBounds(170, 200, 130, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/manipulate.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        insertPanel.add(jLabel3);
        jLabel3.setBounds(0, 0, 400, 430);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(insertPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(insertPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        bikeIDText.setText(null);
        manufacturerText.setText(null);
        modelText.setText(null);
        categoryComboBox.setSelectedItem("Select");        
        colourText.setText(null);        
        priceText.setText(null);
    }//GEN-LAST:event_clearButtonActionPerformed

    private void insertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertButtonActionPerformed
        // TODO add your handling code here:
        int bikeID= 0, price=0;
        String bikeIDTxt = bikeIDText.getText();
        String manufacturer = manufacturerText.getText();
        String model = modelText.getText();
        String category = (String) categoryComboBox.getSelectedItem();        
        String colour = colourText.getText();        
        String priceTxt = priceText.getText();
        if(bikeIDTxt.isEmpty() || manufacturer.isEmpty() || model.isEmpty() || category.equals("None") || colour.isEmpty() || priceTxt.isEmpty()){
            JOptionPane.showMessageDialog(insertPanel, "Please, Fill up all the above fields.");  
        }else{        
            try{
                bikeID = Integer.parseInt(bikeIDTxt);
                price = Integer.parseInt(priceTxt);
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(insertPanel, "Please, Enter Bike Number/ Price in number format.");
            }catch (Exception ex){
                JOptionPane.showMessageDialog(insertPanel, "Error:" + ex);
            }
            if (bikeID<=0 || price<=0){
                JOptionPane.showMessageDialog(insertPanel, "Please, Enter the Bike Number/ Price value greater than 0");                
            }else{   
                boolean sucessfull = BikeInfo.insertInformation(bikeIDTxt, manufacturer, model, category, colour, priceTxt);
                if (sucessfull){
                    dispose();
                    BikeInfo.setterInsertWindowStatus();
                }
            }
        }
    }//GEN-LAST:event_insertButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
 
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Insert().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bikeIDLabel;
    private javax.swing.JTextField bikeIDText;
    private javax.swing.JComboBox<String> categoryComboBox;
    private javax.swing.JLabel categoryLabel;
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel colourLabel;
    private javax.swing.JTextField colourText;
    private javax.swing.JButton insertButton;
    private javax.swing.JPanel insertPanel;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel manufacturerLabel;
    private javax.swing.JTextField manufacturerText;
    private javax.swing.JLabel modelLabel;
    private javax.swing.JTextField modelText;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JTextField priceText;
    // End of variables declaration//GEN-END:variables
}

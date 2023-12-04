/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ecommerce;

import java.awt.CardLayout;
import static java.awt.image.ImageObserver.HEIGHT;
import javax.swing.JOptionPane;
import model.CustomerDirectory;
import model.ProductDirectory;

/**
 *
 * @author shakt
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    CustomerDirectory employees;
    ProductDirectory products;
    
    public MainJFrame() {
        initComponents();
        employees = new CustomerDirectory();
        products = new ProductDirectory();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        topPanel = new javax.swing.JPanel();
        registerButton = new javax.swing.JButton();
        viewButton = new javax.swing.JButton();
        createProductButton1 = new javax.swing.JButton();
        viewProductButton = new javax.swing.JButton();
<<<<<<< HEAD
=======
        viewCartButton = new javax.swing.JButton();
        loginButton = new javax.swing.JButton();
        TitleLable = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
>>>>>>> origin/Louisnew
        bottomPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

<<<<<<< HEAD
        createButton.setText("Create Customer");
        createButton.addActionListener(new java.awt.event.ActionListener() {
=======
        registerButton.setText("Customer Register");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
>>>>>>> origin/Louisnew
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        viewButton.setText("ViewCustomer");
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });

        createProductButton1.setText("Create Product");
        createProductButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createProductButton1ActionPerformed(evt);
            }
        });

<<<<<<< HEAD
        viewProductButton.setText("View");
=======
        viewProductButton.setText("ViewProduct");
>>>>>>> origin/Louisnew
        viewProductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewProductButtonActionPerformed(evt);
            }
        });

<<<<<<< HEAD
=======
        viewCartButton.setText("View Cart");
        viewCartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCartButtonActionPerformed(evt);
            }
        });

        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        TitleLable.setText("Ecommerce!");
        TitleLable.setSize(new java.awt.Dimension(90, 17));

        jButton1.setText("View All Products");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

>>>>>>> origin/Louisnew
        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
<<<<<<< HEAD
                .addGap(138, 138, 138)
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(createButton)
                    .addComponent(createProductButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 185, Short.MAX_VALUE)
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewButton)
                    .addComponent(viewProductButton))
                .addGap(177, 177, 177))
=======
                .addGap(17, 17, 17)
                .addComponent(TitleLable)
                .addGap(271, 271, 271)
                .addComponent(registerButton)
                .addGap(31, 31, 31)
                .addComponent(loginButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewCartButton)
                .addGap(69, 69, 69))
            .addGroup(topPanelLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(topPanelLayout.createSequentialGroup()
                        .addComponent(viewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(viewProductButton, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(createProductButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
>>>>>>> origin/Louisnew
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
<<<<<<< HEAD
                .addGap(19, 19, 19)
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createButton)
                    .addComponent(viewButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createProductButton1)
                    .addComponent(viewProductButton))
                .addContainerGap(23, Short.MAX_VALUE))
=======
                .addGap(18, 18, 18)
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewCartButton)
                    .addComponent(loginButton)
                    .addComponent(registerButton)
                    .addComponent(TitleLable))
                .addGap(9, 9, 9)
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewButton)
                    .addComponent(viewProductButton)
                    .addComponent(createProductButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1))
>>>>>>> origin/Louisnew
        );

        jSplitPane1.setTopComponent(topPanel);

        bottomPanel.setToolTipText("");
        bottomPanel.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(bottomPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        // TODO add your handling code here:
        createCustomerPanel formPanel = new createCustomerPanel(bottomPanel,employees);
        bottomPanel.add("CreateScreen", formPanel);
        CardLayout layout = (CardLayout) bottomPanel.getLayout();
        layout.next(bottomPanel);
    }//GEN-LAST:event_registerButtonActionPerformed

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed

        viewCustomerPanel viewPanel = new viewCustomerPanel(bottomPanel,employees);
        bottomPanel.add("ViewScreen", viewPanel);
        CardLayout layout = (CardLayout) bottomPanel.getLayout();
        layout.next(bottomPanel);
    }//GEN-LAST:event_viewButtonActionPerformed

    private void createProductButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createProductButton1ActionPerformed
<<<<<<< HEAD
        createProductPanel formPanel2 = new createProductPanel(bottomPanel,products);
=======
        createProductPanel formPanel2 = new createProductPanel(bottomPanel);
>>>>>>> origin/Louisnew
        bottomPanel.add("CreateScreen", formPanel2);
        CardLayout layout = (CardLayout) bottomPanel.getLayout();
        layout.next(bottomPanel);
    }//GEN-LAST:event_createProductButton1ActionPerformed

    private void viewProductButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewProductButtonActionPerformed
        // TODO add your handling code here:
<<<<<<< HEAD
        viewProductPanel viewProdPanel = new viewProductPanel(bottomPanel, products);
        bottomPanel.add("ViewScreen", viewProdPanel);
                CardLayout layout = (CardLayout) bottomPanel.getLayout();
        layout.next(bottomPanel);
    }//GEN-LAST:event_viewProductButtonActionPerformed

=======
        viewProductPanel viewProdPanel = new viewProductPanel(bottomPanel);

        CardLayout layout = (CardLayout) bottomPanel.getLayout();
        bottomPanel.add("ViewScreen", viewProdPanel);
        layout.next(bottomPanel);
       
    }//GEN-LAST:event_viewProductButtonActionPerformed

    private void viewCartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewCartButtonActionPerformed
        // TODO add your handling code here:
        viewShoppingCartPanel viewSCPanel = new viewShoppingCartPanel(bottomPanel);
        
        CardLayout layout = (CardLayout) bottomPanel.getLayout();
        bottomPanel.add("ViewScreen", viewSCPanel);
        layout.next(bottomPanel);
    }//GEN-LAST:event_viewCartButtonActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
        loginPanel loginP = new loginPanel(bottomPanel, employees);
        
        CardLayout layout = (CardLayout) bottomPanel.getLayout();
                bottomPanel.add("ViewScreen", loginP);
        layout.next(bottomPanel);

    }//GEN-LAST:event_loginButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        viewWholeProductsPanel viewProdsP = new viewWholeProductsPanel(bottomPanel);
        
        CardLayout layout = (CardLayout) bottomPanel.getLayout();
        bottomPanel.add("ViewScreen", viewProdsP);
        layout.next(bottomPanel);
    }//GEN-LAST:event_jButton1ActionPerformed

>>>>>>> origin/Louisnew
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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TitleLable;
    private javax.swing.JPanel bottomPanel;
<<<<<<< HEAD
    private javax.swing.JButton createButton;
    private javax.swing.JButton createProductButton1;
=======
    private javax.swing.JButton createProductButton1;
    private javax.swing.JButton jButton1;
>>>>>>> origin/Louisnew
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton loginButton;
    private javax.swing.JButton registerButton;
    private javax.swing.JPanel topPanel;
    private javax.swing.JButton viewButton;
<<<<<<< HEAD
=======
    private javax.swing.JButton viewCartButton;
>>>>>>> origin/Louisnew
    private javax.swing.JButton viewProductButton;
    // End of variables declaration//GEN-END:variables
}

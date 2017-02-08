/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumptus.view;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import sumptus.dao.AreaDAO;
import sumptus.dao.DataBase;
import sumptus.dao.OutlayDAO;
import sumptus.dao.PayFormDAO;
import sumptus.model.Area;
import sumptus.model.Outlay;
import sumptus.model.PayForm;
import sumptus.model.User;

/**
 *
 * @author jessicadagostini
 */
public class OutlayDialog extends javax.swing.JDialog {

    private Outlay outlay;
    private AreaDAO areaDAO;
    private List<Area> areas;
    private PayFormDAO pformDAO;
    private List<PayForm> pforms;
    private Area area;
    private PayForm pform;
    private User userLogged;
    private OutlayDAO outlayDAO;

    /**
     * Creates new form OutlayDialog
     */
    public OutlayDialog(User userLogged) {
        initComponents();
        manageOutlay();
        this.userLogged = userLogged;
        outlay = new Outlay();
    }
    
    public OutlayDialog(Outlay outlay){
        this.outlay = outlay;
        System.out.println(outlay.getId());
        initComponents();
        manageOutlay();
        editOutlay();
    }
    
    public OutlayDialog(){        
    }
    
    private void manageOutlay() {
        try {
            areaDAO = new AreaDAO(DataBase.connection());
            areas = areaDAO.findAll();
            areasComboBox.addItem("-");
            for (Area area : areas) {
                areasComboBox.addItem(area.getName());
            }

            pformDAO = new PayFormDAO(DataBase.connection());
            pforms = pformDAO.findAll();
            pformsComboBox.addItem("-");
            for (PayForm pform : pforms) {
                pformsComboBox.addItem(pform.getForm());
            }
            
            outlayDAO = new OutlayDAO(DataBase.connection());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    private void editOutlay(){
        areasComboBox.setSelectedItem(outlay.getArea().getName());
        pformsComboBox.setSelectedItem(outlay.getPform().getForm());
        inputDescription.setText(outlay.getDescription());
        inputCost.setText(outlay.getCost().toString());
        purchaseCalendar.setDate(outlay.getPurchase_date());
        paymentCalendar.setDate(outlay.getPayment_day());
        userLogged = outlay.getUser();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pformLabel = new javax.swing.JLabel();
        areasComboBox = new javax.swing.JComboBox<>();
        areaLabel = new javax.swing.JLabel();
        pformsComboBox = new javax.swing.JComboBox<>();
        descriptionLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        inputDescription = new javax.swing.JTextArea();
        costLabel = new javax.swing.JLabel();
        inputCost = new javax.swing.JTextField();
        purchaseLabel = new javax.swing.JLabel();
        paymentLabel = new javax.swing.JLabel();
        saveOutlayButton = new javax.swing.JButton();
        purchaseCalendar = new com.toedter.calendar.JCalendar();
        paymentCalendar = new com.toedter.calendar.JCalendar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sumptus - Adicionar Gasto");
        setResizable(false);

        pformLabel.setText("Forma de Pagamento");

        areasComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areasComboBoxActionPerformed(evt);
            }
        });

        areaLabel.setText("Área");

        pformsComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pformsComboBoxActionPerformed(evt);
            }
        });

        descriptionLabel.setText("Descrição");

        inputDescription.setColumns(20);
        inputDescription.setRows(5);
        jScrollPane2.setViewportView(inputDescription);

        costLabel.setText("Valor");

        purchaseLabel.setText("Data da Compra");

        paymentLabel.setText("Data de Vencimento");

        saveOutlayButton.setText("Salvar");
        saveOutlayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveOutlayButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(saveOutlayButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(areaLabel)
                                    .addComponent(pformLabel)
                                    .addComponent(descriptionLabel)
                                    .addComponent(costLabel))
                                .addGap(38, 38, 38))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(paymentLabel)
                                    .addComponent(purchaseLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(inputCost, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pformsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(areasComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(purchaseCalendar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(paymentCalendar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pformLabel)
                    .addComponent(pformsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(areaLabel)
                    .addComponent(areasComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descriptionLabel)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(costLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(purchaseLabel)
                    .addComponent(purchaseCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(paymentLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(paymentCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveOutlayButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void areasComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areasComboBoxActionPerformed
        JComboBox jb = (JComboBox) evt.getSource();
        String name = (String) jb.getSelectedItem();
        if (name != "-") {
            try {
                area = areaDAO.findByName(name);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            }
        }
    }//GEN-LAST:event_areasComboBoxActionPerformed

    private void pformsComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pformsComboBoxActionPerformed
        JComboBox jb = (JComboBox) evt.getSource();
        String name = (String) jb.getSelectedItem();
        if (name != "-") {
            try {
                pform = pformDAO.findByName(name);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            }
        }
    }//GEN-LAST:event_pformsComboBoxActionPerformed

    private void saveOutlayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveOutlayButtonActionPerformed
        outlay.setUser(userLogged);
        outlay.setArea(area);
        outlay.setPform(pform);
        outlay.setDescription(inputDescription.getText());
        outlay.setCost(new BigDecimal(inputCost.getText()));
        outlay.setPurchase_date(purchaseCalendar.getDate());
        outlay.setPayment_day(paymentCalendar.getDate());
        System.out.println(outlay.getId());
        if(outlay.getArea() != null && outlay.getPform() != null){
            if(outlay.getId() == null){
                try {
                    Integer id = outlayDAO.create(outlay);
                    JOptionPane.showMessageDialog(rootPane, "Registro criado! Id:" + id);
                    this.dispose();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(rootPane, ex.getMessage());
                }
            } else {
                try{
                    String saida = outlayDAO.update(outlay);
                    JOptionPane.showMessageDialog(rootPane, saida);
                    this.dispose();
                }catch(SQLException ex){
                    JOptionPane.showMessageDialog(rootPane, ex.getMessage());
                }
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Por favor, edite os dados necessários");
        }

    }//GEN-LAST:event_saveOutlayButtonActionPerformed

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
            java.util.logging.Logger.getLogger(OutlayDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OutlayDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OutlayDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OutlayDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                OutlayDialog dialog = new OutlayDialog();
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel areaLabel;
    private javax.swing.JComboBox<String> areasComboBox;
    private javax.swing.JLabel costLabel;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JTextField inputCost;
    private javax.swing.JTextArea inputDescription;
    private javax.swing.JScrollPane jScrollPane2;
    private com.toedter.calendar.JCalendar paymentCalendar;
    private javax.swing.JLabel paymentLabel;
    private javax.swing.JLabel pformLabel;
    private javax.swing.JComboBox<String> pformsComboBox;
    private com.toedter.calendar.JCalendar purchaseCalendar;
    private javax.swing.JLabel purchaseLabel;
    private javax.swing.JButton saveOutlayButton;
    // End of variables declaration//GEN-END:variables
}

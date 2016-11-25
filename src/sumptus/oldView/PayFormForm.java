package sumptus.oldView;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sumptus.dao.DataBase;
import sumptus.dao.PayFormDAO;
import sumptus.model.PayForm;
/**
 *
 * @author Jessica Dagostini
 */
public class PayFormForm extends javax.swing.JFrame {

    /**
     * Creates new form PayFormForm
     */
    public PayFormForm() {
        initComponents();
        initialize();
    }
    
    private void initialize(){
        try {
            pformDAO = new PayFormDAO(DataBase.connection());
            pforms = pformDAO.findAll();
            pFormTbModel = new PayFormTableModel(pforms);
            pFormTable.setModel(pFormTbModel);            
        } catch (SQLException ex) {
            Logger.getLogger(PayFormForm.class.getName()).log(Level.SEVERE, null, ex);
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

        editFrame = new javax.swing.JFrame();
        jLabel2 = new javax.swing.JLabel();
        editId = new javax.swing.JTextField();
        editForm = new javax.swing.JTextField();
        saveEdition = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pFormTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        createPform = new javax.swing.JButton();
        deletePform = new javax.swing.JButton();

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Editar Forma de Pagamento");

        editId.setText("jTextField1");
        editId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editIdActionPerformed(evt);
            }
        });

        editForm.setText("jTextField2");

        saveEdition.setText("Salvar");
        saveEdition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveEditionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout editFrameLayout = new javax.swing.GroupLayout(editFrame.getContentPane());
        editFrame.getContentPane().setLayout(editFrameLayout);
        editFrameLayout.setHorizontalGroup(
            editFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editFrameLayout.createSequentialGroup()
                .addGroup(editFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editFrameLayout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel2))
                    .addGroup(editFrameLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(editFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(saveEdition)
                            .addGroup(editFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(editId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(editForm, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        editFrameLayout.setVerticalGroup(
            editFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editFrameLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel2)
                .addGap(29, 29, 29)
                .addComponent(editId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saveEdition)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pFormTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        pFormTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pFormTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(pFormTable);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Formas de Pagamento");

        createPform.setText("Novo");
        createPform.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPformActionPerformed(evt);
            }
        });

        deletePform.setText("Deletar");
        deletePform.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletePformActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(288, 288, 288)
                .addComponent(createPform)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deletePform)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(142, 142, 142))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createPform)
                    .addComponent(deletePform))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createPformActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPformActionPerformed
        String newPform = JOptionPane.showInputDialog("Digite a nova Forma de Pagamento");
        if(newPform != null){            
            try {
                PayForm payform = new PayForm();
                PayFormDAO DAO = new PayFormDAO(DataBase.connection());
                payform.setForm(newPform);
                DAO.create(payform);
                JOptionPane.showMessageDialog(null, "Gravado com Sucesso", "Informação", JOptionPane.INFORMATION_MESSAGE);
                refresh();
            } catch (SQLException ex) {
                Logger.getLogger(PayFormForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_createPformActionPerformed

    private void deletePformActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePformActionPerformed
        // TODO add your handling code here:
        pform = pforms.get(pFormTable.getSelectedRow());
        int delete = JOptionPane.showConfirmDialog(rootPane, "Deletar \"" + pform.getForm() + "\"?", "Confirmação", JOptionPane.YES_NO_OPTION);
            System.out.println("Delete = " + delete);
            if(delete == 0){
                try {
                    String saida = pformDAO.delete(pform.getId());
                    JOptionPane.showMessageDialog(rootPane, saida);
                    refresh();
                } catch (Exception ex) {
                }
            }
    }//GEN-LAST:event_deletePformActionPerformed

    private void editIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editIdActionPerformed

    private void pFormTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pFormTableMouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount() == 2) {
            pform = pforms.get(pFormTable.getSelectedRow());
            editForm.setText(pform.getForm());
            editId.setText(pform.getId().toString());
            editFrame.setSize(400, 400);
            editFrame.setVisible(true);
        }
    }//GEN-LAST:event_pFormTableMouseClicked

    private void saveEditionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveEditionActionPerformed
        // TODO add your handling code here:
        pform.setId(Integer.parseInt(editId.getText()));
        pform.setForm(editForm.getText());
        try {
            String saida = pformDAO.update(pform);
            editFrame.setVisible(false);
            JOptionPane.showMessageDialog(rootPane, saida);
            refresh();
        } catch (SQLException ex) {
            Logger.getLogger(AreaForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_saveEditionActionPerformed

    private void refresh(){
        try {
            pformDAO = new PayFormDAO(DataBase.connection());
            pforms = pformDAO.findAll();
            pFormTbModel = new PayFormTableModel(pforms);
            pFormTable.setModel(pFormTbModel);            
        } catch (SQLException ex) {
            Logger.getLogger(PayFormForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
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
            java.util.logging.Logger.getLogger(PayFormForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PayFormForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PayFormForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PayFormForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PayFormForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createPform;
    private javax.swing.JButton deletePform;
    private javax.swing.JTextField editForm;
    private javax.swing.JFrame editFrame;
    private javax.swing.JTextField editId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable pFormTable;
    private javax.swing.JButton saveEdition;
    // End of variables declaration//GEN-END:variables
    private List<PayForm> pforms;
    private PayForm pform;
    private PayFormDAO pformDAO;
    private PayFormTableModel pFormTbModel;    
}
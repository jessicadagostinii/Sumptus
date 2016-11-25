/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumptus.oldView;

import sumptus.view.OutlayTableModel;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import sumptus.dao.AreaDAO;
import sumptus.dao.DataBase;
import sumptus.dao.OutlayDAO;
import sumptus.dao.PayFormDAO;
import sumptus.dao.UserDAO;
import sumptus.model.Area;
import sumptus.model.Outlay;
import sumptus.model.PayForm;
import sumptus.model.User;

/**
 *
 * @author Jessica Dagostini
 */
public class OutlayForm extends javax.swing.JFrame {

    private Outlay outlay;
    private OutlayDAO outlayDAO;
    private List<Outlay> outlays;
    private List<Area> areas;
    private List<PayForm> pforms;
    private PayFormDAO pformDAO;
    private AreaDAO areaDAO;
    private Area area;
    private PayForm pform;
    private OutlayTableModel outlayTbModel;
    private UserDAO userDAO;
    private User userLogged;

    /**
     * Creates new form OutlayFrom
     */
    public OutlayForm(User userLogged) {
        initComponents();
        setUser(userLogged);
        initialize();
    }

    private OutlayForm() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        initComponents();
        initialize();
    }

    public void setUser(User userLogged){
        this.userLogged = userLogged;
    }
    
    public void initialize() {
        try {
            outlayDAO = new OutlayDAO(DataBase.connection());
            outlays = outlayDAO.findByUser(userLogged.getId());
            outlayTbModel = new OutlayTableModel(outlays);
            outlayTable.setModel(outlayTbModel);
            showOutlay.setVisible(true);
            addOutlay.setVisible(false);
            
            areaDAO = new AreaDAO(DataBase.connection());
            areas = areaDAO.findAll();
            for(Area area : areas){ 
                System.out.println(area.getName());
                selectArea.addItem(area.getName());
            }
            
            pformDAO = new PayFormDAO(DataBase.connection());
            pforms = pformDAO.findAll();
            for(PayForm pform : pforms){ 
                System.out.println(pform.getForm());
                selectPayForm.addItem(pform.getForm());
            }
            
            userDAO = new UserDAO(DataBase.connection());
            area = new Area();
            pform = new PayForm();
            outlay = new Outlay();
            
        } catch (SQLException ex) {
            Logger.getLogger(OutlayForm.class.getName()).log(Level.SEVERE, null, ex);
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

        showOutlay = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        outlayTable = new javax.swing.JTable();
        createOutlay = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        addOutlay = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        selectArea = new javax.swing.JComboBox<>();
        selectPayForm = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        setDescription = new javax.swing.JTextArea();
        setCost = new javax.swing.JTextField();
        createButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        outlayTable.setModel(new javax.swing.table.DefaultTableModel(
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
        outlayTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                outlayTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(outlayTable);

        createOutlay.setText("Adicionar");
        createOutlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createOutlayActionPerformed(evt);
            }
        });

        jButton1.setText("Listar Áreas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout showOutlayLayout = new javax.swing.GroupLayout(showOutlay);
        showOutlay.setLayout(showOutlayLayout);
        showOutlayLayout.setHorizontalGroup(
            showOutlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 799, Short.MAX_VALUE)
            .addGroup(showOutlayLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(createOutlay))
        );
        showOutlayLayout.setVerticalGroup(
            showOutlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, showOutlayLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(showOutlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createOutlay)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE))
        );

        jLabel1.setText("Área");

        jLabel2.setText("Forma de Pagamento");

        jLabel3.setText("Descrição");

        jLabel4.setText("Valor");

        selectArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectAreaActionPerformed(evt);
            }
        });

        selectPayForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectPayFormActionPerformed(evt);
            }
        });

        setDescription.setColumns(20);
        setDescription.setRows(5);
        jScrollPane2.setViewportView(setDescription);

        setCost.setText("0.00");

        createButton.setText("Salvar");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addOutlayLayout = new javax.swing.GroupLayout(addOutlay);
        addOutlay.setLayout(addOutlayLayout);
        addOutlayLayout.setHorizontalGroup(
            addOutlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addOutlayLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(addOutlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addOutlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addOutlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectPayForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(setCost, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addOutlayLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(createButton)
                .addGap(23, 23, 23))
        );
        addOutlayLayout.setVerticalGroup(
            addOutlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addOutlayLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(addOutlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(selectArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addOutlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(selectPayForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addOutlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addOutlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(setCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(createButton)
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(showOutlay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(addOutlay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(showOutlay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(addOutlay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createOutlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createOutlayActionPerformed
        // TODO add your handling code here:
        showOutlay.setVisible(false);
        addOutlay.setVisible(true);
    }//GEN-LAST:event_createOutlayActionPerformed

    private void outlayTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_outlayTableMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            int row = outlayTable.rowAtPoint(evt.getPoint());
            int col = outlayTable.columnAtPoint(evt.getPoint());
            if (col == 6) {
                outlay = outlays.get(outlayTable.getSelectedRow());
                if (outlay.getPaid() == "-" && JOptionPane.showConfirmDialog(rootPane, "Você deseja marcar este dado como pago?") == 0) {
                    outlay.setPaid(true);
                    try {
                        String saida = outlayDAO.update(outlay);
                        JOptionPane.showMessageDialog(rootPane, saida);
                        refresh();
                    } catch (SQLException ex) {
                        Logger.getLogger(OutlayForm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }else {
                
            }
        }
    }//GEN-LAST:event_outlayTableMouseClicked

    private void selectAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectAreaActionPerformed
        JComboBox jb = (JComboBox)evt.getSource();
        String name = (String)jb.getSelectedItem();
        System.out.println("Select " + name);
        try {
            area = areaDAO.findByName(name);
            System.out.println(area.getId() + " " + area.getName());
        } catch (SQLException ex) {
            Logger.getLogger(OutlayForm.class.getName()).log(Level.SEVERE, null, ex);
        }      
        
    }//GEN-LAST:event_selectAreaActionPerformed

    private void selectPayFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectPayFormActionPerformed
        // TODO add your handling code here:
        JComboBox jb = (JComboBox)evt.getSource();
        String name = (String)jb.getSelectedItem();
        try {
            pform = pformDAO.findByName(name);
            System.out.println(pform.getForm());
        } catch (SQLException ex) {
            Logger.getLogger(OutlayForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_selectPayFormActionPerformed

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        // TODO add your handling code here:
        System.out.println(area.getId());
        outlay.setArea(area);
        System.out.println(outlay.getArea().getId());
        outlay.setPform(pform);
        try {
            outlay.setUser(userDAO.findById(1));
            outlay.setDescription(setDescription.getText());
            outlay.setCost(new BigDecimal(setCost.getText()));
            Integer id = outlayDAO.create(outlay);
            System.out.println(outlay.getArea().getName() + " " + outlay.getPform().getForm() + " " + outlay.getCost().toString());
            JOptionPane.showMessageDialog(rootPane, "Usuário criado" + id);
            showOutlay.setVisible(true);
            addOutlay.setVisible(false);
            refresh();
        } catch (SQLException ex) {
            Logger.getLogger(OutlayForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_createButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        AreaForm areaFrame = new AreaForm();
        areaFrame.setVisible(true);
        System.out.println("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void refresh() {
        try {
            outlayDAO = new OutlayDAO(DataBase.connection());
            outlays = outlayDAO.findAll();
            outlayTbModel = new OutlayTableModel(outlays);
            outlayTable.setModel(outlayTbModel);
            areas = areaDAO.findAll();
            for(Area area : areas){ 
                System.out.println(area.getName());
                selectArea.addItem(area.getName());
            }
        } catch (SQLException ex) {
            Logger.getLogger(OutlayForm.class.getName()).log(Level.SEVERE, null, ex);
        }
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
            java.util.logging.Logger.getLogger(OutlayForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OutlayForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OutlayForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OutlayForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OutlayForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addOutlay;
    private javax.swing.JButton createButton;
    private javax.swing.JButton createOutlay;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable outlayTable;
    private javax.swing.JComboBox<String> selectArea;
    private javax.swing.JComboBox<String> selectPayForm;
    private javax.swing.JTextField setCost;
    private javax.swing.JTextArea setDescription;
    private javax.swing.JPanel showOutlay;
    // End of variables declaration//GEN-END:variables
}
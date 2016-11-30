/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumptus.view;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class UserOutlaysFrame extends javax.swing.JFrame {

    private User userLogged;
    private OutlayDAO outlayDAO;
    private List<Outlay> outlays;
    private OutlayTableModel outlayTbModel;
    private AreaDAO areaDAO;
    private List<Area> areas;
    private PayFormDAO pformDAO;
    private List<PayForm> pforms;
    private Outlay outlay;
    private Area area;
    private PayForm pform;

    /**
     * Creates new form UserOutlays
     */
    public UserOutlaysFrame(User userLogged) {
        initComponents();
        this.userLogged = userLogged;
        initOutlays();
        Locale locale = new Locale("pt", "BR");
    }

    private UserOutlaysFrame() {
        initComponents();
    }

    public void initOutlays() {
        try {
            outlayDAO = new OutlayDAO(DataBase.connection());
            outlays = outlayDAO.findByUser(userLogged.getId());
            outlayTbModel = new OutlayTableModel(outlays);
            outlaysTable.setModel(outlayTbModel);
            LocalDate today = LocalDate.now();
            String diaDaSemana = today.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault());
            String mes = today.getMonth().getDisplayName(TextStyle.FULL, Locale.getDefault());
            welcomeLabel.setText("Olá " + userLogged.getName() + "! Hoje é " + diaDaSemana + ", " + today.getDayOfMonth() + " de " + mes + " de " + today.getYear());
        } catch (SQLException ex) {
            Logger.getLogger(UserOutlaysFrame.class.getName()).log(Level.SEVERE, null, ex);
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

        setOutlay = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        areasComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        pformsComboBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        inputDescription = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        inputCost = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        saveOutlayButton = new javax.swing.JButton();
        purchaseCalendar = new com.toedter.calendar.JCalendar();
        paymentCalendar = new com.toedter.calendar.JCalendar();
        outlaysPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        outlaysTable = new javax.swing.JTable();
        welcomeLabel = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        outlayMenu = new javax.swing.JMenu();
        addOutlayMenuItem = new javax.swing.JMenuItem();
        editOutlayMenuItem = new javax.swing.JMenuItem();
        areaMenu = new javax.swing.JMenu();
        listAllAreasMenuItem = new javax.swing.JMenuItem();
        pformMenu = new javax.swing.JMenu();
        listAllPformsMenuItem = new javax.swing.JMenuItem();
        userMenu = new javax.swing.JMenu();
        editUserMenuItem = new javax.swing.JMenuItem();

        setOutlay.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setOutlay.setTitle("Pagamento");
        setOutlay.setMinimumSize(new java.awt.Dimension(500, 300));
        setOutlay.setSize(new java.awt.Dimension(1080, 720));

        jLabel1.setText("Forma de Pagamento");

        areasComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areasComboBoxActionPerformed(evt);
            }
        });

        jLabel2.setText("Área");

        pformsComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pformsComboBoxActionPerformed(evt);
            }
        });

        jLabel3.setText("Descrição");

        inputDescription.setColumns(20);
        inputDescription.setRows(5);
        jScrollPane2.setViewportView(inputDescription);

        jLabel4.setText("Valor");

        inputCost.setText("0.00");

        jLabel5.setText("Data da Compra");

        jLabel6.setText("Data de Pagamento");

        saveOutlayButton.setText("Salvar");
        saveOutlayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveOutlayButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout setOutlayLayout = new javax.swing.GroupLayout(setOutlay.getContentPane());
        setOutlay.getContentPane().setLayout(setOutlayLayout);
        setOutlayLayout.setHorizontalGroup(
            setOutlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setOutlayLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(setOutlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, setOutlayLayout.createSequentialGroup()
                        .addGroup(setOutlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(38, 38, 38))
                    .addGroup(setOutlayLayout.createSequentialGroup()
                        .addGroup(setOutlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)))
                .addGroup(setOutlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(purchaseCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputCost, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pformsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(areasComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(setOutlayLayout.createSequentialGroup()
                        .addComponent(paymentCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveOutlayButton)))
                .addContainerGap(256, Short.MAX_VALUE))
        );
        setOutlayLayout.setVerticalGroup(
            setOutlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setOutlayLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(setOutlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(pformsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(setOutlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(areasComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(setOutlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(setOutlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(setOutlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(purchaseCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(setOutlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(setOutlayLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel6))
                    .addGroup(setOutlayLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(paymentCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, setOutlayLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(saveOutlayButton)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(1080, 520));

        outlaysTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(outlaysTable);

        welcomeLabel.setText("jLabel7");

        javax.swing.GroupLayout outlaysPanelLayout = new javax.swing.GroupLayout(outlaysPanel);
        outlaysPanel.setLayout(outlaysPanelLayout);
        outlaysPanelLayout.setHorizontalGroup(
            outlaysPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(outlaysPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(welcomeLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        outlaysPanelLayout.setVerticalGroup(
            outlaysPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, outlaysPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(welcomeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        outlayMenu.setText("Gastos");

        addOutlayMenuItem.setText("Adicionar");
        addOutlayMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOutlayMenuItemActionPerformed(evt);
            }
        });
        outlayMenu.add(addOutlayMenuItem);

        editOutlayMenuItem.setText("Editar");
        outlayMenu.add(editOutlayMenuItem);

        menuBar.add(outlayMenu);

        areaMenu.setText("Areas");

        listAllAreasMenuItem.setText("Listar Todos");
        listAllAreasMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listAllAreasMenuItemActionPerformed(evt);
            }
        });
        areaMenu.add(listAllAreasMenuItem);

        menuBar.add(areaMenu);

        pformMenu.setText("Formas Pagamentos");

        listAllPformsMenuItem.setText("Listar Todos");
        listAllPformsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listAllPformsMenuItemActionPerformed(evt);
            }
        });
        pformMenu.add(listAllPformsMenuItem);

        menuBar.add(pformMenu);

        userMenu.setText("Usuários");

        editUserMenuItem.setText("Editar usuário");
        editUserMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editUserMenuItemActionPerformed(evt);
            }
        });
        userMenu.add(editUserMenuItem);

        menuBar.add(userMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(outlaysPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(outlaysPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listAllAreasMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listAllAreasMenuItemActionPerformed
        // TODO add your handling code here:
        System.out.println("Entrou ActionPerformed");
        AreaFrame areas = new AreaFrame();
        areas.setVisible(true);
    }//GEN-LAST:event_listAllAreasMenuItemActionPerformed

    private void addOutlayMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOutlayMenuItemActionPerformed
        // TODO add your handling code here:
        setOutlay.setVisible(true);
        manageOutlay();
    }//GEN-LAST:event_addOutlayMenuItemActionPerformed

    private void saveOutlayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveOutlayButtonActionPerformed
        // TODO add your handling code here:
        outlay = new Outlay();
        outlay.setUser(userLogged);
        outlay.setArea(area);
        outlay.setPform(pform);
        outlay.setDescription(inputDescription.getText());
        outlay.setCost(new BigDecimal(inputCost.getText()));
        outlay.setPurchase_date(purchaseCalendar.getDate());
        outlay.setPayment_day(paymentCalendar.getDate());
        if(outlay.getArea() != null && outlay.getPform() != null){
            try {
            Integer id = outlayDAO.create(outlay);
            System.out.println(outlay.getArea().getName() + " " + outlay.getPform().getForm() + " " + outlay.getCost().toString());
            JOptionPane.showMessageDialog(rootPane, "Usuário criado" + id);
            setOutlay.dispose();
            initOutlays();
        } catch (SQLException ex) {
            Logger.getLogger(UserOutlaysFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        } else {
            JOptionPane.showMessageDialog(areasComboBox, "Por favor, edite os dados necessários");
        }
        

    }//GEN-LAST:event_saveOutlayButtonActionPerformed

    private void areasComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areasComboBoxActionPerformed
        // TODO add your handling code here:
        JComboBox jb = (JComboBox) evt.getSource();
        String name = (String) jb.getSelectedItem();
        if (name != "-") {
            try {
                area = areaDAO.findByName(name);
            } catch (SQLException ex) {
                Logger.getLogger(UserOutlaysFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_areasComboBoxActionPerformed

    private void pformsComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pformsComboBoxActionPerformed
        // TODO add your handling code here:
        JComboBox jb = (JComboBox) evt.getSource();
        String name = (String) jb.getSelectedItem();
        if (name != "-") {
            try {
                pform = pformDAO.findByName(name);
            } catch (SQLException ex) {
                Logger.getLogger(UserOutlaysFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_pformsComboBoxActionPerformed

    private void listAllPformsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listAllPformsMenuItemActionPerformed
        // TODO add your handling code here:
        PayFormFrame pforms = new PayFormFrame();
        pforms.setVisible(true);
    }//GEN-LAST:event_listAllPformsMenuItemActionPerformed

    private void editUserMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editUserMenuItemActionPerformed
        // TODO add your handling code here
        UserEditFrame edit = new UserEditFrame();
        edit.setUser(userLogged);
        edit.setVisible(true);
    }//GEN-LAST:event_editUserMenuItemActionPerformed

    private void manageOutlay() {
        try {
            areaDAO = new AreaDAO(DataBase.connection());
            areas = areaDAO.findAll();
            areasComboBox.addItem("-");
            for (Area area : areas) {
                System.out.println(area.getName());
                areasComboBox.addItem(area.getName());
            }

            pformDAO = new PayFormDAO(DataBase.connection());
            pforms = pformDAO.findAll();
            pformsComboBox.addItem("-");
            for (PayForm pform : pforms) {
                System.out.println(pform.getForm());
                pformsComboBox.addItem(pform.getForm());
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserOutlaysFrame.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(UserOutlaysFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserOutlaysFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserOutlaysFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserOutlaysFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserOutlaysFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem addOutlayMenuItem;
    private javax.swing.JMenu areaMenu;
    private javax.swing.JComboBox<String> areasComboBox;
    private javax.swing.JMenuItem editOutlayMenuItem;
    private javax.swing.JMenuItem editUserMenuItem;
    private javax.swing.JTextField inputCost;
    private javax.swing.JTextArea inputDescription;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem listAllAreasMenuItem;
    private javax.swing.JMenuItem listAllPformsMenuItem;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu outlayMenu;
    private javax.swing.JPanel outlaysPanel;
    private javax.swing.JTable outlaysTable;
    private com.toedter.calendar.JCalendar paymentCalendar;
    private javax.swing.JMenu pformMenu;
    private javax.swing.JComboBox<String> pformsComboBox;
    private com.toedter.calendar.JCalendar purchaseCalendar;
    private javax.swing.JButton saveOutlayButton;
    private javax.swing.JDialog setOutlay;
    private javax.swing.JMenu userMenu;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}

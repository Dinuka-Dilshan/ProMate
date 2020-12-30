
package Interfaces;

import Alerts.logoutAlert;
import DB.dbConnect;
import Errors.dbError;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class MainMenu extends javax.swing.JFrame {

    int x,y;
    
    //comment
   
    
    public MainMenu() {
        initComponents();
    }

    public MainMenu(String user, String type) {
        initComponents();
        unScreen.setText("User - "+user);
        
        if(type.equals("admin")){
           users.setVisible(true); 
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        users = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        settings = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        power = new javax.swing.JLabel();
        unScreen = new javax.swing.JLabel();
        userPane = new javax.swing.JLayeredPane();
        Home = new javax.swing.JPanel();
        statPanel = new javax.swing.JPanel();
        Statics = new javax.swing.JLabel();
        inventoryPanel = new javax.swing.JPanel();
        Inventory = new javax.swing.JLabel();
        promotionPanle = new javax.swing.JPanel();
        Promotions = new javax.swing.JLabel();
        supplierPanel = new javax.swing.JPanel();
        Finance = new javax.swing.JLabel();
        userControl = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        userDetailsTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        updateButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        deleteButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        typeComboBox = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        nicSearch = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txtNic = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtUName = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        showInventory = new javax.swing.JPanel();
        usersText = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        settingsPanel = new javax.swing.JPanel();
        settingsText = new javax.swing.JLabel();
        geelsSuperLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(52, 73, 94));
        jPanel1.setMaximumSize(new java.awt.Dimension(710, 560));
        jPanel1.setSize(710,560);
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(127, 140, 141));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        users.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/img/icons8_user_30px.png"))); // NOI18N
        users.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usersMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                usersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                usersMouseExited(evt);
            }
        });
        jPanel2.add(users, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, -1));
        //users.setVisible(false);

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/img/icons8_logout_rounded_left_26px.png"))); // NOI18N
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutMouseExited(evt);
            }
        });
        jPanel2.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));

        settings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/img/settingsIMG.png"))); // NOI18N
        settings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                settingsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                settingsMouseExited(evt);
            }
        });
        jPanel2.add(settings, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        jLabel1.setText("Home");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, 60));

        power.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/img/icons8_shutdown_30px_1.png"))); // NOI18N
        power.setText("jLabel7");
        power.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                powerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                powerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                powerMouseExited(evt);
            }
        });

        unScreen.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        unScreen.setForeground(new java.awt.Color(255, 255, 255));
        unScreen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                unScreenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                unScreenMouseExited(evt);
            }
        });

        userPane.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        userPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Home.setBackground(new java.awt.Color(62, 74, 87));

        statPanel.setBackground(new java.awt.Color(204, 204, 204));
        statPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Statics.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Statics.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/img/Finance.png"))); // NOI18N
        Statics.setText("Statistics");
        Statics.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                StaticsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                StaticsMouseExited(evt);
            }
        });

        javax.swing.GroupLayout statPanelLayout = new javax.swing.GroupLayout(statPanel);
        statPanel.setLayout(statPanelLayout);
        statPanelLayout.setHorizontalGroup(
            statPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Statics, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        statPanelLayout.setVerticalGroup(
            statPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, statPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Statics, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        inventoryPanel.setBackground(new java.awt.Color(204, 204, 204));

        Inventory.setBackground(new java.awt.Color(255, 51, 204));
        Inventory.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Inventory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/img/Intentory.png"))); // NOI18N
        Inventory.setText("Inventory");
        Inventory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InventoryMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                InventoryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                InventoryMouseExited(evt);
            }
        });

        javax.swing.GroupLayout inventoryPanelLayout = new javax.swing.GroupLayout(inventoryPanel);
        inventoryPanel.setLayout(inventoryPanelLayout);
        inventoryPanelLayout.setHorizontalGroup(
            inventoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Inventory, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
        );
        inventoryPanelLayout.setVerticalGroup(
            inventoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inventoryPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(Inventory, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        promotionPanle.setBackground(new java.awt.Color(204, 204, 204));

        Promotions.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Promotions.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/img/Promotion.png"))); // NOI18N
        Promotions.setText("  Promotions");
        Promotions.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PromotionsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PromotionsMouseExited(evt);
            }
        });

        javax.swing.GroupLayout promotionPanleLayout = new javax.swing.GroupLayout(promotionPanle);
        promotionPanle.setLayout(promotionPanleLayout);
        promotionPanleLayout.setHorizontalGroup(
            promotionPanleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Promotions, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
        );
        promotionPanleLayout.setVerticalGroup(
            promotionPanleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, promotionPanleLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Promotions, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        supplierPanel.setBackground(new java.awt.Color(204, 204, 204));
        supplierPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Finance.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Finance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/img/Supplies.png"))); // NOI18N
        Finance.setText("Suppliers");
        Finance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FinanceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FinanceMouseExited(evt);
            }
        });

        javax.swing.GroupLayout supplierPanelLayout = new javax.swing.GroupLayout(supplierPanel);
        supplierPanel.setLayout(supplierPanelLayout);
        supplierPanelLayout.setHorizontalGroup(
            supplierPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Finance, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        supplierPanelLayout.setVerticalGroup(
            supplierPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, supplierPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Finance, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout HomeLayout = new javax.swing.GroupLayout(Home);
        Home.setLayout(HomeLayout);
        HomeLayout.setHorizontalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(statPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inventoryPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23)
                .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(promotionPanle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(supplierPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        HomeLayout.setVerticalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomeLayout.createSequentialGroup()
                .addContainerGap(125, Short.MAX_VALUE)
                .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(statPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(supplierPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inventoryPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(promotionPanle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(128, 128, 128))
        );

        userPane.add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 450));

        userControl.setBackground(new java.awt.Color(62, 74, 87));
        userControl.setVisible(false);

        userDetailsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "User Name", "NIC", "Phone", "Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        userDetailsTable.setShowHorizontalLines(false);
        userDetailsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userDetailsTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(userDetailsTable);
        if (userDetailsTable.getColumnModel().getColumnCount() > 0) {
            userDetailsTable.getColumnModel().getColumn(0).setResizable(false);
            userDetailsTable.getColumnModel().getColumn(1).setResizable(false);
            userDetailsTable.getColumnModel().getColumn(2).setResizable(false);
            userDetailsTable.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel2.setBackground(new java.awt.Color(62, 74, 87));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("User Name");

        jLabel3.setBackground(new java.awt.Color(62, 74, 87));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NIC");

        jLabel4.setBackground(new java.awt.Color(62, 74, 87));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Phone");

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(62, 74, 87));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Name");

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        addButton.setText("ADD");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(62, 74, 87));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Type");

        jLabel7.setBackground(new java.awt.Color(62, 74, 87));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Password");

        typeComboBox.setBackground(new java.awt.Color(62, 74, 87));
        typeComboBox.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        typeComboBox.setForeground(new java.awt.Color(255, 255, 255));
        typeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User", "Admin" }));

        jLabel8.setBackground(new java.awt.Color(62, 74, 87));
        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Name");

        nicSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nicSearchActionPerformed(evt);
            }
        });
        nicSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nicSearchKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nicSearchKeyTyped(evt);
            }
        });

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtNic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNicActionPerformed(evt);
            }
        });

        txtPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneActionPerformed(evt);
            }
        });

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout userControlLayout = new javax.swing.GroupLayout(userControl);
        userControl.setLayout(userControlLayout);
        userControlLayout.setHorizontalGroup(
            userControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userControlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addButton)
                .addGap(18, 18, 18)
                .addComponent(updateButton)
                .addGap(18, 18, 18)
                .addComponent(deleteButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(userControlLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(userControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtName)
                    .addComponent(txtUName)
                    .addComponent(txtNic)
                    .addComponent(txtPhone)
                    .addGroup(userControlLayout.createSequentialGroup()
                        .addGroup(userControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(userControlLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(typeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58))
                    .addComponent(txtPassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(userControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(userControlLayout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nicSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addGap(43, 43, 43))
        );
        userControlLayout.setVerticalGroup(
            userControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userControlLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(userControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(nicSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGroup(userControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(userControlLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(txtUName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(8, 8, 8)
                        .addComponent(txtNic, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(typeComboBox, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                    .addGroup(userControlLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(userControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateButton)
                    .addComponent(deleteButton)
                    .addComponent(addButton))
                .addGap(28, 28, 28))
        );

        userPane.add(userControl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        showInventory.setVisible(false);

        usersText.setFont(new java.awt.Font("MS PGothic", 0, 36)); // NOI18N
        usersText.setText("Inventory");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pro_Code", "Name", "Quantity", "Unit Price", "Type"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout showInventoryLayout = new javax.swing.GroupLayout(showInventory);
        showInventory.setLayout(showInventoryLayout);
        showInventoryLayout.setHorizontalGroup(
            showInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showInventoryLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 759, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(showInventoryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(usersText, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        showInventoryLayout.setVerticalGroup(
            showInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showInventoryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(usersText, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                .addContainerGap())
        );

        userPane.add(showInventory, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 2, 790, 430));

        settingsPanel.setVisible(false);

        settingsText.setFont(new java.awt.Font("MS PGothic", 0, 36)); // NOI18N
        settingsText.setText("Settings");

        javax.swing.GroupLayout settingsPanelLayout = new javax.swing.GroupLayout(settingsPanel);
        settingsPanel.setLayout(settingsPanelLayout);
        settingsPanelLayout.setHorizontalGroup(
            settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsPanelLayout.createSequentialGroup()
                .addComponent(settingsText, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 616, Short.MAX_VALUE))
        );
        settingsPanelLayout.setVerticalGroup(
            settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsPanelLayout.createSequentialGroup()
                .addComponent(settingsText, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(366, Short.MAX_VALUE))
        );

        userPane.add(settingsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 2, 790, 430));

        geelsSuperLabel.setFont(new java.awt.Font("Leelawadee", 1, 36)); // NOI18N
        geelsSuperLabel.setForeground(new java.awt.Color(255, 255, 255));
        geelsSuperLabel.setText("Geels Super");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(geelsSuperLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(213, 213, 213)
                        .addComponent(unScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(power, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(userPane))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(geelsSuperLabel)
                            .addGap(24, 24, 24))
                        .addComponent(unScreen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(power))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(userPane, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void updateUserDetailsTable(){
        //add data to the userTable
        DefaultTableModel userTableModel1 =(DefaultTableModel)userDetailsTable.getModel();
        Connection con= dbConnect.getConnection();
        userTableModel1.setRowCount(0);
        try {
           Statement statement =con.createStatement();
           ResultSet rst= statement.executeQuery("SELECT * FROM user;");
           
           while(rst.next()){
               String data[]={rst.getString("name"),rst.getString("userName"),rst.getString("Usr_NIC"),rst.getString("phone_num"),rst.getString("Type")};
               userTableModel1.addRow(data);
           }
           
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void changecolor(JPanel panel, Color c ){
    
        panel.setBackground(c);
    } 
    private void switchPanels() {
        Home.setVisible(false);
        settingsPanel.setVisible(false);
        showInventory.setVisible(false);
        userControl.setVisible(false);
    }
    
    //added
   private void tableset(){
       DefaultTableModel userTable = (DefaultTableModel)jTable1.getModel();
       userTable.setRowCount(0);
   String query = "SELECT * FROM  product";
        String tbdata[] = new String[5];
         try {
            Connection con= dbConnect.getConnection();
            Statement st=con.createStatement();
            ResultSet rt = st.executeQuery(query);
            while (rt.next()){
                tbdata[0] = rt.getString("pro_code");
                tbdata[1] = rt.getString("name");
                tbdata[2] = rt.getString("quantity");
                tbdata[3] = rt.getString("unit_price");
                tbdata[4] = rt.getString("type");
                userTable.addRow(tbdata);
            
            }
         }
         catch (Exception e){
                new dbError().setVisible(true);
         
         }
   }
    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        x=evt.getX();
        y=evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        x=evt.getX();
        y=evt.getY();
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        this.setLocation(evt.getXOnScreen()-x, evt.getYOnScreen()-y);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void powerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_powerMouseExited
        // TODO add your handling code here:
        MouseEffect(power, -1);
        //power.setLocation((power.getLocation().x), (power.getLocation().y)-1);
    }//GEN-LAST:event_powerMouseExited

    private void powerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_powerMouseEntered
        // TODO add your handling code here:
        //power.setLocation((power.getLocation().x), (power.getLocation().y)+1);
        MouseEffect(power, 1);
    }//GEN-LAST:event_powerMouseEntered

    private void powerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_powerMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_powerMouseClicked

    private void usersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersMouseExited
        // TODO add your handling code here:
        MouseEffect(users, -1);
    }//GEN-LAST:event_usersMouseExited

    private void usersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersMouseEntered
        // TODO add your handling code here:
        MouseEffect(users, 1);
    }//GEN-LAST:event_usersMouseEntered

    private void usersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersMouseClicked
        switchPanels();
        userControl.setVisible(true);
        
        //add data to the userTable
        DefaultTableModel userTableModel1 =(DefaultTableModel)userDetailsTable.getModel();
        Connection con= dbConnect.getConnection();
        userTableModel1.setRowCount(0);
        try {
           Statement statement =con.createStatement();
           ResultSet rst= statement.executeQuery("SELECT * FROM user;");
           
           while(rst.next()){
               String data[]={rst.getString("name"),rst.getString("userName"),rst.getString("Usr_NIC"),rst.getString("phone_num"),rst.getString("Type")};
               userTableModel1.addRow(data);
           }
           
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
    }//GEN-LAST:event_usersMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        this.remove(jPanel1);
        new logoutAlert(this,jPanel1).setVisible(true);
    }//GEN-LAST:event_logoutMouseClicked

    private void logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseEntered
        MouseEffect(logout, 1);
    }//GEN-LAST:event_logoutMouseEntered

    private void logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseExited
         MouseEffect(logout, -1);
    }//GEN-LAST:event_logoutMouseExited

    private void unScreenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unScreenMouseEntered
        
    }//GEN-LAST:event_unScreenMouseEntered

    private void unScreenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unScreenMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_unScreenMouseExited

    private void settingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseClicked
        switchPanels();
        settingsPanel.setVisible(true);
        //userPanel.setVisible(false);
    }//GEN-LAST:event_settingsMouseClicked

    private void settingsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseEntered
        // TODO add your handling code here:
        MouseEffect(settings, 1);
    }//GEN-LAST:event_settingsMouseEntered

    private void settingsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseExited
        // TODO add your handling code here:
        MouseEffect(settings, -1);
    }//GEN-LAST:event_settingsMouseExited

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        switchPanels();
        Home.setVisible(true);
        
    }//GEN-LAST:event_jLabel1MouseClicked

    private void InventoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InventoryMouseClicked
        // TODO add your handling code here:
        //proceeed to inventory
        switchPanels();
        tableset();
        showInventory.setVisible(true);
        
    }//GEN-LAST:event_InventoryMouseClicked

    private void InventoryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InventoryMouseEntered
        // TODO add your handling code here:
        changecolor(inventoryPanel,Color.darkGray);
    }//GEN-LAST:event_InventoryMouseEntered

    private void InventoryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InventoryMouseExited
        // TODO add your handling code here:
        changecolor(inventoryPanel,Color.lightGray);
        
    }//GEN-LAST:event_InventoryMouseExited

    private void FinanceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FinanceMouseEntered
        // TODO add your handling code here:
        changecolor(supplierPanel,Color.DARK_GRAY);
    }//GEN-LAST:event_FinanceMouseEntered

    private void FinanceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FinanceMouseExited
        // TODO add your handling code here:
        changecolor(supplierPanel,Color.lightGray);
    }//GEN-LAST:event_FinanceMouseExited

    private void StaticsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StaticsMouseEntered
        // TODO add your handling code here:
        changecolor(statPanel,Color.DARK_GRAY);
    }//GEN-LAST:event_StaticsMouseEntered

    private void StaticsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StaticsMouseExited
        // TODO add your handling code here:
        changecolor(statPanel,Color.lightGray);
    }//GEN-LAST:event_StaticsMouseExited

    private void PromotionsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PromotionsMouseEntered
        // TODO add your handling code here:
        changecolor(promotionPanle,Color.DARK_GRAY);
    }//GEN-LAST:event_PromotionsMouseEntered

    private void PromotionsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PromotionsMouseExited
        // TODO add your handling code here:
        changecolor(promotionPanle,Color.lightGray);
    }//GEN-LAST:event_PromotionsMouseExited

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        String enteredName= txtName.getText();
        String enteredUserName=txtUName.getText();
        String enteredNic= txtNic.getText();
        String enteredPhone=txtPhone.getText();
        String enterdPassword=txtPassword.getText();
        String enteredType= typeComboBox.getSelectedItem().toString();
        
        Connection con=dbConnect.getConnection();
        try {
            Statement st=con.createStatement();
            st.execute("INSERT INTO user (Password,name,phone_num,Usr_NIC,userName,Type) VALUES ('"+enterdPassword+"', '"+enteredName+"', '"+enteredPhone+"', '"+enteredNic+"', '"+enteredUserName+"', '"+enteredType+"');");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        updateUserDetailsTable();
        
    }//GEN-LAST:event_addButtonActionPerformed

    private void userDetailsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userDetailsTableMouseClicked
       DefaultTableModel myTable= (DefaultTableModel)userDetailsTable.getModel();
       int rawIndex=userDetailsTable.getSelectedRow();
       
       txtName.setText(myTable.getValueAt(rawIndex, 0).toString());
       txtUName.setText(myTable.getValueAt(rawIndex, 1).toString());
       txtNic.setText(myTable.getValueAt(rawIndex, 2).toString());
       txtPhone.setText(myTable.getValueAt(rawIndex, 3).toString());
       
       
       String typeOfTheUser=myTable.getValueAt(rawIndex, 4).toString();

       
       if(typeOfTheUser.equals("Admin")){
           typeComboBox.setSelectedIndex(1);
       }
       if(typeOfTheUser.equals("User")){
           typeComboBox.setSelectedIndex(0);
       }
   
       
    }//GEN-LAST:event_userDetailsTableMouseClicked

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        String enteredName= txtName.getText();
        String enteredUserName=txtUName.getText();
        String enteredNic= txtNic.getText();
        String enteredPhone=txtPhone.getText();
        String enterdPassword=txtPassword.getText();
        String enteredType= typeComboBox.getSelectedItem().toString();
        
        DefaultTableModel model= (DefaultTableModel)userDetailsTable.getModel();
        int selectedRow= userDetailsTable.getSelectedRow();
        Connection con=dbConnect.getConnection();
        try {
            Statement st=con.createStatement();
            st.execute("UPDATE user SET name='"+enteredName+"',userName='"+enteredUserName+"',Usr_NIC='"+enteredNic+"',phone_num='"+enteredPhone+"',Password='"+enterdPassword+"',Type='"+enteredType+"' WHERE Usr_NIC='"+model.getValueAt(selectedRow, 2)+"'");
        } catch (SQLException e) {
        }
        
        updateUserDetailsTable();
        
        
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        
        String enteredNic= txtNic.getText();
        
        DefaultTableModel model= (DefaultTableModel)userDetailsTable.getModel();
        int selectedRow= userDetailsTable.getSelectedRow();
        Connection con=dbConnect.getConnection();
        try {
            Statement st=con.createStatement();
            st.execute("DELETE FROM user WHERE Usr_NIC='"+enteredNic +"'");
        } catch (SQLException e) {
        }
        
        txtName.setText("");
        txtUName.setText("");
        txtNic.setText("");
        txtPhone.setText("");
        txtPassword.setText("");
        updateUserDetailsTable();
        
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void nicSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nicSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nicSearchActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        String nameSearch=nicSearch.getText();
        nameSearch="%"+nameSearch+"%";
        Connection con= dbConnect.getConnection();
        DefaultTableModel myTable= (DefaultTableModel)userDetailsTable.getModel();
        myTable.setRowCount(0);
        int rawIndex=userDetailsTable.getSelectedRow();
        try {
            Statement st= con.createStatement();
            ResultSet rst= st.executeQuery("SELECT * FROM user WHERE name LIKE'"+nameSearch+"'");
            while(rst.next()){
               String data[]={rst.getString("name"),rst.getString("userName"),rst.getString("Usr_NIC"),rst.getString("phone_num"),rst.getString("Type")};
               myTable.addRow(data);
           }
            
        } catch (Exception e) {
        }
       
       
  
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void nicSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nicSearchKeyTyped
         String nameSearch=nicSearch.getText();
         nameSearch="%"+nameSearch+"%";
        Connection con= dbConnect.getConnection();
        DefaultTableModel myTable= (DefaultTableModel)userDetailsTable.getModel();
        myTable.setRowCount(0);
        int rawIndex=userDetailsTable.getSelectedRow();
        try {
            Statement st= con.createStatement();
            ResultSet rst= st.executeQuery("SELECT * FROM user WHERE name LIKE'"+nameSearch+"'");
            while(rst.next()){
               String data[]={rst.getString("name"),rst.getString("userName"),rst.getString("Usr_NIC"),rst.getString("phone_num"),rst.getString("Type")};
               myTable.addRow(data);
           }
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_nicSearchKeyTyped

    private void nicSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nicSearchKeyPressed
         
        String nameSearch=nicSearch.getText();
        nameSearch="%"+nameSearch+"%";
        Connection con= dbConnect.getConnection();
        DefaultTableModel myTable= (DefaultTableModel)userDetailsTable.getModel();
        myTable.setRowCount(0);
        int rawIndex=userDetailsTable.getSelectedRow();
        try {
            Statement st= con.createStatement();
            ResultSet rst= st.executeQuery("SELECT * FROM user WHERE name LIKE'"+nameSearch+"'");
            while(rst.next()){
               String data[]={rst.getString("name"),rst.getString("userName"),rst.getString("Usr_NIC"),rst.getString("phone_num"),rst.getString("Type")};
               myTable.addRow(data);
           }
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_nicSearchKeyPressed

    private void txtNicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNicActionPerformed

    private void txtPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    

    
    
    
    private void visibility(JPanel panel){
        
        panel.getName();
        //userWindow.setVisible(false);
    
    
    }

    
    private void MouseEffect(JLabel object, int i){
        object.setLocation((object.getLocation().x), (object.getLocation().y)+i);
        object.setSize(object.getWidth()+(i*5), object.getHeight()+(i*5));
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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Finance;
    private javax.swing.JPanel Home;
    private javax.swing.JLabel Inventory;
    private javax.swing.JLabel Promotions;
    private javax.swing.JLabel Statics;
    private javax.swing.JButton addButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel geelsSuperLabel;
    private javax.swing.JPanel inventoryPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel logout;
    private javax.swing.JTextField nicSearch;
    private javax.swing.JLabel power;
    private javax.swing.JPanel promotionPanle;
    private javax.swing.JLabel settings;
    private javax.swing.JPanel settingsPanel;
    private javax.swing.JLabel settingsText;
    private javax.swing.JPanel showInventory;
    private javax.swing.JPanel statPanel;
    private javax.swing.JPanel supplierPanel;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNic;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtUName;
    private javax.swing.JComboBox<String> typeComboBox;
    private javax.swing.JLabel unScreen;
    private javax.swing.JButton updateButton;
    private javax.swing.JPanel userControl;
    private javax.swing.JTable userDetailsTable;
    private javax.swing.JLayeredPane userPane;
    private javax.swing.JLabel users;
    private javax.swing.JLabel usersText;
    // End of variables declaration//GEN-END:variables
}

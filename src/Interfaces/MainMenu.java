
package Interfaces;

import Alerts.Done;
import Alerts.InputError;
import Alerts.logoutAlert;
import DB.dbConnect;
import Errors.dbError;
import Errors.dbErrorNonExitOnClose;
import classes.Product;
import classes.Suppliers;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Graphics.jPanelGradient;
import PopUps.AddProductPopUp;
import PopUps.AddSupplier;
import PopUps.AddSupply;
import PopUps.AddUserPopup;
import PopUps.UpdateProduct;
import PopUps.UpdateSupplier;
import PopUps.UpdateSupply;
import PopUps.UpdateUserPopup;
import classes.Supply;
import classes.User;
import java.awt.Toolkit;
import javax.swing.JTable;

public class MainMenu extends javax.swing.JFrame {

    int x,y;
    
    //comment
   
    
    public MainMenu() {
        initComponents();
    }
    
    public MainMenu(String user, String type) {
        initComponents();
        unScreen.setText("User - "+user);
        
        if(type.equalsIgnoreCase("Admin")){
           users.setVisible(true); 
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new jPanelGradient(41,50,60,72,85,99);
        jPanel2 = new jPanelGradient(134,143,150,89,97,100);
        users = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        homeLabelButton = new javax.swing.JLabel();
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
        SuppliersButton = new javax.swing.JLabel();
        userControl = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        userDetailsTable = new javax.swing.JTable();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        nicSearch = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        showInventory = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        InventoryDetailsTable = new javax.swing.JTable();
        ProductSearchField = new javax.swing.JTextField();
        UpdatePopUpCaller = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        addPopUpCallButton = new javax.swing.JButton();
        UpdatePopUpCaller1 = new javax.swing.JButton();
        settingsPanel = new javax.swing.JPanel();
        settingsText = new javax.swing.JLabel();
        SuppliersPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        supplierTable = new javax.swing.JTable();
        addSupplierButton = new javax.swing.JButton();
        suppliersUpdateButton = new javax.swing.JButton();
        supplierSearchTxtField = new javax.swing.JTextField();
        supplierSearchButton = new javax.swing.JButton();
        NewSupply = new javax.swing.JPanel();
        addButton1 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        SupplyDetailsTable = new javax.swing.JTable();
        SupplySearch = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        addButton2 = new javax.swing.JButton();
        addButton3 = new javax.swing.JButton();
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
        users.setVisible(false);

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

        homeLabelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/img/icons8_home_30px.png"))); // NOI18N
        homeLabelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeLabelButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeLabelButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeLabelButtonMouseExited(evt);
            }
        });
        jPanel2.add(homeLabelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 40, 60));

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
        Home.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        statPanel.setBackground(new java.awt.Color(204, 204, 204));
        statPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Statics.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        Statics.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/img/Finance.png"))); // NOI18N
        Statics.setText("         Statistics");
        Statics.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StaticsMouseClicked(evt);
            }
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

        Home.add(statPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 136, 350, -1));

        inventoryPanel.setBackground(new java.awt.Color(204, 204, 204));

        Inventory.setBackground(new java.awt.Color(255, 51, 204));
        Inventory.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        Inventory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/img/Intentory.png"))); // NOI18N
        Inventory.setText("         Inventory");
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

        Home.add(inventoryPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 246, -1, -1));

        promotionPanle.setBackground(new java.awt.Color(204, 204, 204));

        Promotions.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        Promotions.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/img/Promotion.png"))); // NOI18N
        Promotions.setText("       Promotions");
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
            .addComponent(Promotions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        promotionPanleLayout.setVerticalGroup(
            promotionPanleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, promotionPanleLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Promotions, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        Home.add(promotionPanle, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 246, 342, -1));

        supplierPanel.setBackground(new java.awt.Color(204, 204, 204));
        supplierPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        SuppliersButton.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        SuppliersButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/img/Supplies.png"))); // NOI18N
        SuppliersButton.setText("       Suppliers");
        SuppliersButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SuppliersButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SuppliersButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SuppliersButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout supplierPanelLayout = new javax.swing.GroupLayout(supplierPanel);
        supplierPanel.setLayout(supplierPanelLayout);
        supplierPanelLayout.setHorizontalGroup(
            supplierPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SuppliersButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
        );
        supplierPanelLayout.setVerticalGroup(
            supplierPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, supplierPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(SuppliersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Home.add(supplierPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 136, -1, -1));

        userPane.add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 450));

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

        updateButton.setBackground(new java.awt.Color(102, 102, 102));
        updateButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        updateButton.setText("Update Exixting User");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(102, 102, 102));
        deleteButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        deleteButton.setText("Delete Exsisting User");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        addButton.setBackground(new java.awt.Color(102, 102, 102));
        addButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        addButton.setText("Add New User");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

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

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout userControlLayout = new javax.swing.GroupLayout(userControl);
        userControl.setLayout(userControlLayout);
        userControlLayout.setHorizontalGroup(
            userControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userControlLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(updateButton)
                .addGap(70, 70, 70)
                .addComponent(deleteButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(userControlLayout.createSequentialGroup()
                .addGap(232, 454, Short.MAX_VALUE)
                .addComponent(nicSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(85, 85, 85))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userControlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        userControlLayout.setVerticalGroup(
            userControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userControlLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(userControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nicSearch)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(userControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateButton)
                    .addComponent(deleteButton)
                    .addComponent(addButton))
                .addGap(28, 28, 28))
        );

        userPane.add(userControl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        showInventory.setVisible(false);
        showInventory.setBackground(new java.awt.Color(62, 74, 87));

        InventoryDetailsTable.setModel(new javax.swing.table.DefaultTableModel(
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
                "Product Code", "Name", "Quantity", "Unit Price", "Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        InventoryDetailsTable.setRowSelectionAllowed(true);
        InventoryDetailsTable.setShowHorizontalLines(false);
        InventoryDetailsTable.getTableHeader().setReorderingAllowed(false);
        InventoryDetailsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InventoryDetailsTableMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                InventoryDetailsTableMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(InventoryDetailsTable);
        if (InventoryDetailsTable.getColumnModel().getColumnCount() > 0) {
            InventoryDetailsTable.getColumnModel().getColumn(0).setResizable(false);
            InventoryDetailsTable.getColumnModel().getColumn(1).setResizable(false);
            InventoryDetailsTable.getColumnModel().getColumn(2).setResizable(false);
            InventoryDetailsTable.getColumnModel().getColumn(3).setResizable(false);
            InventoryDetailsTable.getColumnModel().getColumn(4).setResizable(false);
        }

        ProductSearchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductSearchFieldActionPerformed(evt);
            }
        });
        ProductSearchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ProductSearchFieldKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ProductSearchFieldKeyTyped(evt);
            }
        });

        UpdatePopUpCaller.setBackground(new java.awt.Color(51, 51, 51));
        UpdatePopUpCaller.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        UpdatePopUpCaller.setForeground(new java.awt.Color(204, 204, 204));
        UpdatePopUpCaller.setText("Update Product details");
        UpdatePopUpCaller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdatePopUpCallerActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(51, 51, 51));
        jButton6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(204, 204, 204));
        jButton6.setText("Search");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        addPopUpCallButton.setBackground(new java.awt.Color(51, 51, 51));
        addPopUpCallButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        addPopUpCallButton.setForeground(new java.awt.Color(204, 204, 204));
        addPopUpCallButton.setText("Add New Products");
        addPopUpCallButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPopUpCallButtonActionPerformed(evt);
            }
        });

        UpdatePopUpCaller1.setBackground(new java.awt.Color(51, 51, 51));
        UpdatePopUpCaller1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        UpdatePopUpCaller1.setForeground(new java.awt.Color(204, 204, 204));
        UpdatePopUpCaller1.setText("Add New Stock");
        UpdatePopUpCaller1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdatePopUpCaller1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout showInventoryLayout = new javax.swing.GroupLayout(showInventory);
        showInventory.setLayout(showInventoryLayout);
        showInventoryLayout.setHorizontalGroup(
            showInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showInventoryLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(showInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, showInventoryLayout.createSequentialGroup()
                        .addComponent(ProductSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, showInventoryLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, showInventoryLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(addPopUpCallButton, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(UpdatePopUpCaller)
                .addGap(83, 83, 83)
                .addComponent(UpdatePopUpCaller1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        showInventoryLayout.setVerticalGroup(
            showInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, showInventoryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(showInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(ProductSearchField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(showInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(showInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addPopUpCallButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(UpdatePopUpCaller, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(UpdatePopUpCaller1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        userPane.add(showInventory, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 2, 820, 460));

        settingsPanel.setVisible(false);

        settingsText.setFont(new java.awt.Font("MS PGothic", 0, 36)); // NOI18N
        settingsText.setText("Settings");

        javax.swing.GroupLayout settingsPanelLayout = new javax.swing.GroupLayout(settingsPanel);
        settingsPanel.setLayout(settingsPanelLayout);
        settingsPanelLayout.setHorizontalGroup(
            settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsPanelLayout.createSequentialGroup()
                .addComponent(settingsText, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 646, Short.MAX_VALUE))
        );
        settingsPanelLayout.setVerticalGroup(
            settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsPanelLayout.createSequentialGroup()
                .addComponent(settingsText, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(396, Short.MAX_VALUE))
        );

        userPane.add(settingsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 2, 820, 460));

        SuppliersPanel.setBackground(new java.awt.Color(62, 74, 87));

        supplierTable.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        supplierTable.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        supplierTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Supplier ID", "Name", "Phone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        supplierTable.setShowHorizontalLines(false);
        supplierTable.getTableHeader().setReorderingAllowed(false);
        supplierTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                supplierTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(supplierTable);

        addSupplierButton.setBackground(new java.awt.Color(102, 102, 102));
        addSupplierButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        addSupplierButton.setForeground(new java.awt.Color(204, 204, 204));
        addSupplierButton.setText("Add new suppliers");
        addSupplierButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSupplierButtonActionPerformed(evt);
            }
        });

        suppliersUpdateButton.setBackground(new java.awt.Color(102, 102, 102));
        suppliersUpdateButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        suppliersUpdateButton.setForeground(new java.awt.Color(204, 204, 204));
        suppliersUpdateButton.setText("Update A Supplier");
        suppliersUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suppliersUpdateButtonActionPerformed(evt);
            }
        });

        supplierSearchTxtField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        supplierSearchTxtField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                supplierSearchTxtFieldKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                supplierSearchTxtFieldKeyTyped(evt);
            }
        });

        supplierSearchButton.setBackground(new java.awt.Color(102, 102, 102));
        supplierSearchButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        supplierSearchButton.setForeground(new java.awt.Color(204, 204, 204));
        supplierSearchButton.setText("Search");
        supplierSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierSearchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SuppliersPanelLayout = new javax.swing.GroupLayout(SuppliersPanel);
        SuppliersPanel.setLayout(SuppliersPanelLayout);
        SuppliersPanelLayout.setHorizontalGroup(
            SuppliersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SuppliersPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(supplierSearchTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(supplierSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
            .addGroup(SuppliersPanelLayout.createSequentialGroup()
                .addGroup(SuppliersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SuppliersPanelLayout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(addSupplierButton)
                        .addGap(156, 156, 156)
                        .addComponent(suppliersUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SuppliersPanelLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 757, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        SuppliersPanelLayout.setVerticalGroup(
            SuppliersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SuppliersPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SuppliersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(supplierSearchTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(supplierSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(SuppliersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addSupplierButton, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(suppliersUpdateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );

        userPane.add(SuppliersPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 450));
        SuppliersPanel.setVisible(false);

        NewSupply.setVisible(false);
        NewSupply.setBackground(new java.awt.Color(62, 74, 87));

        addButton1.setBackground(new java.awt.Color(102, 102, 102));
        addButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        addButton1.setText("Add New Supply");
        addButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButton1ActionPerformed(evt);
            }
        });

        SupplyDetailsTable.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        SupplyDetailsTable.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null}
            },
            new String [] {
                "Supply ID", "Date", "Quantity", "Supplier ID", "Product Code"
            }
        ));
        SupplyDetailsTable.setShowHorizontalLines(false);
        jScrollPane4.setViewportView(SupplyDetailsTable);

        SupplySearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupplySearchActionPerformed(evt);
            }
        });
        SupplySearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SupplySearchKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SupplySearchKeyTyped(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        addButton2.setBackground(new java.awt.Color(102, 102, 102));
        addButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        addButton2.setText("Update Existing Supply");
        addButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButton2ActionPerformed(evt);
            }
        });

        addButton3.setBackground(new java.awt.Color(102, 102, 102));
        addButton3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        addButton3.setText("Back To Inventory");
        addButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout NewSupplyLayout = new javax.swing.GroupLayout(NewSupply);
        NewSupply.setLayout(NewSupplyLayout);
        NewSupplyLayout.setHorizontalGroup(
            NewSupplyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NewSupplyLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SupplySearch, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(66, 66, 66))
            .addGroup(NewSupplyLayout.createSequentialGroup()
                .addGroup(NewSupplyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NewSupplyLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(addButton1)
                        .addGap(53, 53, 53)
                        .addComponent(addButton2)
                        .addGap(42, 42, 42)
                        .addComponent(addButton3))
                    .addGroup(NewSupplyLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 756, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        NewSupplyLayout.setVerticalGroup(
            NewSupplyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NewSupplyLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(NewSupplyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SupplySearch)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(NewSupplyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        userPane.add(NewSupply, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 460));

        geelsSuperLabel.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        geelsSuperLabel.setForeground(new java.awt.Color(204, 204, 204));
        geelsSuperLabel.setText("Geels Super - Home");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(geelsSuperLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(unScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(power, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(userPane))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(unScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(power))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(geelsSuperLabel)
                        .addGap(17, 17, 17)))
                .addComponent(userPane, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        
        userTableModel1.setRowCount(0);
        try {
           Connection con= dbConnect.getConnection();
           Statement statement =con.createStatement();
           ResultSet rst= statement.executeQuery("SELECT * FROM user;");
           
           while(rst.next()){
               String data[]={rst.getString("name"),rst.getString("userName"),rst.getString("Usr_NIC"),rst.getString("phone_num"),rst.getString("Type")};
               userTableModel1.addRow(data);
           }
           
        } catch (Exception e) {
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
        SuppliersPanel.setVisible(false);
        NewSupply.setVisible(false);
    }
    
    //added
   private void tableset(){
       DefaultTableModel userTable = (DefaultTableModel)InventoryDetailsTable.getModel();
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
                new dbErrorNonExitOnClose().setVisible(true);
         
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
        geelsSuperLabel.setText("Geels Super - User Control");
        
        //add data to the userTable
        DefaultTableModel userTableModel1 =(DefaultTableModel)userDetailsTable.getModel();
        
        userTableModel1.setRowCount(0);
        try {
           Connection con= dbConnect.getConnection();
           Statement statement =con.createStatement();
           ResultSet rst= statement.executeQuery("SELECT * FROM user;");
           
           while(rst.next()){
               String data[]={rst.getString("name"),rst.getString("userName"),rst.getString("Usr_NIC"),rst.getString("phone_num"),rst.getString("Type")};
               userTableModel1.addRow(data);
           }
           
        } catch (Exception e) {
        }
        
        //heyyyy
        
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

    private void homeLabelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeLabelButtonMouseClicked
        // TODO add your handling code here:
        switchPanels();
        Home.setVisible(true);
        geelsSuperLabel.setText("Geels Super - Home");
        
    }//GEN-LAST:event_homeLabelButtonMouseClicked

    private void InventoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InventoryMouseClicked
        // TODO add your handling code here:
        //proceeed to inventory
        geelsSuperLabel.setText("Geels Super - Inventory");
        switchPanels();
        tableset();
        showInventory.setVisible(true);
        
    }//GEN-LAST:event_InventoryMouseClicked

    private void InventoryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InventoryMouseEntered
        // TODO add your handling code here:
        changecolor(inventoryPanel,Color.darkGray);
        Inventory.setForeground(Color.WHITE);
    }//GEN-LAST:event_InventoryMouseEntered

    private void InventoryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InventoryMouseExited
        // TODO add your handling code here:
        changecolor(inventoryPanel,Color.lightGray);
        Inventory.setForeground(Color.BLACK);
        
    }//GEN-LAST:event_InventoryMouseExited

    private void SuppliersButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SuppliersButtonMouseEntered
        // TODO add your handling code here:
        changecolor(supplierPanel,Color.DARK_GRAY);
        SuppliersButton.setForeground(Color.WHITE);
    }//GEN-LAST:event_SuppliersButtonMouseEntered

    private void SuppliersButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SuppliersButtonMouseExited
        // TODO add your handling code here:
        changecolor(supplierPanel,Color.lightGray);
        SuppliersButton.setForeground(Color.BLACK);
    }//GEN-LAST:event_SuppliersButtonMouseExited

    private void StaticsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StaticsMouseEntered
        // TODO add your handling code here:
        changecolor(statPanel,Color.DARK_GRAY);
        Statics.setForeground(Color.WHITE);
        
    }//GEN-LAST:event_StaticsMouseEntered

    private void StaticsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StaticsMouseExited
        // TODO add your handling code here:
        changecolor(statPanel,Color.lightGray);
        Statics.setForeground(Color.BLACK);
    }//GEN-LAST:event_StaticsMouseExited

    private void PromotionsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PromotionsMouseEntered
        // TODO add your handling code here:
        changecolor(promotionPanle,Color.DARK_GRAY);
        Promotions.setForeground(Color.WHITE);
    }//GEN-LAST:event_PromotionsMouseEntered

    private void PromotionsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PromotionsMouseExited
        // TODO add your handling code here:
        changecolor(promotionPanle,Color.lightGray);
        Promotions.setForeground(Color.BLACK);
    }//GEN-LAST:event_PromotionsMouseExited

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        new AddUserPopup(userDetailsTable).setVisible(true);
        
    }//GEN-LAST:event_addButtonActionPerformed

    private void userDetailsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userDetailsTableMouseClicked
       
       
    }//GEN-LAST:event_userDetailsTableMouseClicked

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
       
        int selectedRaw= userDetailsTable.getSelectedRow();
        if(selectedRaw!=-1){
           new UpdateUserPopup(userDetailsTable).setVisible(true);
        }else{
            new InputError("Oops..!", "Please select a Raw").setVisible(true);
        }
        User.insertDataToTable(userDetailsTable, User.getUserDetails());
        
        
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        
        int selectedRaw= userDetailsTable.getSelectedRow();
        boolean isDone=false;
        if(selectedRaw!=-1){
            
           isDone=User.deleteUser(User.getClickedTableContents(userDetailsTable)[2]);
           
           if(isDone){
               new Done().setVisible(true);
           }else{
               new InputError("Oops..!", "Please try again..!");
           }
        }else{
            new InputError("Oops..!", "Please select a User").setVisible(true);
        }
        User.insertDataToTable(userDetailsTable, User.getUserDetails());
        
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void nicSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nicSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nicSearchActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        String nameSearch=nicSearch.getText();
        nameSearch="%"+nameSearch+"%";
        
        DefaultTableModel myTable= (DefaultTableModel)userDetailsTable.getModel();
        myTable.setRowCount(0);
        int rawIndex=userDetailsTable.getSelectedRow();
        try {
            Connection con= dbConnect.getConnection();
            Statement st= con.createStatement();
            ResultSet rst= st.executeQuery("SELECT * FROM user WHERE name LIKE'"+nameSearch+"' OR userName LIKE'"+nameSearch+"' OR Usr_NIC LIKE'"+nameSearch+"' OR phone_num LIKE'"+nameSearch+"' OR Type LIKE'"+nameSearch+"'");
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
        
        DefaultTableModel myTable= (DefaultTableModel)userDetailsTable.getModel();
        myTable.setRowCount(0);
        int rawIndex=userDetailsTable.getSelectedRow();
        try {
            Connection con= dbConnect.getConnection();
            Statement st= con.createStatement();
            ResultSet rst= st.executeQuery("SELECT * FROM user WHERE name LIKE'"+nameSearch+"' OR userName LIKE'"+nameSearch+"' OR Usr_NIC LIKE'"+nameSearch+"' OR phone_num LIKE'"+nameSearch+"' OR Type LIKE'"+nameSearch+"'");
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
        
        DefaultTableModel myTable= (DefaultTableModel)userDetailsTable.getModel();
        myTable.setRowCount(0);
        int rawIndex=userDetailsTable.getSelectedRow();
        try {
            Connection con= dbConnect.getConnection();
            Statement st= con.createStatement();
            ResultSet rst= st.executeQuery("SELECT * FROM user WHERE name LIKE'"+nameSearch+"' OR userName LIKE'"+nameSearch+"' OR Usr_NIC LIKE'"+nameSearch+"' OR phone_num LIKE'"+nameSearch+"' OR Type LIKE'"+nameSearch+"'");
            while(rst.next()){
               String data[]={rst.getString("name"),rst.getString("userName"),rst.getString("Usr_NIC"),rst.getString("phone_num"),rst.getString("Type")};
               myTable.addRow(data);
           }
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_nicSearchKeyPressed

    private void SuppliersButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SuppliersButtonMouseClicked
        switchPanels();
        geelsSuperLabel.setText("Geels Super - Suppliers");
        ResultSet rst= Suppliers.getSupplierDetails();
        Suppliers.insertDataToTable(supplierTable, rst);
        SuppliersPanel.setVisible(true);
    }//GEN-LAST:event_SuppliersButtonMouseClicked

    private void addSupplierButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSupplierButtonActionPerformed
        new AddSupplier(supplierTable).setVisible(true);
    }//GEN-LAST:event_addSupplierButtonActionPerformed

    private void supplierTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supplierTableMouseClicked
      /*  String data[]=Suppliers.getClickedTableContents(supplierTable);
        txtSupplierId.setText(data[0]);
        txtSupplierName.setText(data[1]);
        txtSupplierPhone.setText(data[2]);*/
    }//GEN-LAST:event_supplierTableMouseClicked

    private void suppliersUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suppliersUpdateButtonActionPerformed
       /* Suppliers.updateSupplier(txtSupplierId.getText(), txtSupplierName.getText(), txtSupplierPhone.getText(), supplierTable);
        Suppliers.insertDataToTable(supplierTable, Suppliers.getSupplierDetails());
        txtSupplierId.setText("");
        txtSupplierName.setText("");
        txtSupplierPhone.setText("");*/
       
       int selectedRaw=supplierTable.getSelectedRow();
        if(selectedRaw!=-1){
            new UpdateSupplier(supplierTable).setVisible(true);
        }else{
            Toolkit.getDefaultToolkit().beep();
            new InputError("Oops..!","Please select a Supplier..!").setVisible(true);
        }
    }//GEN-LAST:event_suppliersUpdateButtonActionPerformed

    private void supplierSearchTxtFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_supplierSearchTxtFieldKeyTyped
       Suppliers.insertDataToTable(supplierTable, Suppliers.searchSupplier(supplierSearchTxtField.getText()));
    }//GEN-LAST:event_supplierSearchTxtFieldKeyTyped

    private void supplierSearchTxtFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_supplierSearchTxtFieldKeyPressed
        Suppliers.insertDataToTable(supplierTable, Suppliers.searchSupplier(supplierSearchTxtField.getText()));
    }//GEN-LAST:event_supplierSearchTxtFieldKeyPressed

    private void supplierSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierSearchButtonActionPerformed
       Suppliers.insertDataToTable(supplierTable, Suppliers.searchSupplier(supplierSearchTxtField.getText()));
    }//GEN-LAST:event_supplierSearchButtonActionPerformed

    private void InventoryDetailsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InventoryDetailsTableMouseClicked
     
    }//GEN-LAST:event_InventoryDetailsTableMouseClicked

    private void UpdatePopUpCallerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdatePopUpCallerActionPerformed
        int selectedRaw=InventoryDetailsTable.getSelectedRow();
        
          if(selectedRaw==-1){
            Toolkit.getDefaultToolkit().beep();
            new InputError("Oops..!","Please select a product").setVisible(true);
            
        }else{
            DefaultTableModel model= (DefaultTableModel)InventoryDetailsTable.getModel();
            String Data[]={model.getValueAt(selectedRaw, 0).toString()};
            new UpdateProduct(Data,InventoryDetailsTable).setVisible(true);
        }
        
        Product.insertDataToTable(InventoryDetailsTable, Product.getProductDetails());
    }//GEN-LAST:event_UpdatePopUpCallerActionPerformed

    private void ProductSearchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductSearchFieldActionPerformed
        
    }//GEN-LAST:event_ProductSearchFieldActionPerformed

    private void ProductSearchFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ProductSearchFieldKeyTyped
       Product.insertDataToTable(InventoryDetailsTable, Product.searchProduct(ProductSearchField.getText()));
    }//GEN-LAST:event_ProductSearchFieldKeyTyped

    private void ProductSearchFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ProductSearchFieldKeyPressed
        Product.insertDataToTable(InventoryDetailsTable, Product.searchProduct(ProductSearchField.getText()));
    }//GEN-LAST:event_ProductSearchFieldKeyPressed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Product.insertDataToTable(InventoryDetailsTable, Product.searchProduct(ProductSearchField.getText()));
    }//GEN-LAST:event_jButton6ActionPerformed

    private void homeLabelButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeLabelButtonMouseEntered
        MouseEffect(homeLabelButton, 1);
    }//GEN-LAST:event_homeLabelButtonMouseEntered

    private void homeLabelButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeLabelButtonMouseExited
        MouseEffect(homeLabelButton, -1);
    }//GEN-LAST:event_homeLabelButtonMouseExited

    private void StaticsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StaticsMouseClicked
        // TODO add your handling code here:
       // new Graph.MyFrame();
       this.dispose();
       new Statistics().setVisible(true);
    }//GEN-LAST:event_StaticsMouseClicked

    private void addPopUpCallButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPopUpCallButtonActionPerformed
        new AddProductPopUp(InventoryDetailsTable).setVisible(true);
    }//GEN-LAST:event_addPopUpCallButtonActionPerformed

    private void SupplySearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupplySearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SupplySearchActionPerformed

    private void SupplySearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SupplySearchKeyPressed
       Supply.insertDataToTable(SupplyDetailsTable, Supply.searchSupply(SupplySearch.getText()));
    }//GEN-LAST:event_SupplySearchKeyPressed

    private void SupplySearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SupplySearchKeyTyped
        Supply.insertDataToTable(SupplyDetailsTable, Supply.searchSupply(SupplySearch.getText()));
    }//GEN-LAST:event_SupplySearchKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Supply.insertDataToTable(SupplyDetailsTable, Supply.searchSupply(SupplySearch.getText()));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void addButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButton1ActionPerformed
        new AddSupply(SupplyDetailsTable).setVisible(true);
    }//GEN-LAST:event_addButton1ActionPerformed

    private void UpdatePopUpCaller1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdatePopUpCaller1ActionPerformed
        switchPanels();
        geelsSuperLabel.setText("Geels Super - Add Stock");
        NewSupply.setVisible(true);
        Supply.insertDataToTable(SupplyDetailsTable, Supply.getSupplyDetails());
    }//GEN-LAST:event_UpdatePopUpCaller1ActionPerformed

    private void addButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButton2ActionPerformed
        int selectedRaw=SupplyDetailsTable.getSelectedRow();
        if(selectedRaw!=-1){
            new UpdateSupply(SupplyDetailsTable).setVisible(true);
        }else{
            Toolkit.getDefaultToolkit().beep();
            new InputError("Oops..!", "Please select a supply..!").setVisible(true);
        }
    }//GEN-LAST:event_addButton2ActionPerformed

    private void addButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButton3ActionPerformed
        switchPanels();
        geelsSuperLabel.setText("Geels Super - Inventory");
        showInventory.setVisible(true);
        
    }//GEN-LAST:event_addButton3ActionPerformed

    private void InventoryDetailsTableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InventoryDetailsTableMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_InventoryDetailsTableMouseReleased

    
    
    
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
    private javax.swing.JPanel Home;
    private javax.swing.JLabel Inventory;
    private javax.swing.JTable InventoryDetailsTable;
    private javax.swing.JPanel NewSupply;
    private javax.swing.JTextField ProductSearchField;
    private javax.swing.JLabel Promotions;
    private javax.swing.JLabel Statics;
    private javax.swing.JLabel SuppliersButton;
    private javax.swing.JPanel SuppliersPanel;
    private javax.swing.JTable SupplyDetailsTable;
    private javax.swing.JTextField SupplySearch;
    private javax.swing.JButton UpdatePopUpCaller;
    private javax.swing.JButton UpdatePopUpCaller1;
    private javax.swing.JButton addButton;
    private javax.swing.JButton addButton1;
    private javax.swing.JButton addButton2;
    private javax.swing.JButton addButton3;
    private javax.swing.JButton addPopUpCallButton;
    private javax.swing.JButton addSupplierButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel geelsSuperLabel;
    private javax.swing.JLabel homeLabelButton;
    private javax.swing.JPanel inventoryPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel logout;
    private javax.swing.JTextField nicSearch;
    private javax.swing.JLabel power;
    private javax.swing.JPanel promotionPanle;
    private javax.swing.JPanel settingsPanel;
    private javax.swing.JLabel settingsText;
    private javax.swing.JPanel showInventory;
    private javax.swing.JPanel statPanel;
    private javax.swing.JPanel supplierPanel;
    private javax.swing.JButton supplierSearchButton;
    private javax.swing.JTextField supplierSearchTxtField;
    private javax.swing.JTable supplierTable;
    private javax.swing.JButton suppliersUpdateButton;
    private javax.swing.JLabel unScreen;
    private javax.swing.JButton updateButton;
    private javax.swing.JPanel userControl;
    private javax.swing.JTable userDetailsTable;
    private javax.swing.JLayeredPane userPane;
    private javax.swing.JLabel users;
    // End of variables declaration//GEN-END:variables
}

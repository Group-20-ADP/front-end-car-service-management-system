package za.ac.cput.frontendcarservicemanagement.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;
import za.ac.cput.frontendcarservicemanagement.client.CustomerClient;
import za.ac.cput.frontendcarservicemanagement.util.Helper;

/**
 *
 * @author Aphiwe , Kurtney Jantjies(218138105)
 */
public class ShowAllCustomerGUI extends JFrame {
    CustomerClient custClient = new CustomerClient();
    private JTable customerTbl;
    private JScrollPane jScrollPane1;
    private JButton showAllBtn;
    private JPanel soutPnl;
    
    public ShowAllCustomerGUI() {
        init();
    }
    
    private void init() {
        jScrollPane1 = new JScrollPane();
        customerTbl = new JTable();
        soutPnl = new JPanel();
        showAllBtn = new JButton();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        customerTbl.setModel(new DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Last Name", "Email", "Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(customerTbl);
        if (customerTbl.getColumnModel().getColumnCount() > 0) {
            customerTbl.getColumnModel().getColumn(0).setPreferredWidth(20);
            customerTbl.getColumnModel().getColumn(1).setPreferredWidth(20);
            customerTbl.getColumnModel().getColumn(2).setPreferredWidth(20);
            customerTbl.getColumnModel().getColumn(3).setPreferredWidth(20);
            customerTbl.getColumnModel().getColumn(4).setPreferredWidth(100);
        }

        getContentPane().add(jScrollPane1, BorderLayout.CENTER);

        showAllBtn.setText("Show All");
        showAllBtn.setBorder(BorderFactory.createEtchedBorder());
        showAllBtn.setHorizontalTextPosition(SwingConstants.CENTER);
        showAllBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                showAllBtnActionPerformed(evt);
            }
        });

        GroupLayout soutPnlLayout = new GroupLayout(soutPnl);
        soutPnl.setLayout(soutPnlLayout);
        soutPnlLayout.setHorizontalGroup(
            soutPnlLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(showAllBtn, GroupLayout.DEFAULT_SIZE, 868, Short.MAX_VALUE)
        );
        soutPnlLayout.setVerticalGroup(
            soutPnlLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, soutPnlLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(showAllBtn, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        getContentPane().add(soutPnl, BorderLayout.PAGE_END);
        setLocationRelativeTo(null);
        pack();
    }            

    private void showAllBtnActionPerformed(ActionEvent evt) {                                           
       if(evt.getSource()==showAllBtn){
            Helper.setCustomerTableData(custClient, customerTbl);
       }
        
    }                                          

    public JTable getjTable1() {
        return customerTbl;
    }
}

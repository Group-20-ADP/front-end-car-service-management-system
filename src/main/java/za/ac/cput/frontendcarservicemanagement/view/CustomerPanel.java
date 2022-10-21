/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.frontendcarservicemanagement.view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import za.ac.cput.frontendcarservicemanagement.client.CustomerClient;
import za.ac.cput.frontendcarservicemanagement.util.Helper;

/**
 *
 * @author kurtj
 */
public class CustomerPanel {
    private ShowAll showAllCustomers;                   
    private JButton addCustomerBtn;
    private JTextField addressTxt;
    private JPanel cusFormPnl;
    private JPanel customerPnl;
    private JPanel customerSidePnl;
    private JButton deleteCustomerBtn;
    private JTextField emailTxt;
    private JLabel idLbl;
    private JLabel idLbl1;
    private JLabel idLbl2;
    private JLabel idLbl3;
    private JLabel idLbl4;
    private JTextField idTxt;
    private JTextField lastNameTxt;
    private JTextField nameTxt;
    private JButton showCusBtn;
    private JButton updateCustomer;
    private Font font = new Font("Segoe UI", 1, 14);
    private CustomerClient customerClient = new CustomerClient();

    /**
     * Creates new CustomerPnl
     */
    public CustomerPanel() {
        init();
    }
    
    private void init() {
        
        customerPnl = new JPanel();
        customerSidePnl = new JPanel();
        showCusBtn = new JButton();
        addCustomerBtn = new JButton();
        deleteCustomerBtn = new JButton();
        updateCustomer = new JButton();
        cusFormPnl = new JPanel();
        idLbl = new JLabel();
        idLbl1 = new JLabel();
        idLbl2 = new JLabel();
        idLbl3 = new JLabel();
        idLbl4 = new JLabel();
        idTxt = new JTextField();
        nameTxt = new JTextField();
        emailTxt = new JTextField();
        lastNameTxt = new JTextField();
        addressTxt = new JTextField();

        customerSidePnl.setBackground(new Color(136, 149, 141));

        showCusBtn.setBackground(new Color(102, 102, 102));
        showCusBtn.setText("All Customers");
        showCusBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                showCusBtnActionPerformed(evt);
            }
        });

        addCustomerBtn.setBackground(new Color(102, 102, 102));
        addCustomerBtn.setText("Add");
        addCustomerBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                addCustomerBtnActionPerformed(evt);
            }
        });

        deleteCustomerBtn.setBackground(new Color(102, 102, 102));
        deleteCustomerBtn.setText("Delete");
        deleteCustomerBtn.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                deleteCustomerBtnMouseClicked(evt);
            }
        });
        deleteCustomerBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                deleteCustomerBtnActionPerformed(evt);
            }
        });

        updateCustomer.setBackground(new Color(102, 102, 102));
        updateCustomer.setText("Update");
        updateCustomer.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                updateCustomerMouseClicked(evt);
            }
        });
        updateCustomer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                updateCustomerActionPerformed(evt);
            }
        });

        setGUI();
    }
    
    public void setGUI(){
                GroupLayout customerSidePnlLayout = new GroupLayout(customerSidePnl);
        customerSidePnl.setLayout(customerSidePnlLayout);
        customerSidePnlLayout.setHorizontalGroup(
            customerSidePnlLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(customerSidePnlLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(customerSidePnlLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(updateCustomer, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteCustomerBtn, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
                    .addComponent(showCusBtn, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
                    .addComponent(addCustomerBtn, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        customerSidePnlLayout.setVerticalGroup(
            customerSidePnlLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(customerSidePnlLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(addCustomerBtn, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(deleteCustomerBtn, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(updateCustomer, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(showCusBtn, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        idLbl.setFont(font); // NOI18N
        idLbl.setText("ID:");

        idLbl1.setFont(font); // NOI18N
        idLbl1.setText("Name:");

        idLbl2.setFont(font); // NOI18N
        idLbl2.setText("Email:");

        idLbl3.setFont(font); // NOI18N
        idLbl3.setText("Lastname:");

        idLbl4.setFont(font); // NOI18N
        idLbl4.setText("Address:");

        idTxt.setEditable(false);
        idTxt.setBackground(new Color(51, 51, 51));

        nameTxt.setBackground(new Color(51, 51, 51));

        emailTxt.setBackground(new Color(51, 51, 51));

        lastNameTxt.setBackground(new Color(51, 51, 51));

        addressTxt.setBackground(new Color(51, 51, 51));

        GroupLayout cusFormPnlLayout = new GroupLayout(cusFormPnl);
        cusFormPnl.setLayout(cusFormPnlLayout);
        cusFormPnlLayout.setHorizontalGroup(
            cusFormPnlLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(cusFormPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cusFormPnlLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(idLbl2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(idLbl3, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                    .addComponent(idLbl1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(idLbl, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(idLbl4, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cusFormPnlLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(idTxt, GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                    .addComponent(nameTxt, GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                    .addComponent(emailTxt, GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                    .addComponent(lastNameTxt, GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                    .addComponent(addressTxt, GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        cusFormPnlLayout.setVerticalGroup(
            cusFormPnlLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(cusFormPnlLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(cusFormPnlLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(idLbl)
                    .addComponent(idTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cusFormPnlLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(idLbl1)
                    .addComponent(nameTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cusFormPnlLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(idLbl3)
                    .addComponent(lastNameTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cusFormPnlLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(idLbl2)
                    .addComponent(emailTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(cusFormPnlLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(idLbl4)
                    .addComponent(addressTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GroupLayout customerPnlLayout = new GroupLayout(customerPnl);
        customerPnl.setLayout(customerPnlLayout);
        customerPnlLayout.setHorizontalGroup(
            customerPnlLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(customerPnlLayout.createSequentialGroup()
                .addComponent(customerSidePnl, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cusFormPnl, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        customerPnlLayout.setVerticalGroup(
            customerPnlLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(customerSidePnl, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(cusFormPnl, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }
    
    public JPanel getCustomerPanel(){
       return this.customerPnl;
    }                          

    private void showCusBtnActionPerformed(ActionEvent evt) {                                           
        if(evt.getActionCommand().equals("All Customers")){
             CustomerClient getAllCustomers = new CustomerClient();
             showAllCustomers = new ShowAll();
             showAllCustomers.setVisible(true);
          //   Helper.setCustomerTableData(getAllCustomers, showAllCustomers.getjTable1());
        }
    }                   
    
    private void addCustomerBtnActionPerformed(ActionEvent evt) {                                               
        if(evt.getSource()==addCustomerBtn){
            customerClient.saveCustomer(this.nameTxt.getText().toString(), 
                    this.lastNameTxt.getText().toString(), 
                    this.emailTxt.getText().toString(),
                    this.addressTxt.getText().toString());
        }
    }                                              

    private void deleteCustomerBtnMouseClicked(MouseEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void deleteCustomerBtnActionPerformed(ActionEvent evt) {                                                  
        // TODO add your handling code here:
    }                                                 

    private void updateCustomerMouseClicked(MouseEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void updateCustomerActionPerformed(ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    public JTextField getAddressTxt() {
        return addressTxt;
    }

    public JTextField getEmailTxt() {
        return emailTxt;
    }

    public JTextField getIdTxt() {
        return idTxt;
    }

    public JTextField getLastNameTxt() {
        return lastNameTxt;
    }

    public JTextField getNameTxt() {
        return nameTxt;
    }

    public void setAddressTxt(JTextField addressTxt) {
        this.addressTxt = addressTxt;
    }

    public void setEmailTxt(JTextField emailTxt) {
        this.emailTxt = emailTxt;
    }

    public void setIdTxt(JTextField idTxt) {
        this.idTxt = idTxt;
    }

    public void setLastNameTxt(JTextField lastNameTxt) {
        this.lastNameTxt = lastNameTxt;
    }

    public void setNameTxt(JTextField nameTxt) {
        this.nameTxt = nameTxt;
    }       
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.ac.cput.frontendcarservicemanagement.view;

import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;
//import za.ac.cput.frontendcarservicemanagement.client.CustomerClient;

/**
 *
 * @author Manasseh Barnes
 */

public class BookingPanel {
    private ShowAll showAllBookings;   
    
    private JButton addBookingBtn;
    private JButton deleteBookingBtn;
    private JButton updateBooking;
    private JButton showBookingBtn;
    
    private JLabel idLbl;
    private JLabel idLbl1;
    private JLabel idLbl2;
    private JLabel idLbl3;
    private JLabel idLbl4;
    
    private JComboBox CustomerList;
    private JComboBox CustomerVehicleList;
    private JComboBox ServicesList;
    private JTextField BookingStatus;
    
    private JPanel cusFormPnl;
    private JPanel customerPnl;
    private JPanel bookingSidePnl;
    
    private Font font = new Font("Segoe UI", 1, 14);
    
    public BookingPanel() {
       init();
    }

    private void init() {
        
        customerPnl = new JPanel();
        bookingSidePnl = new JPanel();
        
        showBookingBtn = new JButton();
        addBookingBtn = new JButton();
        deleteBookingBtn = new JButton();
        updateBooking = new JButton();
        
        cusFormPnl = new JPanel();
        
        idLbl = new JLabel();
        idLbl1 = new JLabel();
        idLbl2 = new JLabel();
        idLbl3 = new JLabel();
        idLbl4 = new JLabel();
        
        CustomerList = new JComboBox();
        CustomerVehicleList = new JComboBox();
        ServicesList = new JComboBox();
        BookingStatus = new JTextField();
        
        bookingSidePnl.setBackground(new Color(136, 149, 141));

        showBookingBtn.setBackground(new Color(102, 102, 102));
        showBookingBtn.setText("All Customers");
        showBookingBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                showCusBtnActionPerformed(evt);
            }
        });

        addBookingBtn.setBackground(new Color(102, 102, 102));
        addBookingBtn.setText("Add");
        addBookingBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                addCustomerBtnActionPerformed(evt);
            }
        });

        deleteBookingBtn.setBackground(new Color(102, 102, 102));
        deleteBookingBtn.setText("Delete");
        deleteBookingBtn.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                deleteCustomerBtnMouseClicked(evt);
            }
        });
        deleteBookingBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                deleteCustomerBtnActionPerformed(evt);
            }
        });

        updateBooking.setBackground(new Color(102, 102, 102));
        updateBooking.setText("Update");
        updateBooking.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                updateCustomerMouseClicked(evt);
            }
        });
        updateBooking.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                updateCustomerActionPerformed(evt);
            }
        });

        setGUI();
    }
    
    public void setGUI(){
                GroupLayout customerSidePnlLayout = new GroupLayout(bookingSidePnl);
        bookingSidePnl.setLayout(customerSidePnlLayout);
        customerSidePnlLayout.setHorizontalGroup(
            customerSidePnlLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(customerSidePnlLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(customerSidePnlLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(updateBooking, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBookingBtn, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
                    .addComponent(showBookingBtn, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
                    .addComponent(addBookingBtn, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        customerSidePnlLayout.setVerticalGroup(
            customerSidePnlLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(customerSidePnlLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(addBookingBtn, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(deleteBookingBtn, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(updateBooking, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(showBookingBtn, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(CustomerList, GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                    .addComponent(CustomerVehicleList, GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                    .addComponent(ServicesList, GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                    .addComponent(BookingStatus, GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                    .addComponent(BookingStatus, GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
//        cusFormPnlLayout.setVerticalGroup(
//            cusFormPnlLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
//            .addGroup(cusFormPnlLayout.createSequentialGroup()
//                .addGap(28, 28, 28)
//                .addGroup(cusFormPnlLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
//                    .addComponent(idLbl)
//                    .addComponent(idTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
//                .addGap(18, 18, 18)
//                .addGroup(cusFormPnlLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
//                    .addComponent(idLbl1)
//                    .addComponent(nameTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
//                .addGap(18, 18, 18)
//                .addGroup(cusFormPnlLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
//                    .addComponent(idLbl3)
//                    .addComponent(lastNameTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
//                .addGap(18, 18, 18)
//                .addGroup(cusFormPnlLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
//                    .addComponent(idLbl2)
//                    .addComponent(emailTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
//                .addGap(19, 19, 19)
//                .addGroup(cusFormPnlLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
//                    .addComponent(idLbl4)
//                    .addComponent(addressTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
//                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
//        );

        GroupLayout customerPnlLayout = new GroupLayout(customerPnl);
        customerPnl.setLayout(customerPnlLayout);
        customerPnlLayout.setHorizontalGroup(
            customerPnlLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(customerPnlLayout.createSequentialGroup()
                .addComponent(bookingSidePnl, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cusFormPnl, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        customerPnlLayout.setVerticalGroup(
            customerPnlLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(bookingSidePnl, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(cusFormPnl, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }
    
    public JPanel getCustomerPanel(){
       return this.customerPnl;
    }                          

    private void showCusBtnActionPerformed(ActionEvent evt) {                                           
//        if(evt.getActionCommand().equals("All Customers")){
//             CustomerClient getAllCustomers = new CustomerClient();
//             showAllCustomers = new ShowAll();
//             showAllCustomers.setVisible(true);
//          //   Helper.setCustomerTableData(getAllCustomers, showAllCustomers.getjTable1());
//        }
    }                   
    
    private void addCustomerBtnActionPerformed(ActionEvent evt) {                                               
//        if(evt.getSource()==addCustomerBtn){
//            customerClient.saveCustomer(this.nameTxt.getText().toString(), 
//                    this.lastNameTxt.getText().toString(), 
//                    this.emailTxt.getText().toString(),
//                    this.addressTxt.getText().toString());
//        }
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

//    public JTextField getAddressTxt() {
//        return addressTxt;
//    }
//
//    public JTextField getEmailTxt() {
//        return emailTxt;
//    }
//
//    public JTextField getIdTxt() {
//        return idTxt;
//    }
//
//    public JTextField getLastNameTxt() {
//        return lastNameTxt;
//    }
//
//    public JTextField getNameTxt() {
//        return nameTxt;
//    }
//
//    public void setAddressTxt(JTextField addressTxt) {
//        this.addressTxt = addressTxt;
//    }
//
//    public void setEmailTxt(JTextField emailTxt) {
//        this.emailTxt = emailTxt;
//    }
//
//    public void setIdTxt(JTextField idTxt) {
//        this.idTxt = idTxt;
//    }
//
//    public void setLastNameTxt(JTextField lastNameTxt) {
//        this.lastNameTxt = lastNameTxt;
//    }
//
//    public void setNameTxt(JTextField nameTxt) {
//        this.nameTxt = nameTxt;
//    }                               
}

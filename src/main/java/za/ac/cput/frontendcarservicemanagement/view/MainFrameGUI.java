/**
 *
 * @author Kurtney Jantjies 218138s105
 */
package za.ac.cput.frontendcarservicemanagement.view;

import com.formdev.flatlaf.FlatIntelliJLaf;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainFrameGUI extends JFrame {
   //iniialize in constructor
    private CustomerPanel custPnl;
    private BookingPanelForm bookingPanel;
    private ServicePnl servicesPnl;
    private WaitListGUI waitListGUI;     
    private VehiclePnl vehiclePnl;
    private JButton bookingsBtn;
    private JButton cusomerBtn;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JMenu jMenu1;
    private JMenu jMenu2;
    private JMenuBar jMenuBar1;
    private JPanel jPanel1;
    private JPanel logoPnl;
    private JPanel mainPanel;
    private JPanel mainSidePanel;
    private JButton serviceBtn;
    private JPanel switchPnl;
    private JPanel switchPnl1;
    private JButton vehicleBtn;
    private JButton waitListBtn1;
    private JButton workShopBtn;
    
    
    public MainFrameGUI() {
        vehiclePnl = new VehiclePnl();
        waitListGUI = new WaitListGUI(); 
        servicesPnl = new ServicePnl();
        custPnl = new CustomerPanel();
        bookingPanel = new BookingPanelForm();
        mainPanel = new JPanel();
        mainSidePanel = new JPanel();
        workShopBtn = new JButton();
        cusomerBtn = new JButton();
        serviceBtn = new JButton();
        bookingsBtn = new JButton();
        jLabel2 = new JLabel();
        waitListBtn1 = new JButton();
        vehicleBtn = new JButton();
        logoPnl = new JPanel();
        switchPnl = new JPanel();
        switchPnl1 = new JPanel();
        jPanel1 = new JPanel();
        jLabel1 = new JLabel();
        jMenuBar1 = new JMenuBar();
        jMenu1 = new JMenu();
        jMenu2 = new JMenu();
        
        setComponents();
        
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(new Dimension(965, 550));
        getContentPane().setLayout(null);
        setLocationRelativeTo(null);
    }
                 
    private void setComponents() {
        

        mainPanel.setBackground(new Color(221, 242, 235));

        mainSidePanel.setBackground(new Color(136, 149, 141));
        workShopBtn.setBackground(new Color(102, 102, 102));
        workShopBtn.setText("Workshop");
        waitListBtn1.setBackground(new Color(51, 102, 255));
        waitListBtn1.setText("Wait-list repairs");
        waitListBtn1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                workShopBtnMouseClicked(evt);
            }
        });
        workShopBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                workShopBtnActionPerformed(evt);
            }
        });

        cusomerBtn.setBackground(new Color(51, 102, 255));
        cusomerBtn.setText("Customers");
        cusomerBtn.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                cusomerBtnMouseClicked(evt);
            }
        });
        cusomerBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                cusomerBtnActionPerformed(evt);
            }
        });

        serviceBtn.setBackground(new Color(51, 102, 255));
        serviceBtn.setText("Services");
        serviceBtn.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                serviceBtnMouseClicked(evt);
            }
        });
        serviceBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                serviceBtnActionPerformed(evt);
            }
        });

        bookingsBtn.setBackground(new Color(51, 102, 255));
        bookingsBtn.setText("Bookings");
        bookingsBtn.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                bookingsBtnMouseClicked(evt);
            }
        });
        bookingsBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                bookingsBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new Color(0, 0, 0));
        jLabel2.setText("Logout");

        waitListBtn1.setBackground(new Color(102, 102, 102));
        waitListBtn1.setText("Wait-list repairs");
        waitListBtn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                waitListBtn1ActionPerformed(evt);
            }
        });

        vehicleBtn.setBackground(new Color(102, 102, 102));
        vehicleBtn.setText("Vehicle");
        vehicleBtn.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                vehicleBtnMouseClicked(evt);
            }
        });
        vehicleBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                vehicleBtnActionPerformed(evt);
            }
        });

        GroupLayout mainSidePanelLayout = new GroupLayout(mainSidePanel);
        mainSidePanel.setLayout(mainSidePanelLayout);
        mainSidePanelLayout.setHorizontalGroup(
            mainSidePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(mainSidePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainSidePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(waitListBtn1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(mainSidePanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 126, Short.MAX_VALUE))
                    .addComponent(serviceBtn, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                    .addComponent(bookingsBtn, GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                    .addComponent(waitListBtn1, GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                    .addComponent(vehicleBtn, GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                    .addComponent(workShopBtn, GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(mainSidePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(mainSidePanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(cusomerBtn, GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        mainSidePanelLayout.setVerticalGroup(
            mainSidePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, mainSidePanelLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(serviceBtn, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bookingsBtn, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(waitListBtn1, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(workShopBtn, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(vehicleBtn, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(37, 37, 37))
            .addGroup(mainSidePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(mainSidePanelLayout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(cusomerBtn, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(393, Short.MAX_VALUE)))
        );

        logoPnl.setBackground(new Color(136, 149, 141));

        GroupLayout logoPnlLayout = new GroupLayout(logoPnl);
        logoPnl.setLayout(logoPnlLayout);
        logoPnlLayout.setHorizontalGroup(
            logoPnlLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 185, Short.MAX_VALUE)
            .addGap(0, 186, Short.MAX_VALUE)
        );
        logoPnlLayout.setVerticalGroup(
            logoPnlLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        switchPnl.setBackground(new Color(221, 242, 235));
        switchPnl.setLayout(new CardLayout());

        switchPnl1.setBackground(new Color(221, 242, 235));
        switchPnl1.setLayout(new CardLayout());

        jPanel1.setBackground(UIManager.getDefaults().getColor("Actions.GreyInline"));
        jPanel1.setForeground(new Color(86, 79, 246));

        jLabel1.setFont(new Font("Constantia", 3, 36)); // NOI18N
        jLabel1.setText("Welcome To CSMS! Vroom vroom!!!");
        jLabel1.setPreferredSize(new Dimension(597, 44));

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        switchPnl1.add(jPanel1, "card2");

        switchPnl.add(switchPnl1, "card2");

        GroupLayout mainPanelLayout = new GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(mainSidePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logoPnl, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(switchPnl, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(switchPnl, GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(logoPnl, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mainSidePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(switchPnl, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(mainPanel);
        mainPanel.setBounds(0, 0, 1060, 510);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>                        

    private void bookingsBtnActionPerformed(ActionEvent evt) {                                            
        if(evt.getActionCommand().equals("Bookings")){
            swapPanels(this.switchPnl, bookingPanel.getBookingPnl());
            System.out.println("bN ORKS");
        }
    }                                           

    private void bookingsBtnMouseClicked(MouseEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void serviceBtnActionPerformed(ActionEvent evt) {                                           
        if(evt.getActionCommand().equals("Services")){
            swapPanels(this.switchPnl, servicesPnl.getServicesPnl());
        }
    }                                          

    private void serviceBtnMouseClicked(MouseEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void cusomerBtnActionPerformed(ActionEvent evt) {                                           
        if(evt.getActionCommand().equals("Customers")){
            swapPanels(this.switchPnl, custPnl.getCustomerPanel());
        }
    }                                          

    private void cusomerBtnMouseClicked(MouseEvent evt) {                                        

    }                                       

    private void workShopBtnActionPerformed(ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void workShopBtnMouseClicked(MouseEvent evt) {                                         
        // TODO add your handling code here:
    }                                        
                                   

    private void waitListBtn1ActionPerformed(ActionEvent evt) {                                             
        if(evt.getSource() == waitListBtn1){
            new WaitListGUI().setVisible(true);
        }
    }                                            

    private void vehicleBtnMouseClicked(MouseEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void vehicleBtnActionPerformed(ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

      public void swapPanels(JPanel oldPanel, JPanel newPanel){ 
        //oldPanel == panel with cardlayout
        oldPanel.removeAll();   
        oldPanel.add(newPanel);
        oldPanel.repaint();
        oldPanel.revalidate();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(new FlatIntelliJLaf());
                    new MainFrameGUI().setVisible(true);
                }catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }    
            }
        });
    }
    
    
                  
}

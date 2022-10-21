package za.ac.cput.frontendcarservicemanagement.util;

import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import org.apache.commons.validator.routines.EmailValidator;
import org.springframework.util.StringUtils;
import za.ac.cput.frontendcarservicemanagement.client.CustomerClient;
import za.ac.cput.frontendcarservicemanagement.entity.Customer;

public class Helper {
    public static boolean isEmptyOrNull(String str){
        if(str.equals(null)||str.equals("")){
            return true;
        }else{
            return false;
        }
    }

    public static void checkStringParam(String paramName, String paramValue){
        if (isEmptyOrNull(paramValue))
            throw new IllegalArgumentException(String.format("Invalid value for: %s", paramName));
    }

    public static void checkEmail(String s){
        EmailValidator emailValidator = EmailValidator.getInstance();
        if (!emailValidator.isValid(s))
            throw new IllegalArgumentException("Email not valid");
    }

    public static void checkIfObjectNull(String objectName, Object object){
        if (object == null){
            throw new IllegalArgumentException(String.format("%s is null", objectName));
        }
    }
    
    public static void setCustomerTableData(CustomerClient customerList, JTable table){
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);
            ArrayList<Customer> list = customerList.getAll();
            Object[] rowData = new Object[5];
            
            for(int i = 0; i < list.size();i++){
                rowData[0] = list.get(i).getCustId();
                rowData[1] = list.get(i).getUserCredentials().getName();
                rowData[2] = list.get(i).getUserCredentials().getLastName();
                rowData[3] = list.get(i).getUserCredentials().getEmail();
                rowData[4] = list.get(i).getUserCredentials().getAddress();
                model.addRow(rowData);
            }
    }
}

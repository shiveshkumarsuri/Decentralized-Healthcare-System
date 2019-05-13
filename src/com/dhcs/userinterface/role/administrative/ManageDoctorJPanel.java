package com.dhcs.userinterface.role.administrative;

import com.dhcs.business.doctor.Doctor;
import com.dhcs.business.employee.Employee;
import com.dhcs.business.enterprise.Enterprise;
import com.dhcs.business.enterprise.HospitalEnterprise;
import com.dhcs.business.organization.DoctorOrganization;
import com.dhcs.business.organization.Organization;
import com.dhcs.business.organization.OrganizationDirectory;
import java.awt.CardLayout;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;

/**
 *
 * @author shive
 */
public class ManageDoctorJPanel extends javax.swing.JPanel {

    private OrganizationDirectory organizationDir;
    private JPanel userProcessContainer;
    private ArrayList<Enterprise> enterpriseList;
    private static final Logger logger = Logger.getLogger(ManageDoctorJPanel.class);
    /**
     * Creates new form ManageDoctorJPanel
     */
    public ManageDoctorJPanel(JPanel userProcessContainer, OrganizationDirectory organizationDir,
            ArrayList<Enterprise> enterpriseListInj) {
        initComponents();
        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font(  
          "Bookman Old Style", Font.BOLD, 18)));  
        this.userProcessContainer = userProcessContainer;
        this.organizationDir = organizationDir;
        this.enterpriseList = enterpriseListInj;
        
        
        populateOrganizationEmpComboBox();
        populateSpecialityComboBox();
        populateHospitalComboBox();
        populateDoctorTable();
        organizationJTable.getTableHeader().setFont(new Font("MS Reference Sans Serif", Font.BOLD, 18));
    }
    
    
    public void populateOrganizationEmpComboBox(){
        organizationEmpJComboBox.removeAllItems();
        
        for (Organization organization : organizationDir.getOrganizationList()){
            organizationEmpJComboBox.addItem(organization);
        }
    }
    private void populateSpecialityComboBox() {
        
        specialityComboBox.removeAllItems();
         for (Doctor.Speciality speciality : Doctor.Speciality.values()){
                    specialityComboBox.addItem(speciality);
        }
        
    }
    
    private void populateHospitalComboBox() {
        
        hospitalComboBox.removeAllItems();
         for (Enterprise enterprise : enterpriseList){
                if (enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.Hospital))
                    hospitalComboBox.addItem((HospitalEnterprise)enterprise);
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

        addJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        organizationJTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        organizationEmpJComboBox = new javax.swing.JComboBox();
        nameJTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        specialityComboBox = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        hospitalComboBox = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1700, 1000));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addJButton.setBackground(new java.awt.Color(154, 20, 20));
        addJButton.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        addJButton.setText("Add Doctor");
        addJButton.setBorder(null);
        addJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });
        add(addJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 830, 300, 60));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        organizationJTable.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Speciality", "Hospital"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        organizationJTable.setRowHeight(25);
        jScrollPane1.setViewportView(organizationJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 140, 970, 160));

        jLabel3.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(169, 50, 10));
        jLabel3.setText("Organization");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, -1, -1));

        organizationEmpJComboBox.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        add(organizationEmpJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, 400, 60));

        nameJTextField.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        add(nameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 440, 400, 60));

        jLabel2.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(169, 50, 10));
        jLabel2.setText("Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 460, -1, -1));

        backJButton.setBackground(new java.awt.Color(0, 153, 153));
        backJButton.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        backJButton.setText("Back");
        backJButton.setBorder(null);
        backJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 830, 300, 60));

        specialityComboBox.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        add(specialityComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 520, 400, 60));

        jLabel4.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(169, 50, 10));
        jLabel4.setText("Speciality");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 540, -1, -1));

        jLabel5.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(169, 50, 10));
        jLabel5.setText("Hospital");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 630, -1, -1));

        hospitalComboBox.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        add(hospitalComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 610, 400, 60));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dhcs/util/image/manage-doctor.jpg"))); // NOI18N
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1720, 980));
    }// </editor-fold>//GEN-END:initComponents

    private void populateTable(Organization organization){
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();
        
        model.setRowCount(0);
        
        for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()){
            Object[] row = new Object[4];
            Doctor doc = (Doctor) employee;
            row[0] = doc.getId();
            row[1] = doc.getName();
            row[2] = doc.getSpec();
            row[3] = doc.getHospitalEnterprise();
            model.addRow(row);
        }
    }
     private void populateDoctorTable() {
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();
        
        model.setRowCount(0);
        //Organization organization = 
        HospitalEnterprise hospitalEnterprise = (HospitalEnterprise)hospitalComboBox.getSelectedItem();
        ArrayList<Organization> hospitalOrganizationList = hospitalEnterprise.getOrganizationDirectory().getOrganizationList();
        for(Organization organization: hospitalOrganizationList ){
            if(organization instanceof DoctorOrganization){
              for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()){
            Object[] row = new Object[4];
            Doctor doc = (Doctor) employee;
            row[0] = doc.getId();
            row[1] = doc.getName();
            row[2] = doc.getSpec();
            row[3] = doc.getHospitalEnterprise();
            model.addRow(row);
        }  
            }
        }
        
    }

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed
        Organization organization = (Organization) organizationEmpJComboBox.getSelectedItem();
        String name = nameJTextField.getText();
              
        Doctor.Speciality speciality = (Doctor.Speciality)specialityComboBox.getSelectedItem();
        HospitalEnterprise hospitalEnterprise = (HospitalEnterprise)hospitalComboBox.getSelectedItem();
                      
       
        DoctorOrganization docOrg = null;
        if( !name.trim().isEmpty()){
        if(hospitalEnterprise!= null ){
         ArrayList<Organization> hospitalOrganizationList = hospitalEnterprise.getOrganizationDirectory().getOrganizationList();
                if(!hospitalOrganizationList.isEmpty()){
                        for (Organization org: hospitalOrganizationList) {
                            if (org instanceof DoctorOrganization) {
                                docOrg = (DoctorOrganization)org;
                                break;
                            }
                        }

                        if (docOrg==null) {
                            logger.debug("Please add Doctor Organisation in hospital first.");
                            JOptionPane.showMessageDialog(this, "Please add Doctor Organisation in hospital first.",
                                    "Decentralised Health Care System",JOptionPane.WARNING_MESSAGE);
                            return;
                        }
                        if( organization.getEmployeeDirectory().checkIfUsernameIsUnique(name)) {

                            Employee doc = organization.getEmployeeDirectory().createEmployee(name,speciality, hospitalEnterprise);
                            docOrg.getEmployeeDirectory().createEmployee(name, speciality);

                            populateTable(organization);
                            nameJTextField.setText("");
                            logger.info("User Name:"+organization.getEmployeeDirectory());

                        } else {
                            logger.debug("User Name already exists");
                            JOptionPane.showMessageDialog(this,"User name already exists",
                                    "Decentralised Health Care System",JOptionPane.WARNING_MESSAGE);
                        }
                }else{
                    JOptionPane.showMessageDialog(this,"Insufficient data to add doctor",
                                    "Decentralised Health Care System",JOptionPane.WARNING_MESSAGE);
                }
        }else{
                    JOptionPane.showMessageDialog(this,"Insufficient data to add doctor",
                                    "Decentralised Health Care System",JOptionPane.WARNING_MESSAGE);
        }
        }else{
            JOptionPane.showMessageDialog(this,"Please enter a valid Doctor Name",
                                    "Decentralised Health Care System",JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_addJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JComboBox hospitalComboBox;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox organizationEmpJComboBox;
    private javax.swing.JTable organizationJTable;
    private javax.swing.JComboBox specialityComboBox;
    // End of variables declaration//GEN-END:variables

   
    
}

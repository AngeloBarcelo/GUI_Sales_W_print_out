/*
 *This program is a total sales record keeper. It takes the entered info and 
 *writes a file with the entered info. It has two main frames: frame 1 "RepInfo"
 *is all the reps info. Frame 2 "SalesInfo" is all the sales totals info. The 3rd 
 *frame "DisplayText" is ment only to display information to the user...Might 
 *delete it later. 
 *
 *If you see "Added for Ui experiance ++" == Means this feature or code was only 
 *added to make the user experiance better. It is not part or functionality of 
 *the program or requirments unless other wise stated.
 */
package it252;

/**
 * @author Angelo Barcelo
 * angelobarcelo@hotmail.com
 */
public class RepInfo extends javax.swing.JFrame
{
    String rrefContactMethod;
    String rep_FirstName;
    String rep_Id;
    String rep_LastName;
    String salesDist;
    int value;
    /**
     * Creates new form RepInfo
     */
    public RepInfo()
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jLabel1 = new javax.swing.JLabel();
        repId = new javax.swing.JTextField();
        RepFirstName = new javax.swing.JTextField();
        repLastName = new javax.swing.JTextField();
        salesDistrict = new javax.swing.JComboBox();
        PrefferedContactMethod = new javax.swing.JComboBox();
        enterButton = new javax.swing.JButton();
        quitButton = new javax.swing.JButton();
        Frame1Image = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Rep Info Section");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        repId.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        repId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        repId.setText("Sales Representative's ID");
        repId.setToolTipText("Enter the sales representatives ID");
        repId.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                repIdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                repIdFocusLost(evt);
            }
        });

        RepFirstName.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        RepFirstName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        RepFirstName.setText("Sales Reps First Name");
        RepFirstName.setToolTipText("Enter the sales representatives first name");
        RepFirstName.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                RepFirstNameFocusGained(evt);
            }
        });

        repLastName.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        repLastName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        repLastName.setText("Sales Reps Last Name");
        repLastName.setToolTipText("Enter the sales representatives last name");
        repLastName.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                repLastNameFocusGained(evt);
            }
        });

        salesDistrict.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        salesDistrict.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Sales District:", "North", "South", "East", "West" }));
        salesDistrict.setToolTipText("Enter the sales representatives sales district");
        salesDistrict.setName(""); // NOI18N
        salesDistrict.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                salesDistrictActionPerformed(evt);
            }
        });

        PrefferedContactMethod.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        PrefferedContactMethod.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Preffered Contact Method:", "Phone", "E-mail", "Visit" }));
        PrefferedContactMethod.setToolTipText("Enter the sales representatives preferred method to contact the potental buyers");
        PrefferedContactMethod.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        enterButton.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        enterButton.setText("Enter");
        enterButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                enterButtonActionPerformed(evt);
            }
        });

        quitButton.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        quitButton.setText("Quit");
        quitButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                quitButtonActionPerformed(evt);
            }
        });

        Frame1Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/it252/Welcome.PNG"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Frame1Image)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(enterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(quitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(RepFirstName)
                    .addComponent(repId)
                    .addComponent(repLastName)
                    .addComponent(PrefferedContactMethod, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(salesDistrict, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(repId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(RepFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(repLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(salesDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(PrefferedContactMethod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Frame1Image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(enterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salesDistrictActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_salesDistrictActionPerformed
    {//GEN-HEADEREND:event_salesDistrictActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salesDistrictActionPerformed

    private void repIdFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_repIdFocusLost
    {//GEN-HEADEREND:event_repIdFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_repIdFocusLost

    private void enterButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_enterButtonActionPerformed
    {//GEN-HEADEREND:event_enterButtonActionPerformed
        //Gets the text in the repId field
        rep_Id = repId.getText();
        
        //Gets the text in the rep first name field
        rep_FirstName = RepFirstName.getText();
        
        //Gets the text in the rep last name field
        rep_LastName = repLastName.getText();
        
        //Gets the sales district from the dropdown box and sets it to upper case
        switch (salesDistrict.getSelectedIndex())
        {
            case 1:
                salesDist = "North".toUpperCase();
            break;
            
            case 2:
                salesDist = "South".toUpperCase();
            break;
            
            case 3:
                salesDist = "East".toUpperCase();
            break;
            
            case 4:
                salesDist = "West".toUpperCase();
            break; 
        } 
        
        //Gets the pref. contact method from dropdown and gives it string value
        switch(PrefferedContactMethod.getSelectedIndex())
        {
            case 1:
                rrefContactMethod = "Phone";
            break;
            
            case 2:
                rrefContactMethod = "E-mail";
            break;
            
            case 3:
                rrefContactMethod = "Visit";
            break; 
        }        
        
        //Passes variables to 2nd frame constructor and calls it 
        SalesInfo frame2 = new SalesInfo(rrefContactMethod,rep_FirstName, 
                rep_Id, rep_LastName,salesDist);
        
        //Makes 1st frame disapear 
        setVisible(false);
        
        //Makes 2nd frame visiable
        frame2.setVisible(true);
    }//GEN-LAST:event_enterButtonActionPerformed

    private void quitButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_quitButtonActionPerformed
    {//GEN-HEADEREND:event_quitButtonActionPerformed
        //Exits the system when quit button hit
        System.exit(1);
    }//GEN-LAST:event_quitButtonActionPerformed

    private void repIdFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_repIdFocusGained
    {//GEN-HEADEREND:event_repIdFocusGained
        //When rep id section is selected it highlights all the text
        //Added for Ui experiance ++
        repId.selectAll();
    }//GEN-LAST:event_repIdFocusGained

    private void RepFirstNameFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_RepFirstNameFocusGained
    {//GEN-HEADEREND:event_RepFirstNameFocusGained
        //When rep 1st name area is selected it highlights all the text
        //Added for Ui experiance ++
        RepFirstName.selectAll();   
    }//GEN-LAST:event_RepFirstNameFocusGained

    private void repLastNameFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_repLastNameFocusGained
    {//GEN-HEADEREND:event_repLastNameFocusGained
        //When the rep last name area is selected it highlights all the text
        //Added for Ui experiance ++
        repLastName.selectAll(); 
    }//GEN-LAST:event_repLastNameFocusGained

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(RepInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(RepInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(RepInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(RepInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new RepInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Frame1Image;
    private javax.swing.JComboBox PrefferedContactMethod;
    private javax.swing.JTextField RepFirstName;
    private javax.swing.JButton enterButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton quitButton;
    private javax.swing.JTextField repId;
    private javax.swing.JTextField repLastName;
    private javax.swing.JComboBox salesDistrict;
    // End of variables declaration//GEN-END:variables
}
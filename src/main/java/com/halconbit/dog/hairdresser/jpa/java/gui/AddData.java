package com.halconbit.dog.hairdresser.jpa.java.gui;

import javax.swing.JComboBox;

/**
 *
 * @author Brayan Esteves
 */
public class AddData extends javax.swing.JFrame {
    
    private void loadItemComboBox() {
        this.comboboxAllergic.addItem("-");
        this.comboboxAllergic.addItem("Yes");
        this.comboboxAllergic.addItem("No");
        
        this.comboboxSpecialAttention.addItem("-");
        this.comboboxSpecialAttention.addItem("Yes");
        this.comboboxSpecialAttention.addItem("No");
    }

    /**
     * Creates new form AddData
     */
    public AddData() {
        
        initComponents();
        loadItemComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelAddData = new javax.swing.JPanel();
        labelTitle = new javax.swing.JLabel();
        panelFormClient = new javax.swing.JPanel();
        labelClientNumber = new javax.swing.JLabel();
        labelName = new javax.swing.JLabel();
        labelBreed = new javax.swing.JLabel();
        labelColor = new javax.swing.JLabel();
        labelSpecialAttention = new javax.swing.JLabel();
        labelAllergic = new javax.swing.JLabel();
        labelOwnersName = new javax.swing.JLabel();
        labelOwnersPhone = new javax.swing.JLabel();
        labelObeservations = new javax.swing.JLabel();
        textfieldClientNumber = new javax.swing.JTextField();
        textfieldName = new javax.swing.JTextField();
        textfieldBreed = new javax.swing.JTextField();
        textfieldColor = new javax.swing.JTextField();
        textfieldOwnersPhone = new javax.swing.JTextField();
        textfieldOwnersName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        textareaObservatios = new javax.swing.JTextArea();
        comboboxAllergic = new javax.swing.JComboBox<>();
        comboboxSpecialAttention = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        buttonClean = new javax.swing.JButton();
        buttonAdd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitle.setText("Add Data");

        panelFormClient.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelFormClient.setPreferredSize(new java.awt.Dimension(523, 389));

        labelClientNumber.setText("Client Number:");

        labelName.setText("Name:");

        labelBreed.setText("Breed:");

        labelColor.setText("Color:");

        labelSpecialAttention.setText("Special Attention:");

        labelAllergic.setText("Allergic:");

        labelOwnersName.setText("Owner's Name:");

        labelOwnersPhone.setText("Owner's Phone:");

        labelObeservations.setText("Observations:");

        textareaObservatios.setColumns(20);
        textareaObservatios.setRows(5);
        jScrollPane1.setViewportView(textareaObservatios);

        comboboxAllergic.setToolTipText("");

        javax.swing.GroupLayout panelFormClientLayout = new javax.swing.GroupLayout(panelFormClient);
        panelFormClient.setLayout(panelFormClientLayout);
        panelFormClientLayout.setHorizontalGroup(
            panelFormClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormClientLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFormClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelName)
                    .addGroup(panelFormClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelFormClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelAllergic)
                            .addComponent(labelSpecialAttention)
                            .addComponent(labelColor)
                            .addComponent(labelOwnersName)
                            .addComponent(labelOwnersPhone)
                            .addComponent(labelObeservations))
                        .addGroup(panelFormClientLayout.createSequentialGroup()
                            .addGap(73, 73, 73)
                            .addComponent(labelBreed)))
                    .addComponent(labelClientNumber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFormClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textfieldClientNumber)
                    .addComponent(textfieldName)
                    .addComponent(textfieldBreed)
                    .addComponent(textfieldColor)
                    .addComponent(textfieldOwnersName)
                    .addComponent(textfieldOwnersPhone)
                    .addComponent(jScrollPane1)
                    .addComponent(comboboxAllergic, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboboxSpecialAttention, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelFormClientLayout.setVerticalGroup(
            panelFormClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormClientLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panelFormClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelClientNumber)
                    .addComponent(textfieldClientNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelFormClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelName)
                    .addComponent(textfieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelFormClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelBreed)
                    .addComponent(textfieldBreed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelFormClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelColor)
                    .addComponent(textfieldColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelFormClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelAllergic)
                    .addComponent(comboboxAllergic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelFormClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSpecialAttention)
                    .addComponent(comboboxSpecialAttention, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelFormClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelOwnersName)
                    .addComponent(textfieldOwnersName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelFormClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelOwnersPhone)
                    .addComponent(textfieldOwnersPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelFormClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelObeservations)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        buttonClean.setText("Clean");
        buttonClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCleanActionPerformed(evt);
            }
        });

        buttonAdd.setText("Add");
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(buttonClean, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonClean, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelAddDataLayout = new javax.swing.GroupLayout(panelAddData);
        panelAddData.setLayout(panelAddDataLayout);
        panelAddDataLayout.setHorizontalGroup(
            panelAddDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddDataLayout.createSequentialGroup()
                .addGroup(panelAddDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelAddDataLayout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(labelTitle))
                    .addGroup(panelAddDataLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelFormClient, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE))
                    .addGroup(panelAddDataLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelAddDataLayout.setVerticalGroup(
            panelAddDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddDataLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(labelTitle)
                .addGap(18, 18, 18)
                .addComponent(panelFormClient, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAddData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelAddData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCleanActionPerformed
        this.textfieldClientNumber.setText("");
        this.textfieldName.setText("");
        this.textfieldBreed.setText("");
        this.textfieldColor.setText("");
        this.textareaObservatios.setText("");        
        this.textfieldOwnersName.setText("");
        this.textfieldOwnersPhone.setText("");
        this.comboboxAllergic.setSelectedIndex(0);
        this.comboboxSpecialAttention.setSelectedIndex(0);
    }//GEN-LAST:event_buttonCleanActionPerformed

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonClean;
    private javax.swing.JComboBox<String> comboboxAllergic;
    private javax.swing.JComboBox<String> comboboxSpecialAttention;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelAllergic;
    private javax.swing.JLabel labelBreed;
    private javax.swing.JLabel labelClientNumber;
    private javax.swing.JLabel labelColor;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelObeservations;
    private javax.swing.JLabel labelOwnersName;
    private javax.swing.JLabel labelOwnersPhone;
    private javax.swing.JLabel labelSpecialAttention;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JPanel panelAddData;
    private javax.swing.JPanel panelFormClient;
    private javax.swing.JTextArea textareaObservatios;
    private javax.swing.JTextField textfieldBreed;
    private javax.swing.JTextField textfieldClientNumber;
    private javax.swing.JTextField textfieldColor;
    private javax.swing.JTextField textfieldName;
    private javax.swing.JTextField textfieldOwnersName;
    private javax.swing.JTextField textfieldOwnersPhone;
    // End of variables declaration//GEN-END:variables
}

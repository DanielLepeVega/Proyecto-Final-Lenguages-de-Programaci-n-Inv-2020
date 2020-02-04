package com.mycompany.proyectofinallp;

import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sdegante
 */
public class GUIFrame extends javax.swing.JFrame {

    private boolean flagToStartThreads; 
    private ProducerConsumer threadManager;
    
    /**
     * Creates new form GUIFrame
     */
    public GUIFrame() {
        initComponents();
//        this.setSize(431, 343);
        this.jLabelError.setVisible(false);
        this.flagToStartThreads = false;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jTabbedPaneMain = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSpinnerUpperR = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSpinnerProducers = new javax.swing.JSpinner();
        jSpinnerConsumers = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSpinnerLowerR = new javax.swing.JSpinner();
        jLabelError = new javax.swing.JLabel();
        jSpinnerBufferSize = new javax.swing.JSpinner();
        jSpinnerWaitTimeProd = new javax.swing.JSpinner();
        jSpinnerWaitTimeCons = new javax.swing.JSpinner();
        jPanelProcess = new javax.swing.JPanel();
        jScrollPaneToDos = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPaneDone = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jProgressBarToDo = new javax.swing.JProgressBar();
        jTextFieldDone = new javax.swing.JTextField();
        jButtonInicio = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel5.setText("Tiempo de Espera (ms)");

        jLabel6.setText("Rango de Valores (n, m)");

        jSpinnerUpperR.setModel(new javax.swing.SpinnerNumberModel(2, 2, 9, 1));

        jLabel1.setText("Productores");

        jLabel2.setText("Consumidores");

        jSpinnerProducers.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        jSpinnerProducers.setToolTipText("");

        jSpinnerConsumers.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));

        jLabel3.setText("Tamaño del Buffer");

        jLabel4.setText("Cantidad");

        jSpinnerLowerR.setModel(new javax.swing.SpinnerNumberModel(1, 1, 8, 1));

        jLabelError.setForeground(new java.awt.Color(255, 51, 0));
        jLabelError.setText("El valor de \"n\" tiene que ser menor que el de \"m\"");

        jSpinnerBufferSize.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));

        jSpinnerWaitTimeProd.setModel(new javax.swing.SpinnerNumberModel(1000, 0, 10000, 1));

        jSpinnerWaitTimeCons.setModel(new javax.swing.SpinnerNumberModel(1000, 0, 10000, 1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSpinnerConsumers)
                            .addComponent(jSpinnerProducers)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSpinnerLowerR)
                            .addComponent(jSpinnerBufferSize, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jSpinnerUpperR, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinnerWaitTimeProd, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinnerWaitTimeCons, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabelError)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSpinnerUpperR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jSpinnerProducers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinnerWaitTimeProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jSpinnerConsumers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinnerWaitTimeCons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jSpinnerBufferSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jSpinnerLowerR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelError)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jTabbedPaneMain.addTab("Configuración", jPanel2);

        jPanelProcess.setPreferredSize(new java.awt.Dimension(431, 238));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPaneToDos.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPaneDone.setViewportView(jTable2);

        jLabel7.setText("Tareas por hacer");

        jLabel8.setText("Tareas realizadas");

        jProgressBarToDo.setValue(50);

        jTextFieldDone.setEditable(false);
        jTextFieldDone.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldDone.setText("0");

        javax.swing.GroupLayout jPanelProcessLayout = new javax.swing.GroupLayout(jPanelProcess);
        jPanelProcess.setLayout(jPanelProcessLayout);
        jPanelProcessLayout.setHorizontalGroup(
            jPanelProcessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProcessLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelProcessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jProgressBarToDo, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                    .addComponent(jScrollPaneToDos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanelProcessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPaneDone, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                    .addComponent(jTextFieldDone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanelProcessLayout.setVerticalGroup(
            jPanelProcessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProcessLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelProcessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelProcessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPaneToDos, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                    .addComponent(jScrollPaneDone, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelProcessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jProgressBarToDo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        jTabbedPaneMain.addTab("Procesos", jPanelProcess);

        jButtonInicio.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        jButtonInicio.setForeground(new java.awt.Color(0, 102, 51));
        jButtonInicio.setText("INICIAR");
        jButtonInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPaneMain, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(43, 43, 43)
                    .addComponent(jButtonInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(43, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneMain, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(305, 305, 305)
                    .addComponent(jButtonInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(29, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setFlagToStartThreads(boolean flag){
        this.flagToStartThreads = flag;
    }
    
    public boolean getFlagToStartThreads(){
        return this.flagToStartThreads;
    }
    
    private void jButtonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInicioActionPerformed
        // TODO add your handling code here:
        
        int inputProducers = (Integer) this.jSpinnerProducers.getValue();
        int inputWaitTimeProd = (Integer) this.jSpinnerWaitTimeProd.getValue();
        
        int inputConsumers = (Integer) this.jSpinnerConsumers.getValue();
        int inputWaitTimeCons = (Integer) this.jSpinnerWaitTimeCons.getValue();
        
        int inputBufferSize = (Integer) this.jSpinnerBufferSize.getValue();
        
        int inputLowRange = (Integer) this.jSpinnerLowerR.getValue();
        int inputUpRange = (Integer) this.jSpinnerUpperR.getValue();
        
        // display errors if any
        this.displayErrors(this.getErrors(inputProducers, inputWaitTimeProd, 
                inputConsumers, inputWaitTimeCons, inputBufferSize, inputLowRange, 
                inputUpRange));
            
        if (!ProducerConsumer.inProgress) {
            this.threadManager = new ProducerConsumer(
                inputBufferSize,
                inputProducers,
                inputConsumers,
                inputWaitTimeProd,
                inputWaitTimeCons,
                inputLowRange,
                inputUpRange
            );
            
            this.threadManager.startProducerConsumer();
            this.changeJButtonInicio("DETENER", Color.red);
            this.jTabbedPaneMain.setSelectedIndex(1);

        } else {
            this.threadManager.stopProducerConsumer();
            this.changeJButtonInicio("INICIAR", new Color(0, 102, 51));
            this.jTabbedPaneMain.setSelectedIndex(0);
        }
    }//GEN-LAST:event_jButtonInicioActionPerformed

    private void updateToDos() {
        
    }
    
    public void updateProcessTab() {
        
    }
    
    private void changeJButtonInicio(String text, Color color) {
        this.jButtonInicio.setText(text);
        this.jButtonInicio.setForeground(color);
    }
   
    
    private String getErrors(int producers, int wtProducers, int consumers, 
            int wtConsumers, int bufferSize, int lowRange, int upRange) {

        String errors = "";
        
        // Validate producers
        if (!(1 <= producers && producers <= 10)) 
            errors += "Numero de productores debe estar entre (1-10)\n";
        
        // Validate wait time producers
        if (!(0 <= wtProducers && wtProducers <= 10000))
            errors += "Tiempo de espera de productores invalido (0-10000 ms)\n";
        
        // Validate consumers
        if (!(1 <= consumers && consumers <= 10))
            errors += "Numero de productores debe estar entre (1-10)\n";

        // Validate wait time consumers
        if (!(0 <= wtConsumers && wtConsumers <= 10000))
            errors += "Tiempo de espera de consumidores invalido (0-10000 ms)\n";
        
        // Validate buffer size
        if (!(1 <= bufferSize && bufferSize <= 100))
            errors += "Tamaño de buffer invalido (1-100)\n";
        
        //Validar n menor que m
        if(!(0 <= lowRange && lowRange <= upRange && upRange <= 9)){
            errors += "Rango de [n,m] invalido (0 <= n <= m <= 9)\n";
        }
        
        return errors;
    }
    
    private void displayErrors(String errors) {
        if (errors.length() > 0) {
            this.jLabelError.setText(errors);
            this.jLabelError.setVisible(true);
        }
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
            java.util.logging.Logger.getLogger(GUIFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelError;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelProcess;
    private javax.swing.JProgressBar jProgressBarToDo;
    private javax.swing.JScrollPane jScrollPaneDone;
    private javax.swing.JScrollPane jScrollPaneToDos;
    private javax.swing.JSpinner jSpinnerBufferSize;
    private javax.swing.JSpinner jSpinnerConsumers;
    private javax.swing.JSpinner jSpinnerLowerR;
    private javax.swing.JSpinner jSpinnerProducers;
    private javax.swing.JSpinner jSpinnerUpperR;
    private javax.swing.JSpinner jSpinnerWaitTimeCons;
    private javax.swing.JSpinner jSpinnerWaitTimeProd;
    private javax.swing.JTabbedPane jTabbedPaneMain;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextFieldDone;
    // End of variables declaration//GEN-END:variables
}

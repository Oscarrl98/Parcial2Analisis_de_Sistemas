package gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.view;

import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.dao.IVehicleDao;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.dao.VehicleDao;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity.ProductEntity;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity.ServiceOrderEntity;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity.SparePartEntity;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity.VehicleEntity;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.service.AutoDeliveryService;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.service.BrakeRepairService;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.service.CarCleaningService;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.service.CustomsService;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.service.EngineRepairService;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.service.IAutoDeliveryService;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.service.IBrakeRepairService;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.service.ICarCleaningService;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.service.ICustomsService;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.service.IEngineRepairService;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.service.IPaintingService;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.service.IVehicleReceiptService;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.service.PaintingService;
import gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.service.VehicleReceipt;

public class MainForm extends javax.swing.JFrame {

    public MainForm() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnExecuteCombo1 = new javax.swing.JButton();
        btnExecuteCombo2 = new javax.swing.JButton();
        btnExecuteCombo3 = new javax.swing.JButton();
        btnExecuteComboExample = new javax.swing.JButton();
        lblLicenseNumber = new javax.swing.JLabel();
        txtLicenseNumber = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnExecuteCombo1.setText("Ejecutar combo 1");
        btnExecuteCombo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                executeCombo1(evt);
            }
        });

        btnExecuteCombo2.setText("Ejecutar combo 2");
        btnExecuteCombo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                executeCombo2(evt);
            }
        });

        btnExecuteCombo3.setText("Ejecutar combo 3");
        btnExecuteCombo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                executeCombo3(evt);
            }
        });

        btnExecuteComboExample.setText("Ejecutar combo Ejemplo");
        btnExecuteComboExample.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                executeComboExample(evt);
            }
        });

        lblLicenseNumber.setText("Placa");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnExecuteComboExample, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExecuteCombo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExecuteCombo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExecuteCombo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblLicenseNumber)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtLicenseNumber)))
                .addContainerGap(243, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLicenseNumber)
                    .addComponent(txtLicenseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(btnExecuteComboExample)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExecuteCombo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExecuteCombo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExecuteCombo3)
                .addContainerGap(142, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void executeCombo1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_executeCombo1
        System.out.println("Combo PREMIUM!!");
        System.out.println("Servicios:\n 1)Instalacion de Alarma\n2)Polarizado de vidrio\n3)Cambio de aceite de motor\n4)Enderezado y pintura\n5)Pulido y lustrado\n6)Juego libre de volante");
        
        IVehicleReceiptService receiptBay = new VehicleReceipt();
        ServiceOrderEntity order = receiptBay.receiveVehicle(this.txtLicenseNumber.getText());
        System.out.println("Se trabajara en el vehiculo con placas" + order.getVehicle().getLicenseNumber() + " marca " + order.getVehicle().getBrand() + " color " + order.getVehicle().getColor() + " modelo " + order.getVehicle().getModel());
        System.out.println("-----------------------------------------------------------");
        ////////////////////////////////////////////////////////////////////////////////////////////
        ICustomsService customService = new CustomsService();
   /*1*/ProductEntity alarm = customService.installAlarm(order.getVehicle().getBrand());
        System.out.println("///////////////////////////////////////////////////////////////////////////////////////////");
   /*2*/ProductEntity pola = customService.polarizedWindow(order.getVehicle().getColor());
        
        System.out.println("///////////////////////////////////////////////////////////////////////////////////////////");
   /*3*/IEngineRepairService engineRepairService = new EngineRepairService();
        engineRepairService.changeOil(order);
        
        System.out.println("///////////////////////////////////////////////////////////////////////////////////////////");
        IPaintingService paintingService = new PaintingService();
   /*4*/SparePartEntity dcolor = new SparePartEntity();
        SparePartEntity paint = paintingService.setPaint(dcolor.getColors());
        
        System.out.println("///////////////////////////////////////////////////////////////////////////////////");
   /*5*/ICarCleaningService cleaningservice = new CarCleaningService();
        ProductEntity clean = cleaningservice.cleanAndPolished(order.getVehicle().getLicenseNumber());
        System.out.println("/////////////////////////////////////////////////////////////////////////////////");
        
        IAutoDeliveryService autodeliveryservice = new AutoDeliveryService();
   /*6*/SparePartEntity sold = autodeliveryservice.buyRudder(order.getVehicle().getBrand());
        
    }//GEN-LAST:event_executeCombo1

    private void executeCombo2(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_executeCombo2
        System.out.println("Combo #2");
    }//GEN-LAST:event_executeCombo2

    private void executeCombo3(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_executeCombo3
        System.out.println("Combo #3");
    }//GEN-LAST:event_executeCombo3

    private void executeComboExample(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_executeComboExample
        
    }//GEN-LAST:event_executeComboExample

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExecuteCombo1;
    private javax.swing.JButton btnExecuteCombo2;
    private javax.swing.JButton btnExecuteCombo3;
    private javax.swing.JButton btnExecuteComboExample;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblLicenseNumber;
    private javax.swing.JTextField txtLicenseNumber;
    // End of variables declaration//GEN-END:variables
}

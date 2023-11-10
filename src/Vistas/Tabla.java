/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import Entidades.Cuenta;
import Entidades.Datos;
import bancario.Operacion;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author omar_
 */
public class Tabla extends javax.swing.JFrame {
   
    Cuenta cuenta;
    Operacion operacion = new Operacion();
    String mes;
   
 
    public Tabla() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane6 = new javax.swing.JScrollPane();
        tblMovimientos1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BtnSeleccionar = new javax.swing.JButton();
        TxtArchivo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        CboMes = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TblDatosCliente = new javax.swing.JTable();
        TxtNombre = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        TblCuenta = new javax.swing.JTable();
        TxtTipoCuenta = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        TblResumenPeriodo = new javax.swing.JTable();
        jTextField6 = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        TblMovimientos = new javax.swing.JTable();
        jTextField7 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtSaldoFinal = new javax.swing.JTextField();

        tblMovimientos1.setBackground(new java.awt.Color(204, 204, 204));
        tblMovimientos1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FECHA", "DESCRIPCIÓN", "DEPÓSITO", "RETIRO", "SUBTOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMovimientos1.setShowGrid(true);
        jScrollPane6.setViewportView(tblMovimientos1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 0, 0));

        jLabel1.setOpaque(true);

        BtnSeleccionar.setText("Seleccionar");
        BtnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSeleccionarActionPerformed(evt);
            }
        });

        TxtArchivo.setBackground(new java.awt.Color(51, 0, 0));

        jLabel2.setText("Seleccione el archivo que desea cargar:");

        jTextField2.setBackground(new java.awt.Color(51, 0, 0));
        jTextField2.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setText("                                   ESTADO DE CUENTA");

        CboMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        CboMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CboMesActionPerformed(evt);
            }
        });

        jLabel3.setText("Seleccionar el mes:");

        TblDatosCliente.setBackground(new java.awt.Color(204, 204, 204));
        TblDatosCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TblDatosCliente.setShowGrid(true);
        jScrollPane2.setViewportView(TblDatosCliente);

        TxtNombre.setBackground(new java.awt.Color(51, 0, 0));

        TblCuenta.setBackground(new java.awt.Color(204, 204, 204));
        TblCuenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TblCuenta.setShowGrid(true);
        jScrollPane3.setViewportView(TblCuenta);

        TxtTipoCuenta.setBackground(new java.awt.Color(51, 0, 0));

        jTextField5.setBackground(new java.awt.Color(51, 0, 0));
        jTextField5.setFont(new java.awt.Font("sansserif", 3, 24)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        jTextField5.setText("                                  RESUMEN DEL PERIODO");
        jTextField5.setOpaque(true);

        TblResumenPeriodo.setBackground(new java.awt.Color(204, 204, 204));
        TblResumenPeriodo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "", ""
            }
        ));
        TblResumenPeriodo.setName(""); // NOI18N
        TblResumenPeriodo.setShowGrid(true);
        jScrollPane4.setViewportView(TblResumenPeriodo);

        jTextField6.setBackground(new java.awt.Color(51, 0, 0));
        jTextField6.setFont(new java.awt.Font("sansserif", 3, 24)); // NOI18N
        jTextField6.setText("                    DETALLES DE SOBRE LOS MOVIMIENTOS");

        TblMovimientos.setBackground(new java.awt.Color(51, 0, 0));
        TblMovimientos.setForeground(new java.awt.Color(51, 0, 0));
        TblMovimientos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FECHA", "DESCRIPCIÓN", "DEPÓSITO", "RETIRO", "SUBTOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TblMovimientos.setShowGrid(true);
        jScrollPane5.setViewportView(TblMovimientos);

        jTextField7.setBackground(new java.awt.Color(51, 0, 0));
        jTextField7.setFont(new java.awt.Font("sansserif", 3, 24)); // NOI18N
        jTextField7.setText("      SALDO FINAL DEL PERIODO:");

        jLabel4.setFont(new java.awt.Font("sansserif", 3, 24)); // NOI18N
        jLabel4.setText("$");

        TxtSaldoFinal.setBackground(new java.awt.Color(51, 0, 0));
        TxtSaldoFinal.setFont(new java.awt.Font("sansserif", 3, 24)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField5)
                    .addComponent(jTextField2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CboMes, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                            .addComponent(TxtNombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtTipoCuenta)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58))))
                    .addComponent(jTextField6)
                    .addComponent(jScrollPane5)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BtnSeleccionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtSaldoFinal)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSeleccionar)
                    .addComponent(CboMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtTipoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(TxtSaldoFinal, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField7)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSeleccionarActionPerformed

     
                try {
        
        JFileChooser fileChooser = new JFileChooser();
        
        
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        
        
        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            
            CboMes.setEnabled(true);
            
            
            File archivo = fileChooser.getSelectedFile();
            
            
            byte archivoBytes[] = Files.readAllBytes(archivo.toPath());
            String contenido = new String(archivoBytes, StandardCharsets.UTF_8);
            
            // Limpia las tablas de la interfaz para mostrar los nuevos datos.
            DefaultTableModel modelo = (DefaultTableModel) TblDatosCliente.getModel();
            modelo.setRowCount(0);
            DefaultTableModel modelo1 = (DefaultTableModel) TblCuenta.getModel();
            modelo1.setRowCount(0);
            DefaultTableModel modelo2 = (DefaultTableModel) TblResumenPeriodo.getModel();
            modelo2.setRowCount(0);
            DefaultTableModel modelo3 = (DefaultTableModel) TblMovimientos.getModel();
            modelo3.setRowCount(0);
            
            
            float depositos = 0;
            float retiros = 0;
            float saldoFinal = 0;
            
            
            cuenta = new Cuenta().deserializar(contenido);
            
            
            mes = CboMes.getSelectedItem().toString();
            
            
            List<Datos> mov = operacion.obtenerMovimientos(mes, cuenta.getMovimientos());
            
            
            float saldoAnterior = operacion.obtenerSaldoInicial(mes, cuenta.getMovimientos());
            
            
            TxtArchivo.setText(archivo.toString());
            
            
            TxtNombre.setText(cuenta.getCliente().getNombre());
            
            
            modelo.addRow(new Object[] {"RFC: " + cuenta.getCliente().getRfc()});
            modelo.addRow(new Object[] {cuenta.getCliente().getDomicilio()});
            modelo.addRow(new Object[] {cuenta.getCliente().getCiudad()});
            modelo.addRow(new Object[] {"C.P. " + cuenta.getCliente().getCodigoPostal()});
            
            
            TxtTipoCuenta.setText(cuenta.getProducto());
            
            
            modelo1.addRow(new Object[] {"CUENTA", String.format("%25s", cuenta.getCuenta())});
            modelo1.addRow(new Object[] {"CLABE", String.format("%16s", cuenta.getClabe())});
            modelo1.addRow(new Object[] {"MONEDA", String.format("%32s", cuenta.getMoneda())});
            
            
            for (Datos m : mov) {
                depositos += m.getDeposito();
                retiros += m.getRetiro();
                saldoFinal = m.getSubtotal();
            }
            
            
            modelo2.addRow(new Object[] {"Saldo inicial (anterior)", String.format("$%,34.2f", saldoAnterior)});
            modelo2.addRow(new Object[] {"Depósitos", String.format("$%,34.2f", depositos)});
            modelo2.addRow(new Object[] {"Retiros", String.format("$%,34.2f", retiros)});
            modelo2.addRow(new Object[] {"Saldo final", String.format("$%,34.2f", saldoFinal)});
            
            // Muestra los movimientos en la tabla de movimientos.
            for (Datos m : mov) {
                if (m.getDeposito() == 0) {
                    modelo3.addRow(new Object[] {m.getFechaOperacion(), m.getDescripcionOperacion(), String.format("%40s", "-"), String.format("$%,31.2f", m.getRetiro()), String.format("$%,31.2f", m.getSubtotal())});
                }
                if (m.getRetiro() == 0) {
                    modelo3.addRow(new Object[] {m.getFechaOperacion(), m.getDescripcionOperacion(), String.format("$%,31.2f", m.getDeposito()), String.format("%40s", "-"), String.format("$%,31.2f", m.getSubtotal())});
                }
            }
            
            
           TxtSaldoFinal.setText(String.format("%,35.2f", saldoFinal));
        }
    } catch (NullPointerException e) {
        
        JOptionPane.showMessageDialog(null, "Tienes que cargar un archivo JSON, o un archivo JSON con el formato adecuado", "ERROR", JOptionPane.ERROR_MESSAGE);
    } catch (Exception ex) {
        
        JOptionPane.showMessageDialog(null, "Ocurrió un error: " + ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
    }

  
    }//GEN-LAST:event_BtnSeleccionarActionPerformed

    private void CboMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CboMesActionPerformed
       try {
        // Obtiene un modelo de tabla para la tabla de resumen del período.
        DefaultTableModel modelo = (DefaultTableModel) TblResumenPeriodo.getModel();
        modelo.setRowCount(0); // Limpia los datos existentes en la tabla.

        // Obtiene un modelo de tabla para la tabla de movimientos.
        DefaultTableModel modelo2 = (DefaultTableModel) TblMovimientos.getModel();
        modelo2.setRowCount(0); // Limpia los datos existentes en la tabla.

        // Variables para calcular depósitos, retiros y saldo final.
        float depositos = 0;
        float retiros = 0;
        float saldoFinal = 0;

        // Obtiene el mes seleccionado por el usuario.
        mes = CboMes.getSelectedItem().toString();

        // Obtiene una lista de movimientos correspondientes al mes seleccionado.
        List<Datos> mov = operacion.obtenerMovimientos(mes, cuenta.getMovimientos());

        // Obtiene el saldo inicial correspondiente al mes seleccionado.
        float saldoAnterior = operacion.obtenerSaldoInicial(mes, cuenta.getMovimientos());

        // Calcula depósitos, retiros y saldo final para el mes seleccionado.
        for (Datos m : mov) {
            depositos += m.getDeposito();
            retiros += m.getRetiro();
            saldoFinal = m.getSubtotal();
        }

        // Muestra el resumen del período en la tabla de resumen del período.
        modelo.addRow(new Object[]{"Saldo inicial (anterior)", String.format("$%,34.2f", saldoAnterior)});
        modelo.addRow(new Object[]{"Depósitos", String.format("$%,34.2f", depositos)});
        modelo.addRow(new Object[]{"Retiros", String.format("$%,34.2f", retiros)});
        modelo.addRow(new Object[]{"Saldo final", String.format("$%,34.2f", saldoFinal)});

        // Muestra los movimientos correspondientes al mes seleccionado en la tabla de movimientos.
        for (Datos m : mov) {
            if (m.getDeposito() == 0) {
                modelo2.addRow(new Object[]{m.getFechaOperacion(), m.getDescripcionOperacion(), String.format("%40s", "-"), String.format("$%,31.2f", m.getRetiro()), String.format("$%,31.2f", m.getSubtotal())});
            }
            if (m.getRetiro() == 0) {
                modelo2.addRow(new Object[]{m.getFechaOperacion(), m.getDescripcionOperacion(), String.format("$%,31.2f", m.getDeposito()), String.format("%40s", "-"), String.format("$%,31.2f", m.getSubtotal())});
            }
        }

        // Muestra el saldo final en la interfaz.
        TxtSaldoFinal.setText(String.format("%,35.2f", saldoFinal));
    } catch (Exception ex) {
        // Maneja cualquier excepción y muestra un mensaje de error en caso de que ocurra un problema.
        JOptionPane.showMessageDialog(null, "Ocurrió un error: " + ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_CboMesActionPerformed

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
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tabla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnSeleccionar;
    private javax.swing.JComboBox<String> CboMes;
    private javax.swing.JTable TblCuenta;
    private javax.swing.JTable TblDatosCliente;
    private javax.swing.JTable TblMovimientos;
    private javax.swing.JTable TblResumenPeriodo;
    private javax.swing.JTextField TxtArchivo;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JTextField TxtSaldoFinal;
    private javax.swing.JTextField TxtTipoCuenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTable tblMovimientos1;
    // End of variables declaration//GEN-END:variables
}

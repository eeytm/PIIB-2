
package PARCIAL_1.Config.Prin;

import PARCIAL_1.Config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.view.JasperViewer;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.JRException;
import java.util.logging.Logger;



public class Jtable extends javax.swing.JFrame {

    Conexion conl= new Conexion();
    Connection conet;
    DefaultTableModel modelo;
    Statement st;
    ResultSet rs;
    int idc;
    int selectedRowIndex; // Variable para almacenar el índice de la fila seleccionada
    
    
    
    
    public Jtable() {
        initComponents();
        setLocationRelativeTo(null);
        consultar();
        
    }
    
    private añadir ventanaAñadir;


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        txtCod = new javax.swing.JTextField();
        txtPrec = new javax.swing.JTextField();
        txtNom = new javax.swing.JTextField();
        txtCant = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtFech = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        btnReporte = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnFactura = new javax.swing.JButton();
        btnCompra = new javax.swing.JButton();
        btnEgresos = new javax.swing.JButton();
        btnIngresos = new javax.swing.JButton();
        btnVenta = new javax.swing.JButton();
        btnAñadir = new javax.swing.JButton();

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
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jLabel1.setText("CANTIDAD:");

        jLabel2.setText("NOMBRE:");

        btnAgregar.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Pictures\\JEED\\BOTONES CRUD - AGREGAR.png")); // NOI18N
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnModificar.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Pictures\\JEED\\BOTONES CRUD - EDITAR.png")); // NOI18N
        btnModificar.setToolTipText("");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Pictures\\JEED\\BOTONES CRUD - ELIMINAR.png")); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnNuevo.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Pictures\\JEED\\BOTONES CRUD - NUEVO.png")); // NOI18N
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        txtPrec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecActionPerformed(evt);
            }
        });

        jLabel5.setText("PRECIO:");

        jLabel6.setText("CODIGO:");

        jLabel3.setText("FECHA:");

        txtFech.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechActionPerformed(evt);
            }
        });

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Precio", "Cantidad", "Fecha"
            }
        ));
        Tabla.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(Tabla);

        btnReporte.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Pictures\\JEED\\BOTONES CRUD - REPORTE.png")); // NOI18N
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Pictures\\JEED\\JEED 173X173.png")); // NOI18N

        btnBuscar.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Pictures\\JEED\\BOTONES CRUD - BUSCAR.png")); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnFactura.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Pictures\\JEED\\BOTONES CRUD 240x90 - FACTURA.png")); // NOI18N
        btnFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturaActionPerformed(evt);
            }
        });

        btnCompra.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Pictures\\JEED\\BOTONES CRUD 240x90 - COMPRA.png")); // NOI18N
        btnCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompraActionPerformed(evt);
            }
        });

        btnEgresos.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Pictures\\JEED\\BOTONES CRUD 240x90 - EGRESOS.png")); // NOI18N
        btnEgresos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEgresosActionPerformed(evt);
            }
        });

        btnIngresos.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Pictures\\JEED\\BOTONES CRUD 240x90 - INGRESOS.png")); // NOI18N
        btnIngresos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresosActionPerformed(evt);
            }
        });

        btnVenta.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Pictures\\JEED\\BOTONES CRUD 120x90 - VENTA.png")); // NOI18N
        btnVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentaActionPerformed(evt);
            }
        });

        btnAñadir.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Pictures\\JEED\\BOTONES CRUD 240x90 - AÑADIR.png")); // NOI18N
        btnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(99, 99, 99))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrec, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel2))
                            .addComponent(txtCant, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFech, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(btnReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 913, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEgresos, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPrec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(8, 8, 8)
                        .addComponent(txtFech, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReporte)
                    .addComponent(btnAgregar)
                    .addComponent(btnBuscar)
                    .addComponent(btnModificar)
                    .addComponent(btnNuevo)
                    .addComponent(btnEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnVenta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEgresos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCompra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        Nuevo();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        Agregar();
        consultar();
        Nuevo();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtPrecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecActionPerformed

    private void txtFechActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
       


    }//GEN-LAST:event_formMouseClicked

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        Modificar();
        consultar();
        Nuevo();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        Eliminar();
        consultar();
        Nuevo();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
        seleccionarFila();
    }//GEN-LAST:event_TablaMouseClicked

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
        try {
            Conexion con = new Conexion();
            Connection conn =con.getConnection();
            
            JasperReport Reporte = null;
            String path = "src\\Reporte\\herramientas.jasper";
            
            Reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
            
            JasperPrint jprint = JasperFillManager.fillReport(Reporte, null, conn);
            
            JasperViewer view = new JasperViewer(jprint, false);
            
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            
            view.setVisible(true);
        
        } catch (JRException ex){
            Logger.getLogger(Jtable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnReporteActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
      
    String codigo = txtCod.getText().trim(); // Obtener el código ingresado por el usuario
    String nombre = txtNom.getText().trim(); // Obtener el nombre ingresado por el usuario

    if (!codigo.isEmpty() && !nombre.isEmpty()) {
        // Si se ingresaron ambos código y nombre, muestra un mensaje de error
        JOptionPane.showMessageDialog(null, "Ingresa solo un valor para buscar, ya sea código o nombre.");
    } else if (!codigo.isEmpty()) {
        // Si se ingresó un código, busca por código
        buscarPorCodigo(codigo);
    } else if (!nombre.isEmpty()) {
        // Si se ingresó un nombre, busca por nombre
        buscarPorNombre(nombre);
    } else {
        // Si no se ingresó ni código ni nombre, muestra un mensaje de error
        JOptionPane.showMessageDialog(null, "Ingresa un código o un nombre para buscar.");
    }
}

private void buscarPorCodigo(String codigo) {
    // Realizar la consulta en la base de datos por código
    String sql = "SELECT * FROM producto WHERE codigoProducto = ?";
    try {
        conet = conl.getConnection();
        PreparedStatement pstmt = conet.prepareStatement(sql);
        pstmt.setString(1, codigo);
        ResultSet rs = pstmt.executeQuery();

        // Verificar si se encontraron resultados
        if (rs.next()) {
            // Mostrar los datos en los campos de texto
            txtNom.setText(rs.getString("nombreProducto"));
            txtPrec.setText(String.valueOf(rs.getFloat("precioUnitario")));
            txtCant.setText(String.valueOf(rs.getInt("cantidadProducto")));
            txtFech.setText(rs.getString("fechaVencimiento"));
        } else {
            // No se encontraron resultados, mostrar un mensaje
            JOptionPane.showMessageDialog(null, "Producto no encontrado.");
            // Limpiar los campos de texto
            txtNom.setText("");
            txtPrec.setText("");
            txtCant.setText("");
            txtFech.setText("");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al buscar el producto: " + e.getMessage());
    }
}

private void buscarPorNombre(String nombre) {
        // Realizar la consulta en la base de datos por nombre
        String sql = "SELECT * FROM producto WHERE nombreProducto LIKE ?";
        try {
            conet = conl.getConnection();
            PreparedStatement pstmt = conet.prepareStatement(sql);
            pstmt.setString(1, "%" + nombre + "%"); // Busca nombres que contengan la cadena ingresada
            ResultSet rs = pstmt.executeQuery();

            // Verificar si se encontraron resultados
            if (rs.next()) {
                // Mostrar los datos del primer resultado (puedes modificar para manejar múltiples resultados)
                txtCod.setText(rs.getString("codigoProducto"));
                txtNom.setText(rs.getString("nombreProducto"));
                txtPrec.setText(String.valueOf(rs.getFloat("precioUnitario")));
                txtCant.setText(String.valueOf(rs.getInt("cantidadProducto")));
                txtFech.setText(rs.getString("fechaVencimiento"));
            } else {
                // No se encontraron resultados, mostrar un mensaje
                JOptionPane.showMessageDialog(null, "Producto no encontrado.");
                // Limpiar los campos de texto
                txtCod.setText("");
                txtPrec.setText("");
                txtCant.setText("");
                txtFech.setText("");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar el producto: " + e.getMessage());
        }



    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFacturaActionPerformed

    private void btnCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCompraActionPerformed

    private void btnEgresosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEgresosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEgresosActionPerformed

    private void btnIngresosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIngresosActionPerformed

    private void btnVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVentaActionPerformed

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
       
        // Crear una instancia de la ventana "añadir" y pasar la referencia a la ventana principal
    añadir ventanaAñadir = new añadir(this); // "this" se refiere a la ventana principal
    ventanaAñadir.setVisible(true); // Mostrar la ventana "añadir"


    }//GEN-LAST:event_btnAñadirActionPerformed

    
    private void seleccionarFila() {
        int fila = Tabla.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "No se seleccionó una fila");
        } else {
            selectedRowIndex = fila; // Almacena el índice de la fila seleccionada
            txtCod.setText(Tabla.getValueAt(fila, 0).toString());
            txtNom.setText(Tabla.getValueAt(fila, 1).toString());
            txtPrec.setText(Tabla.getValueAt(fila, 2).toString());
            txtCant.setText(Tabla.getValueAt(fila, 3).toString());

            // Convierte la fecha de la tabla al formato deseado y establece el valor en el campo de texto
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // Usa el formato de tu tabla
            Date date = (Date) Tabla.getValueAt(fila, 4);
            txtFech.setText(sdf.format(date));
        }
    }

 
    
    
    void Modificar() {
    String nom = txtNom.getText();
    String prec = txtPrec.getText();
    String cant = txtCant.getText();
    String fechaTexto = txtFech.getText();

    if (nom.isEmpty() || prec.isEmpty() || cant.isEmpty() || fechaTexto.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios.");
        return;
    }

    try {
        // Validar que los campos numéricos sean números válidos
        float precio = Float.parseFloat(prec);
        int cantidad = Integer.parseInt(cant);

        // Validar y convertir la fecha al formato deseado ("yyyy-MM-dd")
        SimpleDateFormat sdfIngreso = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdfBaseDatos = new SimpleDateFormat("yyyy-MM-dd");

        Date fecha = sdfIngreso.parse(fechaTexto);
        String fechaFormateada = sdfBaseDatos.format(fecha);

        // Obtener el código de producto seleccionado de la tabla
        int fila = Tabla.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "No se seleccionó una fila");
            return;
        }
        String cod = Tabla.getValueAt(fila, 0).toString();

        String sql = "UPDATE bdnegocio.producto SET nombreProducto = '" + nom + "', precioUnitario = " + precio + ", cantidadProducto = " + cantidad + ", fechaVencimiento = '" + fechaFormateada + "' WHERE codigoProducto = '"+cod+"'";

        conet = conl.getConnection();
        st = conet.createStatement();
        st.executeUpdate(sql);

        JOptionPane.showMessageDialog(null, "Producto Modificado Exitosamente!");
        consultar(); // Actualiza la tabla después de modificar el producto
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "El precio y la cantidad deben ser números válidos.");
    } catch (ParseException e) {
        JOptionPane.showMessageDialog(null, "Fecha no válida. Utilice el formato dd/MM/yyyy.");
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al modificar el producto en la base de datos: " + e.getMessage());
    } finally {
    }
}


    

    // Actualiza la tabla después de modificar o eliminar un producto
    private void actualizarTabla() {
        consultar();
        Nuevo();
    }
    
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
            java.util.logging.Logger.getLogger(Jtable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jtable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jtable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jtable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jtable().setVisible(true);
            }
        });
    }
    
    void consultar() {
    String sql = "select * from bdnegocio.producto";

    try {
        conet = conl.getConnection();
        st = conet.createStatement();
        rs = st.executeQuery(sql);
        Object[] producto = new Object[5];

        modelo = (DefaultTableModel) Tabla.getModel();
        modelo.setRowCount(0); // Limpiar el modelo antes de agregar nuevos datos

        while (rs.next()) {
            producto = new Object[5];
            producto[0] = rs.getString("codigoProducto");
            producto[1] = rs.getString("nombreProducto");
            producto[2] = rs.getFloat("precioUnitario");
            producto[3] = rs.getInt("cantidadProducto");
            producto[4] = rs.getDate("fechaVencimiento");

            modelo.addRow(producto);
        }
        Tabla.setModel(modelo);
    } catch (Exception e) {
        e.printStackTrace();
    } finally {

    }
}

void Agregar() {
    String cod = txtCod.getText();
    String nom = txtNom.getText();
    String prec = txtPrec.getText();
    String cant = txtCant.getText();
    String fechaTexto = txtFech.getText();

    if (cod.isEmpty() || nom.isEmpty() || prec.isEmpty() || cant.isEmpty() || fechaTexto.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios.");
        return;
    }

    try {
        // Validar que los campos numéricos sean números válidos
        float precio = Float.parseFloat(prec);
        int cantidad = Integer.parseInt(cant);

        // Validar y convertir la fecha
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = null;

        try {
            fecha = sdf.parse(fechaTexto);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "Fecha no válida. Utilice el formato dd/MM/yyyy.");
            return;
        }

        String sql = "INSERT INTO bdnegocio.producto (codigoProducto, nombreProducto, precioUnitario, cantidadProducto, fechaVencimiento) VALUES ('" + cod + "', '" + nom + "', " + precio + ", " + cantidad + ", '" + sdf.format(fecha) + "');";

        conet = conl.getConnection();
        st = conet.createStatement();
        st.executeUpdate(sql);

        JOptionPane.showMessageDialog(null, "Producto Registrado Exitosamente!");
        consultar(); // Actualiza la tabla después de agregar el producto
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "El precio y la cantidad deben ser números válidos.");
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al agregar el producto a la base de datos: " + e.getMessage());
    } finally {
    }
}

    void limpiarTabla(){
        for(int i = 0; i <= Tabla.getRowCount(); i++){
            modelo.removeRow(i);
            i = i - 1;
        }
    }

    void Eliminar() {
    int fila = Tabla.getSelectedRow();
    try {
        if (fila < 0) {
            JOptionPane.showMessageDialog(null, "Producto no Seleccionado");
            limpiarTabla();
        } else {
            // Obtener el valor de idc desde la fila seleccionada
            String codigoProducto = Tabla.getValueAt(fila, 0).toString();
            
            // Luego puedes utilizar idProducto en tu consulta SQL para eliminar el producto
            String sql = "DELETE FROM producto WHERE codigoProducto ='"+codigoProducto+"'";
            
            conet = conl.getConnection();
            st = conet.createStatement();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Producto Eliminado");
            limpiarTabla();
        }
    } catch (Exception e) {
        System.out.println(e);
    }
}

    public void agregarProducto(String codigo, String nombre, float precio, int cantidad, String fecha) {
    DefaultTableModel modelo = (DefaultTableModel) Tabla.getModel();
    modelo.addRow(new Object[]{codigo, nombre, precio, cantidad, fecha});
}

    
    
    void Nuevo(){
        txtCod.setText("");
        txtNom.setText("");
        txtPrec.setText("");
        txtCant.setText("");
        txtFech.setText("");
    }


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAñadir;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCompra;
    private javax.swing.JButton btnEgresos;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnFactura;
    private javax.swing.JButton btnIngresos;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnReporte;
    private javax.swing.JButton btnVenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtCant;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtFech;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtPrec;
    // End of variables declaration//GEN-END:variables
}

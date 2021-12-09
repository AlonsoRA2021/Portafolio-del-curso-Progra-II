package Gui;

import java.util.List;
import java.util.ArrayList;
import Entidades.Cliente;
import Entidades.Cajero;
import Entidades.Usuario;
import Enums.Accion;
import java.util.stream.Collectors;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import Servicios.Registro;

public class RegistroUsuarios extends javax.swing.JFrame {

    private Registro registro = new Registro();
    private boolean tabClientes = true;
    private Accion accionSeleccionada;
    
    public RegistroUsuarios() {
        initComponents();
    }
    public RegistroUsuarios(List<Usuario> usuarios){
        initComponents();
        registro.usuarios = usuarios;
        this.inicializarTabla(this.jTableClientes, registro.verClientes());
        this.inicializarTabla(this.jTableCajeros, registro.verCajeros());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelClientes = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableClientes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldIdCliente = new javax.swing.JTextField();
        jTextFieldNombreCliente = new javax.swing.JTextField();
        jTextFieldApellidoCliente = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCajeros = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldIdCajero = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldNombreCajero = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldApellidoCajero = new javax.swing.JTextField();
        jButtonAgregar = new javax.swing.JButton();
        jButtonActualizar = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelClientesMouseClicked(evt);
            }
        });

        jTableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableClientes.setShowHorizontalLines(false);
        jTableClientes.setShowVerticalLines(false);
        jTableClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableClientes);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Identificación");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Apellido");

        javax.swing.GroupLayout jPanelClientesLayout = new javax.swing.GroupLayout(jPanelClientes);
        jPanelClientes.setLayout(jPanelClientesLayout);
        jPanelClientesLayout.setHorizontalGroup(
            jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
                    .addGroup(jPanelClientesLayout.createSequentialGroup()
                        .addGroup(jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldIdCliente)
                            .addComponent(jTextFieldNombreCliente)
                            .addComponent(jTextFieldApellidoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelClientesLayout.setVerticalGroup(
            jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelClientesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelClientesLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldApellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelClientesLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel3)))
                .addGap(109, 109, 109))
        );

        jTabbedPane1.addTab("Clientes", jPanelClientes);

        jTableCajeros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableCajeros.setShowHorizontalLines(false);
        jTableCajeros.setShowVerticalLines(false);
        jScrollPane2.setViewportView(jTableCajeros);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Identificación");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Nombre");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Apellido");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldIdCajero)
                            .addComponent(jTextFieldNombreCajero)
                            .addComponent(jTextFieldApellidoCajero, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldIdCajero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextFieldNombreCajero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldApellidoCajero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel6)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cajeros", jPanel2);

        jButtonAgregar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonAgregar.setText("Agregar");
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });

        jButtonActualizar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonActualizar.setText("Actualizar");
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });

        jButtonBuscar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jButtonEliminar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jButtonGuardar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAgregar)
                        .addGap(28, 28, 28)
                        .addComponent(jButtonActualizar)
                        .addGap(27, 27, 27)
                        .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(jButtonActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonBuscar)
                    .addComponent(jButtonGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        this.tabClientes = this.jTabbedPane1.getSelectedIndex() < 1;
        this.accionSeleccionada = Accion.BUSCAR;
        this.jButtonActualizar.setEnabled(false);
        this.jButtonEliminar.setEnabled(false);
        this.jButtonBuscar.setEnabled(false);
        this.jButtonAgregar.setEnabled(false);
        this.jButtonGuardar.setEnabled(true);
        this.habilitarTodo();
        this.limpiarTodo();
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
        this.tabClientes = this.jTabbedPane1.getSelectedIndex() < 1;
        this.accionSeleccionada = Accion.AGREGAR;
        this.jButtonActualizar.setEnabled(false);
        this.jButtonEliminar.setEnabled(false);
        this.jButtonBuscar.setEnabled(false);
        this.jButtonAgregar.setEnabled(false);
        this.jButtonGuardar.setEnabled(true);
        this.habilitarTodo();
        this.limpiarTodo();
    }//GEN-LAST:event_jButtonAgregarActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        this.tabClientes = this.jTabbedPane1.getSelectedIndex() < 1;
        String id;
        String nombre;
        String apellido;
        if(this.tabClientes){
            id = this.jTextFieldIdCliente.getText();
            nombre = this.jTextFieldNombreCliente.getText();
            apellido = this.jTextFieldApellidoCliente.getText();
        }else{
            id = this.jTextFieldIdCajero.getText();
            nombre = this.jTextFieldNombreCajero.getText();
            apellido = this.jTextFieldApellidoCajero.getText();
        }
        switch(this.accionSeleccionada){
            case AGREGAR:
                if(this.tabClientes){
                    this.agregarCliente(id, nombre, apellido);
                }else{
                    this.agregarCajero(id, nombre, apellido);
                }
                break;
            case BUSCAR:
                break;
            case ELIMINAR:
                final Usuario usuarioEliminar = this.buscarUsuario(id, nombre, apellido);
                if(usuarioEliminar != null){
                    this.eliminar(usuarioEliminar);
                }
                break;
            default:
                break;
        }
        this.inicializarTabla(this.jTableClientes,
                registro.verClientes());
        this.inicializarTabla(this.jTableCajeros,
                registro.verCajeros());
        this.deshabilitarTodo();
        this.limpiarTodo();
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        this.tabClientes = this.jTabbedPane1.getSelectedIndex() < 1;
        this.accionSeleccionada = Accion.ACTUALIZAR;
        this.jButtonActualizar.setEnabled(false);
        this.jButtonEliminar.setEnabled(false);
        this.jButtonBuscar.setEnabled(false);
        this.jButtonAgregar.setEnabled(false);
        this.jButtonGuardar.setEnabled(true);
        this.habilitarActualizar();
    }//GEN-LAST:event_jButtonActualizarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        this.tabClientes = this.jTabbedPane1.getSelectedIndex() < 1;
        this.accionSeleccionada = Accion.ELIMINAR;
        this.jButtonActualizar.setEnabled(false);
        this.jButtonEliminar.setEnabled(false);
        this.jButtonBuscar.setEnabled(false);
        this.jButtonAgregar.setEnabled(false);
        this.jButtonGuardar.setEnabled(true);
        this.limpiarEliminar();
        this.habilitarEliminar();
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jTableClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClientesMouseClicked
        DefaultTableModel model = (DefaultTableModel) this.jTableClientes.getModel();
        final String id = (String)model.getValueAt(this.jTableClientes.getSelectedRow(), 0);
        final String nombre = (String)model.getValueAt(this.jTableClientes.getSelectedRow(), 1);
        final String apellido = (String)model.getValueAt(this.jTableClientes.getSelectedRow(), 2);
        this.jTextFieldIdCliente.setText(id);
        this.jTextFieldNombreCliente.setText(nombre);
        this.jTextFieldApellidoCliente.setText(apellido);
    }//GEN-LAST:event_jTableClientesMouseClicked

    private void jPanelClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelClientesMouseClicked
        this.tabClientes = true;
    }//GEN-LAST:event_jPanelClientesMouseClicked

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
            java.util.logging.Logger.getLogger(RegistroUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelClientes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableCajeros;
    private javax.swing.JTable jTableClientes;
    private javax.swing.JTextField jTextFieldApellidoCajero;
    private javax.swing.JTextField jTextFieldApellidoCliente;
    private javax.swing.JTextField jTextFieldIdCajero;
    private javax.swing.JTextField jTextFieldIdCliente;
    private javax.swing.JTextField jTextFieldNombreCajero;
    private javax.swing.JTextField jTextFieldNombreCliente;
    // End of variables declaration//GEN-END:variables
        private void inicializarTabla(final JTable tabla, List<Usuario> usuarios){
        DefaultTableModel modeloDefault = new DefaultTableModel();
        modeloDefault.addColumn("ID");
        modeloDefault.addColumn("Nombre");
        modeloDefault.addColumn("Apellido");
        tabla.setModel(modeloDefault);
        usuarios.forEach(usuario ->{
            modeloDefault.addRow(new Object[]{
                usuario.getIdentificacion(),
                usuario.getNombre(),
                usuario.getApellido()});
        });
    }
    private void actualizarTabla(final JTable tabla, Usuario usuario){
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo.addRow(new Object[]{
            usuario.getIdentificacion(),
            usuario.getNombre(),
            usuario.getApellido()
        });
    }
    private void agregarCliente(String id, String nombre, String apellido){
        Cliente cliente = new Cliente(id, nombre, apellido);
        registro.usuarios.add(cliente);
        this.actualizarTabla(this.jTableClientes, cliente);
    }
    private void agregarCajero(String id, String nombre, String apellido){
        Cajero cajero = new Cajero(id, nombre, apellido);
        registro.usuarios.add(cajero);
        this.actualizarTabla(this.jTableCajeros, cajero);
    }
    private void habilitar(final JTextField campo){
        campo.setEnabled(true);
    }
    private void deshabilitar(final JTextField campo){
        campo.setEnabled(false);
    }
    private void habilitarTodo(){
        if(this.tabClientes){
            this.habilitar(this.jTextFieldIdCliente);
            this.habilitar(this.jTextFieldNombreCliente);
            this.habilitar(this.jTextFieldApellidoCliente);
        }else{
            this.habilitar(this.jTextFieldIdCajero);
            this.habilitar(this.jTextFieldNombreCajero);
            this.habilitar(this.jTextFieldApellidoCajero);
        }
        this.jButtonGuardar.setEnabled(true);
    }
    private void deshabilitarTodo(){
        if(this.tabClientes){
            this.deshabilitar(this.jTextFieldIdCliente);
            this.deshabilitar(this.jTextFieldNombreCliente);
            this.deshabilitar(this.jTextFieldApellidoCliente);
        }else{
            this.deshabilitar(this.jTextFieldIdCajero);
            this.deshabilitar(this.jTextFieldNombreCajero);
            this.deshabilitar(this.jTextFieldApellidoCajero);
        }
        this.jButtonActualizar.setEnabled(true);
        this.jButtonEliminar.setEnabled(true);
        this.jButtonBuscar.setEnabled(true);
        this.jButtonAgregar.setEnabled(true);
        this.jButtonGuardar.setEnabled(false);
    }
    private void habilitarActualizar(){
        if(this.tabClientes){
            this.deshabilitar(this.jTextFieldIdCliente);
            this.habilitar(this.jTextFieldNombreCliente);
            this.habilitar(this.jTextFieldApellidoCliente);
        }else{
            this.deshabilitar(this.jTextFieldIdCajero);
            this.habilitar(this.jTextFieldNombreCajero);
            this.habilitar(this.jTextFieldApellidoCajero);
        }
        this.jButtonGuardar.setEnabled(true);
    }
    private void habilitarEliminar(){
        if(this.tabClientes){
            this.habilitar(this.jTextFieldIdCliente);
            this.deshabilitar(this.jTextFieldNombreCliente);
            this.deshabilitar(this.jTextFieldApellidoCliente);
        }else{
            this.habilitar(this.jTextFieldIdCajero);
            this.deshabilitar(this.jTextFieldNombreCajero);
            this.deshabilitar(this.jTextFieldApellidoCajero);
        }
        this.jButtonGuardar.setEnabled(true);
    }
    private Usuario buscarUsuario(String id, String nombre, String apellido){
        if(this.isNotEmpty(id) && this.isNotEmpty(nombre) && this.isNotEmpty(apellido)){
            return registro.usuarios
                    .stream()
                    .filter(u ->
                            u.getIdentificacion().equalsIgnoreCase(id) &&
                            u.getNombre().equalsIgnoreCase(nombre) &&
                            u.getApellido().equalsIgnoreCase(apellido))
                    .findFirst()
                    .orElse(null);
        }else if(this.isNotEmpty(id) && this.isNotEmpty(nombre)){
            return registro.usuarios
                    .stream()
                    .filter(u ->
                            u.getIdentificacion().equalsIgnoreCase(id) &&
                            u.getNombre().equalsIgnoreCase(nombre))
                    .findFirst()
                    .orElse(null);
        }else if(this.isNotEmpty(nombre) && this.isNotEmpty(apellido)){
            return registro.usuarios
                    .stream()
                    .filter(u ->
                            u.getIdentificacion().equalsIgnoreCase(apellido))
                    .findFirst()
                    .orElse(null);
        }else if(this.isNotEmpty(apellido)){
            return registro.usuarios
                    .stream()
                    .filter(u ->
                            u.getApellido().equalsIgnoreCase(apellido))
                    .findFirst()
                    .orElse(null);
        }else if(this.isNotEmpty(nombre)){
            return registro.usuarios
                    .stream()
                    .filter(u ->
                            u.getNombre().equalsIgnoreCase(nombre))
                    .findFirst()
                    .orElse(null);
        }
        return null;
    }
    private Usuario buscarUsuario(String id){
        return this.buscarUsuario(id, null, null);
    }
    private void actualizarUsuario(Usuario usuario){
        registro.modificar(usuario);
    }
    private void eliminar(Usuario usuarioEliminar){
        registro.eliminar(usuarioEliminar);
    }
    private void limpiarEliminar(){
        if(this.tabClientes){
            this.limpiar(this.jTextFieldNombreCliente);
            this.limpiar(this.jTextFieldApellidoCliente);
        }else{
            this.limpiar(this.jTextFieldNombreCajero);
            this.limpiar(this.jTextFieldApellidoCajero);
        }
    }
    private void limpiarTodo(){
        if(this.tabClientes){
            this.limpiar(this.jTextFieldIdCliente);
            this.limpiar(this.jTextFieldNombreCliente);
            this.limpiar(this.jTextFieldApellidoCliente);
        }else{
            this.limpiar(this.jTextFieldIdCajero);
            this.limpiar(this.jTextFieldNombreCajero);
            this.limpiar(this.jTextFieldApellidoCajero);
        }
    }
    private void limpiar(final JTextField campo){
        campo.setText("");
    }
    private boolean isEmpty(final String texto){
        return texto == null || texto.equals("");
    }
    private boolean isNotEmpty(final String texto){
        return !isEmpty(texto);
    }
}

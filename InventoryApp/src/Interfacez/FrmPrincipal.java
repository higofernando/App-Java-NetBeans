/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfacez;

import Clases.Datos;
import java.awt.Toolkit;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class FrmPrincipal extends javax.swing.JFrame {

     
     private int perfil;
     private String clave;
     private String usuario;
     private Datos misDatos;
     
        public void setDatos(Datos misDatos) {
            this.misDatos = misDatos;
        }
        
        public void setUsuario(String usuario) {
            this.usuario = usuario;
        }
        
        public void setClave(String clave) {
            this.clave = clave;
        }

        
        
        public void setPerfil(int perfil) {
            this.perfil = perfil;
        }
        
        
    
    public FrmPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/ImgFrmUsuarios/Icon.png")));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dpnEscritorio = new javax.swing.JDesktopPane();
        Wallpaper = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuArchivo = new javax.swing.JMenu();
        mnuArchivoClientes = new javax.swing.JMenuItem();
        mnuArchivoProductos = new javax.swing.JMenuItem();
        mnuArchivoUsuarios = new javax.swing.JMenuItem();
        jSeparator = new javax.swing.JPopupMenu.Separator();
        mnuArchivoCambioClave = new javax.swing.JMenuItem();
        mnuArchivoCambioUsuario = new javax.swing.JMenuItem();
        mnuArchivoSalir = new javax.swing.JMenuItem();
        mnuMovimientos = new javax.swing.JMenu();
        mnuMovimientosNuevaFactura = new javax.swing.JMenuItem();
        mnuAyuda = new javax.swing.JMenu();
        mnuAyudaAcerdaDe = new javax.swing.JMenuItem();
        mnuAyudaAyuda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Facturaci??n");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgFrmPrincipal/1366x768.png"))); // NOI18N
        dpnEscritorio.add(Wallpaper);
        Wallpaper.setBounds(0, 0, 1370, 740);

        getContentPane().add(dpnEscritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 740));

        mnuArchivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconsGenerales/018-tick mark 1.png"))); // NOI18N
        mnuArchivo.setText("Archivos");
        mnuArchivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        mnuArchivoClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconsGenerales/005-graphic designer 1.png"))); // NOI18N
        mnuArchivoClientes.setText("Clientes");
        mnuArchivoClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnuArchivoClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArchivoClientesActionPerformed(evt);
            }
        });
        mnuArchivo.add(mnuArchivoClientes);

        mnuArchivoProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconsGenerales/001-ruler and pencil 1.png"))); // NOI18N
        mnuArchivoProductos.setText("Productos");
        mnuArchivoProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnuArchivoProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArchivoProductosActionPerformed(evt);
            }
        });
        mnuArchivo.add(mnuArchivoProductos);

        mnuArchivoUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconsGenerales/022-text formatting 1_1.png"))); // NOI18N
        mnuArchivoUsuarios.setText("Usuarios");
        mnuArchivoUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnuArchivoUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArchivoUsuariosActionPerformed(evt);
            }
        });
        mnuArchivo.add(mnuArchivoUsuarios);
        mnuArchivo.add(jSeparator);

        mnuArchivoCambioClave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconsGenerales/041-text formatting 1.png"))); // NOI18N
        mnuArchivoCambioClave.setText("Cambio Clave");
        mnuArchivoCambioClave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnuArchivoCambioClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArchivoCambioClaveActionPerformed(evt);
            }
        });
        mnuArchivo.add(mnuArchivoCambioClave);

        mnuArchivoCambioUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconsGenerales/048-phone 1.png"))); // NOI18N
        mnuArchivoCambioUsuario.setText("Cambio de Usuario");
        mnuArchivoCambioUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnuArchivoCambioUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArchivoCambioUsuarioActionPerformed(evt);
            }
        });
        mnuArchivo.add(mnuArchivoCambioUsuario);

        mnuArchivoSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        mnuArchivoSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconsGenerales/014-drawing tablet 1.png"))); // NOI18N
        mnuArchivoSalir.setText("Salir");
        mnuArchivoSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnuArchivoSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArchivoSalirActionPerformed(evt);
            }
        });
        mnuArchivo.add(mnuArchivoSalir);

        jMenuBar1.add(mnuArchivo);

        mnuMovimientos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconsGenerales/021-computer 1.png"))); // NOI18N
        mnuMovimientos.setText("Movimientos");
        mnuMovimientos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        mnuMovimientosNuevaFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconsGenerales/034-divider 1.png"))); // NOI18N
        mnuMovimientosNuevaFactura.setText("Nueva Factura");
        mnuMovimientosNuevaFactura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnuMovimientosNuevaFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMovimientosNuevaFacturaActionPerformed(evt);
            }
        });
        mnuMovimientos.add(mnuMovimientosNuevaFactura);

        jMenuBar1.add(mnuMovimientos);

        mnuAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconsGenerales/032-notification 1.png"))); // NOI18N
        mnuAyuda.setText("Ayuda");
        mnuAyuda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        mnuAyudaAcerdaDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconsGenerales/020-font 1.png"))); // NOI18N
        mnuAyudaAcerdaDe.setText("Acerca de");
        mnuAyudaAcerdaDe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnuAyudaAcerdaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAyudaAcerdaDeActionPerformed(evt);
            }
        });
        mnuAyuda.add(mnuAyudaAcerdaDe);

        mnuAyudaAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconsGenerales/008-set square 1.png"))); // NOI18N
        mnuAyudaAyuda.setText("Ayuda");
        mnuAyudaAyuda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnuAyudaAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAyudaAyudaActionPerformed(evt);
            }
        });
        mnuAyuda.add(mnuAyudaAyuda);

        jMenuBar1.add(mnuAyuda);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuArchivoProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArchivoProductosActionPerformed
        
      FrmProductos misProductos = new FrmProductos();
        misProductos.setDatos(misDatos);
        dpnEscritorio.add(misProductos);
        misProductos.show();
        
    }//GEN-LAST:event_mnuArchivoProductosActionPerformed

    private void mnuArchivoUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArchivoUsuariosActionPerformed
        
        FrmUsuarios misUsuarios = new FrmUsuarios();
        misUsuarios.setDatos(misDatos);
        dpnEscritorio.add(misUsuarios);
        misUsuarios.show();
        
    }//GEN-LAST:event_mnuArchivoUsuariosActionPerformed

    private void mnuArchivoSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArchivoSalirActionPerformed
        misDatos.grabarTodo();
        System.exit(0);
    }//GEN-LAST:event_mnuArchivoSalirActionPerformed

    private void mnuArchivoClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArchivoClientesActionPerformed
        FrmClientes misClientes = new FrmClientes();
        misClientes.setDatos(misDatos);
        dpnEscritorio.add(misClientes);
        misClientes.show();
    }//GEN-LAST:event_mnuArchivoClientesActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        //Establecer permisos
        if (perfil == 2) { // Si es empleado, se eliman permisos
            mnuArchivoClientes.setEnabled(false);
            mnuArchivoProductos.setEnabled(true);
            mnuMovimientosNuevaFactura.setEnabled(true);
            mnuArchivoUsuarios.setEnabled(false);
            //mnuMovimientosReporteFacturas.setEnabled(false);
        }
        
    }//GEN-LAST:event_formWindowOpened

    private void mnuArchivoCambioUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArchivoCambioUsuarioActionPerformed
        this.setVisible(false);
        FrmLogin miLogin = new FrmLogin();
        miLogin.setDatos(misDatos);
        miLogin.setLocationRelativeTo(null);
        miLogin.setVisible(true);
    }//GEN-LAST:event_mnuArchivoCambioUsuarioActionPerformed

    private void mnuArchivoCambioClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArchivoCambioClaveActionPerformed
        FrmCambioClave miCambio = new FrmCambioClave(this, rootPaneCheckingEnabled);
        miCambio.setClave(clave);
        miCambio.setUsuario(usuario);
        miCambio.setDatos(misDatos);
        miCambio.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_mnuArchivoCambioClaveActionPerformed

    private void mnuAyudaAcerdaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAyudaAcerdaDeActionPerformed
        
        AcercaDe miAcerca = new AcercaDe(this, rootPaneCheckingEnabled);
        miAcerca.setLocationRelativeTo(null);
        miAcerca.setVisible(rootPaneCheckingEnabled);
        
    }//GEN-LAST:event_mnuAyudaAcerdaDeActionPerformed

    private void mnuMovimientosNuevaFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMovimientosNuevaFacturaActionPerformed
       
        FrmFactura miFactura = new FrmFactura();
        miFactura.setDatos(misDatos);
        dpnEscritorio.add(miFactura);
        miFactura.show();
        
    }//GEN-LAST:event_mnuMovimientosNuevaFacturaActionPerformed

    private void mnuAyudaAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAyudaAyudaActionPerformed
        Ayuda miAyuda = new Ayuda(this, rootPaneCheckingEnabled);
        miAyuda.setLocationRelativeTo(null);
        miAyuda.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_mnuAyudaAyudaActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Wallpaper;
    private javax.swing.JDesktopPane dpnEscritorio;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator;
    private javax.swing.JMenu mnuArchivo;
    private javax.swing.JMenuItem mnuArchivoCambioClave;
    private javax.swing.JMenuItem mnuArchivoCambioUsuario;
    private javax.swing.JMenuItem mnuArchivoClientes;
    private javax.swing.JMenuItem mnuArchivoProductos;
    private javax.swing.JMenuItem mnuArchivoSalir;
    private javax.swing.JMenuItem mnuArchivoUsuarios;
    private javax.swing.JMenu mnuAyuda;
    private javax.swing.JMenuItem mnuAyudaAcerdaDe;
    private javax.swing.JMenuItem mnuAyudaAyuda;
    private javax.swing.JMenu mnuMovimientos;
    private javax.swing.JMenuItem mnuMovimientosNuevaFactura;
    // End of variables declaration//GEN-END:variables
}

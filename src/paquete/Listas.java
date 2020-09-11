package paquete;

import java.awt.Image;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static paquete.Principal.base; //PARA IMPORTAR LA BASE DE DATOS

/**
 *
 * @author Juan Pablo
 */
public class Listas extends javax.swing.JFrame {

    private String info5;
    private String info6;
    private String info1;
    private String info2;

    public Listas() {
        initComponents();
        int cuantos = Principal.total;
        this.setVisible(false);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        setSize(724, 670);
        
        ImageIcon fondo = new ImageIcon("src/paquete/fondo.png");
        
        Icon icono = new ImageIcon(fondo.getImage().getScaledInstance(LabelFondo.getWidth(),
                LabelFondo.getHeight(), Image.SCALE_DEFAULT));
        
        LabelFondo.setIcon(icono);
        this.repaint();
        
        ImageIcon logo = new ImageIcon("src/paquete/icono.png");
        Icon icono_logo = new ImageIcon(logo.getImage().getScaledInstance(LabeLogo.getWidth(),
                LabeLogo.getHeight(), Image.SCALE_DEFAULT));
        LabeLogo.setIcon(icono_logo);
        this.repaint();
        
        verCantidad.setText("Actualmente viajan " + cuantos + " estudiantes en total");
    }
    
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("paquete/icono.png"));
        return retValue;
    }

    public Listas(String info5, String info6, String info1, String info2) {
        this.info5 = info5;
        this.info6 = info6;
        this.info1 = info1;
        this.info2 = info2;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        seis30 = new javax.swing.JButton();
        una30 = new javax.swing.JButton();
        dos30 = new javax.swing.JButton();
        atras = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Area = new javax.swing.JTextArea();
        cinco30 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        LabeLogo = new javax.swing.JLabel();
        verCantidad = new javax.swing.JLabel();
        LabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lista de Estudiantes");
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Selecciona la lista según la hora que deseas ver:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        seis30.setBackground(new java.awt.Color(255, 255, 255));
        seis30.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        seis30.setText("Lista 6:30 am");
        seis30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seis30ActionPerformed(evt);
            }
        });
        getContentPane().add(seis30, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 140, 60));

        una30.setBackground(new java.awt.Color(255, 255, 255));
        una30.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        una30.setText("Lista 1:30 pm");
        una30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                una30ActionPerformed(evt);
            }
        });
        getContentPane().add(una30, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 140, 60));

        dos30.setBackground(new java.awt.Color(255, 255, 255));
        dos30.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        dos30.setText("Lista 2:30 pm");
        dos30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dos30ActionPerformed(evt);
            }
        });
        getContentPane().add(dos30, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, 140, 60));

        atras.setBackground(new java.awt.Color(255, 255, 255));
        atras.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        atras.setText("Atras");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        getContentPane().add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 540, 130, 60));

        Area.setEditable(false);
        Area.setBackground(new java.awt.Color(204, 255, 255));
        Area.setColumns(20);
        Area.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Area.setRows(5);
        jScrollPane1.setViewportView(Area);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 610, 300));

        cinco30.setBackground(new java.awt.Color(255, 255, 255));
        cinco30.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cinco30.setText("Lista 5:30 am");
        cinco30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cinco30ActionPerformed(evt);
            }
        });
        getContentPane().add(cinco30, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 140, 60));

        jLabel3.setFont(new java.awt.Font("Bradley Hand ITC", 1, 48)); // NOI18N
        jLabel3.setText("Ruta 2020");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));
        getContentPane().add(LabeLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 60, 60));

        verCantidad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(verCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 560, 440, 30));
        getContentPane().add(LabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void seis30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seis30ActionPerformed

        String info6 = "";

        try {
            for (Estudiante student : base.queryForAll()) {
                int hora = student.getAmanecer();
                if (hora == 630) {
                    info6 += student.getCodigo() + " |  " + student.getNombre() + "  |  " + student.getBarrio()
                    + "  |  " + student.getAcudiente() + "  |\n\n";
                }
                if (hora == 0) {
                    JOptionPane.showMessageDialog(null, "No hay estudiantes que viajen a las 6:30 am");
                    return;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        Area.setText(info6);
    }//GEN-LAST:event_seis30ActionPerformed

    private void una30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_una30ActionPerformed

        String info1 = "";

        try {
            for (Estudiante student : base.queryForAll()) {
                int hora = student.getTarde();
                if (hora == 130) {
                    info1 += student.getCodigo() + " |  " + student.getNombre() + "  |  " + student.getBarrio()
                    + "  |  " + student.getAcudiente() + "  |\n\n";
                }
                if (hora == 0) {
                    JOptionPane.showMessageDialog(null, "No hay estudiantes que viajen a las 1:30 pm");
                    return;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        Area.setText(info1);
    }//GEN-LAST:event_una30ActionPerformed

    private void dos30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dos30ActionPerformed

        String info2 = "";

        try {
            for (Estudiante student : base.queryForAll()) {
                int hora = student.getTarde();
                if (hora == 230) {
                    info2 += student.getCodigo() + " |  " + student.getNombre() + "  |  " + student.getBarrio()
                    + "  |  " + student.getAcudiente() + "  |\n\n";
                }
                if (hora == 0) {
                    JOptionPane.showMessageDialog(null, "No hay estudiantes que viajen a las 2:30 pm");
                    return;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        Area.setText(info2);
    }//GEN-LAST:event_dos30ActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        hide(); //PARA ESCONDER LA VENTANA GUARDANDO LA INFO EN MEMORIA
        Principal inicio = new Principal();
        inicio.setVisible(true);
    }//GEN-LAST:event_atrasActionPerformed

    private void cinco30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cinco30ActionPerformed
        String info5 = "";

        try {
            for (Estudiante student : base.queryForAll()) { //.queryAll() para mostrar o recorrer toda la info en la base de datos
                int hora = student.getAmanecer();
                if (hora == 530) {
                    info5 += student.getCodigo() + " |  " + student.getNombre() + "  |  " + student.getBarrio()
                    + "  |  " + student.getAcudiente()+ "  |\n\n";
                }
                if (hora == 0) { //ACA NO PUEDO PONER UN ELSE PORQUE ME SALE EL MENSAJE COMO SI NO HUBIERA ESTUDIANTES A ESTA HORA
                    JOptionPane.showMessageDialog(null, "No hay estudiantes que viajen a las 5:30 am");
                    return;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        Area.setText(info5);
    }//GEN-LAST:event_cinco30ActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Listas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Listas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Listas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Listas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Listas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Area;
    private javax.swing.JLabel LabeLogo;
    private javax.swing.JLabel LabelFondo;
    private javax.swing.JButton atras;
    private javax.swing.JButton cinco30;
    private javax.swing.JButton dos30;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton seis30;
    private javax.swing.JButton una30;
    private javax.swing.JLabel verCantidad;
    // End of variables declaration//GEN-END:variables
}

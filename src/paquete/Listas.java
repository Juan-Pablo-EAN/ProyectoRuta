package paquete;

import java.awt.Image;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        this.setVisible(false);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
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

        jLabel1 = new javax.swing.JLabel();
        cinco30 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        seis30 = new javax.swing.JButton();
        una30 = new javax.swing.JButton();
        dos30 = new javax.swing.JButton();
        atras = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Area = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lista de Estudiantes");
        setIconImage(getIconImage());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Ruta 2020");

        cinco30.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cinco30.setText("Lista 5:30 am");
        cinco30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cinco30ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Selecciona la lista según la hora que deseas ver:");

        seis30.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        seis30.setText("Lista 6:30 am");
        seis30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seis30ActionPerformed(evt);
            }
        });

        una30.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        una30.setText("Lista 1:30 pm");
        una30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                una30ActionPerformed(evt);
            }
        });

        dos30.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        dos30.setText("Lista 2:30 pm");
        dos30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dos30ActionPerformed(evt);
            }
        });

        atras.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        atras.setText("Atras");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });

        Area.setEditable(false);
        Area.setColumns(20);
        Area.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Area.setRows(5);
        jScrollPane1.setViewportView(Area);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(206, 206, 206))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(atras))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cinco30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(seis30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(una30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dos30))
                            .addComponent(jScrollPane1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cinco30)
                    .addComponent(seis30)
                    .addComponent(una30)
                    .addComponent(dos30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(atras)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JButton atras;
    private javax.swing.JButton cinco30;
    private javax.swing.JButton dos30;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton seis30;
    private javax.swing.JButton una30;
    // End of variables declaration//GEN-END:variables
}

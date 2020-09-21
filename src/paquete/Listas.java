package paquete;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
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
    static int IDtabla;
    static boolean buscado = false;

    public Listas() {
        initComponents();
        int cuantos = Principal.total;
        this.setVisible(false);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        setSize(724, 686);

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
    public Image getIconImage() {
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
        cinco30 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        LabeLogo = new javax.swing.JLabel();
        verCantidad = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListaEstudiantes = new javax.swing.JTable();
        LabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lista de Estudiantes");
        setIconImage(getIconImage());
        setUndecorated(true);
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
        getContentPane().add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 600, 130, 60));

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
        getContentPane().add(verCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, 440, 30));

        ListaEstudiantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre", "Barrio", "Acudiente", "Teléfono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ListaEstudiantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListaEstudiantesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(ListaEstudiantes);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 690, 350));
        getContentPane().add(LabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void seis30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seis30ActionPerformed
        DefaultTableModel tabla = (DefaultTableModel) ListaEstudiantes.getModel();
        tabla.setRowCount(0);
        try {
            for (Estudiante list : base.queryForAll()) {
                if (list.getAmanecer() == 630) {
                    Object[] objeto = {list.getCodigo(), list.getNombre(), list.getBarrio(),
                        list.getAcudiente(), list.getCelular()};
                    tabla.addRow(objeto);
                }
            }
            if (tabla.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "No hay estudiantes registrados a las 6:30 am");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Listas.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_seis30ActionPerformed

    private void una30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_una30ActionPerformed
        DefaultTableModel tabla3 = (DefaultTableModel) ListaEstudiantes.getModel();//para definir el contenido de una tabla en la tabla ListaEstudiantes
        tabla3.setRowCount(0);//esto nos ayuda a poner la tabla en ceros antes de llenarla cada vez que se le de click
        try {
            for (Estudiante student : base.queryForAll()) {//para recorrer la base de datos
                if (student.getTarde() == 130) {//para descartar y encontrar lo que busco en la base
                    Object[] datos = {student.getCodigo(), student.getNombre(),//java me exige crear un objeto[]{} para añadirlo al JTable
                        student.getBarrio(), student.getAcudiente(), student.getCelular()};
                    tabla3.addRow(datos);//para agregar los datos del objeto[]{} a la tabla
                }
            }
            if (tabla3.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "No hay estudiantes registrados a las 1:30 pm");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Listas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_una30ActionPerformed

    private void dos30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dos30ActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) ListaEstudiantes.getModel();
        modelo.setRowCount(0);
        try {
            for (Estudiante e : base.queryForAll()) {
                if (e.getTarde() == 230) {
                    Object[] infoE = {e.getCodigo(), e.getNombre(), e.getBarrio(),
                        e.getAcudiente(), e.getCelular()};
                    modelo.addRow(infoE);
                }
            }
            if (modelo.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "No hay estudiantes registrados a las 2:30 pm");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Listas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dos30ActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        hide(); //PARA ESCONDER LA VENTANA GUARDANDO LA INFO EN MEMORIA
        Principal inicio = new Principal();
        inicio.setVisible(true);
    }//GEN-LAST:event_atrasActionPerformed

    private void cinco30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cinco30ActionPerformed
        DefaultTableModel tabla = (DefaultTableModel) ListaEstudiantes.getModel();
        tabla.setRowCount(0);
        try {
            for (Estudiante infos : base.queryForAll()) {
                if (infos.getAmanecer() == 530) {
                    Object[] filas = {infos.getCodigo(), infos.getNombre(), infos.getBarrio(),
                        infos.getAcudiente(), infos.getCelular()};
                    tabla.addRow(filas);
                }
            }
            if (tabla.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "No hay estudiantes registrados a las 5:30 am");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Listas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cinco30ActionPerformed

    private void ListaEstudiantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaEstudiantesMouseClicked
        //metodo MouseClicked para seleccionar las filas de la tabla
        int fila = ListaEstudiantes.rowAtPoint(evt.getPoint());//para saber que fila se esta seleccionando
        IDtabla = (int) ListaEstudiantes.getValueAt(fila, 0);//para conocer el valor que hay en la fila seleccionada y en la COLUMNA CERO
        int comparar = (int) ListaEstudiantes.getValueAt(fila, 0); 
        buscado = true;
        if (IDtabla == comparar) {//para que pueda seleccionar una fila con un solo click
            hide();                      //
            Busqueda b = new Busqueda(); //lo que quiero que pase cuando se selecciona una fila
            b.setVisible(true);          //
        } else {
            return; //por si acaso
        }

    }//GEN-LAST:event_ListaEstudiantesMouseClicked

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
    private javax.swing.JLabel LabeLogo;
    private javax.swing.JLabel LabelFondo;
    private javax.swing.JTable ListaEstudiantes;
    private javax.swing.JButton atras;
    private javax.swing.JButton cinco30;
    private javax.swing.JButton dos30;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton seis30;
    private javax.swing.JButton una30;
    private javax.swing.JLabel verCantidad;
    // End of variables declaration//GEN-END:variables
}

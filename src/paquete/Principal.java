package paquete;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan Pablo
 */
public class Principal extends javax.swing.JFrame {

    //para usar la base de datos
    static Dao<Estudiante, Integer> base;
    //Estudiante son los datos que se guardan en la tabla segun el identificador
    //Integer es el tipo de variable del identificador 
    
    static int total;
    private String name;
    private int code;
    private String parent;
    private long telphone;
    private String home;
    private int am;
    private int pm;

    public Principal() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        setSize(745, 518); //Es importante definir esto aca para que se acomode bien la IMAGEN DE FONDO

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
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("paquete/icono.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        registro = new javax.swing.JButton();
        buscar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        listas = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        barrio = new javax.swing.JTextField();
        cerrar = new javax.swing.JButton();
        estudiante = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        footer = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        acudiente = new javax.swing.JTextField();
        LabeLogo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        manana = new javax.swing.JComboBox<>();
        after = new javax.swing.JComboBox<>();
        phoneText = new javax.swing.JTextField();
        LabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ruta 2020");
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Telefono del acudiente:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, -1, 20));

        jLabel10.setText("pm");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, -1, 30));

        registro.setBackground(new java.awt.Color(255, 255, 255));
        registro.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        registro.setText("Registrar");
        registro.setBorder(null);
        registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroActionPerformed(evt);
            }
        });
        getContentPane().add(registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, 160, 50));

        buscar.setBackground(new java.awt.Color(255, 255, 255));
        buscar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        buscar.setText("Buscar");
        buscar.setBorder(null);
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        getContentPane().add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, 150, 50));

        eliminar.setBackground(new java.awt.Color(255, 255, 255));
        eliminar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        eliminar.setText("Eliminar");
        eliminar.setBorder(null);
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, 150, 50));

        jLabel1.setFont(new java.awt.Font("Bradley Hand ITC", 1, 48)); // NOI18N
        jLabel1.setText("Ruta 2020");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Barrio o dirección:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, -1, 20));

        listas.setBackground(new java.awt.Color(255, 255, 255));
        listas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        listas.setText("Ver listas");
        listas.setBorder(null);
        listas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listasActionPerformed(evt);
            }
        });
        getContentPane().add(listas, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, 150, 50));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Estudiante:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, 20));

        barrio.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(barrio, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 170, 30));

        cerrar.setBackground(new java.awt.Color(255, 255, 255));
        cerrar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cerrar.setText("Cerrar");
        cerrar.setBorder(null);
        cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarActionPerformed(evt);
            }
        });
        getContentPane().add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, 150, 50));

        estudiante.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(estudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 220, 30));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Horario mañana:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, -1, 20));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Código:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, 20));

        footer.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        footer.setText("Creado por Juan Pablo Ballesteros Obando ®");
        getContentPane().add(footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 490, 220, 22));

        codigo.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 85, 30));

        jLabel9.setText("am");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, -1, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Acudiente:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, 20));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Horario tarde:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, -1, 20));

        acudiente.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(acudiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 220, 30));
        getContentPane().add(LabeLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 60, 60));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setText("Acerca de");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, 150, 50));

        manana.setBackground(new java.awt.Color(204, 255, 255));
        manana.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5:30", "6:30", "Ninguno" }));
        manana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mananaActionPerformed(evt);
            }
        });
        getContentPane().add(manana, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 100, 30));

        after.setBackground(new java.awt.Color(204, 255, 255));
        after.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1:30", "2:30", "Ninguno" }));
        getContentPane().add(after, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 100, 30));

        phoneText.setBackground(new java.awt.Color(204, 255, 255));
        phoneText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneTextActionPerformed(evt);
            }
        });
        getContentPane().add(phoneText, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 140, 30));
        getContentPane().add(LabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroActionPerformed
        if (estudiante.getText() == "") {
            JOptionPane.showMessageDialog(null, "¡Debes llenar todos los espacios!");
        }
        try {
            name = estudiante.getText();
            code = Integer.parseInt(codigo.getText());
            parent = acudiente.getText();
            telphone = Long.parseLong(phoneText.getText());
            home = barrio.getText();
            String amanece = manana.getSelectedItem().toString();
            switch (amanece) {
                case "5:30":
                    am = 530;
                    break;
                case "6:30":
                    am = 630;
                    break;
                case "Ninguno":
                    am = 0;
                    break;
                default:
                    break;
            }
            String atardece = after.getSelectedItem().toString();
            switch (atardece) {
                case "1:30":
                    pm = 130;
                    break;
                case "2:30":
                    pm = 230;
                    break;
                case "Ninguno":
                    pm = 0;
                    break;
                default:
                    break;
            }

            for (Estudiante codes : base.queryForAll()) {
                if (code == codes.getCodigo()) {
                    JOptionPane.showMessageDialog(null, "¡Este estudiante ya está registrado!");
                }
            }

            Estudiante e = new Estudiante(name, code, parent, telphone, home, am, pm);
            //base.countOf() para contar cuantos hay en la base de datos
            base.create(e);//ESTO ES PARA AGRAGAR EL NUEVO ESTUDIANTE A LA BASE DE DATOS
            JOptionPane.showMessageDialog(null, "¡Nuevo estudiante registrado en la ruta!");
            estudiante.setText("");
            codigo.setText("");
            acudiente.setText("");
            phoneText.setText("");
            //long1.setText("");
            barrio.setText("");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error");
        } //EL TRY CATCH LO EXIGE EL base.create(e); POR SI SE GENERAN ERRORES
    }//GEN-LAST:event_registroActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        Busqueda buscar = new Busqueda();
        buscar.setVisible(true);
        hide();
    }//GEN-LAST:event_buscarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        ParaEliminar delete = new ParaEliminar();
        delete.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_eliminarActionPerformed

    private void listasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listasActionPerformed
        try {
            int cuantos = (int) base.countOf();
            total = cuantos;
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        hide();
        Listas mostrar = new Listas();
        mostrar.setVisible(true);
    }//GEN-LAST:event_listasActionPerformed

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        hide();
        Cerrar close = new Cerrar();
        close.setVisible(true);
    }//GEN-LAST:event_cerrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        hide();
        Acerca ver = new Acerca();
        ver.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void mananaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mananaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mananaActionPerformed

    private void phoneTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneTextActionPerformed

    public static void main(String args[]) throws SQLException {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        String nombreArchivo = "jdbc:h2:./nuevaLista";
        ConnectionSource conn = new JdbcConnectionSource(nombreArchivo);
        //estas dos lineas son las mismas de ArchivoEstidiante.class
        base = DaoManager.createDao(conn, Estudiante.class);
        //para usar la base en cualquier parte del programa

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabeLogo;
    private javax.swing.JLabel LabelFondo;
    private javax.swing.JTextField acudiente;
    private javax.swing.JComboBox<String> after;
    private javax.swing.JTextField barrio;
    private javax.swing.JButton buscar;
    private javax.swing.JButton cerrar;
    private javax.swing.JTextField codigo;
    private javax.swing.JButton eliminar;
    private javax.swing.JTextField estudiante;
    private javax.swing.JLabel footer;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton listas;
    private javax.swing.JComboBox<String> manana;
    private javax.swing.JTextField phoneText;
    private javax.swing.JButton registro;
    // End of variables declaration//GEN-END:variables
}

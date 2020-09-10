package paquete;

import java.awt.Image;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static paquete.Principal.base; //PARA IMPORTAR LA BASE DE DATOS

public class Busqueda extends javax.swing.JFrame {

    public Busqueda() {
        initComponents();
        this.setVisible(false);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }
    
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("paquete/icono.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buscaCodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Buscar = new javax.swing.JButton();
        Atras = new javax.swing.JButton();
        changeNombre = new javax.swing.JButton();
        changeCodigo = new javax.swing.JButton();
        changeAcud = new javax.swing.JButton();
        changeTel = new javax.swing.JButton();
        changeAM = new javax.swing.JButton();
        changePM = new javax.swing.JButton();
        changeBarr = new javax.swing.JButton();
        showNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        showCod = new javax.swing.JTextField();
        showAcu = new javax.swing.JTextField();
        showTel = new javax.swing.JTextField();
        showBarr = new javax.swing.JTextField();
        showAM = new javax.swing.JTextField();
        showPM = new javax.swing.JTextField();
        limpiar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Busqueda Ruta 2020");
        setIconImage(getIconImage());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Ruta 2020");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Escribe el código del estudiante:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Código:");

        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        Atras.setText("Volver al inicio");
        Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasActionPerformed(evt);
            }
        });

        changeNombre.setText("Cambiar nombre");
        changeNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        changeNombre.setEnabled(false);
        changeNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeNombreActionPerformed(evt);
            }
        });

        changeCodigo.setText("Cambiar código");
        changeCodigo.setEnabled(false);
        changeCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeCodigoActionPerformed(evt);
            }
        });

        changeAcud.setText("Cambiar acudiente");
        changeAcud.setEnabled(false);
        changeAcud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeAcudActionPerformed(evt);
            }
        });

        changeTel.setText("Cambiar teléfono");
        changeTel.setEnabled(false);
        changeTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeTelActionPerformed(evt);
            }
        });

        changeAM.setText("Cambiar horario AM");
        changeAM.setEnabled(false);
        changeAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeAMActionPerformed(evt);
            }
        });

        changePM.setText("Cambiar horario PM");
        changePM.setEnabled(false);
        changePM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePMActionPerformed(evt);
            }
        });

        changeBarr.setText("Cambiar Barrio");
        changeBarr.setEnabled(false);
        changeBarr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeBarrActionPerformed(evt);
            }
        });

        showNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showNombreActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre:");

        jLabel5.setText("Acudiente:");

        jLabel6.setText("Código:");

        jLabel7.setText("Teléfono:");

        jLabel8.setText("Barrio:");

        jLabel9.setText("Horario AM:");

        jLabel10.setText("Horario PM:");

        showCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showCodActionPerformed(evt);
            }
        });

        showAcu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showAcuActionPerformed(evt);
            }
        });

        showTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showTelActionPerformed(evt);
            }
        });

        showBarr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showBarrActionPerformed(evt);
            }
        });

        showAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showAMActionPerformed(evt);
            }
        });

        showPM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPMActionPerformed(evt);
            }
        });

        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel12.setText("Escribe el nuevo dato y oprime enter para cambiarlo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(buscaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Buscar))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel10))
                                        .addGap(24, 24, 24)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(showNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(showCod, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(showAcu, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(showTel, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(showBarr, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(showAM, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(showPM, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(limpiar, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(changeNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(changeCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(changeAcud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(changeTel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(changeBarr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(changeAM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(changePM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Atras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(Buscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(changeNombre)
                    .addComponent(showNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(changeCodigo)
                    .addComponent(jLabel6)
                    .addComponent(showCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(changeAcud)
                    .addComponent(jLabel5)
                    .addComponent(showAcu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(changeTel)
                    .addComponent(jLabel7)
                    .addComponent(showTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(changeBarr)
                    .addComponent(jLabel8)
                    .addComponent(showBarr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(changeAM)
                    .addComponent(jLabel9)
                    .addComponent(showAM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(changePM)
                    .addComponent(jLabel10)
                    .addComponent(showPM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Atras)
                    .addComponent(limpiar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasActionPerformed
        hide();
        Principal prin = new Principal();
        prin.setVisible(true);
    }//GEN-LAST:event_AtrasActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed

        int codigoB = Integer.parseInt(buscaCodigo.getText());

        String horario1 = "";
        String horario2 = "";
        boolean existe = false;
        try {
            for (Estudiante est : base.queryForAll()) {
                if (codigoB == est.getCodigo()) {
                    switch (est.getAmanecer()) {
                        case 530:
                            horario1 = "5:30 am";
                            existe = true;
                            break;
                        case 630:
                            horario1 = "6:30 am";
                            existe = true;
                            break;
                        default:
                            break;
                    }
                    switch (est.getTarde()) {
                        case 130:
                            horario2 = "1:30 pm";
                            existe = true;
                            break;
                        case 230:
                            horario2 = "2:30 pm";
                            existe = true;
                            break;
                        default:
                            break;
                    }
                    showNombre.setText(est.getNombre());
                    showCod.setText(String.valueOf(est.getCodigo()));
                    showAcu.setText(est.getAcudiente());
                    showTel.setText(String.valueOf(est.getTelefono()));
                    showBarr.setText(est.getBarrio());
                    showAM.setText(horario1);
                    showPM.setText(horario2);
                }
            }
            if (existe == false) {
                JOptionPane.showMessageDialog(null, "El estudiante con código " + buscaCodigo.getText() + " no esta registrado");
                return;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error");
        }

    }//GEN-LAST:event_BuscarActionPerformed

    private void modificaciones() {
        boolean pasa = false;
        try {
            String name1 = showNombre.getText();
            int code1 = Integer.parseInt(showCod.getText());
            String acud1 = showAcu.getText();
            long phone1 = Long.parseLong(showTel.getText());
            String home1 = showBarr.getText();
            String am1 = showAM.getText();
            String pm1 = showPM.getText();
            int am2 = 0;
            int pm2 = 0;
            switch (am1) {
                case "5:30 am":
                    am2 = 530;
                    break;
                case "6:30 am":
                    am2 = 630;
                    break;
                default:
                    break;
            }
            switch (pm1) {
                case "1:30 pm":
                    pm2 = 130;
                    break;
                case "2:30 pm":
                    pm2 = 230;
                    break;
                default:
                    break;
            }
            Estudiante e = new Estudiante(name1, code1, acud1, phone1, home1, am2, pm2);
            base.update(e);
            pasa = true;
        } catch (SQLException ex) {
            Logger.getLogger(Busqueda.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (pasa == true) {
            JOptionPane.showMessageDialog(null, "¡Datos cambiados exitosamente!");
        }
    }

    private void changeNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeNombreActionPerformed
        modificaciones();
        changeNombre.setEnabled(false);
    }//GEN-LAST:event_changeNombreActionPerformed

    private void changeCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeCodigoActionPerformed
        modificaciones();
        changeCodigo.setEnabled(false);
    }//GEN-LAST:event_changeCodigoActionPerformed

    private void changeAcudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeAcudActionPerformed
        modificaciones();
        changeAcud.setEnabled(false);
    }//GEN-LAST:event_changeAcudActionPerformed

    private void changeTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeTelActionPerformed
        modificaciones();
        changeTel.setEnabled(false);
    }//GEN-LAST:event_changeTelActionPerformed

    private void changeBarrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeBarrActionPerformed
        modificaciones();
        changeBarr.setEnabled(false);
    }//GEN-LAST:event_changeBarrActionPerformed

    private void changeAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeAMActionPerformed
        modificaciones();
        changeAM.setEnabled(false);
    }//GEN-LAST:event_changeAMActionPerformed

    private void changePMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePMActionPerformed
        modificaciones();
        changePM.setEnabled(false);
    }//GEN-LAST:event_changePMActionPerformed

    private void showCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showCodActionPerformed
        int codigoD = Integer.parseInt(buscaCodigo.getText());
        int code2 = Integer.parseInt(showCod.getText());
        try {
            Estudiante D = base.queryForId(codigoD);
            int code3 = D.getCodigo();
            if (code2 == code3) {
                changeCodigo.setEnabled(false);//PARA DESHABILITAR EL BOTON
            } else {
                changeCodigo.setEnabled(true);//PARA HABILITAR EL BOTON
            }
        } catch (SQLException ex) {
            Logger.getLogger(Busqueda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_showCodActionPerformed

    private void showNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showNombreActionPerformed
        int codigoD = Integer.parseInt(buscaCodigo.getText());
        String name2 = showNombre.getText();
        try {
            Estudiante D = base.queryForId(codigoD);
            String nameBD = D.getNombre();
            if (nameBD.equals(name2)) {
                changeNombre.setEnabled(false);//PARA DESHABILITAR EL BOTON DE changeNombre
            } else {
                changeNombre.setEnabled(true);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Busqueda.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_showNombreActionPerformed

    private void showAcuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showAcuActionPerformed
        int codigoD = Integer.parseInt(buscaCodigo.getText());
        String acud2 = showAcu.getText();
        try {
            Estudiante D = base.queryForId(codigoD);
            String acudBD = D.getAcudiente();
            if (acudBD.equals(acud2)) {
                changeAcud.setEnabled(false);
            } else {
                changeAcud.setEnabled(true);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Busqueda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_showAcuActionPerformed

    private void showTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showTelActionPerformed
        int codigoD = Integer.parseInt(buscaCodigo.getText());
        int tel2 = Integer.parseInt(showTel.getText());
        try {
            Estudiante D = base.queryForId(codigoD);
            long telBD = D.getTelefono();
            if (tel2 == telBD) {
                changeTel.setEnabled(false);
            } else {
                changeTel.setEnabled(true);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Busqueda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_showTelActionPerformed

    private void showBarrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showBarrActionPerformed
        int codigoD = Integer.parseInt(buscaCodigo.getText());
        String barrio2 = showBarr.getText();
        try {
            Estudiante D = base.queryForId(codigoD);
            String barrioBD = D.getBarrio();
            if (barrioBD.equals(barrio2)) {
                changeBarr.setEnabled(false);
            } else {
                changeBarr.setEnabled(true);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Busqueda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_showBarrActionPerformed

    private void showAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showAMActionPerformed
        int codigoD = Integer.parseInt(buscaCodigo.getText());
        String AM2 = showAM.getText();
        int AM3 = 0;
        switch (AM2) {
            case "5:30 am":
                AM3 = 530;
                break;
            case "6:30 am":
                AM3 = 630;
                break;
            default:
                break;
        }
        try {
            Estudiante D = base.queryForId(codigoD);
            int AMBD = D.getAmanecer();
            if (AM3 == AMBD) {
                changeAM.setEnabled(false);
            } else {
                changeAM.setEnabled(true);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Busqueda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_showAMActionPerformed

    private void showPMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPMActionPerformed
        int codigoD = Integer.parseInt(buscaCodigo.getText());
        String PM2 = showPM.getText();
        int PM3 = 0;
        switch (PM2) {
            case "1:30 pm":
                PM3 = 530;
                break;
            case "2:30 pm":
                PM3 = 630;
                break;
            default:
                break;
        }
        try {
            Estudiante D = base.queryForId(codigoD);
            int PMBD = D.getTarde();
            if (PM3 == PMBD) {
                changePM.setEnabled(false);
            } else {
                changePM.setEnabled(true);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Busqueda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_showPMActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        showNombre.setText("");
        showCod.setText("");
        showAcu.setText("");
        showTel.setText("");
        showBarr.setText("");
        showAM.setText("");
        showPM.setText("");
        buscaCodigo.setText("");
    }//GEN-LAST:event_limpiarActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Busqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Busqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Busqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Busqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Busqueda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atras;
    private javax.swing.JButton Buscar;
    private javax.swing.JTextField buscaCodigo;
    private javax.swing.JButton changeAM;
    private javax.swing.JButton changeAcud;
    private javax.swing.JButton changeBarr;
    private javax.swing.JButton changeCodigo;
    private javax.swing.JButton changeNombre;
    private javax.swing.JButton changePM;
    private javax.swing.JButton changeTel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton limpiar;
    private javax.swing.JTextField showAM;
    private javax.swing.JTextField showAcu;
    private javax.swing.JTextField showBarr;
    private javax.swing.JTextField showCod;
    private javax.swing.JTextField showNombre;
    private javax.swing.JTextField showPM;
    private javax.swing.JTextField showTel;
    // End of variables declaration//GEN-END:variables
}

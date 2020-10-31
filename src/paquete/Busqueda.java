package paquete;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static paquete.Principal.base; //PARA IMPORTAR LA BASE DE DATOS

public class Busqueda extends javax.swing.JFrame {

    static String horarioA;
    static String horarioP;
    private boolean hab = false;

    public Busqueda() {
        initComponents();
        this.setVisible(false);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        setSize(724, 603);
        volverLista.setVisible(false);

        showNombre.setEditable(false);
        showCod.setEditable(false);
        showAcu.setEditable(false);
        showTel.setEditable(false);
        showBarr.setEditable(false);
        showAM.setEditable(false);
        showPM.setEditable(false);

        if (Listas.buscado == true) {
            try {
                for (Estudiante e : base.queryForAll()) {
                    if (e.getCodigo() == Listas.IDtabla) {
                        buscaCodigo.setText(String.valueOf(e.getCodigo()));
                        showNombre.setText(e.getNombre());
                        showCod.setText(String.valueOf(e.getCodigo()));
                        showAcu.setText(e.getAcudiente());
                        showTel.setText(String.valueOf(e.getCelular()));
                        showBarr.setText(e.getBarrio());
                        horarios(e.getAmanecer(), e.getTarde());
                        showAM.setText(String.valueOf(horarioA));
                        showPM.setText(String.valueOf(horarioP));
                        showNombre.setEditable(true);
                        showAcu.setEditable(true);
                        showTel.setEditable(true);
                        showBarr.setEditable(true);
                        showAM.setEditable(true);
                        showPM.setEditable(true);
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(Busqueda.class.getName()).log(Level.SEVERE, null, ex);
            }
            volverLista.setVisible(true);
        }

        shemaNom();
        shemaAcu();
        shemaTel();
        shemaBarr();
        shemaAM();
        shemaPM();
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("paquete/icono.png"));
        return retValue;
    }

    private void horarios(int amanecer, int atardecer) {
        switch (amanecer) {
            case 530:
                horarioA = "5:30 am";
                break;
            case 630:
                horarioA = "6:30 am";
                break;
            case 0:
                horarioA = "Ninguno";
                break;
            default:
                break;
        }
        switch (atardecer) {
            case 130:
                horarioP = "1:30 pm";
                break;
            case 230:
                horarioP = "2:30 pm";
                break;
            case 0:
                horarioP = "Ninguno";
                break;
            default:
                break;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        changeTel = new javax.swing.JButton();
        changeAM = new javax.swing.JButton();
        changePM = new javax.swing.JButton();
        buscaCodigo = new javax.swing.JTextField();
        changeBarr = new javax.swing.JButton();
        showNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Buscar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Atras = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        changeNombre = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        changeAcud = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        showCod = new javax.swing.JTextField();
        showAcu = new javax.swing.JTextField();
        showTel = new javax.swing.JTextField();
        showBarr = new javax.swing.JTextField();
        showAM = new javax.swing.JTextField();
        showPM = new javax.swing.JTextField();
        limpiar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        LabeLogo = new javax.swing.JLabel();
        volverLista = new javax.swing.JButton();
        LabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Busqueda Ruta 2020");
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        changeTel.setBackground(new java.awt.Color(255, 255, 255));
        changeTel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        changeTel.setText("Cambiar teléfono");
        changeTel.setEnabled(false);
        changeTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeTelActionPerformed(evt);
            }
        });
        getContentPane().add(changeTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, 170, -1));

        changeAM.setBackground(new java.awt.Color(255, 255, 255));
        changeAM.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        changeAM.setText("Cambiar horario AM");
        changeAM.setEnabled(false);
        changeAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeAMActionPerformed(evt);
            }
        });
        getContentPane().add(changeAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 430, -1, -1));

        changePM.setBackground(new java.awt.Color(255, 255, 255));
        changePM.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        changePM.setText("Cambiar horario PM");
        changePM.setEnabled(false);
        changePM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePMActionPerformed(evt);
            }
        });
        getContentPane().add(changePM, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 470, -1, -1));

        buscaCodigo.setBackground(new java.awt.Color(204, 255, 255));
        buscaCodigo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        buscaCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaCodigoActionPerformed(evt);
            }
        });
        getContentPane().add(buscaCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 80, -1));

        changeBarr.setBackground(new java.awt.Color(255, 255, 255));
        changeBarr.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        changeBarr.setText("Cambiar barrio");
        changeBarr.setEnabled(false);
        changeBarr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeBarrActionPerformed(evt);
            }
        });
        getContentPane().add(changeBarr, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 390, 170, -1));

        showNombre.setBackground(new java.awt.Color(204, 255, 255));
        showNombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        showNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showNombreActionPerformed(evt);
            }
        });
        getContentPane().add(showNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 220, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Escribe el código del estudiante:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Nombre:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, -1, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Código:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, 30));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Acudiente:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, -1, 30));

        Buscar.setBackground(new java.awt.Color(255, 255, 255));
        Buscar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });
        getContentPane().add(Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Código:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, -1, 30));

        Atras.setBackground(new java.awt.Color(255, 255, 255));
        Atras.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Atras.setText("Volver al inicio");
        Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasActionPerformed(evt);
            }
        });
        getContentPane().add(Atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 520, 170, 50));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Teléfono:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, -1, 30));

        changeNombre.setBackground(new java.awt.Color(255, 255, 255));
        changeNombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        changeNombre.setText("Cambiar nombre");
        changeNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        changeNombre.setEnabled(false);
        changeNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeNombreActionPerformed(evt);
            }
        });
        getContentPane().add(changeNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 170, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Barrio:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, -1, 30));

        changeAcud.setBackground(new java.awt.Color(255, 255, 255));
        changeAcud.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        changeAcud.setText("Cambiar acudiente");
        changeAcud.setEnabled(false);
        changeAcud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeAcudActionPerformed(evt);
            }
        });
        getContentPane().add(changeAcud, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, 170, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("Horario AM:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, -1, 30));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("Horario PM:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, -1, 30));

        showCod.setEditable(false);
        showCod.setBackground(new java.awt.Color(204, 255, 255));
        showCod.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        showCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showCodActionPerformed(evt);
            }
        });
        getContentPane().add(showCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 220, -1));

        showAcu.setBackground(new java.awt.Color(204, 255, 255));
        showAcu.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        showAcu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showAcuActionPerformed(evt);
            }
        });
        getContentPane().add(showAcu, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 220, -1));

        showTel.setBackground(new java.awt.Color(204, 255, 255));
        showTel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        showTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showTelActionPerformed(evt);
            }
        });
        getContentPane().add(showTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 220, -1));

        showBarr.setBackground(new java.awt.Color(204, 255, 255));
        showBarr.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        showBarr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showBarrActionPerformed(evt);
            }
        });
        getContentPane().add(showBarr, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 220, -1));

        showAM.setBackground(new java.awt.Color(204, 255, 255));
        showAM.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        showAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showAMActionPerformed(evt);
            }
        });
        getContentPane().add(showAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, 220, -1));

        showPM.setBackground(new java.awt.Color(204, 255, 255));
        showPM.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        showPM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPMActionPerformed(evt);
            }
        });
        getContentPane().add(showPM, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 470, 220, -1));

        limpiar.setBackground(new java.awt.Color(255, 255, 255));
        limpiar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });
        getContentPane().add(limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 520, 120, 50));

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel12.setText("Escribe el nuevo dato y oprime enter para cambiarlo");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, -1));

        jLabel1.setFont(new java.awt.Font("Bradley Hand ITC", 1, 48)); // NOI18N
        jLabel1.setText("Ruta 2020");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, -1, -1));
        getContentPane().add(LabeLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 60, 60));

        volverLista.setBackground(new java.awt.Color(255, 255, 255));
        volverLista.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        volverLista.setText("Volver a listas");
        volverLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverListaActionPerformed(evt);
            }
        });
        getContentPane().add(volverLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 520, 140, 50));

        LabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paquete/fondo.png"))); // NOI18N
        getContentPane().add(LabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void changeTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeTelActionPerformed
        modificaciones();
        changeTel.setEnabled(false);
    }//GEN-LAST:event_changeTelActionPerformed

    private void changeAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeAMActionPerformed
        modificaciones();
        changeAM.setEnabled(false);
    }//GEN-LAST:event_changeAMActionPerformed

    private void changePMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePMActionPerformed
        modificaciones();
        changePM.setEnabled(false);
    }//GEN-LAST:event_changePMActionPerformed

    private void changeBarrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeBarrActionPerformed
        modificaciones();
        changeBarr.setEnabled(false);
    }//GEN-LAST:event_changeBarrActionPerformed

    private void showNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showNombreActionPerformed
        if (hab == true) {
            modificaciones();
            changeNombre.setEnabled(false);
        }
    }//GEN-LAST:event_showNombreActionPerformed

    public void busqueda() {
        if (!buscaCodigo.getText().equals("")) {
            int codigoB = 0;
            boolean letra = false;
            try {
                codigoB = Integer.parseInt(buscaCodigo.getText());
            } catch (Exception e) {
                System.out.println(e);
                JOptionPane.showMessageDialog(null, "No puedes escribir simbolos o letras en este espacio");
                letra = true;
            }
            boolean existe = false;
            try {
                for (Estudiante est : base.queryForAll()) {
                    horarios(est.getAmanecer(), est.getTarde()); //metodo para mostrar bien los horarios en pantalla
                    if (codigoB == est.getCodigo()) {
                        existe = true;
                        showNombre.setText(est.getNombre());
                        showCod.setText(String.valueOf(est.getCodigo()));
                        showAcu.setText(est.getAcudiente());
                        showTel.setText(String.valueOf(est.getCelular()));
                        showBarr.setText(est.getBarrio());
                        showAM.setText(horarioA);
                        showPM.setText(horarioP);
                        showNombre.setEditable(true);
                        showAcu.setEditable(true);
                        showTel.setEditable(true);
                        showBarr.setEditable(true);
                        showAM.setEditable(true);
                        showPM.setEditable(true);
                    }
                }
                if (existe == false && letra == false) {
                    JOptionPane.showMessageDialog(null, "El estudiante con código " + buscaCodigo.getText() + " no esta registrado");
                    return;
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Ocurrio un error");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingresa un número para buscar");
        }
    }

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        busqueda();
    }//GEN-LAST:event_BuscarActionPerformed

    private void AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasActionPerformed
        Listas.buscado = false;
        hide();
        Principal prin = new Principal();
        prin.setVisible(true);
    }//GEN-LAST:event_AtrasActionPerformed

    public void shemaNom() {
        KeyListener accion = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
            }

            @Override
            public void keyPressed(KeyEvent ke) {
            }

            @Override
            public void keyReleased(KeyEvent ke) {
                if (!buscaCodigo.getText().equals("")) {
                    try {
                        Estudiante et = base.queryForId(Integer.parseInt(buscaCodigo.getText()));
                        if (et.getNombre().equals(showNombre.getText())) {
                            changeNombre.setEnabled(false);
                            hab = false;
                        } else if (showNombre.getText().equals("")) {
                            changeNombre.setEnabled(false);
                            hab = false;
                        } else {
                            changeNombre.setEnabled(true);
                            hab = true;
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(Busqueda.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        };

        showNombre.addKeyListener(accion);
    }

    public void shemaAcu() {

        KeyListener accion2 = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
            }

            @Override
            public void keyPressed(KeyEvent ke) {
            }

            @Override
            public void keyReleased(KeyEvent ke) {
                if (!buscaCodigo.getText().equals("")) {
                    try {
                        Estudiante et = base.queryForId(Integer.parseInt(buscaCodigo.getText()));
                        if (et.getAcudiente().equals(showAcu.getText())) {
                            changeAcud.setEnabled(false);
                            hab = false;
                        } else if (showAcu.getText().equals("")) {
                            changeAcud.setEnabled(false);
                            hab = false;
                        } else {
                            changeAcud.setEnabled(true);
                            hab = true;
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(Busqueda.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        };

        showAcu.addKeyListener(accion2);
    }

    public void shemaTel() {
        KeyListener accion3 = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            public void keyPressed(KeyEvent e) {
            }

            public void keyReleased(KeyEvent e) {
                if (!buscaCodigo.getText().equals("")) {
                    try {
                        Estudiante et = base.queryForId(Integer.parseInt(buscaCodigo.getText()));
                        if (showTel.getText().equals("")) {
                            changeTel.setEnabled(false);
                            hab = false;
                        } else {
                            changeTel.setEnabled(true);
                            hab = true;
                        }
                        try {
                            if (et.getCelular() == Long.parseLong(showTel.getText().trim())) {
                                changeTel.setEnabled(false);
                                hab = false;
                            }
                        } catch (Exception exc) {
                            JOptionPane.showMessageDialog(null, "No puedes escribir letras en este espacio");
                        }

                    } catch (SQLException ex) {
                        Logger.getLogger(Busqueda.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        };
        showTel.addKeyListener(accion3);
    }

    public void shemaBarr() {
        KeyListener accion4 = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if (!buscaCodigo.getText().equals("")) {
                    try {
                        Estudiante et = base.queryForId(Integer.parseInt(buscaCodigo.getText()));
                        if (et.getBarrio().equals(showBarr.getText())) {
                            changeBarr.setEnabled(false);
                            hab = false;
                        } else if (showBarr.getText().equals("")) {
                            changeBarr.setEnabled(false);
                            hab = false;
                        } else {
                            changeBarr.setEnabled(true);
                            hab = true;
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(Busqueda.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        };
        showBarr.addKeyListener(accion4);
    }

    public void shemaAM() {
        KeyListener accion5 = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if (!buscaCodigo.getText().equals("")) {
                    try {
                        Estudiante et = base.queryForId(Integer.parseInt(buscaCodigo.getText()));
                        String verAm = showAM.getText();
                        int verAm2 = 0;
                        switch (verAm) {
                            case "5:30 am":
                                verAm2 = 530;
                                break;
                            case "6:30 am":
                                verAm2 = 630;
                                break;
                            case "Ninguno":
                                verAm2 = 0;
                                break;
                            default:
                                break;
                        }
                        if (et.getAmanecer() == verAm2) {
                            changeAM.setEnabled(false);
                            hab = false;
                        } else if (showAM.getText().equals("")) {
                            changeAM.setEnabled(false);
                            hab = false;
                        } else {
                            changeAM.setEnabled(true);
                            hab = true;
                        }

                        //para corregir lo del escuchar a "ninguno"
                        if (et.getAmanecer() == 0 && showAM.getText().equals("Ninguno")) {
                            changeAM.setEnabled(false);
                            hab = false;
                        } else {
                            changeAM.setEnabled(true);
                            hab = true;
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(Busqueda.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        };
        showAM.addKeyListener(accion5);
    }

    public void shemaPM() {
        KeyListener accion6 = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if (!buscaCodigo.getText().equals("")) {
                    try {
                        Estudiante et = base.queryForId(Integer.parseInt(buscaCodigo.getText()));
                        String verPm = showPM.getText();
                        int verPm2 = 0;
                        switch (verPm) {
                            case "1:30 pm":
                                verPm2 = 130;
                                break;
                            case "2:30 pm":
                                verPm2 = 230;
                                break;
                            case "Ninguno":
                                verPm2 = 0;
                                break;
                            default:
                                break;
                        }
                        if (et.getTarde() == verPm2) {
                            changePM.setEnabled(false);
                            hab = false;
                        } else if (showPM.getText().equals("")) {
                            changePM.setEnabled(false);
                            hab = false;
                        } else {
                            changePM.setEnabled(true);
                            hab = true;
                        }

                        //para corregir lo del escuchar a "ninguno"
                        if (et.getTarde() == 0 && showPM.getText().equals("Ninguno")) {
                            changePM.setEnabled(false);
                            hab = false;
                        } else {
                            changePM.setEnabled(true);
                            hab = true;
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(Busqueda.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        };
        showPM.addKeyListener(accion6);
    }

    private void changeNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeNombreActionPerformed
        modificaciones();
        changeNombre.setEnabled(false);
    }//GEN-LAST:event_changeNombreActionPerformed

    private void changeAcudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeAcudActionPerformed
        modificaciones();
        changeAcud.setEnabled(false);
    }//GEN-LAST:event_changeAcudActionPerformed

    private void showCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showCodActionPerformed

    }//GEN-LAST:event_showCodActionPerformed

    private void showAcuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showAcuActionPerformed
        if (hab == true) {
            modificaciones();
            changeAcud.setEnabled(false);
        }
    }//GEN-LAST:event_showAcuActionPerformed

    private void showTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showTelActionPerformed
        if (hab == true) {
            modificaciones();
            changeTel.setEnabled(false);
        }
    }//GEN-LAST:event_showTelActionPerformed

    private void showBarrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showBarrActionPerformed
        if (hab == true) {
            modificaciones();
            changeBarr.setEnabled(false);
        }
    }//GEN-LAST:event_showBarrActionPerformed

    private void showAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showAMActionPerformed
        if (hab == true) {
            modificaciones();
            changeAM.setEnabled(false);
        }
    }//GEN-LAST:event_showAMActionPerformed

    private void showPMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPMActionPerformed
        if (hab == true) {
            modificaciones();
            changePM.setEnabled(false);
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
        showNombre.setEditable(false);
        showAcu.setEditable(false);
        showTel.setEditable(false);
        showBarr.setEditable(false);
        showAM.setEditable(false);
        showPM.setEditable(false);

    }//GEN-LAST:event_limpiarActionPerformed

    private void volverListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverListaActionPerformed
        showNombre.setText("");
        showCod.setText("");
        showAcu.setText("");
        showTel.setText("");
        showBarr.setText("");
        showAM.setText("");
        showPM.setText("");
        buscaCodigo.setText("");
        Listas.IDtabla = 0;
        Listas.buscado = false;
        hide();
        Listas li = new Listas();
        li.setVisible(true);
    }//GEN-LAST:event_volverListaActionPerformed

    private void buscaCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaCodigoActionPerformed
        busqueda();
    }//GEN-LAST:event_buscaCodigoActionPerformed

    private void modificaciones() {
        boolean pasa = false;
        boolean pasa2 = false;
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
            Date date = null;
            String sitio = "";
            switch (am1) {
                case "5:30 am":
                    am2 = 530;
                    pasa = true;
                    break;
                case "6:30 am":
                    am2 = 630;
                    pasa = true;
                    break;
                case "Ninguno":
                    am2 = 0;
                    pasa = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Solamente hay horarios de 5:30 y 6:30 am");
                    pasa = false;
                    break;
            }
            switch (pm1) {
                case "1:30 pm":
                    pm2 = 130;
                    pasa2 = true;
                    break;
                case "2:30 pm":
                    pm2 = 230;
                    pasa2 = true;
                    break;
                case "Ninguno":
                    pm2 = 0;
                    pasa2 = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Solamente hay horarios de 1:30 y 2:30 pm");
                    pasa2 = false;
                    break;
            }
            if (pasa == true && pasa2 == true) {
                Estudiante etd = base.queryForId(Integer.parseInt(showCod.getText()));
                date = etd.getFecha();
                sitio = etd.getLugar();

                Estudiante e = new Estudiante(name1, code1, acud1, phone1, home1, am2, pm2, date, sitio);
                base.update(e);
                JOptionPane.showMessageDialog(null, "¡Datos cambiados exitosamente!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "¡Ocurrió un error!\n"
                    + "Vuelve a intentarlo");
        }

    }

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
    private javax.swing.JLabel LabeLogo;
    private javax.swing.JLabel LabelFondo;
    private javax.swing.JTextField buscaCodigo;
    private javax.swing.JButton changeAM;
    private javax.swing.JButton changeAcud;
    private javax.swing.JButton changeBarr;
    private javax.swing.JButton changeNombre;
    private javax.swing.JButton changePM;
    private javax.swing.JButton changeTel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JButton volverLista;
    // End of variables declaration//GEN-END:variables
}

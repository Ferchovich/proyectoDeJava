/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package formularios;

import clases.Evento;
import clases.QR;
import com.google.zxing.WriterException;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import TimeClass.TimePicker;
/**
 * 
 * 
 *
 * @author octavio
 */
public class frmEvento extends javax.swing.JFrame {
    private QR generadorQR;
    private String nombreDeUsuario;
    
    private TimePicker timePicker1;
    private TimePicker timePicker2;
    /**
     * Creates new form frmEvento
     * @param nombreDeUsuario
     */
    public frmEvento(String nombreDeUsuario) {
        initComponents();
        this.nombreDeUsuario = nombreDeUsuario;
        timePicker1 = new TimePicker();
        timePicker1.setDisplayText(txtTime1);
        
        timePicker2 = new TimePicker();
        timePicker2.setDisplayText(txtTime2);
        
    }

    private frmEvento() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombreEvento = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmbRequisitos = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        btnCrear = new javax.swing.JButton();
        txtDireccion = new javax.swing.JTextField();
        txtCapacidad = new javax.swing.JTextField();
        btnHoraDeInicio = new javax.swing.JButton();
        txtTime1 = new javax.swing.JTextField();
        btnHoraDeCierre = new javax.swing.JButton();
        txtTime2 = new javax.swing.JTextField();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(31, 52, 75));

        jLabel1.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 24)); // NOI18N
        jLabel1.setText("Eventos");

        jLabel2.setFont(new java.awt.Font("Mongolian Baiti", 2, 16)); // NOI18N
        jLabel2.setText("Nombre de evento");

        jLabel3.setFont(new java.awt.Font("Mongolian Baiti", 2, 16)); // NOI18N
        jLabel3.setText("Direccion del evento");

        jLabel4.setFont(new java.awt.Font("Mongolian Baiti", 2, 16)); // NOI18N
        jLabel4.setText("Fecha del evento");

        txtNombreEvento.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        txtNombreEvento.setNextFocusableComponent(txtFecha);

        txtFecha.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        txtFecha.setNextFocusableComponent(txtDireccion);
        txtFecha.setOpaque(true);

        jLabel5.setFont(new java.awt.Font("Mongolian Baiti", 2, 16)); // NOI18N
        jLabel5.setText("Capacidad del evento");

        jLabel6.setFont(new java.awt.Font("Mongolian Baiti", 2, 16)); // NOI18N
        jLabel6.setText("Requisitos del evento");

        cmbRequisitos.setFont(new java.awt.Font("Mongolian Baiti", 2, 18)); // NOI18N
        cmbRequisitos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+18 DNI FISICO", "+16 DNI FISICO", "-18 DNI FISICO", "-16 DNI FISICO", " " }));
        cmbRequisitos.setNextFocusableComponent(btnBuscar);

        btnBuscar.setFont(new java.awt.Font("Mongolian Baiti", 2, 14)); // NOI18N
        btnBuscar.setText("BUSCAR EVENTO");
        btnBuscar.setNextFocusableComponent(btnCrear);

        btnCrear.setFont(new java.awt.Font("Mongolian Baiti", 2, 14)); // NOI18N
        btnCrear.setText("CREAR EVENTO");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        txtDireccion.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N

        txtCapacidad.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        txtCapacidad.setNextFocusableComponent(txtFecha);

        btnHoraDeInicio.setFont(new java.awt.Font("Mongolian Baiti", 2, 14)); // NOI18N
        btnHoraDeInicio.setText("Hora de Inicio");
        btnHoraDeInicio.setNextFocusableComponent(btnCrear);
        btnHoraDeInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHoraDeInicioActionPerformed(evt);
            }
        });

        txtTime1.setEditable(false);

        btnHoraDeCierre.setFont(new java.awt.Font("Mongolian Baiti", 2, 14)); // NOI18N
        btnHoraDeCierre.setText("Hora de Cierre");
        btnHoraDeCierre.setNextFocusableComponent(btnCrear);
        btnHoraDeCierre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHoraDeCierreActionPerformed(evt);
            }
        });

        txtTime2.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(167, 167, 167))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDireccion)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtFecha)
                            .addComponent(txtNombreEvento)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(txtTime1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(txtTime2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnBuscar)))
                        .addGap(50, 50, 50))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(cmbRequisitos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnHoraDeInicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHoraDeCierre)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNombreEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)))
                .addComponent(jLabel4)
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cmbRequisitos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrear)
                    .addComponent(txtTime1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTime2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHoraDeInicio)
                    .addComponent(btnHoraDeCierre))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        
        String nombreEvento = txtNombreEvento.getText();
        String fecha = txtFecha.getText();
        String direccion = txtDireccion.getText();
        String requisitos = String.valueOf(cmbRequisitos.getSelectedItem());
        String horaInicio = txtTime1.getText();
        String horaCierre = txtTime2.getText();
        if (!(nombreEvento.equals("") || fecha.equals("") || direccion.equals("") || requisitos.equals("")) || (horaInicio.equals(horaCierre))){
            try {
                int capacidad = Integer.parseInt(txtCapacidad.getText());
                Evento evento = new Evento(nombreEvento, fecha, direccion, requisitos, horaInicio, horaCierre, capacidad);
                generadorQR = new QR();
                BufferedImage imagen = generadorQR.crearQR(evento.invitacion(nombreDeUsuario));
                ImageIcon icono = new ImageIcon(imagen);
                JOptionPane.showMessageDialog(this, "Invitacion creada correctamente", "Evento", JOptionPane.PLAIN_MESSAGE, icono);
            } catch (NumberFormatException ex){
                JOptionPane.showConfirmDialog(this, "Error al ingresar los datos", "Error al crear el evento", JOptionPane.ERROR_MESSAGE);
            } catch (WriterException ex) {
                JOptionPane.showMessageDialog(this, "Error al crear el codigo QR", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        else {
            JOptionPane.showMessageDialog(this, "Tiene que rellenar todos los formularios", "Error",  JOptionPane.WARNING_MESSAGE);
        }
 
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnHoraDeInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHoraDeInicioActionPerformed
        timePicker1.showPopup(this, (getWidth() - timePicker1.getPreferredSize().width) / 2, (getHeight() - timePicker1.getPreferredSize().height) / 2);
    }//GEN-LAST:event_btnHoraDeInicioActionPerformed

    private void btnHoraDeCierreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHoraDeCierreActionPerformed
        timePicker2.showPopup(this, (getWidth() - timePicker2.getPreferredSize().width) / 2, (getHeight() - timePicker2.getPreferredSize().height) / 2);
    }//GEN-LAST:event_btnHoraDeCierreActionPerformed

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
            java.util.logging.Logger.getLogger(frmEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmEvento().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnHoraDeCierre;
    private javax.swing.JButton btnHoraDeInicio;
    private javax.swing.JComboBox<String> cmbRequisitos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JTextField txtCapacidad;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNombreEvento;
    private javax.swing.JTextField txtTime1;
    private javax.swing.JTextField txtTime2;
    // End of variables declaration//GEN-END:variables
}

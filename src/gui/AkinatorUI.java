package gui;

import ArbolBinario.Akinator;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

public class AkinatorUI extends javax.swing.JFrame {

    private boolean respuesta;
    private ImageIcon imagenPersonaje;
    private Akinator objAkinator;

    public AkinatorUI() {
        initComponents();
        alternarPanel(false);
        ocultarPersonajeImg();
        objAkinator = new Akinator(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPanel = new javax.swing.JPanel();
        scrollPanel = new javax.swing.JScrollPane();
        areaTexto = new javax.swing.JTextArea();
        lblSeleccioneImg = new javax.swing.JLabel();
        lblEscribaRespuesta = new javax.swing.JLabel();
        lblPersonajeImg = new javax.swing.JLabel();
        btnSubirImg = new javax.swing.JLabel();
        btnOK = new javax.swing.JLabel();
        lblPergaminoAbierto = new javax.swing.JLabel();
        btnNo = new javax.swing.JLabel();
        btnSi = new javax.swing.JLabel();
        lblPergaminoCerrado = new javax.swing.JLabel();
        lblResPersonajeImg = new javax.swing.JLabel();
        lblRespuesta = new javax.swing.JLabel();
        lblDialogo = new javax.swing.JLabel();
        lblGloboTexto = new javax.swing.JLabel();
        lblAkinator = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlPanel.setBackground(new java.awt.Color(255, 255, 255));
        pnlPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scrollPanel.setBorder(null);
        scrollPanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPanel.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        areaTexto.setBackground(new java.awt.Color(230, 192, 127));
        areaTexto.setColumns(20);
        areaTexto.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        areaTexto.setForeground(new java.awt.Color(255, 255, 255));
        areaTexto.setLineWrap(true);
        areaTexto.setRows(5);
        areaTexto.setWrapStyleWord(true);
        scrollPanel.setViewportView(areaTexto);

        pnlPanel.add(scrollPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 200, 120));

        lblSeleccioneImg.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblSeleccioneImg.setForeground(new java.awt.Color(255, 255, 255));
        lblSeleccioneImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSeleccioneImg.setText("Seleccione su imagen");
        pnlPanel.add(lblSeleccioneImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, 240, 50));

        lblEscribaRespuesta.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblEscribaRespuesta.setForeground(new java.awt.Color(255, 255, 255));
        lblEscribaRespuesta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEscribaRespuesta.setText("Escriba su respuesta:");
        pnlPanel.add(lblEscribaRespuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 240, 50));
        pnlPanel.add(lblPersonajeImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 325, 130, 130));

        btnSubirImg.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btnSubirImg.setForeground(new java.awt.Color(255, 255, 255));
        btnSubirImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSubirImg.setText("Subir Imagen");
        btnSubirImg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSubirImgMousePressed(evt);
            }
        });
        pnlPanel.add(btnSubirImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 465, 280, 50));

        btnOK.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btnOK.setForeground(new java.awt.Color(255, 255, 255));
        btnOK.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnOK.setText("OK");
        btnOK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnOKMousePressed(evt);
            }
        });
        pnlPanel.add(btnOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 465, 280, 50));

        lblPergaminoAbierto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Pergamino Abierto.png"))); // NOI18N
        lblPergaminoAbierto.setText("jLabel5");
        pnlPanel.add(lblPergaminoAbierto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 660, 270));

        btnNo.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btnNo.setForeground(new java.awt.Color(255, 255, 255));
        btnNo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnNo.setText("NO");
        btnNo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNoMouseClicked(evt);
            }
        });
        pnlPanel.add(btnNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 385, 380, 50));

        btnSi.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btnSi.setForeground(new java.awt.Color(255, 255, 255));
        btnSi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSi.setText("SI");
        btnSi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSiMousePressed(evt);
            }
        });
        pnlPanel.add(btnSi, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 380, 50));

        lblPergaminoCerrado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Pergamino cerrado.png"))); // NOI18N
        pnlPanel.add(lblPergaminoCerrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, -1, -1));
        pnlPanel.add(lblResPersonajeImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 65, 100, 100));

        lblRespuesta.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        lblRespuesta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRespuesta.setText("<html>Tu personaje es Goku?<html>");
        lblRespuesta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlPanel.add(lblRespuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 260, 90));

        lblDialogo.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        lblDialogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDialogo.setText("<html>Tu personaje es Goku?<html>");
        lblDialogo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlPanel.add(lblDialogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 390, 90));

        lblGloboTexto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/globotexto.png"))); // NOI18N
        lblGloboTexto.setText("jLabel3");
        pnlPanel.add(lblGloboTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 460, 200));

        lblAkinator.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/AkinatorNormal.png"))); // NOI18N
        lblAkinator.setText("jLabel1");
        pnlPanel.add(lblAkinator, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 60, 250, 450));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/wallpaper.png"))); // NOI18N
        pnlPanel.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 575));

        getContentPane().add(pnlPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 575));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSiMousePressed
        respuesta = true;
        synchronized (this) {
            this.notify();
        }
    }//GEN-LAST:event_btnSiMousePressed

    private void btnNoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNoMouseClicked
        respuesta = false;
        synchronized (this) {
            this.notify();
        }
    }//GEN-LAST:event_btnNoMouseClicked

    private void btnOKMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOKMousePressed
        respuesta = true;
        synchronized (this) {
            this.notify();
        }
    }//GEN-LAST:event_btnOKMousePressed

    private void btnSubirImgMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubirImgMousePressed
        JFileChooser explorador = new JFileChooser();
        int result = explorador.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File imgSeleccionada = explorador.getSelectedFile();
            imagenPersonaje = new ImageIcon(imgSeleccionada.getPath());
            Image imagen = imagenPersonaje.getImage().getScaledInstance(lblPersonajeImg.getWidth(), lblPersonajeImg.getHeight(), Image.SCALE_SMOOTH);
            imagenPersonaje = new ImageIcon(imagen);
            lblPersonajeImg.setIcon(imagenPersonaje);
        }
    }//GEN-LAST:event_btnSubirImgMousePressed

    public void mostrarPersonajeImg(ImageIcon img) {
        try {
            Image imagen = img.getImage().getScaledInstance(lblResPersonajeImg.getWidth(), lblResPersonajeImg.getHeight(), Image.SCALE_SMOOTH);
            this.lblResPersonajeImg.setIcon(new ImageIcon(imagen));
        } catch (Exception e) {
            this.lblResPersonajeImg.setIcon(NoIMG());
        }
        this.lblResPersonajeImg.setVisible(true);
        this.lblRespuesta.setVisible(true);

        this.lblDialogo.setVisible(false);
    }

    public void ocultarPersonajeImg() {
        this.lblResPersonajeImg.setVisible(false);
        this.lblRespuesta.setVisible(false);
        this.lblDialogo.setVisible(true);
    }

    public void vaciarArea() {
        this.areaTexto.setText("");
    }

    public void alternarPanel(boolean valor) {
        this.lblPergaminoAbierto.setVisible(valor);
        this.scrollPanel.setVisible(valor);
        this.btnOK.setVisible(valor);
        this.btnSubirImg.setVisible(valor);
        this.lblPersonajeImg.setVisible(valor);
        this.lblSeleccioneImg.setVisible(valor);
        this.lblEscribaRespuesta.setVisible(valor);
        this.lblPersonajeImg.setIcon(null);

        this.lblPergaminoCerrado.setVisible(!valor);
        this.btnSi.setVisible(!valor);
        this.btnNo.setVisible(!valor);
    }

    // Metodos Gets y Sets -----------------------------------------------------
    public boolean getRespuesta() throws InterruptedException {
        synchronized (this) {
            this.wait();
        }
        return respuesta;
    }

    public String getTexto() {
        String resp = this.areaTexto.getText();
        this.areaTexto.setText("");
        return resp;
    }

    public void setDialogo(String dialogo) {
        this.lblDialogo.setText(dialogo);
    }

    public void setRespuesta(String respuesta) {
        this.lblRespuesta.setText(respuesta);
    }

    public ImageIcon getImagenPersonaje() {
        return imagenPersonaje;
    }

    public ImageIcon NoIMG() {
        ImageIcon imagenIcono = new ImageIcon(getClass().getResource("/imagenes/hombremorado.png"));
        Image imagen = imagenIcono.getImage().getScaledInstance(lblResPersonajeImg.getWidth(), lblResPersonajeImg.getHeight(), WIDTH);
        imagenIcono = new ImageIcon(imagen);
        return imagenIcono;
    }

    // Cambiar imagen de Akinator ----------------------------------------------
    public void AkinatorNormal() {
        ImageIcon nuevaImagen = new ImageIcon(getClass().getResource("/imagenes/AkinatorNormal.png"));
        lblAkinator.setIcon(nuevaImagen);
    }

    public void AkinatorConfiado() {
        ImageIcon nuevaImagen = new ImageIcon(getClass().getResource("/imagenes/AkinatorConfiado.png"));
        lblAkinator.setIcon(nuevaImagen);
    }

    public void AkinatorSorprendido() {
        ImageIcon nuevaImagen = new ImageIcon(getClass().getResource("/imagenes/AkinatorSorprendido.png"));
        lblAkinator.setIcon(nuevaImagen);
    }

    public void AkinatorFeliz() {
        ImageIcon nuevaImagen = new ImageIcon(getClass().getResource("/imagenes/AkinatorFeliz.png"));
        lblAkinator.setIcon(nuevaImagen);
    }

    public void AkinatorCelular() {
        ImageIcon nuevaImagen = new ImageIcon(getClass().getResource("/imagenes/AkinatorCelular.png"));
        lblAkinator.setIcon(nuevaImagen);
    }

    public void AkinatorListo() {
        ImageIcon nuevaImagen = new ImageIcon(getClass().getResource("/imagenes/AkinatorListo.png"));
        lblAkinator.setIcon(nuevaImagen);
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AkinatorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AkinatorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AkinatorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AkinatorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AkinatorUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaTexto;
    private javax.swing.JLabel btnNo;
    private javax.swing.JLabel btnOK;
    private javax.swing.JLabel btnSi;
    private javax.swing.JLabel btnSubirImg;
    private javax.swing.JLabel lblAkinator;
    private javax.swing.JLabel lblDialogo;
    private javax.swing.JLabel lblEscribaRespuesta;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblGloboTexto;
    private javax.swing.JLabel lblPergaminoAbierto;
    private javax.swing.JLabel lblPergaminoCerrado;
    private javax.swing.JLabel lblPersonajeImg;
    private javax.swing.JLabel lblResPersonajeImg;
    private javax.swing.JLabel lblRespuesta;
    private javax.swing.JLabel lblSeleccioneImg;
    private javax.swing.JPanel pnlPanel;
    private javax.swing.JScrollPane scrollPanel;
    // End of variables declaration//GEN-END:variables
}

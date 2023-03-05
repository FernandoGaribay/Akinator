package gui;

import ArbolBinario.Akinator;

public class AkinatorUI extends javax.swing.JFrame {

    private boolean respuesta;
    private Akinator objAkinator;

    public AkinatorUI() {
        initComponents();
        alternarPanel(false);
        objAkinator = new Akinator(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblEscribaRespuesta = new javax.swing.JLabel();
        btnOK = new javax.swing.JLabel();
        scrollPanel = new javax.swing.JScrollPane();
        areaTexto = new javax.swing.JTextArea();
        lblPergaminoAbierto = new javax.swing.JLabel();
        btnNo = new javax.swing.JLabel();
        btnSi = new javax.swing.JLabel();
        lblPergaminoCerrado = new javax.swing.JLabel();
        lblDialogo = new javax.swing.JLabel();
        lblGloboTexto = new javax.swing.JLabel();
        lblAkinator = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEscribaRespuesta.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblEscribaRespuesta.setForeground(new java.awt.Color(255, 255, 255));
        lblEscribaRespuesta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEscribaRespuesta.setText("Escriba su respuesta:");
        jPanel1.add(lblEscribaRespuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 240, 50));

        btnOK.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btnOK.setForeground(new java.awt.Color(255, 255, 255));
        btnOK.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnOK.setText("OK");
        btnOK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnOKMousePressed(evt);
            }
        });
        jPanel1.add(btnOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 460, 380, 50));

        scrollPanel.setBorder(null);
        scrollPanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPanel.setToolTipText("");
        scrollPanel.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        areaTexto.setBackground(new java.awt.Color(230, 192, 127));
        areaTexto.setColumns(20);
        areaTexto.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        areaTexto.setForeground(new java.awt.Color(255, 255, 255));
        areaTexto.setLineWrap(true);
        areaTexto.setRows(5);
        areaTexto.setWrapStyleWord(true);
        areaTexto.setBorder(null);
        areaTexto.setCaretColor(new java.awt.Color(230, 192, 151));
        areaTexto.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        scrollPanel.setViewportView(areaTexto);

        jPanel1.add(scrollPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 330, 195, 120));
        scrollPanel.setVisible(false);

        lblPergaminoAbierto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Pergamino Abierto.png"))); // NOI18N
        lblPergaminoAbierto.setText("jLabel5");
        jPanel1.add(lblPergaminoAbierto, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 380, -1));

        btnNo.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btnNo.setForeground(new java.awt.Color(255, 255, 255));
        btnNo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnNo.setText("NO");
        btnNo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNoMouseClicked(evt);
            }
        });
        jPanel1.add(btnNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 385, 380, 50));

        btnSi.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btnSi.setForeground(new java.awt.Color(255, 255, 255));
        btnSi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSi.setText("SI");
        btnSi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSiMousePressed(evt);
            }
        });
        jPanel1.add(btnSi, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 380, 50));

        lblPergaminoCerrado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Pergamino cerrado.png"))); // NOI18N
        jPanel1.add(lblPergaminoCerrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, -1, -1));

        lblDialogo.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        lblDialogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDialogo.setText("<html>Tu personaje es Goku?<html>");
        lblDialogo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblDialogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 370, 90));

        lblGloboTexto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/globotexto.png"))); // NOI18N
        lblGloboTexto.setText("jLabel3");
        jPanel1.add(lblGloboTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 460, 200));

        lblAkinator.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/AkinatorNormal.png"))); // NOI18N
        lblAkinator.setText("jLabel1");
        jPanel1.add(lblAkinator, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 60, 250, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/wallpaper.png"))); // NOI18N
        jPanel1.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 575));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 575));

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

    public void alternarPanel(boolean valor) {
        this.lblPergaminoAbierto.setVisible(valor);
        this.scrollPanel.setVisible(valor);
        this.btnOK.setVisible(valor);
        this.lblEscribaRespuesta.setVisible(valor);

        this.lblPergaminoCerrado.setVisible(!valor);
        this.btnSi.setVisible(!valor);
        this.btnNo.setVisible(!valor);
    }
    
    public void vaciarArea(){
        this.areaTexto.setText("");
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAkinator;
    private javax.swing.JLabel lblDialogo;
    private javax.swing.JLabel lblEscribaRespuesta;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblGloboTexto;
    private javax.swing.JLabel lblPergaminoAbierto;
    private javax.swing.JLabel lblPergaminoCerrado;
    private javax.swing.JScrollPane scrollPanel;
    // End of variables declaration//GEN-END:variables
}

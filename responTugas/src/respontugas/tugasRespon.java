package respontugas;
import java.text.SimpleDateFormat;

public class tugasRespon extends javax.swing.JFrame {
    int lminap;
    double inap, layanan, persalinan, totalbyr, totalinap, totallayanan;
    public tugasRespon() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txttotalBiaya = new javax.swing.JTextField();
        rbBidan = new javax.swing.JRadioButton();
        btnHitung = new javax.swing.JButton();
        cbKelas = new javax.swing.JComboBox<>();
        btnBersih = new javax.swing.JButton();
        rbDokter = new javax.swing.JRadioButton();
        btnKeluar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtnmpasien = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtbiayaInap = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtbiayaLayanan = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtbiayaSalin = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtlamaInap = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        dcMasuk = new com.toedter.calendar.JDateChooser();
        dcKeluar = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txttotalBiaya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttotalBiayaActionPerformed(evt);
            }
        });

        rbBidan.setText("BIDAN");
        rbBidan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbBidanMouseClicked(evt);
            }
        });

        btnHitung.setText("HITUNG");
        btnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungActionPerformed(evt);
            }
        });

        cbKelas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Kelas", "A", "B", "C" }));
        cbKelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbKelasActionPerformed(evt);
            }
        });

        btnBersih.setText("BERSIHKAN KONTAK");
        btnBersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBersihActionPerformed(evt);
            }
        });

        rbDokter.setText("DOKTER");
        rbDokter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbDokterMouseClicked(evt);
            }
        });

        btnKeluar.setText("KELUAR");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("KLINIK BERSALIN SAHABAT SEJATI");

        jLabel9.setText("LAMA INAP");

        jLabel2.setText("NAMA PASIEN");

        jLabel10.setText("TOTAL PEMBAYARAN");

        jLabel3.setText("KELAS");

        jLabel4.setText("INAP");

        txtbiayaInap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbiayaInapActionPerformed(evt);
            }
        });

        jLabel5.setText("LAYANAN");

        jLabel6.setText("BIAYA PERSALINAN");

        txtbiayaSalin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbiayaSalinActionPerformed(evt);
            }
        });

        jLabel7.setText("MASUK");

        txtlamaInap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtlamaInapMouseClicked(evt);
            }
        });
        txtlamaInap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlamaInapActionPerformed(evt);
            }
        });

        jLabel8.setText("KELUAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(rbDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(rbBidan)))
                                    .addGap(165, 165, 165))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtbiayaSalin, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(120, 120, 120)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(230, 230, 230)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtlamaInap))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtbiayaLayanan))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(34, 34, 34)
                                    .addComponent(txtbiayaInap, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dcMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dcKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(btnHitung)
                                .addGap(35, 35, 35)
                                .addComponent(btnBersih))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtnmpasien, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(31, 31, 31)
                        .addComponent(btnKeluar)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txttotalBiaya, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(txtnmpasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbiayaInap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(txtbiayaLayanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(jLabel7))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rbDokter)
                                    .addComponent(rbBidan)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(dcMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(txtbiayaSalin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addComponent(dcKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtlamaInap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txttotalBiaya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHitung)
                    .addComponent(btnBersih)
                    .addComponent(btnKeluar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txttotalBiayaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttotalBiayaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttotalBiayaActionPerformed

    private void rbBidanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbBidanMouseClicked
        if (rbBidan.isSelected()){
            rbDokter.setSelected(false);
            persalinan=750000;
    }//GEN-LAST:event_rbBidanMouseClicked
        txtbiayaSalin.setText(String.valueOf(persalinan));
    }
    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungActionPerformed
       totalbyr = persalinan + totallayanan + totalinap;
       txttotalBiaya.setText(String.valueOf(totalbyr));
    }//GEN-LAST:event_btnHitungActionPerformed

    private void cbKelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbKelasActionPerformed
        if (cbKelas.getSelectedItem().equals("Pilih Kelas")){
            txtbiayaInap.setText("");
            txtbiayaLayanan.setText("");
        }
        else if (cbKelas.getSelectedItem().equals("A")){
            inap = 300000;
            layanan = 100000;
        }
        else if (cbKelas.getSelectedItem().equals("B")){
            inap = 200000;
            layanan = 70000;
        }
        else{
            inap = 100000;
            layanan = 50000;
        }
        txtbiayaInap.setText(String.valueOf(inap));
        txtbiayaLayanan.setText(String.valueOf(layanan));
    }//GEN-LAST:event_cbKelasActionPerformed

    private void rbDokterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbDokterMouseClicked
        if (rbDokter.isSelected()){
            rbBidan.setSelected(false);
            persalinan=1000000;
        }
        txtbiayaSalin.setText(String.valueOf(persalinan));
    }//GEN-LAST:event_rbDokterMouseClicked

    private void txtbiayaInapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbiayaInapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbiayaInapActionPerformed

    private void txtbiayaSalinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbiayaSalinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbiayaSalinActionPerformed

    private void txtlamaInapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtlamaInapMouseClicked
        try{
            String tglmasuk, tglkeluar;
            
            SimpleDateFormat ft = new SimpleDateFormat("dd-MMM-yyyy");

            tglmasuk = ft.format(dcMasuk.getDate());
            int tm = Integer.parseInt(tglmasuk.substring(0,2));
            tglkeluar = ft.format(dcKeluar.getDate());
            int tk = Integer.parseInt(tglkeluar.substring(0,2));
            lminap = tk - tm;
            txtlamaInap.setText(String.valueOf(lminap));
        }catch(NumberFormatException ex){
            System.out.println("" + ex.getMessage());
        }
        totalinap = lminap * inap;
        totallayanan = lminap * layanan;
    }//GEN-LAST:event_txtlamaInapMouseClicked

    private void btnBersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBersihActionPerformed
       txtnmpasien.setText("");
       cbKelas.setEnabled(false);
       rbDokter.setEnabled(false);
       rbBidan.setEnabled(false);
       txtbiayaInap.setText("");
       txtbiayaLayanan.setText("");
       txtbiayaSalin.setText("");
       dcMasuk.setEnabled(false);
       dcKeluar.setEnabled(false);
       txtlamaInap.setText("");
       txttotalBiaya.setText("");
       
    }//GEN-LAST:event_btnBersihActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void txtlamaInapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlamaInapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlamaInapActionPerformed

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
            java.util.logging.Logger.getLogger(tugasRespon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tugasRespon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tugasRespon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tugasRespon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tugasRespon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBersih;
    private javax.swing.JButton btnHitung;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JComboBox<String> cbKelas;
    private com.toedter.calendar.JDateChooser dcKeluar;
    private com.toedter.calendar.JDateChooser dcMasuk;
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
    private javax.swing.JRadioButton rbBidan;
    private javax.swing.JRadioButton rbDokter;
    private javax.swing.JTextField txtbiayaInap;
    private javax.swing.JTextField txtbiayaLayanan;
    private javax.swing.JTextField txtbiayaSalin;
    private javax.swing.JTextField txtlamaInap;
    private javax.swing.JTextField txtnmpasien;
    private javax.swing.JTextField txttotalBiaya;
    // End of variables declaration//GEN-END:variables
}

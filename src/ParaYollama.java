/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.sql.*;
/**
 *
 * @author muhammedsimsek
 */
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class ParaYollama extends javax.swing.JFrame {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/Banka_Uygulamasi";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "";
 

    /**
     * Creates new form HesapEkrani
     */
    
   
    public ParaYollama() {
       initComponents();
        this.setLocationRelativeTo(null);
        fetchAndShowCustomers();

        
    }
    private void fetchAndShowCustomers() {
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();//table'da veri gösterimi için default table model kullandım
    model.setRowCount(0);//liste güncellenince verilerin silinmesi için ekledim
    String query = "SELECT tc_no ,bakiye FROM bakiye_tablosu"; 
    try (Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(query)) {
        while (rs.next()) {
            String tc_noString = rs.getString("tc_no");
            String bakiyeString = rs.getString("bakiye");
           
            model.addRow(new Object[]{tc_noString,bakiyeString});
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
}
    
    
        

    // Veritabanından giriş yapan kullanıcının bakiyesini çeken metot
  
      
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        YeniKullaniciParaGonderButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        YollanacakMiktarTextField = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        YeniKullaniciParaGonderButton.setFont(new java.awt.Font("Helvetica", 1, 24)); // NOI18N
        YeniKullaniciParaGonderButton.setForeground(new java.awt.Color(0, 51, 153));
        YeniKullaniciParaGonderButton.setText("Para Gönder");
        YeniKullaniciParaGonderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YeniKullaniciParaGonderButtonActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tc"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(YeniKullaniciParaGonderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(137, 137, 137))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(YollanacakMiktarTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(188, 188, 188))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(YollanacakMiktarTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(YeniKullaniciParaGonderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
        );

        jMenu1.setText("Exit");

        jMenuItem1.setText("Çıkış");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void YeniKullaniciParaGonderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YeniKullaniciParaGonderButtonActionPerformed
       
       Object a = (String) jTable1.getValueAt(jTable1.getSelectedRow(),0);
        
      String tc = KullanıcıGirişi.tc;
       
       
     
        String yollanacamiktarString = YollanacakMiktarTextField.getText();
        double miktar = Double.parseDouble(yollanacamiktarString);
        
        
        try {
            System.out.println("before connection");
            Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            updateHesaplar(connection, tc, a.toString(), miktar);
            connection.close();
            
        } catch (SQLException e) {
            System.err.println("Hesapları güncellerken bir hata oluştu:");
            e.printStackTrace();
        }
        

    }//GEN-LAST:event_YeniKullaniciParaGonderButtonActionPerformed
 private static void updateHesaplar(Connection connection, String hesapTc, String yollananTc, double miktar) {
      
     
        try {
            // Hesap bakiyesini güncelle
            PreparedStatement stmt = connection.prepareStatement("UPDATE bakiye_tablosu SET bakiye = bakiye - ? WHERE tc_no = ?");
            stmt.setDouble(1, miktar);
            stmt.setString(2, hesapTc);
            stmt.executeUpdate();
            stmt.close();

            // Yollanan hesabın bakiyesini güncelle
            stmt = connection.prepareStatement("UPDATE bakiye_tablosu SET bakiye = bakiye + ? WHERE tc_no = ?");
            stmt.setDouble(1, miktar);
            stmt.setString(2, yollananTc);
            stmt.executeUpdate();
            stmt.close();

            System.out.println("Hesaplar güncellendi.");
             
             
             
        } catch (SQLException e) {
            System.err.println("Hesapları güncellerken bir hata oluştu:");
            e.printStackTrace();
        }
    }
 
 private static void baglanma(){
            
  try {
            Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            if (connection != null) {
                System.out.println("Veritabanına bağlantı başarılı.");

                String hesapTc = "12345678901"; // Hesabın TC'si
                String yollananTc = "98765432109"; // Yollanan hesabın TC'si
                double miktar = 100.0; // Azaltılacak miktar

                updateHesaplar(connection, hesapTc, yollananTc, miktar);

                connection.close();
            }
        } catch (SQLException e) {
            System.err.println("Veritabanına bağlanırken bir hata oluştu:");
            e.printStackTrace();
        }
    
    
 }
    
    
    
    
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       
        this.setVisible(false);
        new IslemSEcin().setVisible(true);
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(ParaYollama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ParaYollama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ParaYollama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ParaYollama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton YeniKullaniciParaGonderButton;
    private javax.swing.JTextField YollanacakMiktarTextField;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}

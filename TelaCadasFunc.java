
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author geovanna
 */
public class TelaCadasFunc extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadasFunc
     */
    public TelaCadasFunc() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtCPF = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtCel = new javax.swing.JTextField();
        txtEnd = new javax.swing.JTextField();
        txtCEP = new javax.swing.JTextField();
        txtDA = new javax.swing.JTextField();
        txtSal = new javax.swing.JTextField();
        txtLogin = new javax.swing.JTextField();
        btnEnviar = new javax.swing.JButton();
        btnCan = new javax.swing.JButton();
        txtSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(1, 3, 115));

        jLabel1.setForeground(new java.awt.Color(245, 245, 245));
        jLabel1.setText("Cadastro de Funcion??rio");

        jLabel2.setForeground(new java.awt.Color(245, 245, 245));
        jLabel2.setText("Nome Completo");

        jLabel3.setForeground(new java.awt.Color(245, 245, 245));
        jLabel3.setText("Email");

        jLabel4.setForeground(new java.awt.Color(245, 245, 245));
        jLabel4.setText("CPF");

        jLabel5.setForeground(new java.awt.Color(245, 245, 245));
        jLabel5.setText("Endere??o Completo / N??");

        jLabel6.setForeground(new java.awt.Color(245, 245, 245));
        jLabel6.setText("Celular");

        jLabel7.setForeground(new java.awt.Color(245, 245, 245));
        jLabel7.setText("Data de Admiss??o");

        jLabel8.setForeground(new java.awt.Color(245, 245, 245));
        jLabel8.setText("Sal??rio ");

        jLabel9.setForeground(new java.awt.Color(245, 245, 245));
        jLabel9.setText("Login");

        jLabel10.setForeground(new java.awt.Color(245, 245, 245));
        jLabel10.setText("Senha");

        jLabel11.setForeground(new java.awt.Color(245, 245, 245));
        jLabel11.setText("CEP");

        btnEnviar.setText("Cadastrar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        btnCan.setText("Cancelar");
        btnCan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCel, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtDA, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel8))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(52, 52, 52)
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtSal, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(128, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(348, 348, 348))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCan, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtDA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(txtSal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(81, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCan)
                            .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        if(txtNome.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Campo Nome Vazio", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        else if(txtCPF.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Campo CPF Vazio", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        else if(txtEmail.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Campo Email Vazio", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        else if(txtCel.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Campo Celular Vazio", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        else if(txtEnd.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Campo Endere??o Vazio", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        else if(txtCEP.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Campo CEP Vazio", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        else if(txtDA.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Campo Data de Admiss??o Vazio", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        else if(txtSal.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Campo Sal??rio Vazio", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        else if(txtLogin.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Campo Login Vazio", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        else if(txtSenha.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Campo Senha Vazio", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null,"Funcion??rio Cadastrado Com Sucesso");
        }
        
        
        TelaLogin tl = new TelaLogin();
        TelaCadasCliente tc = new TelaCadasCliente();
        TelaCadasFunc tf = new TelaCadasFunc();
        TelaCadasProd tp = new TelaCadasProd();
        TelaCompra tcmp = new TelaCompra();
        TelaNotaFiscal tn= new TelaNotaFiscal();
        
        int escolha;
        
           
            String esc = JOptionPane.showInputDialog(  "Escolha uma op????o: "
                                            + "\n1- Cadastro de Cliente"
                                            + "\n2- Cadastro de Produto"
                                            + "\n3- Cadastro de Funcion??rio"
                                            + "\n4- Cadastrar Compra"
                                            + "\n5- Cadastrar Nota Fiscal"
                                            + "\n6- Sair");
            escolha = Integer.parseInt(esc);
            
            switch(escolha){
                case 1:
                    tc.setVisible(true);
                    tp.setVisible(false);
                    tf.setVisible(false);
                    tcmp.setVisible(false);
                    tn.setVisible(false);
                    tl.setVisible(false);
                    break;
                case 2:
                    tp.setVisible(true);
                    tc.setVisible(false);
                    tf.setVisible(false);
                    tcmp.setVisible(false);
                    tn.setVisible(false);
                    tl.setVisible(false);
                    break;
                case 3:
                    tf.setVisible(true);
                    tc.setVisible(false);
                    tp.setVisible(false);
                    tcmp.setVisible(false);
                    tn.setVisible(false);
                    tl.setVisible(false);
                    break;
                case 4:
                    tcmp.setVisible(true);
                    tc.setVisible(false);
                    tp.setVisible(false);
                    tf.setVisible(false);
                    tn.setVisible(false);
                    tl.setVisible(false);
                    break;
                case 5:
                    tn.setVisible(true);
                    tc.setVisible(false);
                    tp.setVisible(false);
                    tf.setVisible(false);
                    tcmp.setVisible(false);
                    tl.setVisible(false);
                    break;
                case 6:
                        System.exit(0);
                        break;
                default:
                    JOptionPane.showMessageDialog(null, "Op????o Inv??lida", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
            
           
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void btnCanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCanActionPerformed
        TelaLogin tl = new TelaLogin();
        TelaCadasCliente tc = new TelaCadasCliente();
        TelaCadasFunc tf = new TelaCadasFunc();
        TelaCadasProd tp = new TelaCadasProd();
        TelaCompra tcmp = new TelaCompra();
        TelaNotaFiscal tn= new TelaNotaFiscal();
        
        int escolha;
        
           
            String esc = JOptionPane.showInputDialog(  "Escolha uma op????o: "
                                            + "\n1- Cadastro de Cliente"
                                            + "\n2- Cadastro de Produto"
                                            + "\n3- Cadastro de Funcion??rio"
                                            + "\n4- Cadastrar Compra"
                                            + "\n5- Cadastrar Nota Fiscal"
                                            + "\n6- Sair");
            escolha = Integer.parseInt(esc);
            
            switch(escolha){
                case 1:
                    tc.setVisible(true);
                    tp.setVisible(false);
                    tf.setVisible(false);
                    tcmp.setVisible(false);
                    tn.setVisible(false);
                    tl.setVisible(false);
                    break;
                case 2:
                    tp.setVisible(true);
                    tc.setVisible(false);
                    tf.setVisible(false);
                    tcmp.setVisible(false);
                    tn.setVisible(false);
                    tl.setVisible(false);
                    break;
                case 3:
                    tf.setVisible(true);
                    tc.setVisible(false);
                    tp.setVisible(false);
                    tcmp.setVisible(false);
                    tn.setVisible(false);
                    tl.setVisible(false);
                    break;
                case 4:
                    tcmp.setVisible(true);
                    tc.setVisible(false);
                    tp.setVisible(false);
                    tf.setVisible(false);
                    tn.setVisible(false);
                    tl.setVisible(false);
                    break;
                case 5:
                    tn.setVisible(true);
                    tc.setVisible(false);
                    tp.setVisible(false);
                    tf.setVisible(false);
                    tcmp.setVisible(false);
                    tl.setVisible(false);
                    break;
                case 6:
                        System.exit(0);
                        break;
                default:
                    JOptionPane.showMessageDialog(null, "Op????o Inv??lida", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
            
           
        
    }//GEN-LAST:event_btnCanActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadasFunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadasFunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadasFunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadasFunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadasFunc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCan;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCEP;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtCel;
    private javax.swing.JTextField txtDA;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEnd;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSal;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}

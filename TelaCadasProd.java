
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
public class TelaCadasProd extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadasProd
     */
    public TelaCadasProd() {
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
        txtNome = new javax.swing.JTextField();
        txtCod = new javax.swing.JTextField();
        txtDesc = new javax.swing.JTextField();
        txtPreco = new javax.swing.JTextField();
        txtQtd = new javax.swing.JTextField();
        btnEnviar = new javax.swing.JButton();
        btnCan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(1, 3, 115));

        jLabel1.setForeground(new java.awt.Color(245, 245, 245));
        jLabel1.setText("Cadastro do Produto");

        jLabel2.setForeground(new java.awt.Color(245, 245, 245));
        jLabel2.setText("Nome do Produto");

        jLabel3.setForeground(new java.awt.Color(245, 245, 245));
        jLabel3.setText("Código do Produto");

        jLabel4.setForeground(new java.awt.Color(245, 245, 245));
        jLabel4.setText("Descrição");

        jLabel5.setForeground(new java.awt.Color(245, 245, 245));
        jLabel5.setText("Preço");

        jLabel6.setForeground(new java.awt.Color(245, 245, 245));
        jLabel6.setText("Quantidade");

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
                        .addGap(109, 109, 109)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDesc))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel2)
                        .addGap(43, 43, 43)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(87, 87, 87))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(352, 352, 352)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(363, 363, 363))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCan, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCan, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
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
        else if(txtCod.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Campo Código do Produto Vazio", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        else if(txtDesc.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Campo Descrição Vazio", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        else if(txtPreco.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Campo Preço Vazio", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        else if(txtQtd.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Campo Quantidade Vazio", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null,"Produto Cadastrado Com Sucesso");
        }
        
       TelaLogin tl = new TelaLogin();
        TelaCadasCliente tc = new TelaCadasCliente();
        TelaCadasFunc tf = new TelaCadasFunc();
        TelaCadasProd tp = new TelaCadasProd();
        TelaCompra tcmp = new TelaCompra();
        TelaNotaFiscal tn= new TelaNotaFiscal();
        
        int escolha;
        
           
            String esc = JOptionPane.showInputDialog(  "Escolha uma opção: "
                                            + "\n1- Cadastro de Cliente"
                                            + "\n2- Cadastro de Produto"
                                            + "\n3- Cadastro de Funcionário"
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
                    JOptionPane.showMessageDialog(null, "Opção Inválida", "ERRO", JOptionPane.ERROR_MESSAGE);
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
        
           
            String esc = JOptionPane.showInputDialog(  "Escolha uma opção: "
                                            + "\n1- Cadastro de Cliente"
                                            + "\n2- Cadastro de Produto"
                                            + "\n3- Cadastro de Funcionário"
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
                    JOptionPane.showMessageDialog(null, "Opção Inválida", "ERRO", JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(TelaCadasProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadasProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadasProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadasProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadasProd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCan;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtQtd;
    // End of variables declaration//GEN-END:variables
}

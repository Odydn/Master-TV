/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.BadLocationException;
import mastertv.Cliente;
import mastertv.Contrato;
import mastertv.Funcionario;

/**
 *
 * @author Luís
 */
public class MenuCliente extends javax.swing.JFrame {

    Cliente cliente = new Cliente();
    public MenuCliente() {
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
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        pContrato = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pFazerChamado = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pConsuContratos = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        tNome = new javax.swing.JTextField();
        jLabelAlterar = new javax.swing.JLabel();
        tTelefone = new javax.swing.JTextField();
        tEmail = new javax.swing.JTextField();
        tCpf = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Menu do Cliente");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/list.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Tv-Master");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)))
                .addGap(138, 544, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(24, 24, 24))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 140));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        pContrato.setBackground(new java.awt.Color(0, 153, 153));
        pContrato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pContratoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pContratoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pContratoMouseExited(evt);
            }
        });
        pContrato.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/contract (3).png"))); // NOI18N
        pContrato.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 70, 70));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fazer Contrato");
        pContrato.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        pFazerChamado.setBackground(new java.awt.Color(0, 153, 153));
        pFazerChamado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pFazerChamadoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pFazerChamadoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pFazerChamadoMouseExited(evt);
            }
        });
        pFazerChamado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/customer-service (1).png"))); // NOI18N
        pFazerChamado.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 70, 70));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Fazer Chamado");
        pFazerChamado.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        pConsuContratos.setBackground(new java.awt.Color(0, 153, 153));
        pConsuContratos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pConsuContratosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pConsuContratosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pConsuContratosMouseExited(evt);
            }
        });
        pConsuContratos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/contract management.png"))); // NOI18N
        pConsuContratos.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 70, 70));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Consultar Contratos");
        pConsuContratos.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 130, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(pConsuContratos, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(pContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(pFazerChamado, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pFazerChamado, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(pConsuContratos, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 420, 370));

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));

        jPanel5.setBackground(new java.awt.Color(0, 51, 51));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 153, 51));
        jLabel16.setText("Fechar");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(670, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 760, 50));

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Nome");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CPF");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel17.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Telefone");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, 20));

        jLabel18.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Email");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 310, 10));
        jPanel4.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 310, 10));
        jPanel4.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 310, 10));
        jPanel4.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 310, 10));

        tNome.setEditable(false);
        tNome.setBackground(jPanel4.getBackground());
        tNome.setForeground(new java.awt.Color(255, 255, 255));
        tNome.setBorder(null);
        jPanel4.add(tNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 310, 20));

        jLabelAlterar.setBackground(new java.awt.Color(255, 255, 255));
        jLabelAlterar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabelAlterar.setForeground(new java.awt.Color(255, 153, 51));
        jLabelAlterar.setText("Alterar");
        jLabelAlterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAlterarMouseClicked(evt);
            }
        });
        jPanel4.add(jLabelAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        tTelefone.setBackground(jPanel4.getBackground());
        tTelefone.setForeground(new java.awt.Color(255, 255, 255));
        tTelefone.setBorder(null);
        tTelefone.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel4.add(tTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 310, 20));

        tEmail.setEditable(false);
        tEmail.setBackground(jPanel4.getBackground());
        tEmail.setForeground(new java.awt.Color(255, 255, 255));
        tEmail.setBorder(null);
        jPanel4.add(tEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 310, 20));

        tCpf.setEditable(false);
        tCpf.setBackground(jPanel4.getBackground());
        tCpf.setForeground(new java.awt.Color(255, 255, 255));
        tCpf.setBorder(null);
        tCpf.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel4.add(tCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 120, 310, 20));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 340, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JTextField gettCpf() {
        return tCpf;
    }

    public JTextField gettEmail() {
        return tEmail;
    }

    public JTextField gettNome() {
        return tNome;
    }

    public JTextField gettTelefone() {
        return tTelefone;
    }

    public JLabel getjLabelAlterar() {
        return jLabelAlterar;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    private void pContratoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pContratoMouseClicked
        TelaContrato tela = new TelaContrato();
        tela.setMenu(this);
        tela.setVisible(true);
    }//GEN-LAST:event_pContratoMouseClicked

    private void pContratoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pContratoMouseEntered
        setColor(pContrato);
    }//GEN-LAST:event_pContratoMouseEntered

    private void pContratoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pContratoMouseExited
        resetColor(pContrato);
    }//GEN-LAST:event_pContratoMouseExited

    private void pFazerChamadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pFazerChamadoMouseClicked
        TelaChamado tela = new TelaChamado();
        ArrayList<Contrato> array2 = new ArrayList<>();
        array2 = Contrato.getAllFromDB(tCpf.getText());
        if(array2.size()==0){
            JOptionPane.showMessageDialog(rootPane, "O cliente não possui Contratos", "Erro!", ERROR_MESSAGE);
            return;
        }
        for(Contrato c: array2){
            tela.getCbContratos().addItem(c.getNumeroContrato());
        }
        ArrayList<Funcionario> array = new ArrayList<>();
        array = Funcionario.getAllFromDB();
        if(array.size()==0){
            JOptionPane.showMessageDialog(rootPane, "Não existem tecnicos disponiveis no momento", "Erro!", ERROR_MESSAGE);
            return;
        }
        for(Funcionario f: array){
            if(f.getCargo().equals("Tecnico")){
                tela.getCbTecnicos().addItem(f.getUsuario());
            }
        }
        tela.getCbTecnicos().setSelectedIndex(0);
        tela.setVisible(true);
    }//GEN-LAST:event_pFazerChamadoMouseClicked

    private void pFazerChamadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pFazerChamadoMouseEntered
        setColor(pFazerChamado);
    }//GEN-LAST:event_pFazerChamadoMouseEntered

    private void pFazerChamadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pFazerChamadoMouseExited
         resetColor(pFazerChamado);
    }//GEN-LAST:event_pFazerChamadoMouseExited

    private void pConsuContratosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pConsuContratosMouseEntered
         setColor(pConsuContratos);
    }//GEN-LAST:event_pConsuContratosMouseEntered

    private void pConsuContratosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pConsuContratosMouseExited
         resetColor(pConsuContratos);
    }//GEN-LAST:event_pConsuContratosMouseExited

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        this.dispose();
    }//GEN-LAST:event_jPanel5MouseClicked

    private void jLabelAlterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAlterarMouseClicked
        AlterarDadosCliente tela = new AlterarDadosCliente();
        tela.gettNome().setText(this.gettNome().getText());
        tela.gettCpf().setText("");
        tela.gettCpf().setText(this.gettCpf().getText());
        tela.gettTelefone().setText(this.gettTelefone().getText());
        tela.gettEmail().setText(this.gettEmail().getText());
        tela.setCliente(this);
        tela.setVisible(true);
    }//GEN-LAST:event_jLabelAlterarMouseClicked

    private void pConsuContratosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pConsuContratosMouseClicked
        ConsultarContratos tela = new ConsultarContratos();
        tela.preencherTabela(Contrato.getAllFromDB(tCpf.getText()));
        tela.setMenu(this);
        tela.setVisible(true);
    }//GEN-LAST:event_pConsuContratosMouseClicked

    public void setColor(JPanel panel){
        panel.setBackground(new java.awt.Color(0,224,204));
    }
    public void resetColor(JPanel panel){
        panel.setBackground(new java.awt.Color(0,153,153));
    }
    public void resetColor2(JPanel panel){
        panel.setBackground(new java.awt.Color(0,51,51));
    }
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
            java.util.logging.Logger.getLogger(MenuCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelAlterar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JPanel pConsuContratos;
    private javax.swing.JPanel pContrato;
    private javax.swing.JPanel pFazerChamado;
    private javax.swing.JTextField tCpf;
    private javax.swing.JTextField tEmail;
    private javax.swing.JTextField tNome;
    private javax.swing.JTextField tTelefone;
    // End of variables declaration//GEN-END:variables
}

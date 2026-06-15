package telas;

import com.TrabalhoPOO2.util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

import javax.swing.JFrame;

public class CadastroMorador extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(CadastroMorador.class.getName());
    private final JFrame telaAnterior;

    public CadastroMorador(javax.swing.JFrame telaAnterior) {
        this.telaAnterior = telaAnterior;
        initComponents();
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        CampoCPF = new javax.swing.JTextField();
        UnidadeHabitacional = new javax.swing.JLabel();
        CampoNomeCompleto = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        CampoNumeroUnidadeHabitacional = new javax.swing.JTextField();
        BotãoSalvar = new javax.swing.JButton();
        BotãoListaMoradores = new javax.swing.JButton();
        CampoTelefone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        BotãoVoltar2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(0, 0, 102));

        jLabel4.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cadastro de Moradores");

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));

        jPanel6.setBackground(new java.awt.Color(102, 102, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 95, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Telefone (DDD + numero)*:");

        CampoCPF.setBackground(new java.awt.Color(204, 204, 255));
        CampoCPF.addActionListener(this::CampoCPFActionPerformed);

        UnidadeHabitacional.setForeground(new java.awt.Color(255, 255, 255));
        UnidadeHabitacional.setText("Nº unidade Habitacional*:");

        CampoNomeCompleto.setBackground(new java.awt.Color(204, 204, 255));
        CampoNomeCompleto.addActionListener(this::CampoNomeCompletoActionPerformed);

        jLabel8.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("PORTAL DA VIZINHANÇA");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Nome Completo*:");

        CampoNumeroUnidadeHabitacional.setBackground(new java.awt.Color(204, 204, 255));
        CampoNumeroUnidadeHabitacional.addActionListener(this::CampoNumeroUnidadeHabitacionalActionPerformed);

        BotãoSalvar.setBackground(new java.awt.Color(102, 102, 255));
        BotãoSalvar.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        BotãoSalvar.setForeground(new java.awt.Color(255, 255, 255));
        BotãoSalvar.setText("SALVAR");
        BotãoSalvar.addActionListener(this::BotãoSalvarActionPerformed);

        BotãoListaMoradores.setBackground(new java.awt.Color(102, 102, 255));
        BotãoListaMoradores.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        BotãoListaMoradores.setForeground(new java.awt.Color(255, 255, 255));
        BotãoListaMoradores.setText("LISTA DE MORADORES");
        BotãoListaMoradores.addActionListener(this::BotãoListaMoradoresActionPerformed);

        CampoTelefone.setBackground(new java.awt.Color(204, 204, 255));
        CampoTelefone.addActionListener(this::CampoTelefoneActionPerformed);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CPF*:");

        BotãoVoltar2.setBackground(new java.awt.Color(102, 102, 255));
        BotãoVoltar2.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        BotãoVoltar2.setForeground(new java.awt.Color(255, 255, 255));
        BotãoVoltar2.setText("VOLTAR");
        BotãoVoltar2.addActionListener(this::BotãoVoltar2ActionPerformed);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(CampoNomeCompleto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CampoCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(BotãoSalvar, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CampoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CampoNumeroUnidadeHabitacional, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UnidadeHabitacional, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(61, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel8))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BotãoListaMoradores)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotãoVoltar2)))
                        .addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotãoListaMoradores)
                    .addComponent(BotãoVoltar2))
                .addGap(37, 37, 37)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UnidadeHabitacional, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoNomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoNumeroUnidadeHabitacional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(BotãoSalvar)
                .addContainerGap(107, Short.MAX_VALUE))
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoCPFActionPerformed
  
    }//GEN-LAST:event_CampoCPFActionPerformed

    private void CampoNomeCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoNomeCompletoActionPerformed

    }//GEN-LAST:event_CampoNomeCompletoActionPerformed

    private void CampoNumeroUnidadeHabitacionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoNumeroUnidadeHabitacionalActionPerformed

    }//GEN-LAST:event_CampoNumeroUnidadeHabitacionalActionPerformed

    private void BotãoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotãoSalvarActionPerformed
String nome = CampoNomeCompleto.getText();
String cpf = CampoCPF.getText();
String telefone = CampoTelefone.getText();
int unidade = Integer.parseInt(CampoNumeroUnidadeHabitacional.getText());

try {

    Connection con = Conexao.conectar();

    String sql = "INSERT INTO morador (nome, cpf, telefone, email, id_unidade) VALUES (?, ?, ?, ?, ?)";

    PreparedStatement ps = con.prepareStatement(sql);

    ps.setString(1, nome);
    ps.setString(2, cpf);
    ps.setString(3, telefone);
    ps.setString(4, null);
    ps.setInt(5, unidade);

    ps.executeUpdate();

    JOptionPane.showMessageDialog(this, "Morador cadastrado com sucesso!");

    con.close();

} catch (Exception e) {

    JOptionPane.showMessageDialog(this, "Erro ao cadastrar!");

    e.printStackTrace();

}
    }//GEN-LAST:event_BotãoSalvarActionPerformed

    private void BotãoListaMoradoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotãoListaMoradoresActionPerformed
        new ListaMoradores(this).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotãoListaMoradoresActionPerformed

    private void CampoTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoTelefoneActionPerformed

    }//GEN-LAST:event_CampoTelefoneActionPerformed

    private void BotãoVoltar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotãoVoltar2ActionPerformed
            telaAnterior.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_BotãoVoltar2ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new CadastroMorador(new MenuSindico()).setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotãoListaMoradores;
    private javax.swing.JButton BotãoSalvar;
    private javax.swing.JButton BotãoVoltar2;
    private javax.swing.JTextField CampoCPF;
    private javax.swing.JTextField CampoNomeCompleto;
    private javax.swing.JTextField CampoNumeroUnidadeHabitacional;
    private javax.swing.JTextField CampoTelefone;
    private javax.swing.JLabel UnidadeHabitacional;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables
}

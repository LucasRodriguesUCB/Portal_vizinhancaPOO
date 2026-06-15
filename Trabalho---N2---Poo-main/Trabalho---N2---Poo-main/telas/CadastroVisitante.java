
package telas;

import com.TrabalhoPOO2.util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class CadastroVisitante extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(CadastroVisitante.class.getName());


    public CadastroVisitante(javax.swing.JFrame telaAnterior) {
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
        CampoData = new javax.swing.JTextField();
        UnidadeHabitacional = new javax.swing.JLabel();
        CampoNomeCompleto = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        CampoNumeroUnidadeHabitacional = new javax.swing.JTextField();
        BotãoSalvar = new javax.swing.JButton();
        BotãoListaVisitas = new javax.swing.JButton();
        CampoTelefone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        BotãoVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(0, 0, 102));

        jLabel4.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cadastro de visitante");

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
        jLabel5.setText("Telefone (DDD + número)*:");

        CampoData.setBackground(new java.awt.Color(204, 204, 255));
        CampoData.addActionListener(this::CampoDataActionPerformed);

        UnidadeHabitacional.setForeground(new java.awt.Color(255, 255, 255));
        UnidadeHabitacional.setText("Nº unidade Habitacional visitada*:");

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

        BotãoListaVisitas.setBackground(new java.awt.Color(102, 102, 255));
        BotãoListaVisitas.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        BotãoListaVisitas.setForeground(new java.awt.Color(255, 255, 255));
        BotãoListaVisitas.setText("LISTA DE VISITAS");
        BotãoListaVisitas.addActionListener(this::BotãoListaVisitasActionPerformed);

        CampoTelefone.setBackground(new java.awt.Color(204, 204, 255));
        CampoTelefone.addActionListener(this::CampoTelefoneActionPerformed);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Data da visita (dd/mm/aa):");

        BotãoVoltar.setBackground(new java.awt.Color(102, 102, 255));
        BotãoVoltar.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        BotãoVoltar.setForeground(new java.awt.Color(255, 255, 255));
        BotãoVoltar.setText("VOLTAR");
        BotãoVoltar.addActionListener(this::BotãoVoltarActionPerformed);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(186, 186, 186))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(CampoData, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(BotãoSalvar)
                                            .addComponent(CampoNomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CampoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CampoNumeroUnidadeHabitacional, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(UnidadeHabitacional, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(61, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(jLabel8))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(BotãoListaVisitas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotãoVoltar)))
                        .addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotãoListaVisitas)
                    .addComponent(BotãoVoltar))
                .addGap(37, 37, 37)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoNomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UnidadeHabitacional)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoNumeroUnidadeHabitacional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private javax.swing.JFrame telaAnterior;
    
    private void CampoDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoDataActionPerformed

    }//GEN-LAST:event_CampoDataActionPerformed

    private void CampoNomeCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoNomeCompletoActionPerformed
 
    }//GEN-LAST:event_CampoNomeCompletoActionPerformed

    private void CampoNumeroUnidadeHabitacionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoNumeroUnidadeHabitacionalActionPerformed
   
    }//GEN-LAST:event_CampoNumeroUnidadeHabitacionalActionPerformed

    private void BotãoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotãoSalvarActionPerformed
        String data = CampoData.getText();
        String nome = CampoNomeCompleto.getText();
        String telefone = CampoTelefone.getText();
        int unidade = Integer.parseInt(CampoNumeroUnidadeHabitacional.getText());

    try {

        Connection con = Conexao.conectar();

        // Procura qual morador pertence à unidade informada
        String busca = "SELECT id_morador FROM Morador WHERE id_unidade = ?";
        PreparedStatement psBusca = con.prepareStatement(busca);
        psBusca.setInt(1, unidade);

        ResultSet rs = psBusca.executeQuery();

        if (rs.next()) {

            int idMorador = rs.getInt("id_morador");

           String sql = "INSERT INTO Visitante (nome, cpf, telefone, id_morador, data_visita) VALUES (?, ?, ?, ?, NOW())";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, nome);
            ps.setString(2, null); // não temos campo CPF na tela
            ps.setString(3, telefone);
            ps.setInt(4, idMorador);

            ps.executeUpdate();

            JOptionPane.showMessageDialog(this, "Visitante cadastrado com sucesso!");

        } else {
            JOptionPane.showMessageDialog(this, "Unidade não encontrada!");
        }

        con.close();

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Erro ao cadastrar visitante!");
        e.printStackTrace();
    }
       
    }//GEN-LAST:event_BotãoSalvarActionPerformed

    private void BotãoListaVisitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotãoListaVisitasActionPerformed
        new ListaVisitas(this).setVisible(true);
    this.setVisible(false);

    }//GEN-LAST:event_BotãoListaVisitasActionPerformed

    private void CampoTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoTelefoneActionPerformed
   
    }//GEN-LAST:event_CampoTelefoneActionPerformed

    private void BotãoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotãoVoltarActionPerformed
            telaAnterior.setVisible(true);
            this.dispose();
        
    }//GEN-LAST:event_BotãoVoltarActionPerformed

    public static void main(String args[]) {
 

        java.awt.EventQueue.invokeLater(() -> new CadastroVisitante(new MenuPorteiro()).setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotãoListaVisitas;
    private javax.swing.JButton BotãoSalvar;
    private javax.swing.JButton BotãoVoltar;
    private javax.swing.JTextField CampoData;
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


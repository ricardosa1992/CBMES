/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.es.cb.sdro.view;

//import org.fluttercode.datafactory.impl.*;
import br.gov.es.cb.sdro.model.Equipamento;
import br.gov.es.cb.sdro.model.Status;
import br.gov.es.cb.sdro.model.Unidade;
import br.gov.es.cb.sdro.model.Viatura;
import br.gov.es.cb.sdro.util.ChecaSimilaridadeString;
import br.gov.es.cb.sdro.util.EquipamentoDAO;
import br.gov.es.cb.sdro.util.Sessao;
import br.gov.es.cb.sdro.util.StatusDAO;
import java.text.AttributedCharacterIterator;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Patrícia
 */
public class TelaEquipamento extends javax.swing.JInternalFrame {

    int codigo;
    List<Status> lstStatus;
    List<Equipamento> lstEquipamentos;
    StatusDAO statusDAO;
    HashMap<String, Integer> mapStatus;
    EquipamentoDAO equipamentoDAO;
    private DefaultTableModel tableEquipamentos;
    Status status;
    ChecaSimilaridadeString similaridadeString;
    Sessao sessao;
    /**
     * Creates new form TelaEquipamento
     */
    public TelaEquipamento() throws Exception {
        initComponents();
        sessao = Sessao.getInstancia();
        status = new Status();
        tableEquipamentos = (DefaultTableModel) jTableEquipamentos.getModel();
        equipamentoDAO = new EquipamentoDAO();
        lstStatus = new ArrayList<>();
        statusDAO = new StatusDAO();
        lstStatus = statusDAO.buscaStatuss();
        this.mapStatus = getMapStatus(lstStatus);
        jComboStatus.removeAllItems();
        similaridadeString = new ChecaSimilaridadeString();

        for (Status status : lstStatus) {
            jComboStatus.addItem(status.getDescricao());
        }
        addTabela();
        this.setVisible(true);
        
    }
    
//    public void populaTabela(){
//        DataFactory df = new DataFactory();
//        
//        for (int i = 0; i < 1500000; i++) {
//            Equipamento eq = new Equipamento();
//            String name = df.getRandomText(3, 10);
//            String marca = df.getRandomText(3, 10);
//            eq.setNome(name);
//            eq.setMarca(marca);
//            Status st = new Status();
//            st.setIdstatus(df.getNumberBetween(1, 4));
//            eq.setIdstatus(st);
//            Viatura vt = new Viatura();
//            vt.setIdviatura(df.getNumberBetween(1, 1500000));
//            eq.setIdviatura(vt);
//            Unidade un = new Unidade();
//            un.setIdunidade(df.getNumberBetween(1, 10));
//            eq.setIdunidade(un);
//            eq.setIsalocado(df.chance(50));
//            equipamentoDAO.save(eq);
//            System.out.println(i);
//        }
//    }
    
    public HashMap getMapStatus(List<Status> lstStatus) {
        HashMap<String, Integer> mapStatus = new HashMap<>();
        for (Status status : lstStatus) {
            mapStatus.put(status.getDescricao(), status.getIdstatus());
        }
        return mapStatus;
    }

    public int getIdStatus(String status) {
        for (Map.Entry<String, Integer> entry : mapStatus.entrySet()) {
            String key = entry.getKey();
            int id = entry.getValue();
            if (key.equals(status)) {
                return id;
            }
        }
        return 0;
    }

    public void addTabela() throws Exception {
        if (tableEquipamentos.getRowCount() > 0) {
            System.out.println("qtd" + tableEquipamentos.getRowCount());
            int qtd = tableEquipamentos.getRowCount();
            for (int i = 0; i < qtd; i++) {
                tableEquipamentos.removeRow(0);
                System.out.println(i);
            }
        }
        if (tableEquipamentos.getRowCount() > 0) {
            System.out.println("table    " + tableEquipamentos.getDataVector());
        }
        lstEquipamentos = equipamentoDAO.buscaEquipamentosDisponiveisUnidade(sessao.getUnidade());
        //lstEquipamentos = equipamentoDAO.buscaEquipamentos();
        for (Equipamento eq : lstEquipamentos) {

            Status status = eq.getIdstatus();
            Status statusResult = statusDAO.buscaStatusPorID(status.getIdstatus());
            tableEquipamentos.addRow(new Object[]{eq.getIdequipamento(), eq.getNome(), eq.getMarca(), statusResult.getDescricao()});
        }

    }

    public void limparCamposCadastrar() {
        txtMarca.setText("");
        txtNome.setText("");
    }

    public void limparCamposAlterar() {
        txtMarcaAlterar.setText("");
        txtNomeAlterar.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        jComboStatus = new javax.swing.JComboBox<>();
        btnSalvar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEquipamentos = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtPesquisar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboStatusAlterar = new javax.swing.JComboBox<>();
        txtNomeAlterar = new javax.swing.JTextField();
        txtMarcaAlterar = new javax.swing.JTextField();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jLabel1.setText("Status");

        jLabel2.setText("Nome");

        jLabel3.setText("Marca");

        jComboStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSalvar)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                            .addComponent(txtMarca)
                            .addComponent(jComboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 101, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalvar)
                .addGap(75, 75, 75))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Cadastrar", jPanel1);

        jTableEquipamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Marca", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableEquipamentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEquipamentosMouseClicked(evt);
            }
        });
        jTableEquipamentos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTableEquipamentosKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTableEquipamentos);

        jLabel4.setText("Pesquisar");

        txtPesquisar.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                txtPesquisarCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtPesquisarInputMethodTextChanged(evt);
            }
        });
        txtPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPesquisarKeyPressed(evt);
            }
        });

        jLabel5.setText("Nome:");

        jLabel6.setText("Marca");

        jLabel7.setText("Status");

        jComboStatusAlterar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnAlterar.setText("Salvar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(153, 153, 153))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNomeAlterar)
                                    .addComponent(txtMarcaAlterar))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboStatusAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(btnExcluir)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnAlterar)))))
                        .addGap(41, 41, 41))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNomeAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboStatusAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtMarcaAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir)
                    .addComponent(btnAlterar))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Editar", jPanel2);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 420, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        try {
            if(!txtNome.getText().equals("")  && !txtMarca.getText().equals("")){
            String statusdescricao = jComboStatus.getSelectedItem().toString();
            int id = getIdStatus(statusdescricao);
            status.setIdstatus(id);
            Unidade unidade = new Unidade();
            unidade.setIdunidade(sessao.getUnidade().getIdunidade());
            Equipamento equipamento = new Equipamento();
            equipamento.setIdunidade(unidade);
            Viatura viatura = new Viatura();
//       viatura.setIdviatura(0);
//       equipamento.setIdviatura(viatura);
            equipamento.setNome(txtNome.getText());
            equipamento.setMarca(txtMarca.getText());
            equipamento.setIsalocado(false);
            equipamento.setIdstatus(status);

            if(equipamentoDAO.save(equipamento)){
                 JOptionPane.showMessageDialog(null,"Equipamento Cadastrado com sucesso!");
            }else{
                 JOptionPane.showMessageDialog(null,"Erro ao Cadastrar Equipamento");
            }
            limparCamposCadastrar();
            }
            else{
                JOptionPane.showMessageDialog(null,"Todos os campos devem ser preenchidos");
            }
            
        } catch (Exception ex) {
            Logger.getLogger(TelaEquipamento.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        try {
            if(!txtNomeAlterar.getText().equals("")  && !txtMarcaAlterar.getText().equals("")){
            int linha = jTableEquipamentos.getSelectedRow();
            codigo = Integer.parseInt(tableEquipamentos.getValueAt(linha, 0).toString());
            String statusdescricao = jComboStatusAlterar.getSelectedItem().toString();
            int id = getIdStatus(statusdescricao);
            status.setIdstatus(id);
           // Unidade unidade = new Unidade();
            //unidade.setIdunidade();
            Equipamento equipamento = new Equipamento();
            equipamento.setIdunidade(sessao.getUnidade());
            Viatura viatura = new Viatura();
//       viatura.setIdviatura(0);
//       equipamento.setIdviatura(viatura);
            equipamento.setIdequipamento(codigo);
            equipamento.setNome(txtNomeAlterar.getText());
            equipamento.setMarca(txtMarcaAlterar.getText());
            equipamento.setIsalocado(false);
            equipamento.setIdstatus(status);

            
            if(equipamentoDAO.update(equipamento)){
                 JOptionPane.showMessageDialog(null,"Equipamento Atualizado com sucesso");
            }
            else{
                 JOptionPane.showMessageDialog(null,"Erro ao Atualizar Equipamento");
            }
            addTabela();
            limparCamposAlterar();
            }
            else{
                JOptionPane.showMessageDialog(null,"Todos os campos devem ser preenchidos");
            }
        } catch (Exception ex) {
            Logger.getLogger(TelaEquipamento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void txtPesquisarInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtPesquisarInputMethodTextChanged


    }//GEN-LAST:event_txtPesquisarInputMethodTextChanged

    private void jTableEquipamentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEquipamentosMouseClicked
        int linha = jTableEquipamentos.getSelectedRow();
        codigo = Integer.parseInt(tableEquipamentos.getValueAt(linha, 0).toString());
        for (Equipamento eq : lstEquipamentos) {
            System.out.println(eq.getIdstatus());
            if (eq.getIdequipamento().equals(codigo)) {
                txtMarcaAlterar.setText(eq.getMarca());
                txtNomeAlterar.setText(eq.getNome());
                jComboStatusAlterar.removeAllItems();

                if(eq.getIdstatus().getDescricao() != null)jComboStatusAlterar.addItem(eq.getIdstatus().getDescricao());
                System.out.println(eq.getIdstatus().getDescricao());
                
                for (Status status : lstStatus) {
                    if (!status.getDescricao().equals(eq.getIdstatus().getDescricao())) {
                        jComboStatusAlterar.addItem(status.getDescricao());
                    }
                }
            }
        }
    }//GEN-LAST:event_jTableEquipamentosMouseClicked

    private void jTableEquipamentosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableEquipamentosKeyPressed
        int linha = jTableEquipamentos.getSelectedRow();
        codigo = Integer.parseInt(tableEquipamentos.getValueAt(linha, 0).toString());
    }//GEN-LAST:event_jTableEquipamentosKeyPressed

    private void txtPesquisarCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtPesquisarCaretPositionChanged

    }//GEN-LAST:event_txtPesquisarCaretPositionChanged

    private void txtPesquisarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarKeyPressed
        String input = txtPesquisar.getText();
        limparCamposAlterar();
        if (tableEquipamentos.getRowCount() > 0) {
            int qtd = tableEquipamentos.getRowCount();
            for (int i = 0; i < qtd; i++) {
                tableEquipamentos.removeRow(0);
            }

        }
        if (input.equals("")) {
            try {
                addTabela();
            } catch (Exception ex) {
                Logger.getLogger(TelaEquipamento.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            for (Equipamento eq : lstEquipamentos) {
                float result = 0;
                try {
                    result = similaridadeString.checkSimilarity(eq.getNome(), input);
                } catch (Exception ex) {
                    Logger.getLogger(TelaEquipamento.class.getName()).log(Level.SEVERE, null, ex);
                }

                if (result > 0.50) {
                    Status status = eq.getIdstatus();
                    Status statusResult = statusDAO.buscaStatusPorID(status.getIdstatus());
                    tableEquipamentos.addRow(new Object[]{eq.getIdequipamento(), eq.getNome(), eq.getMarca(), statusResult.getDescricao()});
                }

            }
        }

    }//GEN-LAST:event_txtPesquisarKeyPressed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        try {
            int linha = jTableEquipamentos.getSelectedRow();
            codigo = Integer.parseInt(tableEquipamentos.getValueAt(linha, 0).toString());
            Equipamento eq = new Equipamento();

            eq.setIdequipamento(codigo);
            if(equipamentoDAO.remove(eq)){
                JOptionPane.showMessageDialog(null,"Equipamento Excluido com sucesso!");
            }
            else{
                JOptionPane.showMessageDialog(null,"Erro ao Excluir Equipamento");
            }
            addTabela();
            limparCamposAlterar();
        } catch (Exception ex) {
            Logger.getLogger(TelaEquipamento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
       limparCamposAlterar();
        try {
            jComboStatusAlterar.removeAllItems();
            addTabela();
        } catch (Exception ex) {
            Logger.getLogger(TelaEquipamento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTabbedPane1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> jComboStatus;
    private javax.swing.JComboBox<String> jComboStatusAlterar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableEquipamentos;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtMarcaAlterar;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNomeAlterar;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables

    public int somar(int valor1, int valor2) {
      return valor1+valor2;
    }

   
}

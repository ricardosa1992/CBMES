/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.es.cb.sdro.view;

import br.gov.es.cb.sdro.model.Equipamento;
import br.gov.es.cb.sdro.model.Status;
import br.gov.es.cb.sdro.util.EquipamentoDAO;
import br.gov.es.cb.sdro.util.StatusDAO;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Patrícia
 */
public class TelaEquipamentosAlocacao extends javax.swing.JFrame {

    private DefaultTableModel tableEquipamentos;
    List<Equipamento> lstEquipamentos;
    List<Status> lstStatus;
    StatusDAO statusDAO;
    EquipamentoDAO equipamentoDAO;
    ArrayList<Integer> lstEquipamentosSelecionados;
    int idEquipamentoSelecionado;

    public TelaEquipamentosAlocacao(ArrayList<Integer> lstIdEquipamentos) throws Exception {
        initComponents();
        lstEquipamentosSelecionados = new ArrayList<Integer>();
        lstEquipamentosSelecionados = lstIdEquipamentos;
        statusDAO = new StatusDAO();
        tableEquipamentos = (DefaultTableModel) jTableEquipamentos.getModel();
        equipamentoDAO = new EquipamentoDAO();
        // lstEquipamentos = new List<Equipamento>();
        addTabela();
        this.setVisible(true);
    }

    public void addTabela() throws Exception {

        if (tableEquipamentos.getRowCount() > 0) {

            int qtd = tableEquipamentos.getRowCount();
            for (int i = 0; i < qtd; i++) {
                tableEquipamentos.removeRow(0);
                System.out.println(i);
            }
        }

        lstEquipamentos = equipamentoDAO.buscaEquipamentosDisponiveis();

        for (Equipamento eq : lstEquipamentos) {
            if (!lstEquipamentosSelecionados.contains(eq.getIdequipamento())) {
                Status status = eq.getIdstatus();
                Status statusResult = statusDAO.buscaStatusPorID(status.getIdstatus());

                tableEquipamentos.addRow(new Object[]{eq.getIdequipamento(), eq.getNome(), eq.getMarca()});
            }
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableEquipamentos = new javax.swing.JTable();
        btnSalvar = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTableEquipamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Marca"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableEquipamentos);
        if (jTableEquipamentos.getColumnModel().getColumnCount() > 0) {
            jTableEquipamentos.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        btnSalvar.setText("Selecionar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSalvar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalvar)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        int linha = jTableEquipamentos.getSelectedRow();
        idEquipamentoSelecionado = Integer.parseInt(tableEquipamentos.getValueAt(linha, 0).toString());
        TelaAlocacao tela = TelaAlocacao.getInstancia();
        tela.setIdEquipamento(idEquipamentoSelecionado);


    }//GEN-LAST:event_btnSalvarActionPerformed
    public int getIdEquipamentoSelecionado() {
        return idEquipamentoSelecionado;
    }

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
            java.util.logging.Logger.getLogger(TelaEquipamentosAlocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEquipamentosAlocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEquipamentosAlocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEquipamentosAlocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                try {
//                    new TelaEquipamentosAlocacao().setVisible(true);
//                } catch (Exception ex) {
//                    Logger.getLogger(TelaEquipamentosAlocacao.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableEquipamentos;
    // End of variables declaration//GEN-END:variables
}

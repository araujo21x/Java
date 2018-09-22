package br.com.sistemahospedagem.view;


import br.com.sistemahospedagem.dao.QuartoDAO;
import br.com.sistemahospedagem.model.Quarto;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class ListarQuartos extends javax.swing.JInternalFrame {

    private List<Quarto> lista;
    private QuartoDAO dao;
    
    public ListarQuartos() {
        initComponents();
        loadJTable();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabelaQuartos = new javax.swing.JTable();
        ExcluirFuncionario = new javax.swing.JButton();
        modificarFuncionario = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Quartos");
        setToolTipText("Quartos");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jLabel3.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel3.setText("Quartos");

        tabelaQuartos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero", "Ventilação", "UN Cama Casal", "UN Cama Solteiro"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tabelaQuartos);

        ExcluirFuncionario.setText("Exluir");
        ExcluirFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirFuncionarioActionPerformed(evt);
            }
        });

        modificarFuncionario.setText("Modificar");
        modificarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarFuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 767, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(modificarFuncionario)
                .addGap(18, 18, 18)
                .addComponent(ExcluirFuncionario)
                .addGap(296, 296, 296))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(279, 279, 279)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modificarFuncionario)
                    .addComponent(ExcluirFuncionario))
                .addContainerGap())
        );

        jScrollPane2.setViewportView(jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        int confirmacao = JOptionPane.showConfirmDialog(null, "Deseja sair?"
                , "CUIDADO!!!", JOptionPane.YES_OPTION, JOptionPane.WARNING_MESSAGE);
        if(confirmacao == JOptionPane.YES_OPTION){
            dispose();
        }
    }//GEN-LAST:event_formInternalFrameClosing

    private void ExcluirFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirFuncionarioActionPerformed
        int confirmacao = JOptionPane.showConfirmDialog(null,"Deseja excluir?",
            "CUIDADE!!!", JOptionPane.YES_OPTION, JOptionPane.WARNING_MESSAGE );
        if(confirmacao == JOptionPane.YES_OPTION){
            DefaultTableModel itensLista = (DefaultTableModel) tabelaQuartos.getModel();

            for(int i = 0; i <= lista.size(); i++){
                if(i == tabelaQuartos.getSelectedRow()){
                    itensLista.removeRow(i);// remover do jtable.
                    lista.remove(i);// remover do List
                }
            }
        }

    }//GEN-LAST:event_ExcluirFuncionarioActionPerformed

    private void modificarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarFuncionarioActionPerformed
        int i = 0;
        boolean confirmacaoExclusao = false;

        DefaultTableModel itensLista = (DefaultTableModel) tabelaQuartos.getModel();
        for( i = 0; i <= lista.size(); i++){
            if(i == tabelaQuartos.getSelectedRow()){

                //pegar os valores do que sera editado
                Quarto quartoEditavel = new Quarto();
                quartoEditavel = lista.get(i);

                //mandar dados e inicializar a janela
                ModificarQuarto modificar = new ModificarQuarto();//criar janela de editar
                modificar.preencher(quartoEditavel);//pegar dados
                getParent().add(modificar); // comando para abri o modificar, pois ele retorna o container do componente atual, no caso, de um internalframe
                modificar.setVisible(true);
                confirmacaoExclusao = modificar.getConfirmacaoExclusao();
            }
        }

        if(confirmacaoExclusao){
            //excluir o selecionado
            itensLista.removeRow(i);// remover do jtable.
            lista.remove(i);// remover do List

        }

    }//GEN-LAST:event_modificarFuncionarioActionPerformed

    public void loadJTable(){
        DefaultTableModel itensLista = (DefaultTableModel) tabelaQuartos.getModel();
        
        dao = new QuartoDAO();
        lista = dao.list();
        
        if(lista == null){ //Mensagem de Erro
            JOptionPane.showMessageDialog(null, "Nao tem Cadastro");
        }else{
            for(Quarto entity: lista) { //adiciona os intens desejado na JTable
                Object[] insered = new Object[4]; //cria a colunas
                insered[0] = entity.getNumero();
                insered[1] = entity.getVentilacao(); //preenche a colunas
                insered[2] = entity.getQuantidadeCamaCasal(); //preenche a colunas
                insered[3] = entity.getQuantidadeCamaSolteiro(); //preenche a colunas
                itensLista.addRow(insered);//inseri
            }
        }   
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExcluirFuncionario;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton modificarFuncionario;
    private javax.swing.JTable tabelaQuartos;
    // End of variables declaration//GEN-END:variables
}

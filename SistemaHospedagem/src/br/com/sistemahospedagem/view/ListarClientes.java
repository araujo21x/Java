package br.com.sistemahospedagem.view;

import br.com.sistemahospedagem.dao.ClienteDAO;
import br.com.sistemahospedagem.model.Cliente;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class ListarClientes extends javax.swing.JInternalFrame {

    private List<Cliente> lista;
    private ClienteDAO dao;
    
    public ListarClientes() {
        initComponents();
        loadJTable();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaClientes = new javax.swing.JTable();
        Excluir = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        chekIn = new javax.swing.JButton();
        chekOut = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jLabel1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel1.setText("Clientes");

        tabelaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Situação", "Nome", "Sobrenome", "CPF"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaClientes);

        Excluir.setText("Exluir");
        Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirActionPerformed(evt);
            }
        });

        modificar.setText("Modificar");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });

        chekIn.setText("Chek-in");

        chekOut.setText("chek-out");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 677, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(286, 286, 286)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(chekIn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(chekOut)
                .addGap(18, 18, 18)
                .addComponent(modificar)
                .addGap(18, 18, 18)
                .addComponent(Excluir)
                .addGap(170, 170, 170))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chekIn)
                    .addComponent(chekOut)
                    .addComponent(modificar)
                    .addComponent(Excluir))
                .addContainerGap())
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

    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirActionPerformed
        int confirmacao = JOptionPane.showConfirmDialog(null,"Deseja excluir?",
                "CUIDADE!!!", JOptionPane.YES_OPTION, JOptionPane.WARNING_MESSAGE );
        if(confirmacao == JOptionPane.YES_OPTION){
            DefaultTableModel itensLista = (DefaultTableModel) tabelaClientes.getModel();

            for(int i = 0; i <= lista.size(); i++){
                if(i == tabelaClientes.getSelectedRow()){
                    itensLista.removeRow(i);// remover do jtable.
                    lista.remove(i);// remover do List
                }
            }    
        }
            
    }//GEN-LAST:event_ExcluirActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        
        DefaultTableModel itensLista = (DefaultTableModel) tabelaClientes.getModel();
        for(int i = 0; i <= lista.size(); i++){
            if(i == tabelaClientes.getSelectedRow()){
                
                //pegar os valores do que sera editado
                Cliente clieteEditavel = new Cliente();
                clieteEditavel = lista.get(i);
                
                //excluir o selecionado
                itensLista.removeRow(i);// remover do jtable.
                lista.remove(i);// remover do List
                
                //mandar dados e inicializar a janela
                ModificarCliente modificar = new ModificarCliente();//criar janela de editar
                modificar.preencher(clieteEditavel);//pegar dados
                getParent().add(modificar); // comando para abri o modificar, pois ele retorna o container do componente atual, no caso, de um internalframe
                modificar.setVisible(true);
            }
        }
    }//GEN-LAST:event_modificarActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        int confirmacao = JOptionPane.showConfirmDialog(null, "Deseja sair?"
                , "CUIDADO!!!", JOptionPane.YES_OPTION, JOptionPane.WARNING_MESSAGE);
        if(confirmacao == JOptionPane.YES_OPTION){
            dispose();
        }
    }//GEN-LAST:event_formInternalFrameClosing

    public void loadJTable(){
        DefaultTableModel itensLista = (DefaultTableModel) tabelaClientes.getModel();
        
        dao = new ClienteDAO();
        lista = dao.list();
        
        if(lista == null){ //Mensagem de Erro
            JOptionPane.showMessageDialog(null, "Nao tem Cadastro");
        }else{
            for(Cliente entity: lista) { //adiciona os intens desejado na JTable
                Object[] insered = new Object[4]; //cria a colunas
                insered[0] = entity.getSituacao(); //preenche a colunas
                insered[1] = entity.getNome(); //preenche a colunas
                insered[2] = entity.getSobrenome(); //preenche a colunas
                insered[3] = entity.getCpf(); //preenche a colunas
                itensLista.addRow(insered);//inseri
            }
        }   
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Excluir;
    private javax.swing.JButton chekIn;
    private javax.swing.JButton chekOut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modificar;
    private javax.swing.JTable tabelaClientes;
    // End of variables declaration//GEN-END:variables
}

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

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabelaClientes = new javax.swing.JTable();
        ExcluirFuncionario = new javax.swing.JButton();
        modificarFuncionario = new javax.swing.JButton();
        chekIn = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Clientes");
        setToolTipText("Clientes");
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

        jLabel3.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel3.setText("Clientes");

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
        jScrollPane4.setViewportView(tabelaClientes);

        ExcluirFuncionario.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ExcluirFuncionario.setText("Exluir");
        ExcluirFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirFuncionarioActionPerformed(evt);
            }
        });

        modificarFuncionario.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        modificarFuncionario.setText("Modificar");
        modificarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarFuncionarioActionPerformed(evt);
            }
        });

        chekIn.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        chekIn.setText("ChekIn");
        chekIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chekInActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 767, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(345, 345, 345)
                        .addComponent(jLabel3))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(chekIn)
                        .addGap(18, 18, 18)
                        .addComponent(modificarFuncionario)
                        .addGap(18, 18, 18)
                        .addComponent(ExcluirFuncionario)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chekIn)
                    .addComponent(modificarFuncionario)
                    .addComponent(ExcluirFuncionario))
                .addContainerGap(162, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 758, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
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

            DefaultTableModel itensLista = (DefaultTableModel) tabelaClientes.getModel();

            for(int i = 0; i <= lista.size(); i++){
                if(i == tabelaClientes.getSelectedRow()){
                  itensLista.removeRow(i);// remover do jtable.
                  lista.remove(i);// remover do List
                }
            }    
      }

    }//GEN-LAST:event_ExcluirFuncionarioActionPerformed

    private void modificarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarFuncionarioActionPerformed
        DefaultTableModel itensLista = (DefaultTableModel) tabelaClientes.getModel();
        
        for(int i = 0; i <= lista.size(); i++){
            if(i == tabelaClientes.getSelectedRow()){              
                Cliente clieteEditavel = new Cliente();
                ModificarCliente modificar = new ModificarCliente();
                clieteEditavel = lista.get(i);
                modificar.preencher(clieteEditavel);
                
                //Visibilidade de tela
                getParent().add(modificar); 
                modificar.setVisible(true);
                //Apagar
                itensLista.removeRow(i);
                lista.remove(i);
                
            } 
        }
    }//GEN-LAST:event_modificarFuncionarioActionPerformed

    private void chekInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chekInActionPerformed
        //passar informaçoes do cliente
        DefaultTableModel itensLista = (DefaultTableModel) tabelaClientes.getModel();
        
        for(int i = 0; i <= lista.size(); i++){
            if(i == tabelaClientes.getSelectedRow()){
                //Abrir tela
                CadastroCheckIn telaCheckIn = new CadastroCheckIn();
                telaCheckIn.pegarIndexCliente(i);
                getParent().add(telaCheckIn);
                telaCheckIn.setVisible(true);
            }
        }
    }//GEN-LAST:event_chekInActionPerformed

    public void loadJTable(){
        
        DefaultTableModel itensLista = (DefaultTableModel) tabelaClientes.getModel();//tabelaCliente e o nome da tabela

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
    private javax.swing.JButton ExcluirFuncionario;
    private javax.swing.JButton chekIn;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton modificarFuncionario;
    private javax.swing.JTable tabelaClientes;
    // End of variables declaration//GEN-END:variables
}

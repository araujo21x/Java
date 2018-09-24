package br.com.sistemahospedagem.view;

import br.com.sistemahospedagem.dao.CheckInDAO;
import br.com.sistemahospedagem.model.CheckIn;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class ClientesAtivos extends javax.swing.JInternalFrame {

    private List<CheckIn> listaCheckIn;
    private CheckInDAO daoCheckIn;
    
    public ClientesAtivos() {
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
        modificarChekIn = new javax.swing.JButton();
        CheckOut = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Clientes Ativos");
        setToolTipText("Clientes Ativos");
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
        jLabel3.setText("Clientes Ativos");

        tabelaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "Quarto", "Valor"
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

        modificarChekIn.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        modificarChekIn.setText("Modificar ChekIn");
        modificarChekIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarChekInActionPerformed(evt);
            }
        });

        CheckOut.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        CheckOut.setText("Check-Out");
        CheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 835, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(345, 345, 345)
                        .addComponent(jLabel3))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(CheckOut)
                        .addGap(73, 73, 73)
                        .addComponent(modificarChekIn)))
                .addContainerGap(277, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CheckOut)
                    .addComponent(modificarChekIn))
                .addContainerGap(151, Short.MAX_VALUE))
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

    private void CheckOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckOutActionPerformed
        DefaultTableModel itensLista = (DefaultTableModel) tabelaClientes.getModel();
        
        for(int i = 0; i <= listaCheckIn.size(); i++){
            if(i == tabelaClientes.getSelectedRow()){
                itensLista.removeRow(i);// remover do jtable.
                listaCheckIn.remove(i);// remover do List
            }
        }
    }//GEN-LAST:event_CheckOutActionPerformed

    private void modificarChekInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarChekInActionPerformed
        int i;
        boolean confirmacaoExclusao = false;
        
        DefaultTableModel itensLista = (DefaultTableModel) tabelaClientes.getModel();
        for( i = 0; i <= listaCheckIn.size(); i++){
            if(i == tabelaClientes.getSelectedRow()){                
                CheckIn CheckInEditavel = new CheckIn();
                ModificarCheckIn modificar = new ModificarCheckIn();//criar janela de editar
                
                CheckInEditavel = listaCheckIn.get(i);
                modificar.receberDados(CheckInEditavel);//pegar dados
                
                getParent().add(modificar); // comando para abri o modificar, pois ele retorna o container do componente atual, no caso, de um internalframe
                modificar.setVisible(true);
                
                confirmacaoExclusao = modificar.getConfirmacaoExclusao();
            }
        }
        if(confirmacaoExclusao){
            itensLista.removeRow(i);// remover do jtable.
            listaCheckIn.remove(i);// remover do List
        }
    }//GEN-LAST:event_modificarChekInActionPerformed
    public void loadJTable(){
        
        DefaultTableModel itensLista = (DefaultTableModel) tabelaClientes.getModel();//tabelaCliente e o nome da tabela

        daoCheckIn = new CheckInDAO();
        listaCheckIn = daoCheckIn.list();

        if(listaCheckIn == null){ //Mensagem de Erro
            JOptionPane.showMessageDialog(null, "Nao tem Cadastro");
        }else{
            for(CheckIn entity: listaCheckIn) { //adicionar os intens desejado na JTable 
                Object[] insered = new Object[4]; //criar a colunas
                insered[0] = entity. getCliente().getNome(); //preencher a colunas
                insered[1] = entity.getCliente().getCpf(); //preencher a colunas
                insered[2] = entity.getQuarto().getNumero(); //preencher a colunas
                insered[3] = entity.getTotaConta(); //preencher a colunas
                itensLista.addRow(insered);//inserir
            }
        }     
    }   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CheckOut;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton modificarChekIn;
    private javax.swing.JTable tabelaClientes;
    // End of variables declaration//GEN-END:variables
}

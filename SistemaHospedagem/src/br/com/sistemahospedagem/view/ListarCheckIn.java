package br.com.sistemahospedagem.view;

import br.com.sistemahospedagem.dao.CheckInDAO;
import br.com.sistemahospedagem.model.CheckIn;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class ListarCheckIn extends javax.swing.JInternalFrame {

    private List<CheckIn> listaCheckIn;
    private CheckInDAO daoCheckIn;
    
    public ListarCheckIn() {
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
        adicionarConsumo = new javax.swing.JButton();
        CheckOut = new javax.swing.JButton();
        modificarCheckIn = new javax.swing.JButton();

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

        adicionarConsumo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        adicionarConsumo.setText("ADD Consumo");
        adicionarConsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarConsumoActionPerformed(evt);
            }
        });

        CheckOut.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        CheckOut.setText("Check-Out");
        CheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckOutActionPerformed(evt);
            }
        });

        modificarCheckIn.setText("Editar");
        modificarCheckIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarCheckInActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 873, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(345, 345, 345)
                        .addComponent(jLabel3))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(CheckOut)
                        .addGap(18, 18, 18)
                        .addComponent(modificarCheckIn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(adicionarConsumo)))
                .addContainerGap(319, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CheckOut)
                    .addComponent(adicionarConsumo)
                    .addComponent(modificarCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                JOptionPane.showMessageDialog(null,"Nome:"+listaCheckIn.get(i).getCliente().
                        getNome()+" "+listaCheckIn.get(i).getCliente().getSobrenome()+" "
                                + "Total a pagar:"+listaCheckIn.get(i).getTotaConta());
                itensLista.removeRow(i);// remover do jtable.
                listaCheckIn.remove(i);// remover do List                
                dispose();
            }
        }
    }//GEN-LAST:event_CheckOutActionPerformed

    private void adicionarConsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarConsumoActionPerformed

        DefaultTableModel itensLista = (DefaultTableModel) tabelaClientes.getModel();
        for(int i = 0; i <= listaCheckIn.size(); i++){
            if(i == tabelaClientes.getSelectedRow()){                
                CheckIn CheckInEditavel = new CheckIn();
                CadastrarConsumo modificar = new CadastrarConsumo();
                CheckInEditavel = listaCheckIn.get(i);
                modificar.receberDados(CheckInEditavel);
                
                getParent().add(modificar);
                modificar.setVisible(true);
                
                itensLista.removeRow(i);
                listaCheckIn.remove(i);

                dispose();
            } 
        }
    }//GEN-LAST:event_adicionarConsumoActionPerformed

    private void modificarCheckInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarCheckInActionPerformed
        DefaultTableModel itensLista = (DefaultTableModel) tabelaClientes.getModel();
        for(int i = 0; i <= listaCheckIn.size(); i++){
            if(i == tabelaClientes.getSelectedRow()){                
                CheckIn CheckInEditavel = new CheckIn();
                ModificarCheckIn modificar = new ModificarCheckIn();
                
                CheckInEditavel = listaCheckIn.get(i);
                modificar.receberDados(CheckInEditavel);
                modificar.preencher();
                
                getParent().add(modificar);
                modificar.setVisible(true);
                
                
                itensLista.removeRow(i);
                listaCheckIn.remove(i);
                
                dispose();
            } 
        }
    }//GEN-LAST:event_modificarCheckInActionPerformed
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
    private javax.swing.JButton adicionarConsumo;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton modificarCheckIn;
    private javax.swing.JTable tabelaClientes;
    // End of variables declaration//GEN-END:variables
}

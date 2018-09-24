package br.com.sistemahospedagem.view;

import br.com.sistemahospedagem.dao.CheckInDAO;
import br.com.sistemahospedagem.dao.ClienteDAO;
import br.com.sistemahospedagem.dao.QuartoDAO;
import br.com.sistemahospedagem.model.CheckIn;
import br.com.sistemahospedagem.model.Cliente;
import br.com.sistemahospedagem.model.Quarto;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ModificarCheckIn extends javax.swing.JInternalFrame {
    
    private boolean confirmacaoExclusao = false;
    
    private List<Quarto> listaQuartos;
    //private List<Cliente> listaClientes;
    private QuartoDAO daoQuartos;
    //private ClienteDAO daoClientes;
    private CheckIn chekInModificado;
    
    public ModificarCheckIn(){
        initComponents();
        loadJTable();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cancelar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        quartosDisponiveis = new javax.swing.JTable();
        confirmar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        saude = new javax.swing.JTextField();
        quantidadeDias = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        quantidadePessoas = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        quantidadeQuartos = new javax.swing.JComboBox<>();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro de Cliente");
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

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Check In");

        cancelar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        quartosDisponiveis.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(quartosDisponiveis);

        confirmar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        confirmar.setText("Confirmar");
        confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Quantidade de Dias:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Problemas de Saude:");

        saude.setText("Problemas de saude");

        quantidadeDias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Quantidade de Pessoas:");

        quantidadePessoas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        quantidadePessoas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Quantidade de Quartos:");

        quantidadeQuartos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(251, 251, 251)
                            .addComponent(jLabel1))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(quantidadeDias, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(quantidadePessoas, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(quantidadeQuartos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(saude, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(cancelar)
                        .addGap(185, 185, 185)
                        .addComponent(confirmar)))
                .addContainerGap(529, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(quantidadeDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(quantidadePessoas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(quantidadeQuartos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(saude, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelar)
                    .addComponent(confirmar))
                .addGap(280, 280, 280))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        int confirmacao = JOptionPane.showConfirmDialog(this, "Deseja fechar essa janela?",
                "Atenção", JOptionPane.YES_OPTION, JOptionPane.WARNING_MESSAGE);
        if(confirmacao == JOptionPane.YES_OPTION){
            dispose();
        }
    }//GEN-LAST:event_formInternalFrameClosing

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        int confirmacao = JOptionPane.showConfirmDialog(this, "Deseja fechar essa janela?",
            "Atenção", JOptionPane.YES_OPTION, JOptionPane.WARNING_MESSAGE);
        if(confirmacao == JOptionPane.YES_OPTION){
            dispose();
        }
    }//GEN-LAST:event_cancelarActionPerformed
    public void receberDados(CheckIn checkIn){
        chekInModificado = new CheckIn();        
        chekInModificado = checkIn;        
    }
    public void preencher(){
        String converso;
        
        converso = Integer.toString(chekInModificado.getDias());
        quantidadeDias.setSelectedItem(converso);
        
        converso = Integer.toString(chekInModificado.getPessoas());
        quantidadePessoas.setSelectedItem(converso);
        
    }
    private void confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarActionPerformed
        Integer confirmacao = JOptionPane.showConfirmDialog(null, "Deseja mudar dados do "
                + "cliente", "ATENÇÂO!!!", JOptionPane.WARNING_MESSAGE, JOptionPane.YES_OPTION);
        
        DefaultTableModel itensLista = (DefaultTableModel) quartosDisponiveis.getModel();
        
        if(confirmacao == JOptionPane.YES_OPTION){
            Integer conversor;
            Double ValorQuarto;
            confirmacaoExclusao = true;
            
            Cliente clienteSelecionado = new Cliente();
            /*daoClientes = new ClienteDAO();
            listaClientes = daoClientes.list();*/
            clienteSelecionado = chekInModificado.getCliente();
        
            for(int i = 0; i <= listaQuartos.size(); i++){
                if(i == quartosDisponiveis.getSelectedRow()){
                    chekInModificado.setQuarto(listaQuartos.get(i));
                }
            }

            conversor = Integer.parseInt((String)quantidadeDias.getSelectedItem());
            chekInModificado.setDias(conversor);
            conversor = Integer.parseInt((String)quantidadePessoas.getSelectedItem());
            chekInModificado.setPessoas(conversor);
            conversor = Integer.parseInt((String)quantidadeQuartos.getSelectedItem());
            chekInModificado.setQuantidadeQuartos(conversor);
            chekInModificado.setCliente(clienteSelecionado);
        
            if(chekInModificado.getQuarto().getVentilacao().equals("Ventilador")){
                ValorQuarto = (45 * (double)chekInModificado.getPessoas()) * (double)chekInModificado.getDias();
            }else{//Ar
                ValorQuarto = (50 * (double)chekInModificado.getPessoas()) * (double)chekInModificado.getDias();
            }
        
            chekInModificado.setTotaConta(ValorQuarto);
        
        
            CheckInDAO daoCheckIn = new CheckInDAO();
            daoCheckIn.save(chekInModificado);    
        }
        
        
    }//GEN-LAST:event_confirmarActionPerformed
    public boolean getConfirmacaoExclusao(){
        return confirmacaoExclusao;
    }
    private void loadJTable(){
        
        DefaultTableModel itensLista = (DefaultTableModel) quartosDisponiveis.getModel();
        
        daoQuartos = new QuartoDAO();
        listaQuartos = daoQuartos.list();
        
        if(listaQuartos == null){ //Mensagem de Erro
            JOptionPane.showMessageDialog(null, "Nao tem Cadastro");
        }else{
            for(Quarto entity: listaQuartos) { //adiciona os intens desejado na JTable
                if(entity.getStatus().equals("Inativo")){
                    Object[] insered = new Object[4]; //cria a colunas
                    insered[0] = entity.getNumero();
                    insered[1] = entity.getVentilacao(); //preenche a colunas
                    insered[2] = entity.getQuantidadeCamaCasal(); //preenche a colunas
                    insered[3] = entity.getQuantidadeCamaSolteiro(); //preenche a colunas
                    itensLista.addRow(insered);//inseri
                }
            }
        }   
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar;
    private javax.swing.JButton confirmar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> quantidadeDias;
    private javax.swing.JComboBox<String> quantidadePessoas;
    private javax.swing.JComboBox<String> quantidadeQuartos;
    private javax.swing.JTable quartosDisponiveis;
    private javax.swing.JTextField saude;
    // End of variables declaration//GEN-END:variables
}

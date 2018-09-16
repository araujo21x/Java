//* @author araujo
package br.com.sistemahospedagem.view;

import javax.swing.JOptionPane;

public class TelaPrincipal extends javax.swing.JFrame {
    public TelaPrincipal() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu4 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        listarClientes = new javax.swing.JMenu();
        cadastrarCliente = new javax.swing.JMenuItem();
        listarCliente = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenu();
        cadastrarQuartos = new javax.swing.JMenuItem();
        listarQuartos = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        cadastrarFuncionario = new javax.swing.JMenuItem();
        listarFuncionarios = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        desenvolvedores = new javax.swing.JMenuItem();
        sair = new javax.swing.JMenuItem();

        jMenu4.setText("jMenu4");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jDesktopPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jDesktopPane1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                jDesktopPane1ComponentMoved(evt);
            }
        });

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 976, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 595, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        jMenuBar1.setBackground(new java.awt.Color(153, 153, 153));

        listarClientes.setText("Cliente");
        listarClientes.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        cadastrarCliente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cadastrarCliente.setText("Cadastrar");
        cadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarClienteActionPerformed(evt);
            }
        });
        listarClientes.add(cadastrarCliente);

        listarCliente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        listarCliente.setText("Listar");
        listarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarClienteActionPerformed(evt);
            }
        });
        listarClientes.add(listarCliente);

        jMenuBar1.add(listarClientes);

        jMenuItem2.setText("Quartos");
        jMenuItem2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        cadastrarQuartos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cadastrarQuartos.setText("Cadastrar");
        jMenuItem2.add(cadastrarQuartos);

        listarQuartos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        listarQuartos.setText("Listar");
        jMenuItem2.add(listarQuartos);

        jMenuBar1.add(jMenuItem2);

        jMenu9.setText("Funcionario");
        jMenu9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        cadastrarFuncionario.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cadastrarFuncionario.setText("Cadastrar");
        cadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarFuncionarioActionPerformed(evt);
            }
        });
        jMenu9.add(cadastrarFuncionario);

        listarFuncionarios.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        listarFuncionarios.setText("Listar");
        listarFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarFuncionariosActionPerformed(evt);
            }
        });
        jMenu9.add(listarFuncionarios);

        jMenuBar1.add(jMenu9);

        jMenu10.setText("Funcionalidades");
        jMenu10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        desenvolvedores.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        desenvolvedores.setText("Desenvolvedores");
        jMenu10.add(desenvolvedores);

        sair.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        jMenu10.add(sair);

        jMenuBar1.add(jMenu10);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jDesktopPane1ComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jDesktopPane1ComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jDesktopPane1ComponentMoved

    private void cadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarClienteActionPerformed
        CadastrarCliente cadastrarCliente = new CadastrarCliente();
        jDesktopPane1.add(cadastrarCliente);
        cadastrarCliente.setVisible(true);
    }//GEN-LAST:event_cadastrarClienteActionPerformed

    private void cadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarFuncionarioActionPerformed
        CadastrarFuncionario cadastrarFuncionario = new CadastrarFuncionario();
        jDesktopPane1.add(cadastrarFuncionario);
        cadastrarFuncionario.setVisible(true);
    }//GEN-LAST:event_cadastrarFuncionarioActionPerformed

    private void listarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarClienteActionPerformed
        ListarClientes listarCliente = new ListarClientes();
        jDesktopPane1.add(listarCliente);
        listarCliente.setVisible(true);
    }//GEN-LAST:event_listarClienteActionPerformed

    private void listarFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarFuncionariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listarFuncionariosActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        int confirmacao = JOptionPane.showConfirmDialog(null,"Deseja excluir?",
                "CUIDADE!!!", JOptionPane.YES_OPTION, JOptionPane.WARNING_MESSAGE );
        if(confirmacao == JOptionPane.YES_OPTION){
            dispose();    
        }        
    }//GEN-LAST:event_sairActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int confirmacao = JOptionPane.showConfirmDialog(null,"Deseja Sair?",
                "ATENÇÃO!!!", JOptionPane.YES_OPTION, JOptionPane.WARNING_MESSAGE );
        if(confirmacao == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "Tchau!, Obrigado!!!");
            dispose();    
        }   
    }//GEN-LAST:event_formWindowClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem cadastrarCliente;
    private javax.swing.JMenuItem cadastrarFuncionario;
    private javax.swing.JMenuItem cadastrarQuartos;
    private javax.swing.JMenuItem desenvolvedores;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem listarCliente;
    private javax.swing.JMenu listarClientes;
    private javax.swing.JMenuItem listarFuncionarios;
    private javax.swing.JMenuItem listarQuartos;
    private javax.swing.JMenuItem sair;
    // End of variables declaration//GEN-END:variables
}

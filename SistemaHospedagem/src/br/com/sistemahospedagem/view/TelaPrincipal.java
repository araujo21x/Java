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
        clienteAtivos = new javax.swing.JMenuItem();
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
        setTitle("Tela Pincipal");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setMaximumSize(new java.awt.Dimension(1366, 780));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 780));

        jDesktopPane1.setAutoscrolls(true);
        jDesktopPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jDesktopPane1.setMaximumSize(new java.awt.Dimension(1366, 768));
        jDesktopPane1.setMinimumSize(new java.awt.Dimension(800, 600));
        jDesktopPane1.setName("TelaPrincipal"); // NOI18N
        jDesktopPane1.setPreferredSize(new java.awt.Dimension(1366, 768));
        jDesktopPane1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                jDesktopPane1ComponentMoved(evt);
            }
        });

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1368, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 635, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1368, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(153, 153, 153));

        listarClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sistemahospedagem/imagens/Cliente.png"))); // NOI18N
        listarClientes.setText("Cliente");
        listarClientes.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        cadastrarCliente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cadastrarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sistemahospedagem/imagens/group_add.png"))); // NOI18N
        cadastrarCliente.setText("Cadastrar");
        cadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarClienteActionPerformed(evt);
            }
        });
        listarClientes.add(cadastrarCliente);

        listarCliente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        listarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sistemahospedagem/imagens/user.png"))); // NOI18N
        listarCliente.setText("Listar");
        listarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarClienteActionPerformed(evt);
            }
        });
        listarClientes.add(listarCliente);

        clienteAtivos.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        clienteAtivos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sistemahospedagem/imagens/accept.png"))); // NOI18N
        clienteAtivos.setText("Clientes Ativos");
        clienteAtivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteAtivosActionPerformed(evt);
            }
        });
        listarClientes.add(clienteAtivos);

        jMenuBar1.add(listarClientes);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sistemahospedagem/imagens/quartos.png"))); // NOI18N
        jMenuItem2.setText("Quartos");
        jMenuItem2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        cadastrarQuartos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cadastrarQuartos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sistemahospedagem/imagens/door_in.png"))); // NOI18N
        cadastrarQuartos.setText("Cadastrar");
        cadastrarQuartos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarQuartosActionPerformed(evt);
            }
        });
        jMenuItem2.add(cadastrarQuartos);

        listarQuartos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        listarQuartos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sistemahospedagem/imagens/door_out.png"))); // NOI18N
        listarQuartos.setText("Listar");
        listarQuartos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarQuartosActionPerformed(evt);
            }
        });
        jMenuItem2.add(listarQuartos);

        jMenuBar1.add(jMenuItem2);

        jMenu9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sistemahospedagem/imagens/funcionario.png"))); // NOI18N
        jMenu9.setText("Funcionario");
        jMenu9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        cadastrarFuncionario.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cadastrarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sistemahospedagem/imagens/vcard_add.png"))); // NOI18N
        cadastrarFuncionario.setText("Cadastrar");
        cadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarFuncionarioActionPerformed(evt);
            }
        });
        jMenu9.add(cadastrarFuncionario);

        listarFuncionarios.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        listarFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sistemahospedagem/imagens/vcard.png"))); // NOI18N
        listarFuncionarios.setText("Listar");
        listarFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarFuncionariosActionPerformed(evt);
            }
        });
        jMenu9.add(listarFuncionarios);

        jMenuBar1.add(jMenu9);

        jMenu10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sistemahospedagem/imagens/funcionalides.png"))); // NOI18N
        jMenu10.setText("Funcionalidades");
        jMenu10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        desenvolvedores.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        desenvolvedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sistemahospedagem/imagens/compiuter.png"))); // NOI18N
        desenvolvedores.setText("Desenvolvedores");
        desenvolvedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desenvolvedoresActionPerformed(evt);
            }
        });
        jMenu10.add(desenvolvedores);

        sair.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sistemahospedagem/imagens/cancel.png"))); // NOI18N
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
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE)
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
        ListarFuncionarios listarFuncionarios = new ListarFuncionarios();
        jDesktopPane1.add(listarFuncionarios);
        listarFuncionarios.setVisible(true);
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

    private void cadastrarQuartosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarQuartosActionPerformed
        CadastrarQuarto cadastrarQuarto = new CadastrarQuarto();
        jDesktopPane1.add(cadastrarQuarto);
        cadastrarQuarto.setVisible(true);
    }//GEN-LAST:event_cadastrarQuartosActionPerformed

    private void listarQuartosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarQuartosActionPerformed
        ListarQuartos listaQuarto = new ListarQuartos();
        jDesktopPane1.add(listaQuarto);
        listaQuarto.setVisible(true);
    }//GEN-LAST:event_listarQuartosActionPerformed

    private void clienteAtivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteAtivosActionPerformed
        ListarCheckIn clientesAtivos = new ListarCheckIn();
        jDesktopPane1.add(clientesAtivos);
        clientesAtivos.setVisible(true);
    }//GEN-LAST:event_clienteAtivosActionPerformed

    private void desenvolvedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desenvolvedoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_desenvolvedoresActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem cadastrarCliente;
    private javax.swing.JMenuItem cadastrarFuncionario;
    private javax.swing.JMenuItem cadastrarQuartos;
    private javax.swing.JMenuItem clienteAtivos;
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

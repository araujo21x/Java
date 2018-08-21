//* @author araujo
package view;

public class TelaInicial extends javax.swing.JFrame {
    public TelaInicial() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu4 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu8 = new javax.swing.JMenu();
        cadastrarCliente = new javax.swing.JMenuItem();
        chekIn = new javax.swing.JMenuItem();
        chekOut = new javax.swing.JMenuItem();
        despesas = new javax.swing.JMenuItem();
        modificarCadastro = new javax.swing.JMenuItem();
        verificarSituacao = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenu();
        cadastrarQuartos = new javax.swing.JMenuItem();
        situacaoQuarto = new javax.swing.JMenuItem();
        modificarQuarto = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        verificarFuncionarios = new javax.swing.JMenuItem();
        cadastrarFuncionario = new javax.swing.JMenuItem();
        modificarFuncionario = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        desenvolvedores = new javax.swing.JMenuItem();
        sair = new javax.swing.JMenuItem();

        jMenu4.setText("jMenu4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(getMaximumSize());

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
            .addGap(0, 987, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 595, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        jMenuBar1.setBackground(new java.awt.Color(153, 153, 153));

        jMenu8.setText("Cliente");
        jMenu8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        cadastrarCliente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cadastrarCliente.setText("Cadastrar");
        cadastrarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastrarClienteMouseClicked(evt);
            }
        });
        jMenu8.add(cadastrarCliente);

        chekIn.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        chekIn.setText("Chek-in");
        jMenu8.add(chekIn);

        chekOut.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        chekOut.setText("Chek-out");
        jMenu8.add(chekOut);

        despesas.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        despesas.setText("Despesas");
        jMenu8.add(despesas);

        modificarCadastro.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        modificarCadastro.setText("Modificar Cadastro");
        jMenu8.add(modificarCadastro);

        verificarSituacao.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        verificarSituacao.setText("Verificar Situação");
        jMenu8.add(verificarSituacao);

        jMenuBar1.add(jMenu8);

        jMenuItem2.setText("Quartos");
        jMenuItem2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        cadastrarQuartos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cadastrarQuartos.setText("Cadastrar");
        jMenuItem2.add(cadastrarQuartos);

        situacaoQuarto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        situacaoQuarto.setText("Situação");
        situacaoQuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                situacaoQuartoActionPerformed(evt);
            }
        });
        jMenuItem2.add(situacaoQuarto);

        modificarQuarto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        modificarQuarto.setText("Modificar");
        modificarQuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarQuartoActionPerformed(evt);
            }
        });
        jMenuItem2.add(modificarQuarto);

        jMenuBar1.add(jMenuItem2);

        jMenu9.setText("Funcionario");
        jMenu9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        verificarFuncionarios.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        verificarFuncionarios.setText("Verificar");
        jMenu9.add(verificarFuncionarios);

        cadastrarFuncionario.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cadastrarFuncionario.setText("Cadastrar");
        jMenu9.add(cadastrarFuncionario);

        modificarFuncionario.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        modificarFuncionario.setText("Modificar");
        jMenu9.add(modificarFuncionario);

        jMenuBar1.add(jMenu9);

        jMenu10.setText("Funcionalidades");
        jMenu10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        desenvolvedores.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        desenvolvedores.setText("Desenvolvedores");
        jMenu10.add(desenvolvedores);

        sair.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        sair.setText("Sair");
        jMenu10.add(sair);

        jMenuBar1.add(jMenu10);

        setJMenuBar(jMenuBar1);

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

    private void modificarQuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarQuartoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modificarQuartoActionPerformed

    private void situacaoQuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_situacaoQuartoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_situacaoQuartoActionPerformed

    private void cadastrarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrarClienteMouseClicked
        
       
    }//GEN-LAST:event_cadastrarClienteMouseClicked

    private void jDesktopPane1ComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jDesktopPane1ComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jDesktopPane1ComponentMoved

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem cadastrarCliente;
    private javax.swing.JMenuItem cadastrarFuncionario;
    private javax.swing.JMenuItem cadastrarQuartos;
    private javax.swing.JMenuItem chekIn;
    private javax.swing.JMenuItem chekOut;
    private javax.swing.JMenuItem desenvolvedores;
    private javax.swing.JMenuItem despesas;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem modificarCadastro;
    private javax.swing.JMenuItem modificarFuncionario;
    private javax.swing.JMenuItem modificarQuarto;
    private javax.swing.JMenuItem sair;
    private javax.swing.JMenuItem situacaoQuarto;
    private javax.swing.JMenuItem verificarFuncionarios;
    private javax.swing.JMenuItem verificarSituacao;
    // End of variables declaration//GEN-END:variables
}

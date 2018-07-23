//  @author Lucas de Araujo
package sistemavendas;

public class SistemaVendas {

  
    public static void main(String[] args) {
      
       //Vendedor[] vendedores = new Vendedor[3];
            //vendedores[0] = new Vendedor(0,"Severino", "Senhor do Bonfim-BA");
       Vendedor  vendedor = new Vendedor (1,"Joaquin", "Senhor do Bonfim-BA");
       
       Cliente[] clientes = new Cliente[3];
            clientes[0] = new Cliente(0," Cleisson Fabricio", "Senhor do Bonfim-BA");
            clientes[1] = new Cliente(1," Maria Pedrina", "Senhor do Bonfim-BA");
       
            
       Produto[] produtos = new Produto[20];
       //int cod,int quantidade, double valoUnit,String tipo,String nome
       
       produtos[0] =vendedor.cadastrarProduto(0,10,3.70,"Unidade","Feijão");
       produtos[1] =vendedor.cadastrarProduto(1,15,2.85,"Unidade","Arroz");
       produtos[2] =vendedor.cadastrarProduto(2,8,2.85,"Kg","Carne de sol");
       produtos[3] =vendedor.cadastrarProduto(3,8,0.90,"Unidade","Sal");
       produtos[4] =vendedor.cadastrarProduto(4,8,10,"Kg","Frango");
       
       Venda[] vendas = new Venda[5];
            
            vendas[0] = vendedor.vender(0,"16/07/2018", clientes[0], vendedor, "Cartão");
            vendas[1] = vendedor.vender(0,"18/07/2018", clientes[1], vendedor, "Dinheiro"); 
            
       ItensVenda[] itemVenda = new ItensVenda[20];
            itemVenda[0] = vendedor.incluirItem(0, produtos[0], 2, vendas[0]);
            itemVenda[1] = vendedor.incluirItem(3, produtos[2], 2, vendas[0]);
            itemVenda[2] = vendedor.incluirItem(1, produtos[1], 2, vendas[1]);
            itemVenda[3] = vendedor.incluirItem(1, produtos[4], 2, vendas[1]);


        vendedor.mostrarVenda(itemVenda,vendas[0]);   
        vendedor.mostrarVenda(itemVenda,vendas[1]);
        
        vendedor.getFaturamentoGeral();
        }
}

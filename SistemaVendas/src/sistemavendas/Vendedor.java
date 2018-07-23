//  @author Lucas de Araujo
package sistemavendas;

public class Vendedor {
    private int cod;
    private String nome;
    private String endereço;
    private double faturamentoGeral;

    public  Vendedor(int cod, String nome, String endereço){
    this.cod= cod;
    this.nome= nome;
    this.endereço=endereço;     
    } 

    public void getFaturamentoGeral() {
        System.out.println("Faturamento Geral = "+faturamentoGeral);
    }
    public void setFaturamentoGeral(Venda venda){
        String data="16/07/2018";
        int opcao = 1;
        if(opcao == 1){
            this.faturamentoGeral += venda.getTotalVenda();
        }else{
            if(venda.getData().equals(data)){
            this.faturamentoGeral += venda.getTotalVenda();
            }
        }
    }

    public int getCod() {
        return cod;
    }
    public void setCod(int cod) {
        this.cod = cod;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereço() {
        return endereço;
    }
    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
    public Venda  vender(int cod, String data, Cliente cliente, Vendedor vendedor, String formapagamento){
         return new Venda( cod, data, cliente , vendedor , formapagamento);
    }
    public String  cancelarVenda(Venda venda){
         venda.setSituação("Cancelado");
         return "Venda cancelada com sucesso!";
    }
    public String cancelarItem(){
        return "";
    }
    public Produto cadastrarProduto(int cod,int quantidade, double valorUnit,
        String tipo,String nome){
        return new Produto(cod,quantidade,valorUnit,tipo,nome);
    }
    public Produto cancelarProduto(int cod, int quantidade, double valorUnit, String tipo, String nome){
        return new Produto(cod,quantidade,valorUnit,tipo,nome);
    }
    public  Cliente cadastrarCliente(int cod, String nome, String endereço){
         return new Cliente(cod,nome,endereço);
    }
    public ItensVenda incluirItem(int cod,Produto produto, int quantidade,Venda venda ){
        double ValorUnit = produto.getValorUnit();
        double subTotal =  ValorUnit * quantidade;
        ItensVenda item = new ItensVenda();
        item.setCod(cod);
        item.setProduto(produto);
        item.setQuantidade(quantidade);
        item.setSubtotal(subTotal);
        item.setVenda(venda);
        item.setSituaçao("Ativo");
        
        return item; 
    }
    public ItensVenda incluirItem(int cod, double desconto, Produto produto, int quantidade,Venda venda ){
        
        double ValorUnit = produto.getValorUnit();
        double subTotal =  ValorUnit * quantidade;
        ItensVenda item = new ItensVenda();
        item.setCod(cod);
        item.setProduto(produto);
        item.setQuantidade(quantidade);
        item.setSubtotal(subTotal);
        item.setVenda(venda);
        item.setSituaçao("Ativo");
        return item;
    
    }
    public String fecharVenda(Venda venda){  
        venda.setSituação("Finalizado");
        return " Venda finalizada com sucesso!0";
        
    }
    public void mostrarVenda(ItensVenda[] itens, Venda venda){
        int cod= venda.getCod();
        double total = 0;
        String situação= venda.getSituação();
        String data = venda.getData();
        Cliente  cliente = venda.getCliente();
        Vendedor vendedor = venda.getVendedor() ;
        String formapagamento = venda.getFormapagamento();
        System.out.println("Código da venda: "+cod+"\nSituação: "+situação+"\nData da venda "+data+
                "Nomde do Cliente"+cliente.getNome()+"Nome do vendedor "+vendedor.getNome()+" Forma de pagamento "+formapagamento);
        
        System.out.println("---------------------------------- itens vendas -------------------------------");
        for(ItensVenda linha : itens){
            if(linha!= null){
                if(linha.getVenda() == venda){
                    venda.setTotalVenda(linha.getSubtotal());//manda o valor de subtotal para total venda
                    System.out.println("Código do item: "+linha.getCod()+"Desconto: "+linha.getDesconto()+
                          " Nome do produto "+linha.getProduto().getNome()+" Quantidade "+linha.getQuantidade()+
                           " Subtotal: "+linha.getSubtotal());  
                }
            
            }
        }
        System.out.println("Total de venda: "+venda.getTotalVenda());//printa o valor de total
        setFaturamentoGeral(venda);
        
    }
    public void botaoFatu(Venda venda){
        double total =0 ;
        total = venda.getTotalVenda();
        
        System.out.println("");
    }
}

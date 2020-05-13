public class Computador implements IPlacaMae, IProcessador, IComputador, IMemoria{
    
    private String tipoPlacaMae;
    private String placaMaeFabricante;
    private int quantidadeControladorasSata;
    private int quantidadeUSBs;
    private String velocidade;
    private String marcaProcessador;
    private String modeloProcessador;
    private String geracao;
    private String marcaComputador;
    private String modeloComputador;
    private String tipo; 
    private String quantidadeMemoria;
    private String marcaMemoria;
    private String status;
    private String statusRaid;
    
    public Computador() {
        this.status = "desligado";
        this.statusRaid = "desativado";
    }
    
    public String getTipoPlacaMae() {
        return tipoPlacaMae;
    }
    
    public void setTipoPlacaMae(String tipoPlacaMae) {
        this.tipoPlacaMae = tipoPlacaMae;
    }

    public String getPlacaMaeFabricante() {
        return placaMaeFabricante;
    }

    public void setPlacaMaeFabricante(String placaMaeFabricante) {
        this.placaMaeFabricante = placaMaeFabricante;
    }

    public int getQuantidadeControladorasSata() {
        return quantidadeControladorasSata;
    }

    public void setQuantidadeControladorasSata(int quantidadeControladorasSata) {
        this.quantidadeControladorasSata= quantidadeControladorasSata;
    }

    public int getQuantidadeUSBs() {
        return quantidadeUSBs;
    }

    public void setQuantidadeUSBs(int quantidadeUSBs) {
        this.quantidadeUSBs = quantidadeUSBs;
    }
    
    public String getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(String velocidade) {
        this.velocidade = velocidade;
    }

    public String getMarcaProcessador() {
        return marcaProcessador;
    }

    public void setMarcaProcessador(String marcaProcessador) {
        this.marcaProcessador = marcaProcessador;
    }

    public String getModeloProcessador() {
        return modeloProcessador;
    }

    public void setModeloProcessador(String modeloProcessador) {
        this.modeloProcessador = modeloProcessador;
    }

    public String getGeracao() {
        return geracao;
    }

    public void setGeracao(String geracao) {
        this.geracao = geracao;
    }

    public String getMarcaComputador() {
        return marcaComputador;
    }

    public void setMarcaComputador(String marcaComputador) {
        this.marcaComputador = marcaComputador;
    }

    public String getModeloComputador() {
        return modeloComputador;
    }

    public void setModeloComputador(String modeloComputador) {
        this.modeloComputador = modeloComputador;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getQuantidadeMemoria() {
        return quantidadeMemoria;
    }

    public void setQuantidadeMemoria(String quantidadeMemoria) {
        this.quantidadeMemoria = quantidadeMemoria;
    }

    public String getMarcaMemoria() {
        return marcaMemoria;
    }

    public void setMarcaMemoria(String marcaMemoria) {
        this.marcaMemoria = marcaMemoria;
    }
    
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status= status;
    }
    
    public String getStatusRaid() {
        return this.statusRaid;
    }
    
    public void setStatusRaid(String statusRaid) {
        this.statusRaid= statusRaid;
    }

    @Override
    public String mostrarVelocidade() {
        return velocidade;
    }

    @Override
    public String mostrarMarcaDoProcessador() {
        return marcaProcessador;
    }

    @Override
    public String mostrarModelo() {
        return modeloProcessador;
    }

    @Override
    public String mostrarGeracao() {
        return geracao;
    }

    @Override
    public String mostrarTipoPlacaMae() {
        return tipoPlacaMae;
    }

    @Override
    public String mostrarFabricante() {
        return placaMaeFabricante;
    }

    @Override
    public int mostrarQuantidadeControladorasSata() {
        return quantidadeControladorasSata;
    }

    @Override
    public void ativarRaid() {
        this.statusRaid = "ativado";
    }

    @Override
    public void desativarRaid() {
        this.statusRaid = "desativado";
    }

    @Override
    public int mostrarQuantidadeUSBs() {
        return quantidadeUSBs;
    }

    @Override
    public String mostrarQuantidadeDeMemoria() {
        return quantidadeMemoria;
    }

    @Override
    public String mostrarMarcaDaMemoria() {
        return marcaMemoria;
    }

    @Override
    public void on() {
        this.status = "ligado";
    }

    @Override
    public void off() {
        this.status = "desligado";
    }

    @Override
    public void restart() {
        this.status = "Reiniciando..";
    }

    @Override
    public void hibernate() {
        this.status = "hibernando";
    }
    
    public String toString() {
        return "\nA marca do seu computador é: "+this.marcaComputador
              +"\nO modelo do seu computador é: "+this.modeloComputador
              +"\no tipo do seu computador é: "+this.tipo
              +"\nA quantidade de memória é: "+this.mostrarQuantidadeDeMemoria()
              +"\nA marca da memória é: "+this.mostrarMarcaDaMemoria()
              +"\nO tipo da sua placa mãe é: "+this.mostrarTipoPlacaMae()
              +"\nO fabricante da sua placa mãe é: "+this.mostrarFabricante()
              +"\nA quantidade de Satas é: "+this.mostrarQuantidadeControladorasSata()
              +"\nA quantidade de USBs é: "+this.mostrarQuantidadeUSBs()
              +"\nA velocidade do processador é: "+this.mostrarVelocidade()
              +"\nA marca do processador é: "+this.mostrarMarcaDoProcessador()
              +"\nO modelo do seu processador é: "+this.mostrarModelo()
              +"\nA geração do seu processador é: "+this.mostrarGeracao()
              +"\n=============Status do PC======================"
              +"\nO computador está: "+this.status
              +"\nO raid está: "+this.statusRaid;
    
    }
}

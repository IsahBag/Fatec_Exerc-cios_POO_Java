public class Caminhao extends Veiculo{

    private int capacidade, nEixos;

    public Caminhao(String modelo, String placa, int anoFabricacao, double valor, int capacidade, int nEixos){
        super(modelo,placa,anoFabricacao,valor);
        setCapacidade(capacidade);
        setEixos(nEixos);
    }

    public void setCapacidade(int capacidade){
        this.capacidade = 0;
        if(capacidade > 0)
            this.capacidade = capacidade;
    }

    public int getCapacidade(){
        return capacidade;
    }

    public void setEixos(int nEixos){
        this.nEixos = 1;
        if(nEixos > 1)
            this.nEixos = nEixos;
    }

    public int getEixos(){
        return nEixos;
    }

    public void deprecia(float indice){
        setValor(valor - (valor * (indice / 100)));
    }    

    public void imprime(){
        System.out.printf("Veículo: %s\n" +
                          "Placa: %7s\n" +
                          "Ano Fabricação: %4d\n" +
                          "Capacidade: %d toneladas\n" +
                          "Número de eixos: %1d\n" +
                          "Valor: R$ %.2f\n", modelo, placa, anoFabricacao, capacidade, nEixos, valor);
    }
}
public class Carro extends Veiculo {

    private int nPortas, anoModelo;

    public Carro(String modelo, String placa, int anoFabricacao, double valor, int nPortas, int anoModelo){
        super(modelo,placa,anoFabricacao,valor);
        setPortas(nPortas);
        setAnoModelo(anoModelo);
    }

    public void setPortas(int nPortas){
        this.nPortas = 2;
        if(nPortas > 2)
            this.nPortas = nPortas;
    }

    public int getPortas(){
        return nPortas;
    }

    public void setAnoModelo(int anoModelo){
        this.anoModelo = anoModelo;
    }

    public int getAnoModelo(){
        return anoModelo;
    }

    public void deprecia(float indice){
        setValor(valor - (valor * (indice / 100)));
    }    

    public void imprime(){
        System.out.printf("Veículo: %s\n" +
                          "Placa: %7s\n" +
                          "Ano Fabricação: %4d\n" +
                          "Ano Modelo: %4d\n" +
                          "Número de portas: %1d\n" +
                          "Valor: R$ %.2f\n", modelo, placa, anoFabricacao, anoModelo, nPortas, valor);
    }
}
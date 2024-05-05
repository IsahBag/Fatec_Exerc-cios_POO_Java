// Criar uma superclasse 'Veiculo' que contenha:
// i) atributos básicos:
// - modelo
// - placa
// - ano de fabricação
// - valor
// ii) métodos:
// - sets e gets
// - depreciar valor do veículo
// - impressão dos dados


public class Veiculo{

    protected String modelo, placa;
    protected int anoFabricacao;
    protected double valor;

    public Veiculo(String modelo, String placa, int anoFabricacao, double valor){
        setModelo(modelo);
        setPlaca(placa);
        setFabricacao(anoFabricacao);
        setValor(valor);
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getModelo(){
        return modelo;
    }

    public void setPlaca(String placa){
        this.placa = placa;
    }

    public String getPlaca(){
        return placa; 
    }

    public void setFabricacao(int anoFabricacao){
        this.anoFabricacao = anoFabricacao;
    }

    public int getFabricacao(){
        return anoFabricacao;
    }

    public void setValor(double valor){
        if (valor >= 0)
            this.valor = valor;
        else
            this.valor = 0;
    }

    public double getValor(){
        return valor;
    }

    public void deprecia(float indice){
        setValor(valor - (valor * (indice / 100)));
    }    

    public void imprime(){
        System.out.printf("Veículo: %s\n" +
                          "Placa: %7s\n" +
                          "Ano: %4d\n" +
                          "Valor: R$ %.2f\n", modelo, placa, anoFabricacao, valor);
    }
}
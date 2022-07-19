package dio.basecamp.poo;
// exemplo Aula 2 Programação Orientada a Objetos
/*
ESTRUTURA CÓDIGO - BOAS PRÁTICAS
1. Atributos
2. Construtor
3. Gets and Sets
4. Métodos
 */
public class Carro {
    String cor;
    String modelo;
    int capacidadeTanque; // adicionar get and set -> alt+ins

    // Construtor aqui!
    Carro (){

    }

    Carro (String cor, String modelo, int capacidadeTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;

    }

    public String getCor() { // get -> retorna a cor do carro
        return cor;
    }

    public void setCor(String cor) { // set -> coloca um valor em um atributo
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    double totalValorTanque (double valorCombustivel){
        return capacidadeTanque * valorCombustivel;

    }
}


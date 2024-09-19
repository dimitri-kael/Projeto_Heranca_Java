public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;

    public Veiculo(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void acelerar(){
        System.out.println("Acelerando: Vruuuuuuum!!!");
    }

    public void exibirInformacao (){
        System.out.println(String.format("""
                
                Marca: %s
                Modelo: %s
                Ano: %d""", marca, modelo, ano));
    }
}

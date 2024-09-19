public class Carro extends Veiculo{
    private int portas;

    public Carro(String marca, String modelo, int ano, int portas){
        super(marca, modelo, ano);
        this.portas = portas;
    }

    public void portaMalas(boolean abrir){
        if(abrir == true){
            System.out.println("Porta malas aberto.");
        } else {
            System.out.println("Porta malas fechado.");
        }
    }

    public int getPortas() {
        return portas;
    }

    @Override
    public void exibirInformacao(){
        super.exibirInformacao();
        System.out.println("Portas: " + portas);
    }
}

public class Moto extends Veiculo{
    private boolean temCarenagem;

    public Moto(String marca, String modelo, int ano, boolean temCarenagem){
        super(marca, modelo, ano);
        this.temCarenagem = temCarenagem;
    }

    public void empinar(){
        System.out.println("Empinando: Zoooooom!");
    }

    @Override
    public void acelerar(){
        System.out.println("Acelerando: Ran-dan-dan-dan-dan-dan!!!");
    }

    @Override
    public void exibirInformacao(){
        super.exibirInformacao();
        if (temCarenagem == true){
            System.out.println("Tem carenagem: sim");
        } else {
            System.out.println("Tem carenagem: não");
        }

    }
}

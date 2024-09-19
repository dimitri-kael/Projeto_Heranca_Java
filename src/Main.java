public class Main {
    public static void main(String[] args) {
        Moto moto1 = new Moto("HONDA", "CG 160 Titan", 2024, false);
        moto1.exibirInformacao();
        moto1.acelerar();
        moto1.empinar();

        Carro carro1 = new Carro("Fiat", "UNO", 2018, 4);
        carro1.exibirInformacao();
        carro1.acelerar();
        carro1.portaMalas(false);
    }
}

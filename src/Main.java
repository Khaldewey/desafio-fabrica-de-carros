public class Main {
    public static void main(String[] args) {
        int entrada1 = 20000;
        int entrada2 = 28;
        int entrada3 = 45;

        int custoFabrica = entrada1;
        int porcentagemDistribuidor = entrada2;
        int percentualImpostos = entrada3;

        int custoConsumidor;
        int calculoImpostos;
        int calculoPorcentagem;
        int valorImpostos;



        calculoPorcentagem = (custoFabrica * porcentagemDistribuidor) / 100;
        calculoImpostos = (custoFabrica * percentualImpostos) / 100;

        valorImpostos = calculoImpostos + calculoPorcentagem;


        custoConsumidor = custoFabrica + valorImpostos;

        System.out.println(custoConsumidor);


    }
}
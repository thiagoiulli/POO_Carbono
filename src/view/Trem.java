package view;

import excepction.ImpossivelCalcularPegada;
import model.Bicicleta;
import model.Carro;
import model.Casa;

import java.util.Scanner;

public class Trem {
    public static void main(String[] args) {
        boolean running = true;
        Scanner input = new Scanner(System.in);
        while (running){
            int n;
            System.out.println("Digite 1 para calcular a pegada de carbono de uma Casa");
            System.out.println("Digite 2 para calcular a pegada de carbono de uma Bicicleta");
            System.out.println("Digite 3 para calcular a pegada de carbono de um Carro");
            System.out.println("Digite 0 para sair");
            n = input.nextInt();

            double qtdMat, qtdEner, distTran, qtdRes;
            switch (n){
                case 1:
                    try{
                        System.out.println("Digite a quantidade de materiais em toneladas:");
                        qtdMat = input.nextDouble();
                        System.out.println("Digite a quantidade de energia em kWh:");
                        qtdEner = input.nextDouble();
                        System.out.println("Digite a distancia percorrida em Km:");
                        distTran = input.nextDouble();
                        System.out.println("Digite a quantidade de residuos em toneladas:");
                        qtdRes = input.nextDouble();
                        Casa h = new Casa();
                        System.out.println(h.getPegadaDeCarbono(qtdMat, qtdEner, distTran, qtdRes) + " KgCO2e");
                    }
                    catch (ImpossivelCalcularPegada e){
                        System.err.println(e.getMessage());
                    }
                    break;
                case 2:
                    try{
                        System.out.println("Digite a quantidade de materiais em Kg:");
                        qtdMat = input.nextDouble();
                        System.out.println("Digite a quantidade de energia em kWh:");
                        qtdEner = input.nextDouble();
                        System.out.println("Digite a distancia percorrida em Km:");
                        distTran = input.nextDouble();
                        Bicicleta b = new Bicicleta();
                        System.out.println(b.getPegadaDeCarbono(qtdMat, qtdEner, distTran) + " KgCO2e");
                    } catch (ImpossivelCalcularPegada e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        System.out.println("Digite a quantidade de materiais em Kg:");
                        qtdMat = input.nextDouble();
                        System.out.println("Digite a quantidade de energia em kWh:");
                        qtdEner = input.nextDouble();
                        System.out.println("Digite a distancia percorrida em Km:");
                        distTran = input.nextDouble();
                        Carro c = new Carro();
                        System.out.println(c.getPegadaDeCarbono(qtdMat, qtdEner, distTran) + " KgCO2e");
                    }
                    catch (ImpossivelCalcularPegada e){
                        System.err.println(e.getMessage());
                    }
                    break;
                case 0:
                    running = false;
                    break;
                default:
                    System.err.println("Opcao Invalida!");
            }
        }
    }
}

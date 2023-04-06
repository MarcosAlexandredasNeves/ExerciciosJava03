import java.util.Scanner;

public class EX03 {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);

        System.out.println("Qual a distãncia total percorrida pelo veículo: ");
        int z = dados.nextInt();
        System.out.println("Certo, você percorreu " + z + "km.");
        dados.nextLine();
        System.out.println("Quantos litros de combustivel foram gastos na viagem?");
        int y = dados.nextInt();
        System.out.println(y + " Litros de Combustivel.");
        dados.nextLine();
        System.out.println("A autonomia do veiculo foi de " + (z / y) + "Km/l!");
    }

}

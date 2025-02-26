import java.util.ArrayList;
import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Carro> list = new ArrayList<>();
        int op = 0;
        while (op != 4) {
            System.out.println("\n:::::::::Menu:::::::::");
            System.out.println("1 cadastrar Novo carro ");
            System.out.println("2 lista Carros ");
            System.out.println("3 remover Carros ");
            System.out.println("4 sair");
            System.out.println("escolha a opção ");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println(" Insira a marca do carro");
                    String marca = sc.next();
                    System.out.println(" Insira o modelo do carro");
                    String modelo = sc.next();
                    System.out.println(" Insira o ano do carro");
                    String anoCArro = sc.next();
                    list.add(new Carro(marca, modelo, anoCArro));
                    break;
                case 2:
                //verificando se a lista esta vazia 
                    if (list.isEmpty()) {
                        System.out.println("nenhum carro registrado");
                    } else {
                        // exibindo listas
                        for (Carro c : list) {
                            System.out.println("a marca do carro é: " + c.getMarca());
                            System.out.println("o modelo  do carro é: " + c.getModelo());
                            System.out.println("o ano  do carro é: " + c.getAnoFabricacao());

                        }

                    }

                    break;
                case 3:
                    // operação para deletar carro 
                    if (list.isEmpty()) {
                        System.out.println("o estoque está vazio");
                    } else {

                        System.out.println("Digite um indice a ser removido");
                        int indice = sc.nextInt();
                        if (indice >= 0 && indice < list.size()) {
                            list.remove(indice);
                            System.out.println("Carro removido com sucesso");
                        }
                    }

                    break;

                default:
                    break;

            }

        }
        sc.close();
    }
}

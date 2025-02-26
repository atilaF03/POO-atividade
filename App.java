
import java.util.ArrayList;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    ArrayList<Camisas> list = new ArrayList<>();

    int op = 0;

    while (op != 4) {
      System.out.println("\n:::::::::Menu:::::::::");
      System.out.println("1 cadastrar camisas");
      System.out.println("2 lista camisas ");
      System.out.println("3 remover caimisas");
      System.out.println("4 sair");
      System.out.println("escolha a opção ");
      op = sc.nextInt();
      switch (op) {
        case 1:
          System.out.println("insira uma cor de camisa ");
          String Cor = sc.next();
          System.out.println("Tamanho da camisa ");
          String Tamanho = sc.next();
          System.out.println(" Tipo da camisa");
          String Tipo = sc.next();
          list.add(new Camisas(Cor, Tamanho, Tipo));

          break;
        case 2:
          if (list.isEmpty()) {
            System.out.println("  o estoque esta vazia ");
          } else {
            for (Camisas c : list) {
              System.out.println(" a cor da camsisa é: " + c.getCor());
              System.out.println(" O tamanho  da camsisa é: " + c.getTamanho());
              System.out.println(" O tipo  da camsisa é: " + c.getTipo());
            }
          }

          break;
        case 3:
          if (list.isEmpty()) {
            System.out.println("o estoque está vazio");
          } else {

            System.out.println("Digite um indice a ser removido");
            int indice = sc.nextInt();
            if (indice >= 0 && indice < list.size()) {
              list.remove(indice);
              System.out.println("camisa removida removido com sucesso");
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
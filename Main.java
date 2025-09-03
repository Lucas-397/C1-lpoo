import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    PilhaPaginas pilha = new PilhaPaginas();
    int opcao = 1;
      
    while(opcao != 5){
        System.out.println("1 - Acessar página");
        System.out.println("2 - Voltar para página anterior");
        System.out.println("3 - Ver pagina atual");
        System.out.println("4 - Adicionar página");
        System.out.println("5 - Sair");
        opcao = scan.nextInt();
        
        switch(opcao){
            case 1:
                System.out.println("Digite o titulo: ");
                String titulo = scan.next();
                System.out.println("Digite a url: ");
                String url = scan.next();
                pilha.push(new Pagina(titulo, url));
                break;
            case 2:
                if(!pilha.isEmpty()){
                    pilha.pop();
                    pilha.peek().toString();
                }
                break;
            case 3:
                if(!pilha.isEmpty()){
                    System.out.println(pilha.peek().toString());
                }
                break;
            case 4:
                if(!pilha.isEmpty()){
                    System.out.println(pilha.peek().getUrl());
                }
                break;
            case 5:
                System.out.println("Saindo...");
                break;
        }
    }
  }
}
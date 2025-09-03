import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    PilhaPaginas pilha = new PilhaPaginas();
    int opcao = 1;

    while(opcao != 5){
        System.out.println("1 - Acessar nova página");
        System.out.println("2 - Voltar para página anterior");
        System.out.println("3 - Ver pagina atual");
        System.out.println("4 - Visualizar historico");
        System.out.println("5 - Sair");
        opcao = scan.nextInt();
        
        switch(opcao){
            case 1:
                String url = "";
                String titulo = "";
                while(url.trim().isEmpty() || titulo.trim().isEmpty()){
                    System.out.println("Digite o titulo: ");
                    titulo = scan.nextLine();
                    System.out.println("Digite a url: ");
                    url = scan.nextLine();
                }
                pilha.push(new Pagina(titulo, url));
                break;
            case 2:
                if(!pilha.isEmpty()){
                    pilha.pop();//exclui a pagina atual para ir para pagina anterior
                    if(!pilha.isEmpty()) pilha.peek().tostring();
                }else{
                    System.out.println("Não foi possível voltar para a pagina anterior");
                }
                break;
            case 3:
                if(!pilha.isEmpty()){
                    pilha.peek().tostring();
                }else{
                    System.out.println("Não foi possível exibir pagina atual");
                }
                break;
            case 4:
                while(!pilha.isEmpty()){
                    pilha.peek().tostring();
                    pilha.pop();
                }
                System.out.println("Fim do historico");
                break;
            case 5:
                System.out.println("Saindo...");
                break;
        }
    }
  }
}
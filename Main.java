import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    PilhaPaginas pilha = new PilhaPaginas();
    int opcao = 1;//definição para funcionamento do loop

    while(opcao != 5){//loop que ocorre até o usuario inserir 5 (sair)
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
                while(url.trim().isEmpty() || titulo.trim().isEmpty()){//enquanto os input de titulo e url forem vazios não sai do loop
                    System.out.println("Digite o titulo: ");
                    titulo = scan.nextLine();
                    System.out.println("Digite a url: ");
                    url = scan.nextLine();
                    if(url.trim().isEmpty() || titulo.trim().isEmpty()){//confere se os iputs estão preenchidos caso não exibe mensagem de erro
                        System.out.println("Dados invalidos, preencha os dois campos");
                    }
                }
                pilha.push(new Pagina(titulo, url));
                break;
            case 2:
                if(!pilha.isEmpty()){
                    pilha.pop();//exclui a pagina atual para ir para pagina anterior
                    if(!pilha.isEmpty()){
                        System.out.println("Voltando para pagina anterior");
                        System.out.println("-----------------------------");
                        System.out.print("Pagina atual: ");
                        pilha.peek().tostring();
                    }else{
                        System.out.println("Historico esvaziado");
                    }
                }else{
                    System.out.println("Não foi possível voltar para a pagina anterior");
                }
                break;
            case 3:
                if(!pilha.isEmpty()){
                    System.out.print("Pagina atual: ");
                    pilha.peek().tostring();
                }else{
                    System.out.println("Não foi possível exibir pagina atual");
                }
                break;
            case 4:
                int numPagina = 1;// valor para controlar quantos elementos tem na pilha na hora de empilhar e ajudar a exibicao visual
                PilhaPaginas pilhaTemporaria = new PilhaPaginas();//pilha temporaria para não perder os dados da pilha original

                while(!pilha.isEmpty()){//loop para exibir o hitorico
                    System.out.print(numPagina +".");
                    pilha.peek().tostring();
                    pilhaTemporaria.push(pilha.peek());
                    pilha.pop();
                    numPagina++;
                }
                System.out.println("Fim do historico");
                while(numPagina > 1){//loop para reempilhar depois de mostrar o historico
                    pilha.push(pilhaTemporaria.peek());
                    pilhaTemporaria.pop();
                    numPagina--;
                }
                break;
            case 5:
                System.out.println("Saindo...");
                break;
        }
    }
  }
}
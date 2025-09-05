import java.util.LinkedList;

public class PilhaPaginas{
  private LinkedList<Pagina> pilha;

  public PilhaPaginas(){
    this.pilha = new LinkedList<Pagina>();
  }

  public boolean isEmpty(){
    return pilha.isEmpty();
  }

  public Pagina peek(){
      return pilha.peekLast();
  }

  public void push(Pagina pagina){//adiciona novo item a pilha
      this.pilha.add(pagina);
  }

  public boolean pop(){
    if(!this.isEmpty()){//verifica se a pilha é vazia
      this.pilha.removeLast();
      return true;
    }
    return false;
  }
}
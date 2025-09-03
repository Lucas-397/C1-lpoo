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

  public void push(Pagina pagina){
      this.pilha.add(pagina);
  }

  public boolean pop(){
    if(!isEmpty()){
      this.pilha.removeLast();
      return true;
    }
    return false;
  }
}
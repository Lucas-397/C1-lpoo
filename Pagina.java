public class Pagina{
    private String titulo;
    private String url;
  
    public Pagina(String titulo, String url){
      this.titulo = titulo;
      this.url = url;
    }
    public String getTitulo() {
      return titulo;
    }
  
    public void setTitulo(String titulo) {
      this.titulo = titulo;
    }
  
    public String getUrl() {
      return url;
    }
  
    public void setUrl(String url) {
      this.url = url;
    }
  
    public void tostring(){//metodo toString
      System.out.println("Titulo: " + titulo + ", url: " + url);
    }
}
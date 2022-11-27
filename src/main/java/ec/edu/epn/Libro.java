package ec.edu.epn;
/**
 *
 * @author Joffre
 */
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Joffre
 */
public class Libro {

    private String idLibro;
    private String titulo;
    private String autor;
    private String isbn;
    private int stock;
    private int paginas;
    ArrayList<Ejemplar> ejemplares = new ArrayList<>();
    private String atributos[];

    public Libro(String idLibro, String titulo, String isbn, String autor, int paginas) {
        this.idLibro = idLibro;
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.stock = ejemplares.size();
        this.paginas = paginas;
        atributos=new String[5];
        atributos[0]=idLibro;
        atributos[1]=titulo;
        atributos[2]=isbn;
        atributos[3]=autor;
        atributos[4]= String.valueOf(paginas);

    }

    public String getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(String idLibro) {
        this.idLibro = idLibro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        atributos[1]=titulo;
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        atributos[3]=autor;
        this.autor = autor;
    }

    public String getISBN() {
        return isbn;
    }

    public void setISBN(String ISBN) {
        atributos[2]=ISBN;
        this.isbn = ISBN;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        atributos[4]=String.valueOf(paginas);
        this.paginas = paginas;
    }

    public ArrayList<Ejemplar> getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(ArrayList<Ejemplar> ejemplares) {
        this.ejemplares = ejemplares;
    }

    public String[] getAtributos() {
        return atributos;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "idLibro='" + idLibro + '\'' +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", isbn='" + isbn + '\'' +
                ", stock=" + stock +
                ", paginas=" + paginas +
                ", ejemplares=" + ejemplares +
                ", atributos=" + Arrays.toString(atributos) +
                '}';
    }

    public void agregarEjemplar(Ejemplar ejemplar){
        ejemplares.add(ejemplar);
        System.out.println("Ejemplar agregado\n");
        this.stock = ejemplares.size();
    }

}

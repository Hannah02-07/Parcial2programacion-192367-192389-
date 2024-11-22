import iron_package.F_Input;
import iron_package.F_System;

class Libro{
    String titulo;
    String Autor;
    Boolean esta_disponible;

    public void inicialisar (String titulo,String Autor){
        this.titulo = titulo;
        this.Autor = Autor;
    }

    public void prestar(){

    }
    
    public void devolver(){

    }
}

class Usuario {
    String name;
    int id;
    int libros_prestados;

    public void inicialisar(String name,int id){
        this.name = name;
        this.id = id;
        this.libros_prestados = libros_prestados;
    }

    public void prestarLibro(Libro libro){

    }

    public void devolverLibro(Libro libro){

    }
}

public class GestionBiblioteca{
    public static void main (String[] args) {
        boolean _continue = true;
        String warning = "";
        while (_continue){
            F_System.Output(
                "[1]Registrar usuario",
                "[2]Registrar libro",
            
            warning,4);

            switch (F_Input.String_mode()){
                case "1" -> Registrar_usuarios();
                case "2" -> Registrar_libros();
                case "x" -> _continue = false;
                default -> warning = "Inserte un valor valido";
            }

        }
        

        
        //Fin algoritmo
    }
    static int id_new_user = 0;

    public static void Registrar_usuarios(){
        Usuario new_user = new Usuario();
        F_System.Output("Inserte el nombre del usuario",0);
        String name = F_Input.String_mode();
        
        new_user.inicialisar(name,id_new_user);
        id_new_user = id_new_user + 1;


    }

    public static void Registrar_libros(){
        Libro new_libro = new Libro();
        F_System.Output("Inserte el nombre del libro",9);
        String name_book = F_Input.String_mode();
        F_System.Output("Inserte el nombre del autor",9);
        String Autor = F_Input.String_mode();
        new_libro.inicialisar(name_book,Autor);
    }

    public static void Ver_Historial(){

    }
    
}
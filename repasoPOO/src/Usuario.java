import java.util.Scanner;
public class Usuario {

    Scanner sc = new Scanner(System.in);

    private String nombre;
    private String apellido;
    private String telefono;
    private String email;

    private String contraseña;

    private String emailUser;


    public Usuario() {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.telefono = email;
    }

    // Metodos Getter and Stters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    //metodo tipo vacio

    public void registrar() {

        System.out.println("Nombre"); //para capturar datos
        nombre = sc.next();
        System.out.println("Apellido");
        apellido = sc.next();
        System.out.println("Telefono");
        telefono = sc.next();
        System.out.println("Email");
        email = sc.next();
        System.out.println("contraseña");
        contraseña = sc.next();
        System.out.println("EmailUser");
        emailUser = sc.next();

       //Se crea metodo
        public void imprimirReg(){
            System.out.println("1. Nombre" + nombre + "\n" +
                    "2.Apellido: + apellido" + "\n" +
                    "3.Telefono" + telefono + "\n" +
                    "4.Email" + email + "\n");


        }

        public void Login() {
            System.out.println();

        }

    }
}

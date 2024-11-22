import java.util.Scanner;

public class SignUp {
    public static void main(String[] args) {
        //Vamos a crear un formulario de registro
        Scanner scanner = new Scanner(System.in);

        //Los datos que debes pedir al usuario son:

        //1. Nombre
        System.out.print("Indique su nombre: ");
        String userFirstName = scanner.nextLine();

        //2. Apellido
        System.out.print("Indique su apellido: ");
        String userSurname = scanner.nextLine();

        //3. Nombre de usuario
        System.out.print("Indique su nombre de usuario: ");
        String userTagName = scanner.nextLine();

        //4. Contraseña
        System.out.print("Indique su contraseña: ");
        String userPassword = scanner.nextLine();

        //Añade una nueva línea antes de mostrar la siguiente pregunta.
        System.out.println();

        //Imprimir el siguiente resultado:
        //Hola <nombre> <apellido>, tu nombre de usuario es <usuario> y tu contraseña es <contraseña>, gracias por registrarte.
        System.out.println("¡Hola, " + userFirstName + " " + userSurname + ", su nombre de usuario será @" + userTagName + " (" + userPassword + ").");

        //Añade una nueva línea antes de mostrar la respuesta
        System.out.println("¡Gracias por registrarse!");

        scanner.close();
    }
}
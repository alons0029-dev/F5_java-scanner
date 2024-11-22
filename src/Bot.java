import java.util.Scanner;

public class Bot {
    public static void main(String[] args) {
        //Crea el scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hola, ¿Cómo te llamas?");

        //Recoge el dato
        String userName = scanner.nextLine();

        //Añade una nueva línea antes de mostrar la siguiente pregunta.
        System.out.println();
        System.out.println("Hola, " + userName + "! Soy un Bot. ¿De qué ciudad eres?");

        //Recoge el dato
        String userLocation = scanner.nextLine();

        //Añade una nueva línea antes de mostrar la siguiente pregunta.
        System.out.println();
        System.out.println("He escuchado que " + userLocation + " es un encanto. Yo nací en Oracle city.");
        System.out.println("¿Cuántos años tienes?");

        //Recoge el dato
        int userAge = scanner.nextInt();
        scanner.nextLine();

        //Añade una nueva línea antes de mostrar la siguiente pregunta.
        System.out.println();
        System.out.println("Entonces me dices que tienes " + userAge + " años. Yo tengo 400 años.");
        System.out.println("Eso quiere decir que soy " + (400 / userAge) + " veces más vieja que tu.");
        System.out.println("Basta de hablar de mi misma. ¿Cuál es tu lenguaje de programación favorito? (Por favor no digas Python)");

        //Recoge el dato
        String userLanguage = scanner.nextLine();

        //Añade una nueva línea.
        System.out.println();
        System.out.println(userLanguage + ", ¡Eso es excelente! Mucho gusto haber hablado contigo, " + userName + ". ¡Hablamos luego!");

        //Recuerda cerrar el scanner
        scanner.close();
    }
}

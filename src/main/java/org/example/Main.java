package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //1. La nota media v1----------------------------------------------------

        double nota, sumaNotas, media;
        Scanner teclado1 = new Scanner(System.in);
        sumaNotas = 0;
        System.out.println("Introduzca el número de notas:");
        int numNotas = teclado1.nextInt();

        for (int i = 1; i <= numNotas; i++) {
            System.out.println("Nota:");
            Scanner teclado2 = new Scanner(System.in);
            nota = teclado2.nextDouble();
            sumaNotas = sumaNotas + nota;
        }
        media = sumaNotas / numNotas;
        System.out.println("La media es " + media);

        // 2. La nota media v2------------------------------------------------------------------

        Scanner teclado3 = new Scanner(System.in);
        //reiniciar sumaNotas a 0
        sumaNotas = 0;
        System.out.println("Introduzca las notas, si introduce -1, el programa finalizará:");
        nota = teclado3.nextDouble();
        while (nota != -1) {
            sumaNotas = sumaNotas + nota;
            nota = teclado3.nextDouble();
        }
        media = sumaNotas / numNotas;
        System.out.println("La media es " + media);


        //4 Adivine en que numero estoy pensando-----------------------------------------------

        int numAleatorio = (int) (Math.random() * 100) + 1;
        int numUsuario;
        System.out.println("Introduzca un número entre 1 y 100:");
        Scanner teclado4 = new Scanner(System.in);
        numUsuario = teclado4.nextInt();
        while (numUsuario != numAleatorio) {
            if (numUsuario > numAleatorio) {
                System.out.println("El número es menor");
            } else {
                System.out.println("El número es mayor");
            }
            System.out.println("Introduzca un número entre 1 y 100:");
            numUsuario = teclado4.nextInt();
        }
        System.out.println("Has acertado el número");

        //5. Ahora tengo que concontrarlo yo-----------------------------------------------

        int numUsuario2;
        int numAleatorio2 = (int) (Math.random() * 100) + 1;
        int numMin = 1;
        int numMax = 100;
        System.out.println("Piensa un número entre 1 y 100");
        System.out.println("¿Es el número " + numAleatorio2 + "?");
        System.out.println("Si es mayor, introduce +");
        System.out.println("Si es menor, introduce -");
        System.out.println("Si es el número, introduce =");
        Scanner teclado5 = new Scanner(System.in);
        String respuesta = teclado5.nextLine();
        while (!respuesta.equals("=")) {
            if (respuesta.equals("+")) {
                numMin = numAleatorio2 + 1;
                numAleatorio2 = (int) (Math.random() * (numMax - numMin + 1)) + numMin;
                System.out.println("¿Es el número " + numAleatorio2 + "?");
                System.out.println("Si es mayor, introduce +");
                System.out.println("Si es menor, introduce -");
                System.out.println("Si es el número, introduce =");
                respuesta = teclado5.nextLine();
            } else if (respuesta.equals("-")) {
                numMax = numAleatorio2 - 1;
                numAleatorio2 = (int) (Math.random() * (numMax - numMin + 1)) + numMin;
                System.out.println("¿Es el número " + numAleatorio2 + "?");
                System.out.println("Si es mayor, introduce +");
                System.out.println("Si es menor, introduce -");
                System.out.println("Si es el número, introduce =");
                respuesta = teclado5.nextLine();
            }
        }

        //7 Visualizacion de citas de peliculas-----------------------------------------------

        int opcion;
        System.out.println("1 - Una cita de la ciudad del miedo");
        System.out.println("2 - Una cita de James Bond");
        System.out.println("3 - Una cita de la vida es un largo río tranquilo");
        System.out.println("4 - Una cita de Star Wars");
        System.out.println("5 - Salir de esta magnífica aplicación");
        System.out.println("Elige una opción:");
        Scanner teclado7 = new Scanner(System.in);
        opcion = teclado7.nextInt();

        while (opcion != 5) {
            switch (opcion) {
                case 1:
                    System.out.println("La ciudad del miedo");
                    break;
                case 2:
                    System.out.println("James Bond");
                    break;
                case 3:
                    System.out.println("La vida es un largo río tranquilo");
                    break;
                case 4:
                    System.out.println("Star Wars");
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
            System.out.println("1 - Una cita de la ciudad del miedo");
            System.out.println("2 - Una cita de James Bond");
            System.out.println("3 - Una cita de la vida es un largo río tranquilo");
            System.out.println("4 - Una cita de Star Wars");
            System.out.println("5 - Salir de esta magnífica aplicación");
            System.out.println("Elige una opción:");
            opcion = teclado7.nextInt();
        }
        System.out.println("Gracias por usar esta magnífica aplicación");


        //9. Un múltiplo de 3------------------------------------------------------------------

        Scanner teclado9 = new Scanner(System.in);
        System.out.println("Introduzca un número múltiplo de 3:");
        int numultiplo = teclado9.nextInt();
        while (numultiplo % 3 != 0) {
            System.out.println("Introduzca un número múltiplo de 3:");
            numultiplo = teclado9.nextInt();
        }
        System.out.println("El número es múltiplo de 3");

        //10, Arte Ascii------------------------------------------------------------------

        Scanner teclado10 = new Scanner(System.in);
        System.out.println("Introduzca el carácter que desea utilizar:");
        String caracter = teclado10.nextLine();
        System.out.println("Introduzca el número de filas:");
        int filas = teclado10.nextInt();
        System.out.println("Introduzca el número de columnas:");
        int columnas = teclado10.nextInt();
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(caracter);
            }
            System.out.println();
        }

    }

}

package labfinal;

import java.util.Scanner;

public class Labfinal_OrlandoPalma_DonaldPimienta_SebastianSalgado {

    public static void main(String[] args) {
        int op1 = 0;
        Scanner read = new Scanner(System.in);
        System.out.print("Bienvenido al programa!");
        while (op1 != 3) {
            System.out.println("""
                           Las opciones disponibles son:
                           1. Miscelanea de Juegos.
                           2. Procesos Matemáticos.
                           3. Salir.""");
            System.out.print("Ingrese la opción que desea elegir: ");
            op1 = read.nextInt();
            while (op1 < 1 || op1 > 3) {
                System.out.print("Ingrese una opción válida: ");
                op1 = read.nextInt();
            }
            int op2 = 0, op3 = 0;
            switch (op1) {
                case 1:
                    System.out.print("Bienvenido a la Miscelanea de juegos: ");
                    while (op2 != 4) {
                        System.out.println("""
                           Las opciones disponibles son:
                           1. Dados.
                           2. Punto y fama
                           3. Bingo
                           4. Salir           """);
                        op2 = read.nextInt();
                        while (op2 < 1 || op2 > 4) {
                            System.out.print("Ingrese una opción válida: ");
                            op2 = read.nextInt();
                        }
                        switch (op2) {
                            case 1:
                            case 2:
                            case 3:
                                System.out.println("En construcción...");
                                break;
                            case 4:
                                System.out.println("Bye bye");
                        }
                    }
                    break;
                case 2:
                    System.out.print("Bienvenido a los Procesos matemáticos ");
                    while (op3 != 4) {
                        System.out.println("""
                           Las opciones disponibles son:
                           1. Cuadrados.
                           2. Digitos de un número.
                           3. Funciones trigonométricas
                           4. Salir           """);
                        op3 = read.nextInt();
                        while (op3 < 1 || op3 > 4) {
                            System.out.print("Ingrese una opción válida: ");
                            op3 = read.nextInt();
                        }
                        switch (op3) {
                            case 1:
                                int x,
                                 n;
                                String pop = "",
                                 up = "";
                                System.out.println("Ingrese el numero: ");
                                n = read.nextInt();
                                x = 0;
                                int t = 1;
                                for (int i = 1; i <= n; i++) {
                                    x += t;

                                    if (i == 1) {
                                        pop = t + "";
                                    } else {
                                        pop = pop + " + " + t;
                                    }

                                    up = " = " + x;

                                    t = t + 2;
                                    System.out.println("El cuadrado de " + i + " es " + pop + up);
                                }
                                break;
                            case 2:
                            case 3:
                                System.out.println("En construcción...");
                                break;
                            case 4:
                                System.out.println("Bye bye");
                        }
                    }
                    break;

                case 3:
                    System.out.println("""
                                       Bye Bye!
                                       Adios!
                                       Au revoir!
                                       """);

            }

        }
    }

}

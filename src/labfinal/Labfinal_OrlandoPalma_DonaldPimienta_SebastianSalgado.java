package labfinal;

import javax.swing.JOptionPane;
import java.util.Random;

public class Labfinal_OrlandoPalma_DonaldPimienta_SebastianSalgado {

    public static void main(String[] args) {
        int op1 = 0;
        JOptionPane.showMessageDialog(null, "Bienvenido al programa!");
        while (op1 != 3) {
            op1 = Integer.parseInt(JOptionPane.showInputDialog(
                    "Las opciones disponibles son:\n\n"
                    + "1. Miscelanea de Juegos.\n"
                    + "2. Procesos Matemáticos.\n"
                    + "3. Salir.\n\n"
                    + "Ingrese la opción que desea elegir: "));
            while (op1 < 1 || op1 > 3) {
                op1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opción válida: "));
            }
            int op2 = 0, op3 = 0;
            switch (op1) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Bienvenido a la Miscelanea de juegos ");
                    while (op2 != 4) {
                        op2 = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Las opciones disponibles son:\n\n"
                                + "1. Dados.\n"
                                + "2. Punto y fama\n"
                                + "3. Bingo\n"
                                + "4. Salir\n\n"
                                + "Ingrese la opción que desea elegir: ", "Miscelanea de Juegos", JOptionPane.PLAIN_MESSAGE));
                        while (op2 < 1 || op2 > 4) {
                            op2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opción válida: "));
                        }
                        switch (op2) {
                            case 1:
                                String[] botones = {"JUGAR", "REGLAS", "SALIR"}, botones2 = {"JUGADOR 1", "JUGADOR 2"}, botones1 = {"TIRAR DADOS"};
        int turno, valorjugada, valorjugada2, jugador, dado1, dado2, win = 0, puntajeacumulado1 = 0, puntajeacumulado2 = 0, numjugadas = 1, numerodejugadasconsecutivas, k, k1 , 
                opcionesdados = JOptionPane.showOptionDialog(null, """
                                                               Bienvenido al juego de dados
                                                               \u00bfEstas listo para jugar o quieres ver las reglas primero?""", "Juego de dados",
                        0, JOptionPane.QUESTION_MESSAGE, null, botones, botones);
        //Explicación variables: Las variables botones son las que se le muestran al usuario a la hora de escoger que quiere hacer, es decir,actuan como un menu iterativo
        while (opcionesdados != 2) {
            //En el Switch posterior se muestra la decision que tenia el usuario en primera instancia,donde 0 es jugar,1 reglas y 2 salir
            switch (opcionesdados) {
                case 0:
                    turno = (int) (Math.random() * (1 - 2) + 2);
                    jugador = JOptionPane.showOptionDialog(null, "Ingrese el numero con el que desea ser identificado", "JUEGO DE DADOS",
                            0, JOptionPane.PLAIN_MESSAGE, null, botones2, botones2);
                    numerodejugadasconsecutivas = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de partidas consecutivas con el que desea que se acabe la partida"));
                    JOptionPane.showMessageDialog(null, "Comienza el jugador #" + turno);
                    //En este switch lo que se hace es jugar en cinsecuencia de la eleccion del jugador realizada por el usuario,donde 0 es jugador 1 y 1 jugador 2
                    switch (jugador) {
                        case 0:
                            //Y por último tenemos este switch que corresponde al turno, el cual es dado aleatoriamente
                            switch (turno) {
                                case 1:
                                    k=0; k1 = 0;
                                    do {
                                        JOptionPane.showOptionDialog(null, "Tire de los dados", "Jugada# " + numjugadas,
                                                0, JOptionPane.INFORMATION_MESSAGE, null, botones1, botones1);
                                        dado1 = (int) (Math.random() * (1 - 6) + 6);
                                        dado2 = (int) (Math.random() * (1 - 6) + 6);
                                        while (dado1 == dado2) {
                                            JOptionPane.showMessageDialog(null, "Ha sacado doble,por ende vuelve a jugar y suma 1 en el puntajeacumulado");
                                            puntajeacumulado1 = puntajeacumulado1 + 1;
                                            JOptionPane.showOptionDialog(null, "Tire de los dados", "JUEGO DE DADOS",
                                                    0, JOptionPane.INFORMATION_MESSAGE, null, botones1, botones1);
                                            dado1 = (int) (Math.random() * (1 - 6) + 6);
                                            dado2 = (int) (Math.random() * (1 - 6) + 6);
                                        }
                                        valorjugada = dado1 + dado2;
                                        JOptionPane.showMessageDialog(null, "Ha sacado: " + dado1 + " y " + dado2 + " por ende,el valor de su jugada es de: " + valorjugada);
                                        JOptionPane.showMessageDialog(null, "Turno Maquina");
                                        dado1 = (int) (Math.random() * (1 - 6) + 6);
                                        dado2 = (int) (Math.random() * (1 - 6) + 6);
                                        while (dado1 == dado2) {
                                            JOptionPane.showMessageDialog(null, "La maquina ha sacado doble,por ende vuelve a jugar y suma 1 en el puntaje acumulado");
                                            puntajeacumulado2 = puntajeacumulado2 + 1;
                                            dado1 = (int) (Math.random() * (1 - 6) + 6);
                                            dado2 = (int) (Math.random() * (1 - 6) + 6);
                                        }
                                        valorjugada2 = dado1 + dado2;
                                        JOptionPane.showMessageDialog(null, "La maquina ha sacado: " + dado1 + " y " + dado2 + " por ende,el valor de la jugada es de " + valorjugada2);
                                        if (valorjugada > valorjugada2) {
                                            JOptionPane.showMessageDialog(null, "El jugador 1 se lleva esta partida y suma 3 en el acumulado");
                                            puntajeacumulado1 = puntajeacumulado1 + 3;
                                            numjugadas = numjugadas + 1;
                                            k = k + 1;
                                            k1 = 0;
                                        } else {
                                            if (valorjugada2 > valorjugada) {
                                                JOptionPane.showMessageDialog(null, "La maquina se lleva esta partida y suma 3 en el acumulado");
                                                puntajeacumulado2 = puntajeacumulado2 + 3;
                                                numjugadas = numjugadas + 1;
                                                k1 = k1 + 1;
                                                k = 0;
                                            } else {
                                                if (valorjugada == valorjugada2) {
                                                    JOptionPane.showMessageDialog(null, "El valor de la jugada es el mismo,se vuelven a tirar los dados");
                                                }
                                            }
                                        }
                                        if (puntajeacumulado1 - puntajeacumulado2 == 15) {
                                            JOptionPane.showMessageDialog(null, "La partida ha terminado, el ganador es el jugador 1");
                                            win = 1;
                                        } else {
                                            if (puntajeacumulado2 - puntajeacumulado1 == 15) {
                                                JOptionPane.showMessageDialog(null, "La partida ha terminado, el ganador es el jugador 2");
                                                win = 1;
                                            } else {
                                                if (numjugadas >= 25) {
                                                    JOptionPane.showMessageDialog(null, "Se ha llegado al limite de jugadas,por ende la partida termina en empate");
                                                } else {
                                                    if (k == numerodejugadasconsecutivas) {
                                                        JOptionPane.showMessageDialog(null, "Se ha alcanzado el número maximo de jugadas consecutivas,por ende el ganador es el jugador 1");
                                                        win = 1;
                                                    } else {
                                                        if (k1 == numerodejugadasconsecutivas) {
                                                            JOptionPane.showMessageDialog(null, "Se ha alcanzado el número maximo de jugadas consecutivas,por ende el ganador es la maquina");
                                                            win = 1;
                                                        }
                                                    }
                                                }
                                            }

                                        }

                                    } while (win != 1 & numjugadas < 21 & k < numerodejugadasconsecutivas & k1 < numerodejugadasconsecutivas);
                                    opcionesdados = JOptionPane.showOptionDialog(null, """
                                                              QUIERES VOLVER A INTENTARLO?""", "Juego de dados",
                                            0, JOptionPane.QUESTION_MESSAGE, null, botones, botones);
                                    break;
                                case 2:
                                     k=0; k1 = 0;
                                    do {
                                        JOptionPane.showMessageDialog(null, "Turno maquina", "Jugada# " + numjugadas, JOptionPane.INFORMATION_MESSAGE);
                                        dado1 = (int) (Math.random() * (1 - 6) + 6);
                                        dado2 = (int) (Math.random() * (1 - 6) + 6);
                                        while (dado1 == dado2) {
                                            JOptionPane.showMessageDialog(null, "La maquina ha sacado doble,por ende vuelve a jugar y suma 1 en el puntajeacumulado");
                                            puntajeacumulado2 = puntajeacumulado2 + 1;

                                            dado1 = (int) (Math.random() * (1 - 6) + 6);
                                            dado2 = (int) (Math.random() * (1 - 6) + 6);
                                        }
                                        valorjugada2 = dado1 + dado2;
                                        JOptionPane.showMessageDialog(null, "La maquina ha sacado: " + dado1 + " y " + dado2 + " ,por ende el valor de la jugada es de: " + valorjugada2);
                                        JOptionPane.showMessageDialog(null, "Turno jugador");
                                        JOptionPane.showOptionDialog(null, "Tire de los dados", "Jugada# " + numjugadas,
                                                0, JOptionPane.INFORMATION_MESSAGE, null, botones1, botones1);
                                        dado1 = (int) (Math.random() * (1 - 6) + 6);
                                        dado2 = (int) (Math.random() * (1 - 6) + 6);
                                        while (dado1 == dado2) {
                                            JOptionPane.showMessageDialog(null, "Ha sacado doble,por ende vuelve a jugar y suma 1 en el puntajeacumulado");
                                            puntajeacumulado1 = puntajeacumulado1 + 1;

                                            JOptionPane.showOptionDialog(null, "Tire de los dados", "Jugada# " + numjugadas,
                                                    0, JOptionPane.INFORMATION_MESSAGE, null, botones1, botones1);
                                            dado1 = (int) (Math.random() * (1 - 6) + 6);
                                            dado2 = (int) (Math.random() * (1 - 6) + 6);
                                        }
                                        valorjugada = dado1 + dado2;
                                        JOptionPane.showMessageDialog(null, "Ha sacado: " + dado1 + " y " + dado2 + " por ende,el valor de su jugada es de: " + valorjugada);
                                        if (valorjugada2 > valorjugada) {
                                            JOptionPane.showMessageDialog(null, "La maquina se lleva esta jugada y suma 3 en el acumulado");
                                            puntajeacumulado2 = puntajeacumulado2 + 3;
                                            numjugadas = numjugadas + 1;
                                            k1 = k1 + 1;
                                            k = 0;
                                        } else {
                                            if (valorjugada > valorjugada2) {
                                                JOptionPane.showMessageDialog(null, "El jugador se lleva esta jugada y suma 3 en el acumulado");
                                                puntajeacumulado1 = puntajeacumulado1 + 3;
                                                numjugadas = numjugadas + 1;
                                                k = k + 1;
                                                k1 = 0;
                                            } else {
                                                if (valorjugada == valorjugada2) {
                                                    JOptionPane.showMessageDialog(null, "El valor de la jugada es el mismo,se vuelven a tirar los dados");
                                                }
                                            }
                                        }
                                        if (puntajeacumulado1 - puntajeacumulado2 == 15) {
                                            JOptionPane.showMessageDialog(null, "La partida ha terminado, el ganador es el jugador 1");
                                            win = 1;
                                        } else {
                                            if (puntajeacumulado2 - puntajeacumulado1 == 15) {
                                                JOptionPane.showMessageDialog(null, "La partida ha terminado, el ganador es el jugador 2");
                                                win = 1;
                                            } else {
                                                if (numjugadas >= 25) {
                                                    JOptionPane.showMessageDialog(null, "Se ha llegado al limite de jugadas,por ende la partida termina en empate");
                                                } else {
                                                    if (k == numerodejugadasconsecutivas) {
                                                        JOptionPane.showMessageDialog(null, "Se ha alcanzado el número maximo de jugadas consecutivas,por ende el ganador es el jugador1");
                                                        win = 1;
                                                    } else {
                                                        if (k1 == numerodejugadasconsecutivas) {
                                                            JOptionPane.showMessageDialog(null, "Se ha alcanzado el número maximo de jugadas consecutivas,por ende el ganador es la maquina");
                                                            win = 1;
                                                        }
                                                    }
                                                }
                                            }

                                        }

                                    } while (win != 1 & numjugadas <= 21 & k < numerodejugadasconsecutivas & k1 < numerodejugadasconsecutivas);
                                    opcionesdados = JOptionPane.showOptionDialog(null, """
                                                              QUIERES VOLVER A INTENTARLO?""", "Juego de dados",
                                            0, JOptionPane.QUESTION_MESSAGE, null, botones, botones);
                                    break;

                            }

                            break;

                        case 1:
                            switch (turno) {
                                case 1:
                                     k=0; k1 = 0;
                                    do {
                                        JOptionPane.showMessageDialog(null, "Turno maquina", "Jugada# " + numjugadas, JOptionPane.INFORMATION_MESSAGE);
                                        dado1 = (int) (Math.random() * (1 - 6) + 6);
                                        dado2 = (int) (Math.random() * (1 - 6) + 6);
                                        while (dado1 == dado2) {
                                            JOptionPane.showMessageDialog(null, "La maquina ha sacado doble,por ende vuelve a jugar y suma 1 en el puntajeacumulado");
                                            puntajeacumulado2 = puntajeacumulado2 + 1;

                                            dado1 = (int) (Math.random() * (1 - 6) + 6);
                                            dado2 = (int) (Math.random() * (1 - 6) + 6);
                                        }
                                        valorjugada2 = dado1 + dado2;
                                        JOptionPane.showMessageDialog(null, "La maquina ha sacado: " + dado1 + " y " + dado2 + " por ende,el valor de la jugada es de " + valorjugada2);
                                        JOptionPane.showMessageDialog(null, "Turno Jugador");
                                        JOptionPane.showOptionDialog(null, "Tire de los dados", "JUEGO DE DADOS",
                                                0, JOptionPane.INFORMATION_MESSAGE, null, botones1, botones1);
                                        dado1 = (int) (Math.random() * (1 - 6) + 6);
                                        dado2 = (int) (Math.random() * (1 - 6) + 6);
                                        while (dado1 == dado2) {
                                            JOptionPane.showMessageDialog(null, "Ha sacado doble,por ende vuelve a jugar y suma 1 en el puntajeacumulado");
                                            puntajeacumulado1 = puntajeacumulado1 + 1;

                                            JOptionPane.showOptionDialog(null, "Tire de los dados", "JUEGO DE DADOS",
                                                    0, JOptionPane.INFORMATION_MESSAGE, null, botones1, botones1);
                                            dado1 = (int) (Math.random() * (1 - 6) + 6);
                                            dado2 = (int) (Math.random() * (1 - 6) + 6);
                                        }
                                        valorjugada = dado1 + dado2;
                                        JOptionPane.showMessageDialog(null, "Ha sacado: " + dado1 + " y " + dado2 + "por ende,el valor de su jugada es de: " + valorjugada);

                                        if (valorjugada2 > valorjugada) {
                                            JOptionPane.showMessageDialog(null, "La maquina se lleva esta jugada y suma 3 en el acumulado");
                                            puntajeacumulado2 = puntajeacumulado2 + 3;
                                            numjugadas = numjugadas + 1;
                                            k1 = k1 + 1;
                                            k = 0;
                                        } else {
                                            if (valorjugada > valorjugada2) {
                                                JOptionPane.showMessageDialog(null, "El jugador se lleva esta jugada y suma 3 en el acumulado");
                                                puntajeacumulado1 = puntajeacumulado1 + 3;
                                                numjugadas = numjugadas + 1;
                                                k = k + 1;
                                                k1 = 0;
                                            } else {
                                                if (valorjugada == valorjugada2) {
                                                    JOptionPane.showMessageDialog(null, "El valor de la jugada es el mismo,se vuelven a tirar los dados");
                                                }
                                            }
                                        }
                                        if (puntajeacumulado1 - puntajeacumulado2 == 15) {
                                            JOptionPane.showMessageDialog(null, "La partida ha terminado, el ganador es el jugador 1");
                                            win = 1;
                                        } else {
                                            if (puntajeacumulado2 - puntajeacumulado1 == 15) {
                                                JOptionPane.showMessageDialog(null, "La partida ha terminado, el ganador es el jugador 2");
                                                win = 1;
                                            } else {
                                                if (numjugadas >= 25) {
                                                    JOptionPane.showMessageDialog(null, "Se ha llegado al limite de jugadas,por ende la partida termina en empate");
                                                } else {
                                                    if (k == numerodejugadasconsecutivas) {
                                                        JOptionPane.showMessageDialog(null, "Se ha alcanzado el número maximo de jugadas consecutivas,por ende el ganador es el jugador1");
                                                        win = 1;
                                                    } else {
                                                        if (k1 == numerodejugadasconsecutivas) {
                                                            JOptionPane.showMessageDialog(null, "Se ha alcanzado el número maximo de jugadas consecutivas,por ende el ganador es la maquina");
                                                            win = 1;
                                                        }
                                                    }
                                                }
                                            }

                                        }

                                    } while (win != 1 & numjugadas <= 21 & k < numerodejugadasconsecutivas & k1 < numerodejugadasconsecutivas);
                                    opcionesdados = JOptionPane.showOptionDialog(null, """
                                                              QUIERES VOLVER A INTENTARLO?""", "Juego de dados",
                                            0, JOptionPane.QUESTION_MESSAGE, null, botones, botones);
                                    break;
                                case 2:
                                     k=0; k1 = 0;
                                    do {
                                        JOptionPane.showMessageDialog(null, "Turno del jugador");
                                        JOptionPane.showOptionDialog(null, "Tire de los dados", "Jugada# " + numjugadas,
                                                0, JOptionPane.INFORMATION_MESSAGE, null, botones1, botones1);
                                        dado1 = (int) (Math.random() * (1 - 6) + 6);
                                        dado2 = (int) (Math.random() * (1 - 6) + 6);
                                        while (dado1 == dado2) {
                                            JOptionPane.showMessageDialog(null, "Ha sacado doble,por ende vuelve a jugar y suma 1 en el puntajeacumulado");
                                            puntajeacumulado1 = puntajeacumulado1 + 1;

                                            JOptionPane.showOptionDialog(null, "Tire de los dados", "JUEGO DE DADOS",
                                                    0, JOptionPane.INFORMATION_MESSAGE, null, botones1, botones1);
                                            dado1 = (int) (Math.random() * (1 - 6) + 6);
                                            dado2 = (int) (Math.random() * (1 - 6) + 6);
                                        }
                                        valorjugada = dado1 + dado2;
                                        JOptionPane.showMessageDialog(null, "Ha sacado: " + dado1 + " y " + dado2 + " por ende,el valor de su jugada es de: " + valorjugada);
                                        JOptionPane.showMessageDialog(null, "Turno maquina");
                                        dado1 = (int) (Math.random() * (1 - 6) + 6);
                                        dado2 = (int) (Math.random() * (1 - 6) + 6);
                                        while (dado1 == dado2) {
                                            JOptionPane.showMessageDialog(null, "La maquina ha sacado doble,por ende vuelve a jugar y suma 1 en el puntajeacumulado");
                                            puntajeacumulado2 = puntajeacumulado2 + 1;

                                            dado1 = (int) (Math.random() * (1 - 6) + 6);
                                            dado2 = (int) (Math.random() * (1 - 6) + 6);
                                        }
                                        valorjugada2 = dado1 + dado2;
                                        JOptionPane.showMessageDialog(null, "La maquina ha sacado: " + dado1 + " y " + dado2 + " por ende,el valor de la jugada es de " + valorjugada2);
                                        if (valorjugada > valorjugada2) {
                                            JOptionPane.showMessageDialog(null, "El jugador se lleva esta jugada y suma 3 en el acumulado");
                                            puntajeacumulado1 = puntajeacumulado1 + 3;
                                            numjugadas = numjugadas + 1;
                                            k = k + 1;
                                            k1 = 0;
                                        } else {
                                            if (valorjugada2 > valorjugada) {
                                                JOptionPane.showMessageDialog(null, "La maquina se lleva esta jugada y suma 3 en el acumulado");
                                                puntajeacumulado2 = puntajeacumulado2 + 3;
                                                numjugadas = numjugadas + 1;
                                                k1 = k1 + 1;
                                                k = 0;
                                            } else {
                                                if (valorjugada == valorjugada2) {
                                                    JOptionPane.showMessageDialog(null, "El valor de la jugada es el mismo,se vuelven a tirar los dados");
                                                }
                                            }
                                        }
                                        if (puntajeacumulado1 - puntajeacumulado2 == 15) {
                                            JOptionPane.showMessageDialog(null, "La partida ha terminado, el ganador es el jugador 1");
                                            win = 1;
                                        } else {
                                            if (puntajeacumulado2 - puntajeacumulado1 == 15) {
                                                JOptionPane.showMessageDialog(null, "La partida ha terminado, el ganador es el jugador 2");
                                                win = 1;
                                            } else {
                                                if (numjugadas >= 25) {
                                                    JOptionPane.showMessageDialog(null, "Se ha llegado al limite de jugadas,por ende la partida termina en empate");
                                                } else {
                                                    if (k == numerodejugadasconsecutivas) {
                                                        JOptionPane.showMessageDialog(null, "Se ha alcanzado el número maximo de jugadas consecutivas,por ende el ganador es el jugador1");
                                                        win = 1;
                                                    } else {
                                                        if (k1 == numerodejugadasconsecutivas) {
                                                            JOptionPane.showMessageDialog(null, "Se ha alcanzado el número maximo de jugadas consecutivas,por ende el ganador es la maquina");
                                                            win = 1;
                                                        }
                                                    }
                                                }
                                            }
                                        }

                                    } while (win != 1 & numjugadas <= 21 & k < numerodejugadasconsecutivas & k1 < numerodejugadasconsecutivas);
                                    opcionesdados = JOptionPane.showOptionDialog(null, """
                                                              QUIERES VOLVER A INTENTARLO?""", "Juego de dados",
                                            0, JOptionPane.QUESTION_MESSAGE, null, botones, botones);
                                    break;
                            }

                            break;
                    }
                    break;

                case 1:
                    do {
                        opcionesdados = JOptionPane.showOptionDialog(null, """
                                                    Las reglas son las siguientes
                                                    1.El juego consta de dos jugadores el usuario y la maquina,el primero en lanzar sera elegido al azar
                                                    2.Se lanzan los dados
                                                    3.Si el jugador saca doble, aumenta su puntaje acumulado en 1 punto y vuelve a jugar (mientras
                                                      siga sacando dobles, se sigue anotando 1 punto, sigue arrojando el par de dados y el numero de jugadas no aumenta)
                                                    4.Si no saca doble, anota el valor de la jugada (la suma de los dados del jugador) y le cede el turno
                                                      al otro jugador
                                                    5.El que saca mayor puntaje en la jugada aumenta su acumulado en 3 puntos.
                                                    6.Si ambos jugadores sacan el mismo valor en una jugada, ésta se anula y se inicia de nuevo la
                                                      jugada sin incrementar el número de jugadas ni los puntos acumulados.
                                                    7.El partido lo gana el jugador que obtenga una ventaja de 15 puntos sobre su rival o cuando se
                                                      llegue a un total de 21 jugadas o cuando gane k partidas consecutivas(las jugadas consecutivas las define el usuario antes de comenzar la partida
                                                      """, "REGLAS", 0, JOptionPane.INFORMATION_MESSAGE, null, botones, botones);
                    } while (opcionesdados == 1);
                    break;

            }
        }
        if (opcionesdados == 2) {
            JOptionPane.showInternalMessageDialog(null, "GRACIAS POR PARTICIPAR");
        }
                                break;
                            case 2:
                                int numerocomputador,
                                 numerousuario = 0,
                                 cifracomp1,
                                 cifracomp2,
                                 cifracomp3,
                                 cifracomp4,
                                 cifrausu1,
                                 cifrausu2,
                                 cifrausu3,
                                 cifrausu4,
                                 famas,
                                 puntos;
                                //se genera un numero aleatorio de 4 cifras
                                numerocomputador = (int) (Math.random() * 9000) + 1000;
                                cifracomp4 = numerocomputador % 10;
                                cifracomp3 = (numerocomputador / 10) % 10;
                                cifracomp2 = (numerocomputador / 100) % 10;
                                cifracomp1 = (numerocomputador / 1000) % 10;
                                //se verifica que no tenga cifras repetidas
                                while (cifracomp1 == cifracomp2 || cifracomp1 == cifracomp3 || cifracomp1 == cifracomp4 || cifracomp2 == cifracomp3 || cifracomp2 == cifracomp4 || cifracomp3 == cifracomp4) {
                                    numerocomputador = (int) (Math.random() * 9000) + 1000;
                                    cifracomp4 = numerocomputador % 10;
                                    cifracomp3 = (numerocomputador / 10) % 10;
                                    cifracomp2 = (numerocomputador / 100) % 10;
                                    cifracomp1 = (numerocomputador / 1000) % 10;
                                }
                                int intentos = 0;
                                //entero intentos para saber cuantos intentos se toma el usuario en adivinar el numero
                                while (numerocomputador != numerousuario) {
                                    intentos++;
                                    numerousuario = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite su número de 4 cifras: ", "Punto y Fama", JOptionPane.PLAIN_MESSAGE));
                                    while (numerousuario > 9999 || numerousuario < 1000) {
                                        numerousuario = Integer.parseInt(JOptionPane.showInputDialog(null, """
                                                                                   El número debe tener 4 cifras *
                                                                                   Digite su número de 4 cifras: """, "Error", JOptionPane.ERROR_MESSAGE));
                                    }
                                    cifrausu4 = numerousuario % 10;
                                    cifrausu3 = (numerousuario / 10) % 10;
                                    cifrausu2 = (numerousuario / 100) % 10;
                                    cifrausu1 = (numerousuario / 1000) % 10;

                                    while (cifrausu1 == cifrausu2 || cifrausu1 == cifrausu3 || cifrausu1 == cifrausu4 || cifrausu2 == cifrausu3 || cifrausu2 == cifrausu4 || cifrausu3 == cifrausu4) {
                                        numerousuario = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite su número (recuerde que este no puede tener cifras repetidas): ", "Punto y Fama", JOptionPane.PLAIN_MESSAGE));
                                        cifrausu4 = numerousuario % 10;
                                        cifrausu3 = (numerousuario / 10) % 10;
                                        cifrausu2 = (numerousuario / 100) % 10;
                                        cifrausu1 = (numerousuario / 1000) % 10;
                                    }
                                    if (numerocomputador != numerousuario) {

                                        //hallar famas
                                        famas = 0;
                                        if (cifrausu1 == cifracomp1) {
                                            famas++;
                                        }
                                        if (cifrausu2 == cifracomp2) {
                                            famas++;
                                        }
                                        if (cifrausu3 == cifracomp3) {
                                            famas++;
                                        }
                                        if (cifrausu4 == cifracomp4) {
                                            famas++;
                                        }

                                        //hallar puntos
                                        puntos = 0;
                                        if (cifrausu1 == cifracomp2 || cifrausu1 == cifracomp3 || cifrausu1 == cifracomp4) {
                                            puntos++;
                                        }
                                        if (cifrausu2 == cifracomp1 || cifrausu2 == cifracomp3 || cifrausu2 == cifracomp4) {
                                            puntos++;
                                        }
                                        if (cifrausu3 == cifracomp2 || cifrausu3 == cifracomp1 || cifrausu3 == cifracomp4) {
                                            puntos++;
                                        }
                                        if (cifrausu4 == cifracomp2 || cifrausu4 == cifracomp3 || cifrausu4 == cifracomp1) {
                                            puntos++;
                                        }
                                        JOptionPane.showMessageDialog(null, "Hay " + famas + " famas, y " + puntos + " puntos", "Punto y Fama", JOptionPane.PLAIN_MESSAGE);
                                    }
                                }
                                JOptionPane.showMessageDialog(null, "Enhorabuena! Lo has conseguido", "Punto y Fama", JOptionPane.PLAIN_MESSAGE);
                                JOptionPane.showMessageDialog(null, "Usted utilizó " + intentos + " intentos", "Punto y Fama", JOptionPane.PLAIN_MESSAGE);
                                break;
                            case 3:
                                String[] botonesb = {"JUGAR", "¿COMO JUGAR?", "SALIR"}, botonesb1 = {"SACAR BALOTAS"};
                                int c1,
                                 c2,
                                 c3,
                                 c4,
                                 c5,
                                 c6,
                                 c7,
                                 c8,
                                 c9,
                                 num1,
                                 num2,
                                 num3,
                                 numintentos;
                                 win = 0;
                                 int opcionbingo1 = JOptionPane.showOptionDialog(null, """
                                                                                        BIENVENIDO AL BINGO
                                                                                        ¿Quieres jugar o te gustaria ver como funciona primero?""",
                                        "BINGO", JOptionPane.CLOSED_OPTION, JOptionPane.INFORMATION_MESSAGE, null, botonesb, 0);
                                Random random = new Random();
                                do {
                                    switch (opcionbingo1) {
                                        case 0:
                                            numintentos = 0;
                                            c1 = random.nextInt(9 - 1 + 1) + 1;
                                            c2 = random.nextInt(9 - 1 + 1) + 1;
                                            while (c2 == c1) {
                                                c2 = random.nextInt(9 - 1 + 1) + 1;
                                            }
                                            c3 = random.nextInt(9 - 1 + 1) + 1;
                                            while (c3 == c2 || c3 == c1) {
                                                c3 = random.nextInt(9 - 1 + 1) + 1;
                                            }
                                            c4 = random.nextInt(9 - 1 + 1) + 1;
                                            while (c4 == c1 || c4 == c2 || c4 == c3) {
                                                c4 = random.nextInt(9 - 1 + 1) + 1;
                                            }
                                            c5 = random.nextInt(9 - 1 + 1) + 1;
                                            while (c5 == c1 || c5 == c2 || c5 == c3 || c5 == c4) {
                                                c5 = random.nextInt(9 - 1 + 1) + 1;
                                            }
                                            c6 = random.nextInt(9 - 1 + 1) + 1;
                                            while (c6 == c1 || c6 == c2 || c6 == c3 || c6 == c4 || c6 == c5) {
                                                c6 = random.nextInt(9 - 1 + 1) + 1;
                                            }
                                            c7 = random.nextInt(9 - 1 + 1) + 1;
                                            while (c7 == c1 || c7 == c2 || c7 == c3 || c7 == c4 || c7 == c5 || c7 == c6) {
                                                c7 = random.nextInt(9 - 1 + 1) + 1;
                                            }
                                            c8 = random.nextInt(9 - 1 + 1) + 1;
                                            while (c8 == c1 || c8 == c2 || c8 == c3 || c8 == c4 || c8 == c5 || c8 == c6 || c8 == c7) {
                                                c8 = random.nextInt(9 - 1 + 1) + 1;
                                            }
                                            c9 = random.nextInt(9 - 1 + 1) + 1;
                                            while (c9 == c1 || c9 == c2 || c9 == c3 || c9 == c4 || c9 == c5 || c9 == c6 || c9 == c7 || c9 == c8) {
                                                c9 = random.nextInt(9 - 1 + 1) + 1;
                                            }
                                            //Valida que se le de un numero aleatorio a todas las casilla y que estos no se repitan entre si
                                            JOptionPane.showMessageDialog(null, " |  " + c1 + " |  " + c2 + " |  " + c3 + " |   " + "\n"
                                                    + " |  " + c4 + " |  " + c5 + " |  " + c6 + " |   " + "\n"
                                                    + " |  " + c7 + " |  " + c8 + " |  " + c9 + " |   ", "SU TABLERO ES", JOptionPane.INFORMATION_MESSAGE);
                                            //Mostrar tabla
                                            do {
                                                numintentos += 1;

                                                String numintentoss = String.valueOf(numintentos);
                                                String c11 = String.valueOf(c1),
                                                        c12 = String.valueOf(c2),
                                                        c13 = String.valueOf(c3),
                                                        c14 = String.valueOf(c4),
                                                        c15 = String.valueOf(c5),
                                                        c16 = String.valueOf(c6),
                                                        c17 = String.valueOf(c7),
                                                        c18 = String.valueOf(c8),
                                                        c19 = String.valueOf(c9);
                                                //Convierte las casillas en valores de string para posteriormente convertirlas en casillas tapadas por caritas
                                                JOptionPane.showOptionDialog(null, "Pulse para sacar la primera balota", "BINGO", opcionbingo1,
                                                        JOptionPane.INFORMATION_MESSAGE, null, botonesb1, botonesb1);
                                                num1 = random.nextInt(9 - 1 + 1) + 1;
                                                if (c1 == num1) {
                                                    c11 = "☻";
                                                } else {
                                                    if (c2 == num1) {
                                                        c12 = "☻";
                                                    } else {
                                                        if (c3 == num1) {
                                                            c13 = "☻";
                                                        } else {
                                                            if (c4 == num1) {
                                                                c14 = "☻";
                                                            } else {
                                                                if (c5 == num1) {
                                                                    c15 = "☻";
                                                                } else {
                                                                    if (c6 == num1) {
                                                                        c16 = "☻";
                                                                    } else {
                                                                        if (c7 == num1) {
                                                                            c17 = "☻";
                                                                        } else {
                                                                            if (c8 == num1) {
                                                                                c18 = "☻";
                                                                            } else {
                                                                                if (c9 == num1) {
                                                                                    c19 = "☻";
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                //Se valida que la casilla que contenga al numero seleccionado por la balota se cambiado por la carita
                                                JOptionPane.showMessageDialog(null, "Su primera balota es " + num1 + "\n"
                                                        + " |  " + c11 + " |  " + c12 + " |  " + c13 + " |   " + "\n"
                                                        + " |  " + c14 + " |  " + c15 + " |  " + c16 + " |   " + "\n"
                                                        + " |  " + c17 + " |  " + c18 + " |  " + c19 + " |   ", "Intento # " + numintentoss, JOptionPane.INFORMATION_MESSAGE);
                                                JOptionPane.showOptionDialog(null, "Pulse para sacar la segunda balota", "BINGO", opcionbingo1,
                                                        JOptionPane.INFORMATION_MESSAGE, null, botonesb1, botonesb1);
                                                num2 = random.nextInt(9 - 1 + 1) + 1;
                                                while (num2 == num1) {
                                                    num2 = random.nextInt(9 - 1 + 1) + 1;
                                                }
                                                if (c1 == num2) {
                                                    c11 = "☻";
                                                } else {
                                                    if (c2 == num2) {
                                                        c12 = "☻";
                                                    } else {
                                                        if (c3 == num2) {
                                                            c13 = "☻";
                                                        } else {
                                                            if (c4 == num2) {
                                                                c14 = "☻";
                                                            } else {
                                                                if (c5 == num2) {
                                                                    c15 = "☻";
                                                                } else {
                                                                    if (c6 == num2) {
                                                                        c16 = "☻";
                                                                    } else {
                                                                        if (c7 == num2) {
                                                                            c17 = "☻";
                                                                        } else {
                                                                            if (c8 == num2) {
                                                                                c18 = "☻";
                                                                            } else {
                                                                                if (c9 == num2) {
                                                                                    c19 = "☻";
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                JOptionPane.showMessageDialog(null, "Su segunda balota es: " + num2 + "\n"
                                                        + " |  " + c11 + " |  " + c12 + " |  " + c13 + " |   " + "\n"
                                                        + " |  " + c14 + " |  " + c15 + " |  " + c16 + " |   " + "\n"
                                                        + " |  " + c17 + " |  " + c18 + " |  " + c19 + " |   ", "Intento # " + numintentoss, JOptionPane.INFORMATION_MESSAGE);
                                                JOptionPane.showOptionDialog(null, "Pulse para sacar la tercera balota", "BINGO", opcionbingo1,
                                                        JOptionPane.INFORMATION_MESSAGE, null, botonesb1, botonesb1);
                                                num3 = random.nextInt(9 - 1 + 1) + 1;
                                                while (num3 == num2 || num3 == num1) {
                                                    num3 = random.nextInt(9 - 1 + 1) + 1;
                                                }
                                                if (c1 == num3) {
                                                    c11 = "☻";
                                                } else {
                                                    if (c2 == num3) {
                                                        c12 = "☻";
                                                    } else {
                                                        if (c3 == num3) {
                                                            c13 = "☻";
                                                        } else {
                                                            if (c4 == num3) {
                                                                c14 = "☻";
                                                            } else {
                                                                if (c5 == num3) {
                                                                    c15 = "☻";
                                                                } else {
                                                                    if (c6 == num3) {
                                                                        c16 = "☻";
                                                                    } else {
                                                                        if (c7 == num3) {
                                                                            c17 = "☻";
                                                                        } else {
                                                                            if (c8 == num3) {
                                                                                c18 = "☻";
                                                                            } else {
                                                                                if (c9 == num3) {
                                                                                    c19 = "☻";
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                JOptionPane.showMessageDialog(null, "La tercera balota que ha sacado es " + num3 + "\n"
                                                        + " |  " + c11 + " |  " + c12 + " |  " + c13 + " |   " + "\n"
                                                        + " |  " + c14 + " |  " + c15 + " |  " + c16 + " |   " + "\n"
                                                        + " |  " + c17 + " |  " + c18 + " |  " + c19 + " |   ", "Intento # " + numintentoss, JOptionPane.INFORMATION_MESSAGE);
                                                //Pedir al usuario que saque las tres balotas y mostrarle el numero de la balota que ha sacado 
                                                //Mostrar tabla con los numeros selecionados tapados
                                                if (c11 == "☻" & c13 == "☻" & c12 == "☻") {
                                                    JOptionPane.showMessageDialog(null, "!!!BINGO¡¡¡");
                                                    win = 1;
                                                } else {
                                                    if (c11 == "☻" & c14 == "☻" & c17 == "☻") {
                                                        JOptionPane.showMessageDialog(null, "!!!BINGO¡¡¡");
                                                        win = 1;
                                                    } else {
                                                        if (c14 == "☻" & c15 == "☻" & c16 == "☻") {
                                                            JOptionPane.showMessageDialog(null, "!!!BINGO¡¡¡");
                                                            win = 1;
                                                        } else {
                                                            if (c17 == "☻" & c18 == "☻" & c19 == "☻") {
                                                                JOptionPane.showMessageDialog(null, "!!!BINGO¡¡¡");
                                                                win = 1;
                                                            } else {
                                                                if (c12 == "☻" & c15 == "☻" & c18 == "☻") {
                                                                    JOptionPane.showMessageDialog(null, "!!!BINGO¡¡¡");
                                                                    win = 1;
                                                                } else {
                                                                    if (c13 == "☻" & c16 == "☻" & c19 == "☻") {
                                                                        JOptionPane.showMessageDialog(null, "!!!BINGO¡¡¡");
                                                                        win = 1;
                                                                    } else {
                                                                        if (numintentos == 7) {
                                                                            JOptionPane.showMessageDialog(null, "Ha alcanzado el numero maximo de intentos");
                                                                        } else {
                                                                            JOptionPane.showMessageDialog(null, "No ha hecho bingo");
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                //Evalua los casos necesarios para ganar 
                                            } while (win != 1 & numintentos <= 6);
                                            opcionbingo1 = JOptionPane.showOptionDialog(null, "¿QUIERES VOLVER A INTENTRALO? ", "BINGO", 0, JOptionPane.INFORMATION_MESSAGE, null, botonesb, botonesb);
                                            break;
                                        case 1:
                                            do {
                                                opcionbingo1 = JOptionPane.showOptionDialog(null, """
                                                    1.Se generara una tabla aleatoria con nueve casillas
                                                    2.Usted va a dar la orden de que se generen tres numeros aleatorios
                                                    3.Dependiendo de los numeros generados, se van a tapar las casillas que contengan estos numeros
                                                    4.La partida terminara cuando logre sacar tres numeros en linea, ya sea horizontal o vertical
                                                      o cuando haya alcanzado los 7 intentos
                                                    """, "BINGO", 0, JOptionPane.INFORMATION_MESSAGE, null, botonesb, botonesb);
                                            } while (opcionbingo1 == 1);
                                            break;
                                    }
                                } while (opcionbingo1 != 2);
                                if (opcionbingo1 == 2) {
                                    JOptionPane.showMessageDialog(null, "GRACIAS POR HABER PARTICIPADO");
                                }
                                break;
                            case 4:
                                JOptionPane.showMessageDialog(null, "Bye bye");
                        }
                    }
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Bienvenido a los Procesos Matemáticos ", "Procesos Matemáticos", JOptionPane.PLAIN_MESSAGE);
                    while (op3 != 4) {
                        op3 = Integer.parseInt(JOptionPane.showInputDialog(
                                "Las opciones disponibles son:\n\n"
                                + "1. Cuadrados.\n"
                                + "2. Digitos de un número.\n"
                                + "3. Funciones trigonométricas\n"
                                + "4. Salir\n\n"
                                + "Ingrese la opción que desea elegir: "));
                        while (op3 < 1 || op3 > 4) {
                            op3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opción válida: "));
                        }
                        switch (op3) {
                            case 1:
                                int c,
                                 n;
                                String pop = "",
                                 up = "";
                                n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero: ", "Potencia", JOptionPane.PLAIN_MESSAGE));
                                while (n <= 0) {
                                    n = Integer.parseInt(JOptionPane.showInputDialog(null, """
                                                                                                                          El número debe ser mayor a 0
                                                                                                                          Ingrese el numero: 
                                                                    """, "Potencia", JOptionPane.PLAIN_MESSAGE));
                                }
                                c = 0;
                                int m = 1;
                                for (int i = 1; i <= n; i++) {
                                    up = " = " + c;
                                    m = m + 2;
                                    JOptionPane.showMessageDialog(null, "El cuadrado de " + i + " es " + pop + up);
                                }
                                break;
                            case 2:
                                String input = JOptionPane.showInputDialog("Ingrese un número de 3 a 12 dígitos:");
                                long f = Long.parseLong(input);
                                input = JOptionPane.showInputDialog("Ingrese el dígito:");
                                int d = Integer.parseInt(input);
                                int w = 0;
                                long temp = f;
                                while (temp != 0) {
                                    temp /= 10;
                                    w++;
                                }
                                int e = (int) (Math.random() * 9);
                                long Nnum = 0;
                                long s = 1;
                                temp = f;
                                while (temp != 0) {
                                    long digit = temp % 10;
                                    if (digit == s) {
                                        digit = e;
                                    }
                                    Nnum += digit * d;
                                    s *= 10;
                                    temp /= 10;
                                }
                                JOptionPane.showMessageDialog(null, "El número tiene " + w + " dígitos.");
                                JOptionPane.showMessageDialog(null, "El dígito generado aleatoriamente es: " + e);
                                JOptionPane.showMessageDialog(null, "El nuevo número generado es: " + Nnum);
                                int count = 0;
                                temp = Nnum;
                                while (temp != 0) {
                                    long digit = temp % 10;
                                    if (digit == d) {
                                        count++;
                                    }
                                    temp /= 10;
                                }
                                if (count > 0) {
                                    JOptionPane.showMessageDialog(null, "El dígito " + d + " se encuentra " + count + " veces dentro del número.");
                                } else {
                                    JOptionPane.showMessageDialog(null, "El dígito " + d + " no se encuentra dentro del número.");
                                }
                                break;
                            case 3:
                                double sinX = 0,
                                 cosX = 1,
                                 tanX = 1,
                                 cscX = 1,
                                 secX = 1,
                                 cotX = 1;
                                int op = Integer.parseInt(JOptionPane.showInputDialog(null, "(1) Seno\n"
                                        + "(2) Coseno \n"
                                        + "(3) Tangente\n"
                                        + "(4) Cosecante\n"
                                        + "(5) Secante\n"
                                        + "(6) Cotangente", "Series de taylor", JOptionPane.QUESTION_MESSAGE));
                                double x = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el valor de X:"));
                                n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor de n:"));
                                x = x * (Math.PI / 180);
                                double y = x;
//            SENO
                                for (int i = 0; i <= n; i++) {
                                    int den = 2 * i + 1; // Término para el factorial y potencia de x
                                    double p = 1;
                                    double factorial = 1;
                                    for (int j = 1; j <= den; j++) {
                                        p = p * x; // Calcular la potencia de x
                                    }
                                    for (int k = 1; k <= den; k++) {
                                        factorial *= k; // Calcular el factorial
                                    }
                                    int signo; // Entero signo para determinar el signo del resultado
                                    if (i % 2 == 0) {
                                        signo = 1;
                                    } else {
                                        signo = -1;
                                    }
                                    sinX += (signo * p) / factorial; // Operar todas las variables para la serie
                                }
//            COSENO
                                for (int h = 0; h <= n; h++) {
                                    int den = 2 * h; // Variable para almacenar la potencia y enunciado del factorial
                                    double p = 1;
                                    int factorial = 1;
                                    for (int g = 1; g <= den; g++) {
                                        p = p * y; // Calcular la potencia de x    
                                    }
                                    for (int t = 1; t <= den; t++) {
                                        factorial *= t; // Calcular el factorial
                                    }
                                    int signo; // Entero signo para determinar el signo del resultado
                                    if (h % 2 == 0) {
                                        signo = 1;
                                    } else {
                                        signo = -1;
                                    }
                                    cosX += (signo * p) / factorial; // Operar todas las variables para la serie
                                }
                                switch (op) {
                                    case 1:
                                        x = (int) (x * 180 / Math.PI);
                                        JOptionPane.showMessageDialog(null, "El seno de " + x + " es: " + sinX);
                                        break;
                                    case 2:
                                        y = (int) (y * 180 / Math.PI);
                                        JOptionPane.showMessageDialog(null, "El coseno de " + y + " es: " + cosX);
                                        break;
                                    case 3:
                                        x = (int) (x * 180 / Math.PI);
                                        tanX = sinX / cosX;
                                        JOptionPane.showMessageDialog(null, "La tangente de " + x + " es: " + tanX);
                                        break;
                                    case 4:
                                        x = (int) (x * 180 / Math.PI);
                                        cscX = 1 / sinX;
                                        JOptionPane.showMessageDialog(null, "La cosecante de " + x + " es: " + cscX);
                                        break;
                                    case 5:
                                        x = (int) (x * 180 / Math.PI);
                                        secX = 1 / cosX;
                                        JOptionPane.showMessageDialog(null, "La secante de " + x + " es: " + secX);
                                        break;
                                    case 6:
                                        x = (int) (x * 180 / Math.PI);
                                        cotX = cosX / sinX;
                                        JOptionPane.showMessageDialog(null, "La cotangente de " + x + " es: " + cotX);
                                        break;
                                }
                                break;
                            case 4:
                                JOptionPane.showMessageDialog(null, "Bye bye");
                        }
                    }
                    break;

                case 3:
                    JOptionPane.showMessageDialog(null,
                            "Bye Bye!\nAdios!\nAu revoir!");
            }
        }
    }
}

package labfinal;

import javax.swing.JOptionPane;

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
                    JOptionPane.showMessageDialog(null, "Bienvenido a la Miscelanea de juegos: ");
                    while (op2 != 4) {
                        op2 = Integer.parseInt(JOptionPane.showInputDialog(
                                "Las opciones disponibles son:\n\n"
                                + "1. Dados.\n"
                                + "2. Punto y fama\n"
                                + "3. Bingo\n"
                                + "4. Salir\n\n"
                                + "Ingrese la opción que desea elegir: "));
                        while (op2 < 1 || op2 > 4) {
                            op2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opción válida: "));
                        }
                        switch (op2) {
                            case 1:
                                String[] botones = {"JUGAR", "REGLAS", "SALIR"},
                                 botones2 = {"JUGADOR 1", "JUGADOR 2"},
                                 botones1 = {"TIRAR DADOS"};
                                int turno,
                                 valorjugada,
                                 valorjugada2,
                                 jugador,
                                 dado1,
                                 dado2,
                                 win = 0,
                                 puntajeacumulado1 = 0,
                                 puntajeacumulado2 = 0,
                                 numjugadas = 1,
                                 numerodejugadasconsecutivas,
                                 k = 0,
                                 k1 = 0,
                                 opciones2,
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
                                numerocomputador = (int) (Math.random() * 9000) + 1000;
                                cifracomp4 = numerocomputador % 10;
                                cifracomp3 = (numerocomputador / 10) % 10;
                                cifracomp2 = (numerocomputador / 100) % 10;
                                cifracomp1 = (numerocomputador / 1000) % 10;
                                while (cifracomp1 == cifracomp2 || cifracomp1 == cifracomp3 || cifracomp1 == cifracomp4 || cifracomp2 == cifracomp3 || cifracomp2 == cifracomp4 || cifracomp3 == cifracomp4) {
                                    numerocomputador = (int) (Math.random() * 9000) + 1000;
                                    cifracomp4 = numerocomputador % 10;
                                    cifracomp3 = (numerocomputador / 10) % 10;
                                    cifracomp2 = (numerocomputador / 100) % 10;
                                    cifracomp1 = (numerocomputador / 1000) % 10;
                                }
                                int intentos = 0;
                                while (numerocomputador != numerousuario) {
                                    intentos++;
                                    numerousuario = Integer.parseInt(JOptionPane.showInputDialog("Digite su número de 4 cifras: "));
                                    while (numerousuario > 9999 || numerousuario < 1000) {
                                        numerousuario = Integer.parseInt(JOptionPane.showInputDialog("El número debe tener 4 cifras *"));
                                    }
                                    System.out.println("El número debe tener 4 cifras *");
                                    cifrausu4 = numerousuario % 10;
                                    cifrausu3 = (numerousuario / 10) % 10;
                                    cifrausu2 = (numerousuario / 100) % 10;
                                    cifrausu1 = (numerousuario / 1000) % 10;

                                    while (cifrausu1 == cifrausu2 || cifrausu1 == cifrausu3 || cifrausu1 == cifrausu4 || cifrausu2 == cifrausu3 || cifrausu2 == cifrausu4 || cifrausu3 == cifrausu4) {
                                        numerousuario = Integer.parseInt(JOptionPane.showInputDialog("Digite su número (recuerde que este no puede tener cifras repetidas): "));
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
                                        JOptionPane.showMessageDialog(null, "Hay " + famas + " famas, y " + puntos + " puntos");
                                    }
                                }
                                JOptionPane.showMessageDialog(null, "¡Enhorabuena! Lo has conseguido");
                                JOptionPane.showMessageDialog(null, "Usted utilizó " + intentos + " intentos");

                            case 3:
                                JOptionPane.showMessageDialog(null, "En construcción...");
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
                                int x,
                                 n;
                                String pop = "",
                                 up = "";
                                n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero: "));
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
                                    JOptionPane.showMessageDialog(null, "El cuadrado de " + i + " es " + pop + up);
                                }
                                break;
                            case 2:
                            case 3:
                                JOptionPane.showMessageDialog(null, "En construcción...");
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

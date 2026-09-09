import java.util.Scanner;

public class Ejercicio4_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] tablero = new char[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = ' ';
            }
        }

        boolean turnoJugador1 = true;
        boolean juegoTerminado = false;
        int jugadas = 0;

        System.out.println("--- Bienvenido a Tres en Raya ---");


        while (!juegoTerminado && jugadas < 9) {
            

            System.out.println("\nTablero:");
            for (int i = 0; i < 3; i++) {
                System.out.printf(" %c | %c | %c \n", tablero[i][0], tablero[i][1], tablero[i][2]);
                if (i < 2) {
                    System.out.println("-----------"); 
                }
            }

            char simboloActual = turnoJugador1 ? 'X' : 'O';
            int jugadorActual = turnoJugador1 ? 1 : 2;

            System.out.printf("\nTurno del Jugador %d (%c)\n", jugadorActual, simboloActual);

            int fila = -1;
            int columna = -1;
            boolean jugadaValida = false;

            while (!jugadaValida) {
                System.out.println("Indica la fila (0, 1 o 2):");
                fila = scanner.nextInt();
                
                System.out.println("Indica la columna (0, 1 o 2):");
                columna = scanner.nextInt();

                if (fila >= 0 && fila <= 2 && columna >= 0 && columna <= 2) {
                  
                    if (tablero[fila][columna] == ' ') {
                        jugadaValida = true; 
                    } else {
                        System.out.println("Error: Esa celda ya está ocupada. Intenta de nuevo.");
                    }
                } else {
                    System.out.println("Error: Las coordenadas deben ser 0, 1 o 2. Intenta de nuevo.");
                }
            }

            tablero[fila][columna] = simboloActual;
            jugadas++;

            for (int i = 0; i < 3; i++) {
                if (tablero[i][0] == simboloActual && tablero[i][1] == simboloActual && tablero[i][2] == simboloActual) {
                    juegoTerminado = true;
                }
                if (tablero[0][i] == simboloActual && tablero[1][i] == simboloActual && tablero[2][i] == simboloActual) {
                    juegoTerminado = true;
                }
            }
          
            if (tablero[0][0] == simboloActual && tablero[1][1] == simboloActual && tablero[2][2] == simboloActual) {
                juegoTerminado = true;
            }
            if (tablero[0][2] == simboloActual && tablero[1][1] == simboloActual && tablero[2][0] == simboloActual) {
                juegoTerminado = true;
            }

            if (!juegoTerminado) {
                turnoJugador1 = !turnoJugador1; // Invierte el valor booleano
            }
        } 
        System.out.println("\n--- RESULTADO FINAL ---");

        for (int i = 0; i < 3; i++) {
            System.out.printf(" %c | %c | %c \n", tablero[i][0], tablero[i][1], tablero[i][2]);
            if (i < 2) System.out.println("-----------");
        }

        if (juegoTerminado) {
            char simboloGanador = turnoJugador1 ? 'X' : 'O';
            int jugadorGanador = turnoJugador1 ? 1 : 2;
            System.out.printf("\n¡Felicidades! El Jugador %d (%c) ha ganado la partida.\n", jugadorGanador, simboloGanador);
        } else {
            System.out.println("\n¡Es un empate! El tablero se llenó y nadie logró conectar tres en raya.");
        }

        scanner.close();
    }
}
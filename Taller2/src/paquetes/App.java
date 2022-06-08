package paquetes;

import java.util.Scanner;

public class App {
    private static final String MannedCraft = null;
    private static final String RocketCraft = null;
    private static final String DroneCraft = null;
    private static final String PrototypeCraft = null;

    public static void main(String[] args) throws Exception {
        /** solicita al usuario el tipo denave a elegir despues de su construccion */
        System.out.println("Bienvenido. Seleccione un tipo de Nave");
        System.out.println("presione 1 para Seleccionar lanzadera");
        System.out.println("presione 2 para Seleccionar nave no tripulada");
        System.out.println("presione 3 para Seleccionar Nave de pasajeros");
        System.out.println("presione 4 para Seleccionar Nave Multi proposito");
        System.out.println("presione 0 para Salir");

        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione una Opcion");
        int option = sc.nextInt();

        /**
         * por me dio del switch case seleccion una de las opciones eligiendo un numero
         * de posicion para seleccionar la nave deseada
         * 
         */
        switch (option) {

            case 1:
                System.out.println("Has Ingresado a la opcion 1, Preparando Cohete para Propulsion");

                /** nave instanciada perteneciente a la clase Rocketcraft */
                RocketCraft lanzadera = new RocketCraft(01, "LanzaderaHKl789", "Impulsar Naves Fuera de la Orbita",
                        "Propulsar nave tripulada");
                lanzadera.showdata(RocketCraft);
                lanzadera.status();

                break;

            case 2:
                System.out.println("Has Ingresado a la opcion 2, Exitos  en tu exploracion");
                /** nave instanciada perteneciente a la clase Dronetcraft */
                DroneCraft sonda = new DroneCraft(02, "Explorer17", "Zoom Super", "orbitar lunas de jupiter",
                        "Tomar fotos");
                sonda.showdata(DroneCraft);

                break;

            case 3:
                System.out.println("Has Ingresado a la opcion 3,  Los esperamos de regreso");
                /** nave instanciada perteneciente a la clase Mannedcraft */
                MannedCraft naveTripulada = new MannedCraft(03, "Transbordador 2022", "carga de pasajeros",
                        "transportar escuadron", "Contenedor de pasajeros");
                naveTripulada.showdata(MannedCraft);

                break;

            case 4:
                System.out.println("Has Ingresado a la opcion 4,  Nave experimental en proceso de lanzamiento.");
                /** nave instanciada perteneciente a la clase Prototypecraft */
                PrototypeCraft specialCraft = new PrototypeCraft(04, "Kamaleon 1285",
                        "Nave multi funcion para diferentes propositos Tdo en uno",
                        "transporte de sondas y tripulacion para muestreo y exploracion", "captura de imagenes",
                        "transporte de pasajeros", true);
                specialCraft.showdata(PrototypeCraft);
                specialCraft.status();
                break;

            case 5:
                System.exit(0);

            default:
                System.out.println("Hasta luego");

        }

    }
}

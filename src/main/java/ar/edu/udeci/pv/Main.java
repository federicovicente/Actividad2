package ar.edu.udeci.pv;

import org.apache.commons.cli.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        // Definición de opciones de CLI
        Options options = new Options();
        options.addOption("n", "nombre", true, "Nombre del usuario");
        options.addOption("a", "actividad", true, "Actividad del usuario");

        CommandLineParser parser = new DefaultParser();

        try {
            CommandLine cmd = parser.parse(options, args);

            if (cmd.hasOption("n") && cmd.hasOption("a")) {
                String nombre = cmd.getOptionValue("n");
                String actividad = cmd.getOptionValue("a");

                logger.info("Nombre recibido: {}", nombre);
                logger.info("Actividad recibida: {}", actividad);

                System.out.println("Hola " + nombre + ", la actividad " + actividad + " fue completada.");
            } else {
                System.out.println("Faltan parámetros. Use -n <nombre> -a <actividad>");
            }

        } catch (ParseException e) {
            logger.error("Error al parsear los argumentos: {}", e.getMessage());
        }
    }
}
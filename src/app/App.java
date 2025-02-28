/* 
 * Siguiendo con la busqueda de la optimizacion de la aplicacion, asi como de mejorar mis practicas de programacion,
 * he decidido dividir la aplicacion en paquetes, de tal forma que se pueda tener un mejor control de los archivos
 * separando ahora si por completo la logica de la aplicacion de la interfaz grafica.
 * asi como la manipulacion de los datos de la aplicacion del control de la interfaz grafica.
 * ademas en mi busqueda de mejorar mi proceso de debugging segui experimentando
 * con el uso de test unitarios, y automatizados para cada una de las clases de la aplicacion.
 * 
 * Espero recibir una retroalimentacion que me impulse a seguir mejorando en mi proceso de aprendizaje.
 * ademas de que me gustaria saber si voy por buen camino en la implementacion de los test unitarios.
 * 
 * en caso de cualquier duda o inquietud respecto a mi proceso de trabajo siempre puede visitar mi repositorio
 * en github, donde podra encontrar el historial de cambios y mejoras que he ido implementando en la aplicacion.
 *  https://github.com/Mateo-Manchola12/T8-TallerMecanico
 * quedo atento a cualquier comentario o sugerencia que pueda tener, gracias.
 */

package app;

import app.menu.MenuController;

public class App {
    public static void main(String[] args) throws Exception {
        MenuController menuController = new MenuController();
        menuController.start();
    }
}
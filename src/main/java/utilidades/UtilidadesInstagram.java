package utilidades;


import modelos.InformeMensual;
import modelos.Publicacion;
import modelos.Story;
import modelos.Usuario;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UtilidadesInstagram {


    /**
     * Dada una lista de usuarios devuelve los usuarios cuya cuenta está verificada,
     * esto quiere decir que el "TipoUsuario" tiene que ser "CUENTA_VERIFICADA"
     * (1 punto)
     *
     * @param usuarios
     * @return
     */
    public static List<Usuario> getUsuariosConCuentaVerificada(List<Usuario> usuarios){
        return new ArrayList<>();
    }


    /**
     * Dada una lista de publicaciones, devuelve las publicaciones agrupadas por el usuario que las publicó,
     * es decir agrupadas por su "autor"
     * (1 punto)
     *
     * @param publicaciones
     * @return
     */
    public static Map<Usuario, List<Publicacion>> publicacionesAgrupadasPorUsuario(List<Publicacion> publicaciones){
        return new HashMap<>();
    }


    /**
     * Dado una lista de stories, una fecha inicio y una fecha fin, devuelve el número de likes que tiene esa
     * publicación entre ambas fechas (inclusive), es decir todos los likes de la story en cuya fecha sea igual a
     * las fechas dadas o esté entre las fechas.
     * (1.5 puntos)
     *
     * @param stories
     * @param fechaInicio
     * @param fechaFin
     * @return
     */
    public static Integer likesEntreFechas(List<Story> stories, LocalDate fechaInicio, LocalDate fechaFin){
        return 0;
    }


    /**
     * Dado un usuario y una publicación de dicho usuario devuelve todas las interacciones de usuarios que son seguidores
     * es decir el número de likes + número de comentarios de la publicación teniendo en cuenta que esos comentarios
     * y likes hay que filtrarlos quedándose solo con los cuales su autor es un seguidor de la lista de seguidores
     * del usuario que se pasa como parámetro.
     * (1.5 puntos)
     *
     * @param usuario
     * @param publicacion
     * @return
     */
    public static Integer getTotalInteraccionesSeguidores(Usuario usuario, Publicacion publicacion){
        return 0;
    }


    /**
     * A partir de un usuario saca su informe mensual, que se rellena de la siguiente manera:
     * usuario -> el usuario que se pasa como parámetro
     * numPublicacionesTotales -> el total de publicaciones que tiene el usuario
     * numStoriesTotales -> el número total de stories que tiene el usuario
     * numSeguidoresTotales -> el número total de seguidores que tiene el usuario
     * numLikesTotales -> se cacula sumando los likes de todas las publicaciones y stories del usuario.
     * numLikesTotales -> se cacula sumando los likes de todas las publicaciones y stories del usuario.
     * numTotalComentarios -> se calcula sumando el total de comentarios de las publicaciones del usuario.
     * comentariosPublicacion -> se calcula poniendo como claves del mapa las publicaciones del usuario
     *                              y como valor el número de comentarios que tiene esa publicación
     * visualizacionesPorStory -> se calcula poniendo como claves del mapa las stories del usuario
     *                              y como valor el número de visualizaciones que tiene esa story.
     * (5 puntos)
     *s
     * @param usuario
     * @return
     */
    public static InformeMensual getInformeMensualUsuario(Usuario usuario){
        return new InformeMensual();
    }





}

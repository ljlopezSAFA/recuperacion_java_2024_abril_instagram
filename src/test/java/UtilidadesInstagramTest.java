import modelos.*;
import org.junit.jupiter.api.Test;
import utilidades.UtilidadesInstagram;

import java.time.LocalDate;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UtilidadesInstagramTest {

    // Mock data
    Usuario usuario1 = new Usuario("usuario1", "usuario1@example.com", "contraseña1", new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), TipoUsuario.CUENTA_VERIFICADA);
    Usuario usuario2 = new Usuario("usuario2", "usuario2@example.com", "contraseña2", new ArrayList<>(), Collections.singletonList(usuario1), new ArrayList<>(), TipoUsuario.INFLUENCER);

    Comentario comentario1 = new Comentario(usuario1, "¡Gran publicación!");
    Comentario comentario2 = new Comentario(usuario2, "Excelente contenido.");

    Publicacion publicacion1 = new Publicacion(usuario1, "Publicación 1", LocalDate.now(), Collections.singletonList(comentario1), Collections.singletonList(usuario2), new ArrayList<>());
    Publicacion publicacion2 = new Publicacion(usuario2, "Publicación 2", LocalDate.now(), Collections.singletonList(comentario2), Collections.singletonList(usuario1), new ArrayList<>());

    Like like1 = new Like(usuario1, LocalDate.now());
    Like like2 = new Like(usuario2, LocalDate.now());

    Story story1 = new Story(usuario1, "Story 1", LocalDate.now(), Collections.singletonList(usuario2), Arrays.asList(like1, like2));
    Story story2 = new Story(usuario2, "Story 2", LocalDate.now(), Collections.singletonList(usuario1), new ArrayList<>());





    // Test para getUsuariosConCuentaVerificada
    @Test
    public void testGetUsuariosConCuentaVerificada() {
        List<Usuario> usuarios = Arrays.asList(usuario1, usuario2);
        List<Usuario> usuariosVerificados = UtilidadesInstagram.getUsuariosConCuentaVerificada(usuarios);
        assertEquals(1, usuariosVerificados.size());
        assertTrue(usuariosVerificados.contains(usuario1));
    }

    // Test para publicacionesAgrupadasPorUsuario
    @Test
    public void testPublicacionesAgrupadasPorUsuario() {
        List<Publicacion> publicaciones = Arrays.asList(publicacion1, publicacion2);
        Map<Usuario, List<Publicacion>> publicacionesAgrupadas = UtilidadesInstagram.publicacionesAgrupadasPorUsuario(publicaciones);
        assertEquals(2, publicacionesAgrupadas.size());
        assertTrue(publicacionesAgrupadas.containsKey(usuario1));
        assertTrue(publicacionesAgrupadas.containsKey(usuario2));
        assertEquals(1, publicacionesAgrupadas.get(usuario1).size());
        assertEquals(1, publicacionesAgrupadas.get(usuario2).size());
    }

    // Test para likesEntreFechas
    @Test
    public void testLikesEntreFechas() {
        List<Story> stories = Arrays.asList(story1, story2);
        int likesCount = UtilidadesInstagram.likesEntreFechas(stories, LocalDate.now().minusDays(1), LocalDate.now().plusDays(1));
        assertEquals(2, likesCount); // No se han dado likes en las stories
    }

    // Test para getTotalInteraccionesSeguidores
    @Test
    public void testGetTotalInteraccionesSeguidores() {
        int interacciones = UtilidadesInstagram.getTotalInteraccionesSeguidores(usuario1, publicacion2);
        assertEquals(1, interacciones); // Usuario 1 ha dado un like en la publicación 2
    }

    // Test para getInformeMensualUsuario
    @Test
    public void testGetInformeMensualUsuario() {
        usuario1.getPublicaciones().add(publicacion1);
        usuario1.getPublicaciones().add(publicacion2);
        usuario1.getStories().add(story1);
        usuario1.getStories().add(story2);
        int likesCount = publicacion1.getLikes().size() + publicacion2.getLikes().size() + story1.getLikes().size() + story2.getLikes().size();
        int comentariosCount = publicacion1.getComentarios().size() + publicacion2.getComentarios().size();
        InformeMensual informe = UtilidadesInstagram.getInformeMensualUsuario(usuario1);
        assertEquals(usuario1, informe.getUsuario());
        assertEquals(2, informe.getNumPublicacionesTotales());
        assertEquals(2, informe.getNumStoriesTotales());
        assertEquals(1, informe.getNumSeguidoresTotales());
        assertEquals(likesCount, informe.getNumLikesTotales());
        assertEquals(comentariosCount, informe.getNumTotalComentarios());
        assertEquals(2, informe.getComentariosPublicacion().size());
        assertEquals(2, informe.getVisualizacionesPorStory().size());
    }

}

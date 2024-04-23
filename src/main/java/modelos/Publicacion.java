package modelos;

import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = {"comentarios", "etiquetados", "likes", "autor"})
public class Publicacion {
    private Usuario autor;
    private String descripcion;
    private LocalDate fecha;
    private List<Comentario> comentarios;
    private List<Usuario> etiquetados;
    private List<Like> likes;
}

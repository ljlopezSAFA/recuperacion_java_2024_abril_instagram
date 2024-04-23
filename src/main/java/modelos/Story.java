package modelos;

import lombok.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Locale;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = {"autor", "visualizaciones", "likes"})
public class Story {
    private Usuario autor;
    private String descripcion;
    private LocalDate fecha;
    private List<Usuario> visualizaciones;
    private List<Like> likes;
}

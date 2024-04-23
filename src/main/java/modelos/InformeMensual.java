package modelos;

import lombok.*;

import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = {"comentarios", "etiquetados", "likes", "autor"})
public class InformeMensual {
    private Usuario usuario;
    private Integer numPublicacionesTotales;
    private Integer numStoriesTotales;
    private Integer numSeguidoresTotales;
    private Integer numLikesTotales;
    private Integer numTotalComentarios;
    private Map<Publicacion, Integer> comentariosPublicacion;
    private Map<Story, Integer> visualizacionesPorStory;
}

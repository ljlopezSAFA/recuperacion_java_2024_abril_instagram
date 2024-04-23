package modelos;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = {"usuario"})
public class Comentario {
    private Usuario usuario;
    private String texto;
}

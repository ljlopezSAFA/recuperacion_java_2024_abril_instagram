package modelos;
import lombok.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = {"publicaciones", "seguidores", "tipoUsuario", "stories"})
public class Usuario {
    private String nombreUsuario;
    private String correo;
    private String contraseña;
    private List<Publicacion> publicaciones;
    private List<Usuario> seguidores;
    private List<Story> stories;
    private TipoUsuario tipoUsuario;
}

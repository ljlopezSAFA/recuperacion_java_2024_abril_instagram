package modelos;

import java.time.LocalDate;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = {"usuario"})
public class Like {
    private Usuario usuario;
    private LocalDate fecha;
}

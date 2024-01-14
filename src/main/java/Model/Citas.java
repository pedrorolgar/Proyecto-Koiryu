package Model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The type Citas.
 */
@Entity
@Table(name = "citas")
@ToString
@Getter
@Setter
public class Citas implements java.io.Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "CitaId")
  private Integer citaId;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "UsuarioSolicitanteID", nullable = false)
  private Usuarios usuariosByUsuarioSolicitanteId;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "UsuarioDestinoID", nullable = false)
  private Usuarios usuariosByUsuarioDestinoId;

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "citas")
  private Set<Likescitas> likescitases = new HashSet<>(0);

  /**
   * Instantiates a new Citas.
   */
  public Citas() {
  }

  /**
   * Instantiates a new Citas.
   *
   * @param usuariosByUsuarioSolicitanteId the usuarios by usuario solicitante id
   * @param usuariosByUsuarioDestinoId the usuarios by usuario destino id
   * @param likescitases the likescitases
   */
  public Citas(Usuarios usuariosByUsuarioSolicitanteId, Usuarios usuariosByUsuarioDestinoId, Set<Likescitas> likescitases) {
    this.usuariosByUsuarioSolicitanteId = usuariosByUsuarioSolicitanteId;
    this.usuariosByUsuarioDestinoId = usuariosByUsuarioDestinoId;
    this.likescitases = likescitases;
  }
}

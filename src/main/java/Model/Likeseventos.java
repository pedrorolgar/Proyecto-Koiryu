package Model;

/**
 *
 * @author Pedro Rollán
 */
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

/**
 * The type Likeseventos.
 */
@Entity
@Table(name = "likeseventos")
@Getter
@Setter
public class Likeseventos implements java.io.Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "LikeEventoID")
  private Integer likeEventoId;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "EventoID", referencedColumnName = "EventoID", nullable = false)
  private Eventos eventos;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "UsuarioID", referencedColumnName = "UserID", nullable = false)
  private Usuarios usuarios;

  /**
   * Instantiates a new Likeseventos.
   */
  public Likeseventos() {
  }

  /**
   * Instantiates a new Likeseventos.
   *
   * @param eventos the eventos
   * @param usuarios the usuarios
   */
  public Likeseventos(Eventos eventos, Usuarios usuarios) {
    this.eventos = eventos;
    this.usuarios = usuarios;
  }

  /**
   * Gets like evento id.
   *
   * @return the like evento id
   */
  public Integer getLikeEventoId() {
    return this.likeEventoId;
  }

  /**
   * Sets like evento id.
   *
   * @param likeEventoId the like evento id
   */
  public void setLikeEventoId(Integer likeEventoId) {
    this.likeEventoId = likeEventoId;
  }

  /**
   * Gets eventos.
   *
   * @return the eventos
   */
  public Eventos getEventos() {
    return this.eventos;
  }

  /**
   * Sets eventos.
   *
   * @param eventos the eventos
   */
  public void setEventos(Eventos eventos) {
    this.eventos = eventos;
  }

  /**
   * Gets usuarios.
   *
   * @return the usuarios
   */
  public Usuarios getUsuarios() {
    return this.usuarios;
  }

  /**
   * Sets usuarios.
   *
   * @param usuarios the usuarios
   */
  public void setUsuarios(Usuarios usuarios) {
    this.usuarios = usuarios;
  }
}

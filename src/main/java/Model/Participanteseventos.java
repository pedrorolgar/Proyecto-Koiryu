package Model;

/**
 *
 * @author Pedro Rollán
 */
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

/**
 * The type Participanteseventos.
 */
@Entity
@Table(name = "participanteseventos")
@Getter
@Setter
public class Participanteseventos implements java.io.Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "participanteEventoID")
  private Integer participanteEventoId;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "EventoID", referencedColumnName = "EventoID", nullable = false)
  private Eventos eventos;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "UsuarioID", referencedColumnName = "UserID", nullable = false)
  private Usuarios usuarios;

  /**
   * Instantiates a new Participanteseventos.
   */
  public Participanteseventos() {
  }

  /**
   * Instantiates a new Participanteseventos.
   *
   * @param eventos the eventos
   * @param usuarios the usuarios
   */
  public Participanteseventos(Eventos eventos, Usuarios usuarios) {
    this.eventos = eventos;
    this.usuarios = usuarios;
  }

  /**
   * Gets participante evento id.
   *
   * @return the participante evento id
   */
  public Integer getParticipanteEventoId() {
    return this.participanteEventoId;
  }

  /**
   * Sets participante evento id.
   *
   * @param participanteEventoId the participante evento id
   */
  public void setParticipanteEventoId(Integer participanteEventoId) {
    this.participanteEventoId = participanteEventoId;
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

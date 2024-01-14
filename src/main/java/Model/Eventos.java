package Model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The type Eventos.
 */
@Entity
@Table(name = "eventos")
@ToString
@Getter
@Setter
public class Eventos implements java.io.Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "EventoID")
  private Integer eventoId;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "CreadorID",referencedColumnName = "UserID", nullable = false)
  private Usuarios usuarios;

  @Column(name = "NombreEvento", nullable = false)
  private String nombreEvento;

  @Column(name = "TipoEvento", nullable = false)
  private String tipoEvento;

  @Column(name = "DescripcionEvento")
  private String descripcionEvento;

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "eventos")
  private Set<Participanteseventos> participanteseventoses = new HashSet<>(0);

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "eventos")
  private Set<Likeseventos> likeseventoses = new HashSet<>(0);

  /**
   * Instantiates a new Eventos.
   */
  public Eventos() {
  }

  /**
   * Instantiates a new Eventos.
   *
   * @param usuarios the usuarios
   * @param nombreEvento the nombre evento
   * @param tipoEvento the tipo evento
   * @param descripcionEvento the descripcion evento
   * @param participanteseventoses the participanteseventoses
   * @param likeseventoses the likeseventoses
   */
  public Eventos(Usuarios usuarios, String nombreEvento, String tipoEvento, String descripcionEvento,
    Set<Participanteseventos> participanteseventoses, Set<Likeseventos> likeseventoses) {
    this.usuarios = usuarios;
    this.nombreEvento = nombreEvento;
    this.tipoEvento = tipoEvento;
    this.descripcionEvento = descripcionEvento;
    this.participanteseventoses = participanteseventoses;
    this.likeseventoses = likeseventoses;
  }
}

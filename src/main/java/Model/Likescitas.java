package Model;

/**
 *
 * @author Pedro Rollán
 */
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

/**
 * The type Likescitas.
 */
@Entity
@Table(name = "likescitas")
@Getter
@Setter
public class Likescitas implements java.io.Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "LikeCitaID")
  private Integer likeCitaId;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "UsuarioID", referencedColumnName = "UserID", nullable = false)
  private Usuarios usuarios;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "CitaID", referencedColumnName = "CitaID", nullable = false)
  private Citas citas;

  /**
   * Instantiates a new Likescitas.
   */
  public Likescitas() {
  }

  /**
   * Instantiates a new Likescitas.
   *
   * @param usuarios the usuarios
   * @param citas the citas
   */
  public Likescitas(Usuarios usuarios, Citas citas) {
    this.usuarios = usuarios;
    this.citas = citas;
  }

  /**
   * Gets like cita id.
   *
   * @return the like cita id
   */
  public Integer getLikeCitaId() {
    return this.likeCitaId;
  }

  /**
   * Sets like cita id.
   *
   * @param likeCitaId the like cita id
   */
  public void setLikeCitaId(Integer likeCitaId) {
    this.likeCitaId = likeCitaId;
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

  /**
   * Gets citas.
   *
   * @return the citas
   */
  public Citas getCitas() {
    return this.citas;
  }

  /**
   * Sets citas.
   *
   * @param citas the citas
   */
  public void setCitas(Citas citas) {
    this.citas = citas;
  }
}

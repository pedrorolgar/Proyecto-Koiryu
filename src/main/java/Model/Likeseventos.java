package Model;
// Generated 12 ene 2024 22:06:41 by Hibernate Tools 6.3.1.Final

/**
 * Likeseventos generated by hbm2java
 */
public class Likeseventos implements java.io.Serializable {

	private Integer likeEventoId;
	private Eventos eventos;
	private Usuarios usuarios;

	public Likeseventos() {
	}

	public Likeseventos(Eventos eventos, Usuarios usuarios) {
		this.eventos = eventos;
		this.usuarios = usuarios;
	}

	public Integer getLikeEventoId() {
		return this.likeEventoId;
	}

	public void setLikeEventoId(Integer likeEventoId) {
		this.likeEventoId = likeEventoId;
	}

	public Eventos getEventos() {
		return this.eventos;
	}

	public void setEventos(Eventos eventos) {
		this.eventos = eventos;
	}

	public Usuarios getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(Usuarios usuarios) {
		this.usuarios = usuarios;
	}

}

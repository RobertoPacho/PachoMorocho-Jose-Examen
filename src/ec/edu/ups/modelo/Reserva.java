package ec.edu.ups.modelo;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.*;



/**
 * Entity implementation class for Entity: Reserva
 *
 */
@Entity

public class Reserva implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	/*
	 * e. Luego, debe ingresar el número de personas, la fecha y la hora de la
	 * reserva.
	 * 
	 */
	private Calendar fecha;
	private int maxPersonas;

	@ManyToOne
	@JoinColumn
	private Cliente cliente;

	@ManyToOne
	@JoinColumn
	private Restaurante restaurante;

	public Reserva() {
		super();
	}

	public Reserva(int id, Calendar fecha, int maxPersonas, Cliente cliente, Restaurante restaurante) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.maxPersonas = maxPersonas;
		this.cliente = cliente;
		this.restaurante = restaurante;
	}

	public Reserva(int id, Calendar fecha, int maxPersonas, Restaurante restaurante) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.maxPersonas = maxPersonas;
		this.restaurante = restaurante;
	}

	public Reserva(int id, Calendar fecha, int maxPersonas, Cliente cliente) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.maxPersonas = maxPersonas;
		this.cliente = cliente;
	}

	public Reserva(Calendar fecha, int maxPersonas, Cliente cliente, Restaurante restaurante) {
		super();
		this.fecha = fecha;
		this.maxPersonas = maxPersonas;
		this.cliente = cliente;
		this.restaurante = restaurante;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Calendar getFecha() {
		return fecha;
	}

	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}

	/**
	 * @return the maxPersonas
	 */
	public int getMaxPersonas() {
		return maxPersonas;
	}

	/**
	 * @param maxPersonas the maxPersonas to set
	 */
	public void setMaxPersonas(int maxPersonas) {
		this.maxPersonas = maxPersonas;
	}

	/**
	 * @return the cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	/**
	 * @return the restaurante
	 */
	public Restaurante getRestaurante() {
		return restaurante;
	}

	/**
	 * @param restaurante the restaurante to set
	 */
	public void setRestaurante(Restaurante restaurante) {
		this.restaurante = restaurante;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
		result = prime * result + id;
		result = prime * result + maxPersonas;
		result = prime * result + ((restaurante == null) ? 0 : restaurante.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reserva other = (Reserva) obj;
		if (cliente == null) {
			if (other.cliente != null)
				return false;
		} else if (!cliente.equals(other.cliente))
			return false;
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		} else if (!fecha.equals(other.fecha))
			return false;
		if (id != other.id)
			return false;
		if (maxPersonas != other.maxPersonas)
			return false;
		if (restaurante == null) {
			if (other.restaurante != null)
				return false;
		} else if (!restaurante.equals(other.restaurante))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Reserva [id=" + id + ", fecha=" + fecha + ", maxPersonas=" + maxPersonas + ", clienteReserva="
				+ cliente + ", restauranteReserva=" + restaurante + "]";
	}

}

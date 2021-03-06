/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package clases.ito.poo;
// Start of user code (user defined imports)

import java.time.LocalDate;

// End of user code

/**
 * Description of cuentaBancaria.
 * 
 * @author guadalupe
 */
public class cuentaBancaria {
	/**
	 * Description of the property numCuenta.
	 */
	private long numCuenta = 0L;

public cuentaBancaria(long numCuenta, String nomCliente, float saldo, LocalDate fechaApertura) {
	super();
	this.numCuenta = numCuenta;
	this.nomCliente = nomCliente;
	this.saldo = saldo;
	this.fechaApertura = fechaApertura;
}

	/**
	 * Description of the property nomCliente.
	 */
	private String nomCliente = "";

	/**
	 * Description of the property saldo.
	 */
	private float saldo = 0F;

	/**
	 * Description of the property fechaApertura.
	 */
	private java.time.LocalDate fechaApertura = null;

	/**
	 * Description of the property fechaActualizacicon.
	 */
	private java.time.LocalDate fechaActualizacicon = null;

	// Start of user code (user defined attributes for cuentaBancaria)

	// End of user code

	// Start of user code (user defined methods for cuentaBancaria)

	// End of user code
	/**
	 * Returns numCuenta.
	 * @return numCuenta 
	 */
	public long getNumCuenta() {
		return this.numCuenta;
	}

	/**
	 * Sets a value to attribute numCuenta. 
	 * @param newNumCuenta 
	 */
	public void setNumCuenta(long newNumCuenta) {
		this.numCuenta = newNumCuenta;
	}

	/**
	 * Returns nomCliente.
	 * @return nomCliente 
	 */
	public String getNomCliente() {
		return this.nomCliente;
	}

	/**
	 * Sets a value to attribute nomCliente. 
	 * @param newNomCliente 
	 */
	public void setNomCliente(String newNomCliente) {
		this.nomCliente = newNomCliente;
	}

	/**
	 * Returns sueldo.
	 * @return sueldo 
	 */
	public float getSaldo() {
		return this.saldo;
	}

	/**
	 * Sets a value to attribute sueldo. 
	 * @param newSueldo 
	 */
	public void setSueldo(float newSaldo) {
		this.saldo = newSaldo;
	}

	/**
	 * Returns fechaApertura.
	 * @return fechaApertura 
	 */
	public java.time.LocalDate getFechaApertura() {
		return this.fechaApertura;
	}

	/**
	 * Sets a value to attribute fechaApertura. 
	 * @param newFechaApertura 
	 */
	public void setFechaApertura(java.time.LocalDate newFechaApertura) {
		this.fechaApertura = newFechaApertura;
	}

	/**
	 * Returns fechaActualizacicon.
	 * @return fechaActualizacicon 
	 */
	public java.time.LocalDate getFechaActualizacicon() {
		return this.fechaActualizacicon;
	}

	/**
	 * Sets a value to attribute fechaActualizacicon. 
	 * @param newFechaActualizacicon 
	 */
	public void setFechaActualizacicon(java.time.LocalDate newFechaActualizacicon) {
		this.fechaActualizacicon = newFechaActualizacicon;
	}

	 public boolean retiro (float cantidad) {
			boolean retiro=false;
			if(this.saldo>=cantidad) {
			this.saldo-=cantidad;
			retiro=true;
			this.fechaActualizacicon=LocalDate.now();
			}
			 return retiro;
		 }
	 
	 
	 public boolean deposito (float cantidad) {
			boolean retiro=false;
			if(this.saldo>=cantidad) {
			this.saldo+=cantidad;
			retiro=true;
			this.fechaActualizacicon=LocalDate.now();
			}
			 return retiro;
		 }
	 
	 
	@Override
	public String toString() {
		return "cuentaBancaria [numCuenta=" + numCuenta + ", nomCliente=" + nomCliente + ", saldo=" + saldo
				+ ", fechaApertura=" + fechaApertura + ", fechaActualizacicon=" + fechaActualizacicon + "]";
	}

}

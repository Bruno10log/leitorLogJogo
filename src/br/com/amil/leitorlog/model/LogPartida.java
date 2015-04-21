package br.com.amil.leitorlog.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class LogPartida {
	
	@ManyToOne @JoinColumn(name="idPartida")
	private Partida partida;
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idLog;
	
	@Temporal(value = TemporalType.TIME)
	private Date hora;
	 
	private String userAssassino;
	
	private String userVitima;
	
	private String modeloArma;
	
	public LogPartida() {
	}
	
	public LogPartida(Partida partida, Date hora, String assassino, String vitima, String arma) {
		this.partida = partida;
		this.hora = hora;
		this.userAssassino = assassino;
		this.userVitima = vitima;
		this.modeloArma = arma;
	}
	
	public Date getHora() {
		return hora;
	}

	public void setHora(Date hora) {
		this.hora = hora;
	}

	public Partida getPartida() {
		return partida;
	}

	public void setPartida(Partida partida) {
		this.partida = partida;
	}

	public String getUserAssassino() {
		return userAssassino;
	}

	public void setUserAssassino(String userAssassino) {
		this.userAssassino = userAssassino;
	}

	public String getUserVitima() {
		return userVitima;
	}

	public void setUserVitima(String userVitima) {
		this.userVitima = userVitima;
	}

	public String getModeloArma() {
		return modeloArma;
	}

	public void setModeloArma(String modeloArma) {
		this.modeloArma = modeloArma;
	}
	
}

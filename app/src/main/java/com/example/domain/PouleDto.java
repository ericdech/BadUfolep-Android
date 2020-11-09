package com.example.domain;

import java.io.Serializable;

public class PouleDto implements Serializable {
	private Integer idPoule;
	private Integer idPlateau;
	private Integer idCategorie;

	public PouleDto(){
	}

	public PouleDto(Integer idPoule, Integer idPlateau, Integer idCategorie, Integer numero, byte[] feuilleMatch) {
		this.idPoule = idPoule;
		this.idPlateau = idPlateau;
		this.idCategorie = idCategorie;
		this.numero = numero;
		this.feuilleMatch = feuilleMatch;
	}

	public Integer getIdPoule() {
		return idPoule;
	}

	public void setIdPoule(Integer idPoule) {
		this.idPoule = idPoule;
	}

	public Integer getIdPlateau() {
		return idPlateau;
	}

	public void setIdPlateau(Integer idPlateau) {
		this.idPlateau = idPlateau;
	}

	public Integer getIdCategorie() {
		return idCategorie;
	}

	public void setIdCategorie(Integer idCategorie) {
		this.idCategorie = idCategorie;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public byte[] getFeuilleMatch() {
		return feuilleMatch;
	}

	public void setFeuilleMatch(byte[] feuilleMatch) {
		this.feuilleMatch = feuilleMatch;
	}

	private Integer numero;
	private byte[] feuilleMatch;
}
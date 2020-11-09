package com.example.domain;

import java.io.Serializable;

public class ClubDto implements Serializable {
	private Integer idClub;
	private String ucClub;
	private String llClub;
	private String refFederation;
	private String nomSalle;
	private String adresse1Salle;
	private String adresse2Salle;
	private String villeSalle;
	private String email;
	private Boolean invitationJoueurAutomatique;

	public ClubDto(){
	}

	public ClubDto(Integer idClub, String ucClub, String llClub, String refFederation, String nomSalle, String adresse1Salle, String adresse2Salle, String villeSalle, String email, Boolean invitationJoueurAutomatique) {
		this.idClub = idClub;
		this.ucClub = ucClub;
		this.llClub = llClub;
		this.refFederation = refFederation;
		this.nomSalle = nomSalle;
		this.adresse1Salle = adresse1Salle;
		this.adresse2Salle = adresse2Salle;
		this.villeSalle = villeSalle;
		this.email = email;
		this.invitationJoueurAutomatique = invitationJoueurAutomatique;
	}

	public Integer getIdClub() {
		return idClub;
	}

	public void setIdClub(Integer idClub) {
		this.idClub = idClub;
	}

	public String getUcClub() {
		return ucClub;
	}

	public void setUcClub(String ucClub) {
		this.ucClub = ucClub;
	}

	public String getLlClub() {
		return llClub;
	}

	public void setLlClub(String llClub) {
		this.llClub = llClub;
	}

	public String getRefFederation() {
		return refFederation;
	}

	public void setRefFederation(String refFederation) {
		this.refFederation = refFederation;
	}

	public String getNomSalle() {
		return nomSalle;
	}

	public void setNomSalle(String nomSalle) {
		this.nomSalle = nomSalle;
	}

	public String getAdresse1Salle() {
		return adresse1Salle;
	}

	public void setAdresse1Salle(String adresse1Salle) {
		this.adresse1Salle = adresse1Salle;
	}

	public String getAdresse2Salle() {
		return adresse2Salle;
	}

	public void setAdresse2Salle(String adresse2Salle) {
		this.adresse2Salle = adresse2Salle;
	}

	public String getVilleSalle() {
		return villeSalle;
	}

	public void setVilleSalle(String villeSalle) {
		this.villeSalle = villeSalle;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getInvitationJoueurAutomatique() {
		return invitationJoueurAutomatique;
	}

	public void setInvitationJoueurAutomatique(Boolean invitationJoueurAutomatique) {
		this.invitationJoueurAutomatique = invitationJoueurAutomatique;
	}
}
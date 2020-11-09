package com.example.domain;

import android.icu.util.LocaleData;

import java.io.Serializable;
import java.util.Date;

public class AdherentDto implements Serializable {
	private Integer idAdherent;
	private String pseudo;
	private String password;
	private String nom;
	private String prenom;
	private Date dateNaissance;
	private String sexe;
	private String licence;
	private String tel;
	private String email;
	private boolean administrateur;
	private boolean responsableChampionnat;
	private boolean responsableClub;
	private Integer idClub;

	public  AdherentDto(){
	}

	public AdherentDto(Integer idAdherent, String pseudo, String password, String nom, String prenom, Date dateNaissance, String sexe, String licence, String tel, String email, boolean administrateur, boolean responsableChampionnat, boolean responsableClub, Integer idClub) {
		this.idAdherent = idAdherent;
		this.pseudo = pseudo;
		this.password = password;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.sexe = sexe;
		this.licence = licence;
		this.tel = tel;
		this.email = email;
		this.administrateur = administrateur;
		this.responsableChampionnat = responsableChampionnat;
		this.responsableClub = responsableClub;
		this.idClub = idClub;
	}

	public Integer getIdAdherent() {
		return idAdherent;
	}

	public void setIdAdherent(Integer idAdherent) {
		this.idAdherent = idAdherent;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public String getLicence() {
		return licence;
	}

	public void setLicence(String licence) {
		this.licence = licence;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isAdministrateur() {
		return administrateur;
	}

	public void setAdministrateur(boolean administrateur) {
		this.administrateur = administrateur;
	}

	public boolean isResponsableChampionnat() {
		return responsableChampionnat;
	}

	public void setResponsableChampionnat(boolean responsableChampionnat) {
		this.responsableChampionnat = responsableChampionnat;
	}

	public boolean isResponsableClub() {
		return responsableClub;
	}

	public void setResponsableClub(boolean responsableClub) {
		this.responsableClub = responsableClub;
	}

	public Integer getIdClub() {
		return idClub;
	}

	public void setIdClub(Integer idClub) {
		this.idClub = idClub;
	}
}
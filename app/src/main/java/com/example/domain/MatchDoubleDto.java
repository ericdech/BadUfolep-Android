package com.example.domain;

import java.io.Serializable;

public class MatchDoubleDto implements Serializable{
	private Integer idMatchDouble;
	private Integer idPlateauJoueur1Paire1;
	private Integer idPlateauJoueur1Paire2;
	private Integer idPlateauJoueur2Paire1;
	private Integer idPlateauJoueur2Paire2;
	private Integer idPoule;
	private Integer scorePaire1;
	private Integer scorePaire2;
	private Integer bonusPaire1;

	public MatchDoubleDto(){
	}

	public MatchDoubleDto(Integer idMatchDouble, Integer idPlateauJoueur1Paire1, Integer idPlateauJoueur1Paire2, Integer idPlateauJoueur2Paire1, Integer idPlateauJoueur2Paire2, Integer idPoule, Integer scorePaire1, Integer scorePaire2, Integer bonusPaire1, Integer bonusPaire2, String annotation) {
		this.idMatchDouble = idMatchDouble;
		this.idPlateauJoueur1Paire1 = idPlateauJoueur1Paire1;
		this.idPlateauJoueur1Paire2 = idPlateauJoueur1Paire2;
		this.idPlateauJoueur2Paire1 = idPlateauJoueur2Paire1;
		this.idPlateauJoueur2Paire2 = idPlateauJoueur2Paire2;
		this.idPoule = idPoule;
		this.scorePaire1 = scorePaire1;
		this.scorePaire2 = scorePaire2;
		this.bonusPaire1 = bonusPaire1;
		this.bonusPaire2 = bonusPaire2;
		this.annotation = annotation;
	}

	public Integer getIdMatchDouble() {
		return idMatchDouble;
	}

	public void setIdMatchDouble(Integer idMatchDouble) {
		this.idMatchDouble = idMatchDouble;
	}

	public Integer getIdPlateauJoueur1Paire1() {
		return idPlateauJoueur1Paire1;
	}

	public void setIdPlateauJoueur1Paire1(Integer idPlateauJoueur1Paire1) {
		this.idPlateauJoueur1Paire1 = idPlateauJoueur1Paire1;
	}

	public Integer getIdPlateauJoueur1Paire2() {
		return idPlateauJoueur1Paire2;
	}

	public void setIdPlateauJoueur1Paire2(Integer idPlateauJoueur1Paire2) {
		this.idPlateauJoueur1Paire2 = idPlateauJoueur1Paire2;
	}

	public Integer getIdPlateauJoueur2Paire1() {
		return idPlateauJoueur2Paire1;
	}

	public void setIdPlateauJoueur2Paire1(Integer idPlateauJoueur2Paire1) {
		this.idPlateauJoueur2Paire1 = idPlateauJoueur2Paire1;
	}

	public Integer getIdPlateauJoueur2Paire2() {
		return idPlateauJoueur2Paire2;
	}

	public void setIdPlateauJoueur2Paire2(Integer idPlateauJoueur2Paire2) {
		this.idPlateauJoueur2Paire2 = idPlateauJoueur2Paire2;
	}

	public Integer getIdPoule() {
		return idPoule;
	}

	public void setIdPoule(Integer idPoule) {
		this.idPoule = idPoule;
	}

	public Integer getScorePaire1() {
		return scorePaire1;
	}

	public void setScorePaire1(Integer scorePaire1) {
		this.scorePaire1 = scorePaire1;
	}

	public Integer getScorePaire2() {
		return scorePaire2;
	}

	public void setScorePaire2(Integer scorePaire2) {
		this.scorePaire2 = scorePaire2;
	}

	public Integer getBonusPaire1() {
		return bonusPaire1;
	}

	public void setBonusPaire1(Integer bonusPaire1) {
		this.bonusPaire1 = bonusPaire1;
	}

	public Integer getBonusPaire2() {
		return bonusPaire2;
	}

	public void setBonusPaire2(Integer bonusPaire2) {
		this.bonusPaire2 = bonusPaire2;
	}

	public String getAnnotation() {
		return annotation;
	}

	public void setAnnotation(String annotation) {
		this.annotation = annotation;
	}

	private Integer bonusPaire2;
	private String annotation;
}
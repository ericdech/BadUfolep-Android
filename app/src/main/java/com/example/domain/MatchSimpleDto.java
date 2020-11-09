package com.example.domain;


import java.io.Serializable;

public class MatchSimpleDto implements Serializable {
	private Integer idMatchSimple;
	private Integer idPlateauJoueur1;
	private Integer idPlateauJoueur2;

	public MatchSimpleDto(){
	}

	public MatchSimpleDto(Integer idMatchSimple, Integer idPlateauJoueur1, Integer idPlateauJoueur2, Integer idPoule, Integer scoreJoueur1, Integer scoreJoueur2, Integer bonusJoueur1, Integer bonusJoueur2, String annotation) {
		this.idMatchSimple = idMatchSimple;
		this.idPlateauJoueur1 = idPlateauJoueur1;
		this.idPlateauJoueur2 = idPlateauJoueur2;
		this.idPoule = idPoule;
		this.scoreJoueur1 = scoreJoueur1;
		this.scoreJoueur2 = scoreJoueur2;
		this.bonusJoueur1 = bonusJoueur1;
		this.bonusJoueur2 = bonusJoueur2;
		this.annotation = annotation;
	}

	public Integer getIdMatchSimple() {
		return idMatchSimple;
	}

	public void setIdMatchSimple(Integer idMatchSimple) {
		this.idMatchSimple = idMatchSimple;
	}

	public Integer getIdPlateauJoueur1() {
		return idPlateauJoueur1;
	}

	public void setIdPlateauJoueur1(Integer idPlateauJoueur1) {
		this.idPlateauJoueur1 = idPlateauJoueur1;
	}

	public Integer getIdPlateauJoueur2() {
		return idPlateauJoueur2;
	}

	public void setIdPlateauJoueur2(Integer idPlateauJoueur2) {
		this.idPlateauJoueur2 = idPlateauJoueur2;
	}

	public Integer getIdPoule() {
		return idPoule;
	}

	public void setIdPoule(Integer idPoule) {
		this.idPoule = idPoule;
	}

	public Integer getScoreJoueur1() {
		return scoreJoueur1;
	}

	public void setScoreJoueur1(Integer scoreJoueur1) {
		this.scoreJoueur1 = scoreJoueur1;
	}

	public Integer getScoreJoueur2() {
		return scoreJoueur2;
	}

	public void setScoreJoueur2(Integer scoreJoueur2) {
		this.scoreJoueur2 = scoreJoueur2;
	}

	public Integer getBonusJoueur1() {
		return bonusJoueur1;
	}

	public void setBonusJoueur1(Integer bonusJoueur1) {
		this.bonusJoueur1 = bonusJoueur1;
	}

	public Integer getBonusJoueur2() {
		return bonusJoueur2;
	}

	public void setBonusJoueur2(Integer bonusJoueur2) {
		this.bonusJoueur2 = bonusJoueur2;
	}

	public String getAnnotation() {
		return annotation;
	}

	public void setAnnotation(String annotation) {
		this.annotation = annotation;
	}

	private Integer idPoule;
	private Integer scoreJoueur1;
	private Integer scoreJoueur2;
	private Integer bonusJoueur1;
	private Integer bonusJoueur2;
	private String annotation;
}
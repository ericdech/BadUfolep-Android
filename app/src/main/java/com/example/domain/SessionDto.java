package com.example.domain;

import java.io.Serializable;

public class SessionDto implements Serializable {
	private AdherentDto adherent;

	public SessionDto(){

	}

	public SessionDto(AdherentDto adherent, ClubDto club) {
		this.adherent = adherent;
		this.club = club;
	}

	public AdherentDto getAdherent() {
		return adherent;
	}

	public void setAdherent(AdherentDto adherent) {
		this.adherent = adherent;
	}

	public ClubDto getClub() {
		return club;
	}

	public void setClub(ClubDto club) {
		this.club = club;
	}

	private ClubDto club;
}
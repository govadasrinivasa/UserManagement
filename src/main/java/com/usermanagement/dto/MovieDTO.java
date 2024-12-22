/**
 * 
 */
package com.usermanagement.dto;

import java.time.LocalDate;

import com.usermanagement.enums.CertificateType;
import com.usermanagement.enums.MovieLanguage;

public class MovieDTO {

	private long id;
	private String name;
	private MovieLanguage language;
	private CertificateType certificateType;
	private LocalDate releaseDate;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public MovieLanguage getLanguage() {
		return language;
	}
	public void setLanguage(MovieLanguage language) {
		this.language = language;
	}
	public CertificateType getCertificateType() {
		return certificateType;
	}
	public void setCertificateType(CertificateType certificateType) {
		this.certificateType = certificateType;
	}
	public LocalDate getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}

}
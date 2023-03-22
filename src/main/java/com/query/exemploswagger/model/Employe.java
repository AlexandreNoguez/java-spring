package com.query.exemploswagger.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "BUSINESS_EMPLOYMENT")
public class Employe {
	
	@Id
	@Column(name = "id_employe")
	private Integer idEmploye;
	
	@Column(name = "series_reference")
	private String seriesReference;
	
	@Column(name = "period")
	private Date period;
	
	@Column(name = "data_value")
	private Double dataValue;
	
	@Column(name = "supressed")
	private char supressed;
	
	@Column(name = "status")
	private char status;
	
	@Column(name = "units")
	private String units;
	
	@Column(name = "magnitude")
	private Integer magnitude;
	
	@Column(name = "subject")
	private String subject;
	
	@Column(name = "group")
	private String group;
	
	@Column(name = "series_title1")
	private String seriesTitle1;
	
	@Column(name = "series_title2")
	private String seriesTitle2;
	
	@Column(name = "series_title3")
	private String seriesTitle3;
	
	@Column(name = "series_title4")
	private String seriesTitle4;
	
	@Column(name = "series_title5")
	private String seriesTitle5;
	
	
}

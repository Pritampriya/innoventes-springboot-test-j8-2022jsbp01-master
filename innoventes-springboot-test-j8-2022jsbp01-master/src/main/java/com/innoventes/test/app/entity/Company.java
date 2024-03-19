package com.innoventes.test.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EntityListeners(AuditingEntityListener.class)
@Table(name = "company")
@Entity
public class Company extends BaseEntity {

	@Id
	@SequenceGenerator(sequenceName = "company_seq", allocationSize = 1, name = "company_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "company_seq")
	private Long id;

	@Column(name = "company_name")
	private String companyName;

	@Column(name = "email")
	private String email;
	
	@Column(name = "strength")
	private Integer strength;
	
	@Column(name = "website_url")
	private String webSiteURL;
	
	@Column(name = "companyCode")
	private String companyCode;

	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getCompanyName() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getEmail() {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer getStrength() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getWebSiteURL() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setCompanyName(String companyName2) {
		// TODO Auto-generated method stub
		
	}

	public void setId(Long id2) {
		// TODO Auto-generated method stub
		
	}

	public void setEmail(String email2) {
		// TODO Auto-generated method stub
		
	}

	public void setStrength(Integer strength2) {
		// TODO Auto-generated method stub
		
	}

	public void setWebSiteURL(String webSiteURL2) {
		// TODO Auto-generated method stub
		
	}
}

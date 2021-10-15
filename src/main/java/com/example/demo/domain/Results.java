package com.example.demo.domain;

import java.io.Serializable;
import java.util.Objects;

public class Results implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private String section;
	
	private String subsection;
	
	private String title;
	
	public Results() {
		// TODO Auto-generated constructor stub
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getSubsection() {
		return subsection;
	}

	public void setSubsection(String subsection) {
		this.subsection = subsection;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public int hashCode() {
		return Objects.hash(section, subsection, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Results other = (Results) obj;
		return Objects.equals(section, other.section) && Objects.equals(subsection, other.subsection)
				&& Objects.equals(title, other.title);
	}
	
}

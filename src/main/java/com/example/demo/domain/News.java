package com.example.demo.domain;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

public class News implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String title;
	
	private String section;
	
	private Results[] results;
	
	
	public News() {
		// TODO Auto-generated constructor stub
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}
	
	public Results[] getResults() {
		return results;
	}

	public void setResults(Results[] results) {
		this.results = results;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(results);
		result = prime * result + Objects.hash(section, title);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		News other = (News) obj;
		return Arrays.equals(results, other.results) && Objects.equals(section, other.section)
				&& Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		return "News [title=" + title + ", section=" + section + ", results=" + Arrays.toString(results) + "]";
	}
		
}

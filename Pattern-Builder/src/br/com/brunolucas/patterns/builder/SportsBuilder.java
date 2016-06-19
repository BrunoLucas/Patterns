package br.com.brunolucas.patterns.builder;

public abstract class SportsBuilder {

	protected Sport sport;

	public Sport getSport() {
		return sport;
	}

	public void createSport() {
		sport = new Sport();
	}

	public abstract void buildName();
	
	public abstract void buildDescription();
	

}
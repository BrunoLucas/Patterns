package br.com.brunolucas.patterns.builder;

public class EventSports {

	protected SportsBuilder sportsBuilder;
	
	public void setSportsBuilder(SportsBuilder sportsBuilder) {
		this.sportsBuilder = sportsBuilder;
	}

	public Sport getSport() {
		return sportsBuilder.getSport();
	}

	public void constructSport() {
		
		sportsBuilder.createSport();
		sportsBuilder.buildName();
		sportsBuilder.buildDescription();
	}
}

package br.com.brunolucas.patterns.builder;



public class BuilderMain {


    public static void main(String[] args) {
		EventSports eventSports = new EventSports();
		SportsBuilder soccerSportBuilder = new Soccer();
		SportsBuilder kungFuBuilder = new KungFu();
		
		eventSports.setSportsBuilder(soccerSportBuilder);
		eventSports.constructSport();
		Sport soccerFan = eventSports.getSport();

		eventSports.setSportsBuilder(kungFuBuilder);
		eventSports.constructSport();
		Sport kungFuFan = eventSports.getSport();
		
	}
}

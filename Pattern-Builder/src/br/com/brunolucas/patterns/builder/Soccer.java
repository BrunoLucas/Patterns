package br.com.brunolucas.patterns.builder;

public class Soccer extends SportsBuilder{

	@Override
	public void buildName() {
			sport.setName("Soccer");
	}

	@Override
	public void buildDescription() {
			sport.setDescription("This is a sport");
	}

}

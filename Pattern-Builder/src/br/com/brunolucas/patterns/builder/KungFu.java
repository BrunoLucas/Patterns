package br.com.brunolucas.patterns.builder;

public class KungFu extends SportsBuilder{

	@Override
	public void buildName() {
			sport.setName("Kung Fu");
	}

	@Override
	public void buildDescription() {
			sport.setDescription("This is a sport");
	}

}

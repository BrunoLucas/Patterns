/**
 * 
 */
package br.com.brunolucas.patterns.command;

/**
 * @author bruno.melo
 *
 */
public class BotaoALuta implements Command {


	private JogoLuta jogoLuta;
	
	
	public BotaoALuta(JogoLuta jogoLuta) {
		this.jogoLuta = jogoLuta;
	}
	
	@Override
	public void executa() {
		jogoLuta.socoForte();
	}

}

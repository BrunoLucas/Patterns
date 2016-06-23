/**
 * 
 */
package br.com.brunolucas.patterns.command;

/**
 * @author bruno.melo
 *
 */
public class BotaoBLuta implements Command {


	private JogoLuta jogoLuta;
	
	
	public BotaoBLuta(JogoLuta jogoLuta) {
		this.jogoLuta = jogoLuta;
	}
	
	@Override
	public void executa() {
		jogoLuta.chuteAlto();
	}

}

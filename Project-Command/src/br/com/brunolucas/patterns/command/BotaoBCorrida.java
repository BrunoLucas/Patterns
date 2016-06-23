/**
 * 
 */
package br.com.brunolucas.patterns.command;

/**
 * @author bruno.melo
 *
 */
public class BotaoBCorrida implements Command {


	private JogoCorrida jogoCorrida;
	
	
	public BotaoBCorrida(JogoCorrida jogoCorrida) {
		this.jogoCorrida = jogoCorrida;
	}
	
	@Override
	public void executa() {
		jogoCorrida.freia();
	}

}

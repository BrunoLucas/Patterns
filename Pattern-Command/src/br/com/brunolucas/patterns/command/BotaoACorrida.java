/**
 * 
 */
package br.com.brunolucas.patterns.command;

/**
 * @author bruno.melo
 *
 */
public class BotaoACorrida implements Command {


	private JogoCorrida jogoCorrida;
	
	
	public BotaoACorrida(JogoCorrida jogoCorrida) {
		this.jogoCorrida = jogoCorrida;
	}
	
	@Override
	public void executa() {
	
	}

}

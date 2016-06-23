/**
 * 
 */
package br.com.brunolucas.patterns.command;

/**
 * @author bruno.melo
 *
 */
public class BotaoAFutebol implements Command {


	private JogoFutebol jogoFutebol;
	
	
	public BotaoAFutebol(JogoFutebol jogoFutebol) {
		this.jogoFutebol = jogoFutebol;
	}
	
	@Override
	public void executa() {
		jogoFutebol.chuteForte();
	}

}

/**
 * 
 */
package br.com.brunolucas.patterns.command;

/**
 * @author bruno.melo
 *
 */
public class BotaoBFutebol implements Command {


	private JogoFutebol jogoFutebol;
	
	
	public BotaoBFutebol(JogoFutebol jogoFutebol) {
		this.jogoFutebol = jogoFutebol;
	}
	
	@Override
	public void executa() {
		jogoFutebol.corre();
	}

}

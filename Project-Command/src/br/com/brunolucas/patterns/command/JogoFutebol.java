/**
 * 
 */
package br.com.brunolucas.patterns.command;

/**
 * @author bruno.melo
 *
 */
public class JogoFutebol {

	private String mensagem;
	
	
	public JogoFutebol() {
	}
	
	
	public JogoFutebol(String mensagem){
		this.mensagem = mensagem;
	}
	
	public void chuteForte(){
		System.out.println("Chutou!");
	}
	
	public void corre(){
		System.out.println("Correndo!");
	}

	/**
	 * Retorna mensagem
	 *
	 * @return mensagem - mensagem
	 */
	public String getMensagem() {
	return mensagem;
	}

	/**
	 * Especifica mensagem
	 *
	 * @param mensagem - mensagem
	 */
	public void setMensagem(String mensagem) {
	this.mensagem = mensagem;
	}
	
	
}

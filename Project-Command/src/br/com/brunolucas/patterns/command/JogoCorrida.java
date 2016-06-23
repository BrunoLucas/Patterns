/**
 * 
 */
package br.com.brunolucas.patterns.command;

/**
 * @author bruno.melo
 *
 */
public class JogoCorrida {

	private String mensagem;
	
	
	public JogoCorrida() {
	}
	
	
	public JogoCorrida(String mensagem){
		this.mensagem = mensagem;
	}
	
	public void acelera(){
		System.out.println("Pisa fundo!");
	}
	
	public void freia(){
		System.out.println("Diminuindo!");
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

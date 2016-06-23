/**
 * 
 */
package br.com.brunolucas.patterns.command;

/**
 * @author bruno.melo
 *
 */
public class JogoLuta {

	private String mensagem;
	
	
	public JogoLuta() {
	}
	
	
	public JogoLuta(String mensagem){
		this.mensagem = mensagem;
	}
	
	public void chuteAlto(){
		System.out.println("Chute alto!");
	}
	
	public void socoForte(){
		System.out.println("Soco forte!");
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

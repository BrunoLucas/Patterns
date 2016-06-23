/**
 * 
 */
package br.com.brunolucas.patterns.command;

/**
 * @author bruno.melo
 *
 */
//Invoker
public class Joystick {

	private Command[] aCommand;
	private Command[] bCommand;
	public Joystick() {
	}
	
	public void setCommand(int slot, Command aCommand, Command bCommand){
		this.aCommand[slot] = aCommand;
		this.bCommand[slot] = bCommand;
	}
	
	public void apertaBotaoA(int slot){
		this.aCommand[slot].executa();
	}
	
	public void apertaBotaoB(int slot){
		this.bCommand[slot].executa();
	}
	
}

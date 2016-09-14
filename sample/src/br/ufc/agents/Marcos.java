package br.ufc.agents;

import br.ufc.behaviours.ReceberMensagens;
import jade.core.Agent;

public class Marcos extends Agent {

	private static final long serialVersionUID = -375695358844648965L;

	@Override
	protected void setup() {
		
		ReceberMensagens receber = new ReceberMensagens(this);
		
		addBehaviour(receber);
		
	}
}

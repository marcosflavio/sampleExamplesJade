package br.ufc.agents;

import jade.core.AID;
import jade.core.Agent;
import jade.lang.acl.ACLMessage;

public class Eduardo extends Agent {

	private static final long serialVersionUID = 1L;
	

	@Override
	protected void setup() {
		
		ACLMessage msg = new ACLMessage(ACLMessage.INFORM);
		msg.setContent("Olá meu grande amigo!");
		msg.setLanguage("Portuguese");
		msg.setSender(this.getAID());

		msg.addReceiver(new AID("Marcos", AID.ISLOCALNAME));

		this.send(msg);
		
	}
}

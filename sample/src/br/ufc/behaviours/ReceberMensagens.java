package br.ufc.behaviours;

import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;

public class ReceberMensagens extends CyclicBehaviour{
	
	private static final long serialVersionUID = 1L;
	
	
	public ReceberMensagens(Agent agent) {
		
		super(agent);
	}
	@Override
	public void action() {
	
		ACLMessage msg = myAgent.receive();
		
		if(msg != null){
			
			System.out.println("O agente " + msg.getSender().getLocalName() + " me enviou: " + msg.getContent());
	
		}else{
			block();
		}

		
	}

}

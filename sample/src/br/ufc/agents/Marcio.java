package br.ufc.agents;

import br.ufc.behaviours.HumorBehaviour;
import jade.core.Agent;

public class Marcio extends Agent {

	private static final long serialVersionUID = 1L;

	@Override
	protected void setup() {
		HumorBehaviour humor = new HumorBehaviour(this);
		
		addBehaviour(humor);
		
	}

}

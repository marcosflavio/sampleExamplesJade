package br.ufc.agents;

import jade.core.Agent;

public class SimpleAgent extends Agent {

	private static final long serialVersionUID = 1L;

	@Override
	protected void setup() {

		System.out.println("Hello world!, my name is " + this.getLocalName());
	}

}

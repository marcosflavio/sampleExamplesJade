package br.ufc.behaviours;

import java.util.Random;

import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;

public class HumorBehaviour extends OneShotBehaviour{

	private static final long serialVersionUID = 1L;

	public HumorBehaviour(Agent agent) {
		super(agent);
	}
	
	
	@Override
	public void action() {
		int auxiliar = mudancaHumor();
		
		if(auxiliar == 1){
			System.out.println("Eu ("+myAgent.getLocalName() + ") estou de muito mau humor!");
			
		}else if(auxiliar == 2){
			System.out.println("Eu ("+myAgent.getLocalName() + ") estou de muito feliz!");
		}else{
			System.out.println("Eu ("+myAgent.getLocalName() + ") estou pensativo..");
		}
		
	}
	
	private int mudancaHumor(){
		int value;
		Random r = new Random();
		value = r.nextInt(3);
		
		return value;
	}
	
}

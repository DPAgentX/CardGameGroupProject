/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardapp;

import java.util.ArrayList;



public class Player {
	
	private String playerName;
	//private Card[] cards = new Card[5];
	private ArrayList<Card> cards = new ArrayList<>();
        public Player(){}
	public Player(String playerName) {
		this.playerName = playerName;
	}
	
	public String getPlayerName() {
		return this.playerName;
	}
	
	public ArrayList<Card> getCards() {
		return cards;
	}
	
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
        
	public void setCards(ArrayList<Card> cards){
		this.cards = cards;
	}
	public void printCards() {
		for(int i=0; i<cards.size();i++) {
			//System.out.println("Card "+(i+1)+": "+cards[i].getValue()+ "     "+cards[i].getSuit());
                    System.out.println("Card "+(i+1)+": "+cards.get(i).getValue()+ "     "+cards.get(i).getSuit());    
                }
        }
        public void changeCard(Card card, int index){
            //cards[index] = card;
            cards.set(index, card);
        }
        public String toString(){
            
            return "Congratulatins "+ playerName+ " won the game with";
        }
}


public class War {

	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.shuffle();
		Pile p1 = new Pile();
		p1.addDeck(deck.subdeck(0, 5));
		
		p1.pilePrint();
		
		System.out.println("********************");
		
		Pile p2 = new Pile();	
		p2.addDeck(deck.subdeck(26, 31));

			p2.pilePrint();
			
			Pile mid = new Pile();
			
		while (!p1.isEmpty() && !p2.isEmpty()) {
			Card c1 = p1.pop();
			Card c2 = p2.pop();
			
			mid.add(c1);
			mid.add(c2);
			
			int diff = c1.getRank() - c2.getRank();
			if (diff > 0) {
				p1.addPile(mid);
				mid = new Pile();
				
				p1.add(c1);
				p2.add(c2);
				
			} else if (diff < 0) {
				p2.add(c1);
				p2.add(c2);
			}
			else {
				for(int i = 0; i < 3; i++) {
					if(!p1.isEmpty())mid.add(p1.pop());
					if(!p2.isEmpty())mid.add(p2.pop());
				}
			}
			if(!p1.isEmpty())p1.shufflePile();
			if(!p2.isEmpty())p2.shufflePile();
		}
		if(p2.isEmpty())System.out.println("Player 1 wins!");
		else System.out.println("player 2 wins!");
	}
	
}

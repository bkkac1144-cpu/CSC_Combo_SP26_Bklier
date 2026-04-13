import java.util.Arrays;
import java.util.Random;

public class Deck {
	Card[] cards;

	public Deck(int n) {
		this.cards = new Card[n];

	}

	public Deck() {
		this.cards = new Card[52];
		int index = 0;
		for (int suit = 0; suit < 4; suit++) {
			for (int rank = 1; rank <= 13; rank++) {
				cards[index] = new Card(rank, suit);
				index++;
			}

		}

	}
	public Deck subdeck(int low, int high) {
		Deck sub = new Deck(high - low + 1);
		for (int i = 0; i < sub.cards.length; i++) {
			sub.cards[i] = this.cards[low + i];
		}
		return sub;
	}
	private void swap(int i, int j) {
		Card temp = this.cards[i];
		this.cards[i] = this.cards[j];
		this.cards[j] = temp;
	}

	public void selectionSort() {
		for (int i = 0; i < this.cards.length; i++) {
			int j = indexLowest(i, this.cards.length - 1);
			swap(i, j);
		}
	}

	private int indexLowest(int low, int high) {
		int lowIndex = low;
		for (int i = low + 1; i <= high; i++) {
			if (this.cards[i].compareTo(this.cards[lowIndex]) < 0) {
				lowIndex = i;
			}
		}
		return lowIndex;
	}

	public void shuffle() {
		for (int i = 0; i < this.cards.length; i++) {
			int j = randomInt(i, cards.length - 1);
			swap(i, j);
			// for each index i
			// choose arandom number between i and length -1
			// swap the ith card and the random card
		}
	}

	private static int randomInt(int low, int high) {
		Random random = new Random();
		return low + random.nextInt(high - low + 1);
	}

	public Card[] getcards() {
		return this.cards;
	}

	public int search(Card[] cards, Card target) {
		int count = 0;
		for (int i = 0; i < cards.length; i++) {
			count++;
			if (cards[i].equals(target))
				;
		}
		return -1;

	}

	private int binSearch(Deck cards, Card target) {

		int low = 0;
		int high = this.cards.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			int comp = this.cards[mid].compareTo(target);
			if (comp == 0) {

				return mid;
			} else if (comp > 0)
				low = mid + 1;
			else
				high = mid - 1;
		}
		return 0;
	}

	public void printDeck() {
		for (Card card : cards) {
			System.out.println(card);
		}
	}

	public Card[] getCards() {
		return cards;
	}

	public void setCards(Card[] cards) {
		this.cards = cards;
	}

	@Override
	public String toString() {
		return Arrays.toString(this.cards);
	}

}

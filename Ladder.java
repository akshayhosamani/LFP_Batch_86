public class Ladder {
	public static void main(String[] args) {
		int min = 1;  
		int max = 6; 
		int target=1;
		long diceRoll=0;
		while(target!=100) {
		int dice_num = (int)(Math.random()*(max-min+1)+min);
		target=dice_num+target;
		diceRoll++;
		}
		System.out.println("Dice rolled "+diceRoll+" times");
		System.out.println("Target achieved at "+target);
	}
}
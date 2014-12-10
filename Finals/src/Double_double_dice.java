
public class Double_double_dice extends Dice {

	int x; 
 
	public Double_double_dice() { 
 
	} 

	@Override 

	public int GetValue() { 
		x = 1 + (int) (Math.random() * 12); 
		return x; 
	} 

 
} 

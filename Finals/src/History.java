
import java.util.*;

public class History 
{
	private int[] ComputerArray = new int[3];
	private int[] UserArray = new int[3];
	private String[] stringarray = new String[3];
	static int i= 0;
	public void StoreValue(int Compvalue, int Uservalue, int Num)
	{
	ComputerArray[i]= Compvalue;
	UserArray[i] = Uservalue;
	 stringarray[i]= "Game number" + Num;
	 i++;
	}
	public String toString()
	{
		return "\nYour History:" + "\nDice Rolls:" +Arrays.toString(ComputerArray)+ "\nYour Rolls:" + Arrays.toString(UserArray);
	}
}

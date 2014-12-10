
import java.util.*;

public class RandomNumber
{
	private static int num;
	
public RandomNumber(int low, int high)
{
	num = low + (int)(Math.random() *(high - low));
}
public static int getValue()
{
	return num;
}
}
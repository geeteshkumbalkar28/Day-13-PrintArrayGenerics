
public class PrintArray
{
	public static void main(String arg[])
	{
		
		Integer intArray[]={1,2,3,4,5,6};
		Double doubleArray[] = {1.1,2.1,3.1,4.1,5.1,6.1};
		Character charArray[] = {'A','B','C','D','E','F'}; 
		PrintArray.toPrint(intArray);
		PrintArray.toPrint(doubleArray);
		PrintArray.toPrint(charArray);
	}
	public static void toPrint(Integer inputArray[])
	{
		for(int element : inputArray)
		{
			System.out.print(element);
		}
		System.out.println();
	}
	public static void toPrint(Double inputArray[])
	{
		for(double element : inputArray)
		{
			System.out.print(element);
		}
		System.out.println();
	}
	public static void toPrint(Character inputArray[])
	{
		for(char element : inputArray)
		{
			System.out.print(element);
		}
		System.out.println();
	}
}
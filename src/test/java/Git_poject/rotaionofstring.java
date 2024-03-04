package Git_poject;

public class rotaionofstring {

	public static void main(String[] args) {
		
		String str1 = "ABCD";
		
		String str2 = "EFGH";
		
		
		if(isRotaion(str1, str2))
		{
			System.out.println("Rotation is present");
		}		
		
		else
		{
			System.out.println("Rtoation is not present");
		}
	}

	public static boolean isRotaion(String str1, String str2)
	{
		return (str1.length() == str2.length()) && ((str1+str2).indexOf(str2) !=-1);
		
	}
	
	
	}
	


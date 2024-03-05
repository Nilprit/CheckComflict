package Git_poject;

public class rotaionofstring {

	public static void main(String[] args) {
		
		String str1 = "ABCD";
		
		String str2 = "CDAB";
		
		int l = str2.length();
		
		
		
		int x = (str1+str2).indexOf(str2);
		
		System.out.println(x);
		
		
		if(isRotaion(str1, str2, l))
		{
			System.out.println("Rotation is present");
		}		
		
		else
		{
			System.out.println("Rtoation is not present");
		}
	}

	public static boolean isRotaion(String str1, String str2, int l)
	{
		return (str1.length() == str2.length()) && ((str1+str2).indexOf(str2) !=-1); // str1+str2 = ABCDFDAC 
		
	}
	
	
	}
	


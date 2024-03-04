package Git_poject;

public class spicialCharr_removed {

	public static void main(String[] args) {

		String str = "Nileshthakare @#$!%";

		int count = 0;
		
		String sapecialcharreversed = "";
		

		for (int i=0;i<str.length();i++)
		{

			if(!Character.isDigit(str.charAt(i)) && !Character.isLetter(str.charAt(i))
					&& !Character.isWhitespace(str.charAt(i))) 
			{	
				count++;
			}
			
			else
			{
				sapecialcharreversed = sapecialcharreversed + str.charAt(i);
			}
		}
		if (count == 0)
		{
			System.out.println("tehre are no special charectors");
		}
		else
		{
			System.out.println("Special charectors fount number  = " + count);

		}
		System.out.println("special charectors removed = " + sapecialcharreversed );
	}

}

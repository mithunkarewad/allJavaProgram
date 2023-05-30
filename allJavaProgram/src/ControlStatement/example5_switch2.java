package ControlStatement;

public class example5_switch2
{
	public static void main(String[] args)
	{
		
		switch("AA")
		{
			case "CD": System.out.println("running CD Code");
			break;
			
			case "CW": System.out.println("running CW Code");
			break;
			
			case "MT": System.out.println("running MT Code");
			break;
			
			case "BI": System.out.println("running BI Code");
			break;
			
			case "MS": System.out.println("running MS Code");
			break;
			
			default: System.out.println("Invalid input");				
		}	
	}
}
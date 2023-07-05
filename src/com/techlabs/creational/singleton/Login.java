package com.techlabs.creational.singleton;

public class Login {
	//private static  Login login;
	//private Login()
	//{
		
		
	//}
	//public static Login getlogin()
	//{
	//	login=new Login();
	//	return login;
				
				
	//}
	//OR
	//private static  Login login=new Login();//early initialization
	//private Login()
	//{
		
		
	//}
	//public static Login getlogin()
	//{
		
		//return login;
				
				
	//}
	private static  Login login;
	private Login()
	{
		
		
	}
	public static Login getlogin()
	{
		if(login==null)
			login=new Login();
		return login;
				
				
	}
	

}

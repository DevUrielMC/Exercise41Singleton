package com.exercise41singleton.model;

public class MiSingleton {

	//paso 2 se crea la instancia privada estatica
	private static MiSingleton MySingle =null;
	private static String urlServer;
	private static String user;
	private static String pass;
	
	
	//paso1 contructor pricado
	private MiSingleton() 
	{		
	}
	
	//paso 3 metodo get instance publico estatico.
	public static MiSingleton getInstance (String url, String username, String password)
	{
		if(MySingle==null)
		{
			urlServer= url;
			user= username;
			pass= password;
			
			MySingle = new MiSingleton();
		}else
		{
			System.out.println("No se puede crear el objeto porque ya ha sido instanciado");
			System.out.println("Url del sevidor" + urlServer);
			System.out.println("Username=" + user);
			System.out.println("Password=" + pass);
		}
		
		return MySingle;
	}
}

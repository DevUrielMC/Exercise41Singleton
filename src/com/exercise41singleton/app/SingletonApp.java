package com.exercise41singleton.app;
import com.exercise41singleton.model.MiSingleton;;

public class SingletonApp {

	public static void main(String[] args) {
		//System.out.println("SI JALA XD");
		String urlServer1 = "jdbc:mysql://localhost:3306/tiendita";
		String user1 = "root1";
		String pass1 = "admin1";
		
		String urlServer2 = "jdbc:mysql://localhost:3306/tiendita";
		String user2 = "root2";
		String pass2 = "admin2";
		
		String urlServer3 = "jdbc:mysql://localhost:3306/tiendita";
		String user3 = "root3";
		String pass3 = "admin3";
		
		MiSingleton objMiSingleton=	MiSingleton.getInstance(urlServer1,user1,pass1);
		MiSingleton objMiSingleton2=	MiSingleton.getInstance(urlServer2,user2,pass2);
		MiSingleton objMiSingleton3=	MiSingleton.getInstance(urlServer3,user3,pass3);
	}

}

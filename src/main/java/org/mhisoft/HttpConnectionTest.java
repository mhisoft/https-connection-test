package org.mhisoft;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;


public class HttpConnectionTest {

	public static void main(String[] args) {
		try {
			if (args.length == 0) {
				System.out.println("USAGE: Please provide url as an argument");
				return;
			}

//      System.setProperty("https.proxyHost", "proxy");
//      System.setProperty("https.proxyPort", "8080");
			System.out.println(">>>>>>>>>> args[0]:" + args[0]);
			System.out.println(System.getProperties());
			System.out.println(">>>>>>>>>> start to make connectoins.");
			URL url = new URL(args[0]);
			URLConnection yc = url.openConnection();
			BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));

			System.out.println(">>>>>>>>>> rersponse:");
			String inputLine;
			while ((inputLine = in.readLine()) != null) {
				System.out.println(inputLine);
			}
			in.close();
			System.out.println(">>>>>>>>>> end.");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

import java.net.*;
import java.io.*;
import java.util.*;

public class MyIP {

	public static void main(String[] args) throws Exception {

		InetAddress localhost = InetAddress.getLocalHost();
		System.out.println((localhost.getHostAddress()).trim());
	
	}

}

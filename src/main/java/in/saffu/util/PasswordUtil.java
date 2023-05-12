package in.saffu.util;

import org.apache.commons.lang3.RandomStringUtils;

public class PasswordUtil {
	private PasswordUtil() {
		
	}
	
	public  static String genrateRandomPassword()
	{
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		 return RandomStringUtils.random( 6, characters );
		
	}

}

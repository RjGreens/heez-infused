package test;

import java.time.Instant;
import java.util.Date;

public class Test {
	public static void main(String args[]){
		Date date = new Date(Instant.now().getEpochSecond());
		System.out.println(new Date(System.currentTimeMillis()+1800000)+"|"+new Date(System.currentTimeMillis()));
	}
}

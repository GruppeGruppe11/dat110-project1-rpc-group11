package no.hvl.dat110.messaging;

import java.util.Arrays;

import no.hvl.dat110.TODO;

public class MessageUtils {

	public static final int SEGMENTSIZE = 128;

	public static int MESSAGINGPORT = 8080;
	public static String MESSAGINGHOST = "localhost";

	public static byte[] encapsulate(Message message) {
		
		byte[] segment = null;
		byte[] data;
		
		// TODO - START

		data = message.getData();
		segment = new byte[128];
		segment[0] = (byte)data.length;

		for (int i = 0 ; i < data.length; i++) {
			segment[i+1] = data[i];
		}

		// TODO - END
		return segment;
		
	}

	public static Message decapsulate(byte[] segment) {

		Message message = null;
		
		// TODO - START
		byte[] data = new byte[segment[0]];

		for (int i = 1; i < segment[0]+1; i++) {
			data[i-1]=segment[i];
		}

		message = new Message(data);
		// TODO - END
		
		return message;
		
	}
	
}

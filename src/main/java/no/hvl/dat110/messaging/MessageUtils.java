package no.hvl.dat110.messaging;

public class MessageUtils {

	public static final int SEGMENTSIZE = 128;

	public static int MESSAGINGPORT = 8080;

	public static String MESSAGINGHOST = "localhost";

	public static byte[] encapsulate(Message message) {
		
		byte[] segment = null;
		byte[] data = message.getData();
		
		// TODO - START
		
		// encapulate/encode the payload data of the message and form a segment
		// according to the segment format for the messaging layer
		segment = new byte[128];
		final Integer LENGTH = data.length;
		segment[0] = LENGTH.byteValue();
		System.arraycopy(data, 0, segment, 1, LENGTH);

		// TODO - END
		return segment;
		
	}

	public static Message decapsulate(byte[] segment) {

		Message message = null;
		
		// TODO - START
		// decapsulate segment and put received payload data into a message

		final int LENGTH = segment[0];
		byte[] data = new byte[LENGTH];
		System.arraycopy(segment, 1, data, 0, LENGTH);
		message = new Message(data);
		
		// TODO - END
		
		return message;
		
	}
	
}

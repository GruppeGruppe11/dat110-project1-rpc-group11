package no.hvl.dat110.messaging;

public class Message {

	// the up to 127 bytes of data (payload) that a message can hold
	private byte[] data;

	// construction a Message with the data provided
	public Message(byte[] data) {
		
		// TODO - START

		if (data == null){
			throw new NullPointerException("Cannot have null as data.");
		}

		boolean DATA_TOO_LONG = data.length > 127;
		if (DATA_TOO_LONG){
			throw new UnsupportedOperationException("Data is too long. The maximum length is 127 bytes.");
		}

		this.data = data;

		// TODO - END
	}

	public byte[] getData() {
		return this.data; 
	}

}

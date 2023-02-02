package no.hvl.dat110.rpc;

import java.io.IOException;

public class RPCClientStopStub extends RPCLocalStub {

	public RPCClientStopStub(RPCClient rpcclient) {
		super(rpcclient);
	}
	
	// client-side implementation of the built-in server stop RPC method
	public void stop () {
		
		byte[] request = RPCUtils.marshallVoid();

		byte[] response = new byte[0];
		try {
			response = rpcclient.call(RPCCommon.RPIDSTOP,request);
		} catch (IOException e) {
			e.printStackTrace();
		}

		RPCUtils.unmarshallVoid(response);
	
	}
}

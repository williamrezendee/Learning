package org.apache.commons.net.examples.ntp;

import java.io.IOException;
import java.net.InetAddress;
import java.net.SocketException;

import org.apache.commons.net.ntp.NTPUDPClient;
import org.apache.commons.net.ntp.NtpV3Packet;
import org.apache.commons.net.ntp.TimeInfo;
import org.apache.commons.net.ntp.TimeStamp;

public class NTPClient {
	
	public static String processResponse(final TimeInfo info)
    {
        final NtpV3Packet message = info.getMessage();
        
        // Receive Time is time request received by server
        final TimeStamp rcvNtpTime = message.getReceiveTimeStamp();
        return rcvNtpTime.toDateString();
    }
	
	public static void main(String[] args) throws Exception {
		NTPUDPClient client = new NTPUDPClient();
		client.setDefaultTimeout(10_000);
		try {
			client.open();
			try {
				InetAddress hostAddr = InetAddress.getByName("a.st1.ntp.br");
				TimeInfo info = client.getTime(hostAddr);
				String receive = processResponse(info);
				System.out.println(receive);
			}
			catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
		catch (SocketException e) {
			e.printStackTrace();
		}
		client.close();
	}
}

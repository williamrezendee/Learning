package org.apache.commons.net.examples.ntp;

import java.net.InetAddress;

import org.apache.commons.net.ntp.NTPUDPClient;
import org.apache.commons.net.ntp.TimeInfo;
import org.apache.commons.net.ntp.TimeStamp;

public class GuardarCodigo {
	
	/*
	NTPUDPClient client = new NTPUDPClient();
	client.setDefaultTimeout(10_000);
	
	InetAddress hostAddr = InetAddress.getByName("a.st1.ntp.br");
	TimeInfo info = client.getTime(hostAddr);
	info.computeDetails(); // compute offset/delay if not already done
	Long offsetValue = info.getOffset();
	Long delayValue = info.getDelay();
	String delay = (delayValue == null) ? "N/A" : delayValue.toString();
	String offset = (offsetValue == null) ? "N/A" : offsetValue.toString();
	
	// This system NTP time
	TimeStamp systemNtpTime = TimeStamp.getCurrentTime();
	System.out.println("System time:\t" + systemNtpTime + "  " + systemNtpTime.toDateString());
	
	// Calculate the remote server NTP time
	long currentTime = System.currentTimeMillis();
	TimeStamp atomicNtpTime = TimeStamp.getNtpTime(currentTime);
	System.out.println("Atomic time:\t" + atomicNtpTime + "  " + atomicNtpTime.toDateString());

	System.out.println(" Roundtrip delay(ms)=" + delay
	                + ", clock offset(ms)=" + offset);// offset in ms
	 
	System.out.println("Time: " + info.getMessage());
	client.close();
	*/
}

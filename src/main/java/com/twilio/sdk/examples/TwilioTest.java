package com.twilio.sdk.examples;
import java.util.*;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import com.twilio.sdk.*; 
import com.twilio.sdk.resource.factory.*; 
import com.twilio.sdk.resource.instance.*; 
import com.twilio.sdk.resource.list.*; 
 
public class TwilioTest { 
 // Find your Account Sid and Token at twilio.com/user/account 
 public static final String ACCOUNT_SID = "ACedb96c0f75294427815057f6c0e6a372"; 
 public static final String AUTH_TOKEN = "94e5c25ca217d0901a6bdfc4fb5b1da2"; 
 
 public static void main(String[]args) throws TwilioRestException { 
	TwilioRestClient client = new TwilioRestClient(ACCOUNT_SID, AUTH_TOKEN); 
 
	// Build the parameters 
	List<NameValuePair> params = new ArrayList<NameValuePair>(); 
	params.add(new BasicNameValuePair("To", "+16172171059")); 
	params.add(new BasicNameValuePair("From", "+16173963503")); 
	params.add(new BasicNameValuePair("Url", "https://api.twilio.com/2010-04-01/Accounts/AC935e2d7c46b610f4657713cfd824b1c6/Calls"));  
	params.add(new BasicNameValuePair("Method", "GET"));  
	params.add(new BasicNameValuePair("FallbackMethod", "GET"));  
	params.add(new BasicNameValuePair("StatusCallbackMethod", "GET"));    
	params.add(new BasicNameValuePair("Record", "false")); 
 
	CallFactory callFactory = client.getAccount().getCallFactory(); 
	Call call = callFactory.create(params); 
	System.out.println(call.getSid()); 
 } 
}
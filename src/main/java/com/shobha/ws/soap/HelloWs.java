package com.shobha.ws.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.apache.cxf.feature.Features;
import org.apache.cxf.feature.LoggingFeature;

@WebService
@Features(features="org.apache.cxf.feature.LoggingFeature")
public class HelloWs {

	@WebMethod
	public String sayHello() {
		return "hello";
		
	}
}

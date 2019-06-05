package com.express.vistaprinting.app.config;

import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/VistaPrint")
public class AppConfig extends org.glassfish.jersey.server.ResourceConfig
{
	public AppConfig() {
		packages("com.express.vistaprinting.vistaprint");	
		}
	}

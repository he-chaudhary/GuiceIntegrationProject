package com.hh.java.module;

import com.google.inject.servlet.ServletModule;
import com.hh.java.servlet.GuiceServlet;

public class GuiceModule extends ServletModule{
	@Override
	protected void configureServlets(){
		serve("/").with(GuiceServlet.class);
	}
}

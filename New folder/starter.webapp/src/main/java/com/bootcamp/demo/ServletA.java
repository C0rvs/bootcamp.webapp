package com.bootcamp.demo;

import java.io.IOException;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ServletA extends HttpServlet {

    private static final long serialVersionUID = 2265793564953959394L;
    
    private static final Logger LOGGER = LogManager.getLogger(ServletA.class);


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LOGGER.info("action=do_get, source=servlet_a");
	}

}

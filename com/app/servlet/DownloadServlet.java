package com.app.servlet;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/download")
public class DownloadServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
		String fileName="Pratik.jpg";

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
		{
			PrintWriter out = response.getWriter();
			response.setContentType("APPLICATION/OCTET-STREAM");
			
			response.setHeader("Content-Disposition","attachment;filename=\""+fileName+"\""); 
				FileInputStream fis=new FileInputStream("H:/pratik.jpg");
					int i=fis.read(); 
						while (i != -1) 
						{ 
								out.write(i); 
								i=fis.read();
						}
		}
	}

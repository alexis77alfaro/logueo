package com.logueo.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import com.logue.Dao.tb_usuariopdao;
import com.logueo.model.TbUsuariop;

/**
 * Servlet implementation class serveletController
 */
public class serveletController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public serveletController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String usu=request.getParameter("usuario");
		String pass1=request.getParameter("pass");
		
		TbUsuariop usu1=new TbUsuariop ();
		
		usu1.setUsuario(usu);
		usu1.setContrasenia(pass1);
		
		tb_usuariopdao user=new tb_usuariopdao();
		int verificar=user.ingresoUsuario(usu1).size();
		
		if(verificar==1) {
			
			JOptionPane.showMessageDialog(null, "bienvenido");
			
		}else {
			JOptionPane.showMessageDialog(null, "ERRO_MACRO");
			
		}
		
		
		
		
		
		
		 
	}

}

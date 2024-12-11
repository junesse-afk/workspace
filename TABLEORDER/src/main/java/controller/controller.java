package controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.JoinDTO;

@WebServlet("*.com")
public class controller extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}	
	
	private void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String command = req.getServletPath();
		if (command.equals("/main.com")) {
			RequestDispatcher dis = req.getRequestDispatcher("webapp/index.html");
			dis.forward(req, resp);
		}else if (command.equals("/join.com")) {
			RequestDispatcher dis = req.getRequestDispatcher("member/join.jsp");
			dis.forward(req, resp);
		}else if (command.equals("/regist.com")) {
			String tid = req.getParameter("tid");
			
			JoinDTO joindto = new JoinDTO(tid, tpw, );
			
			join(joindto);
		}

	}
	
	public void join (JoinDTO joindto) {
				
		if (joindto.getTid() == '') {
			
		}
	}
	
}
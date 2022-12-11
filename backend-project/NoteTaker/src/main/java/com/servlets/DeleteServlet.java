package com.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Entities.Note;
import com.helper.FactoryProvider;

/**
 * Servlet implementation class DeleteServlet
 */
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			int noteId = Integer.parseInt(request.getParameter("note_id").trim());
			Session session = FactoryProvider.getFactory().openSession();
			Transaction tx = session.beginTransaction();
			
		Note note =(Note)session.get(Note.class, noteId);
			session.delete(note);
			tx.commit();
			response.sendRedirect("all_notes.jsp");
			
			session.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	

}

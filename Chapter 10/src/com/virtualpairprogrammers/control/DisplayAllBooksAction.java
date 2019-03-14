package com.virtualpairprogrammers.control;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.virtualpairprogrammers.domain.Book;
import com.virtualpairprogrammers.services.BookService;

public class DisplayAllBooksAction extends Action
{
	public ActionForward execute(ActionMapping mapping,
							     ActionForm form,
							     HttpServletRequest request,
							     HttpServletResponse response)
	{
		List<Book> allBooks = BookService.getService().getEntireCatalogue();
		request.setAttribute("allBooks", allBooks);
		
		return mapping.findForward("viewBooks");
	}
}

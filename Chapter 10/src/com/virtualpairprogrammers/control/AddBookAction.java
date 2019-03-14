package com.virtualpairprogrammers.control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.virtualpairprogrammers.domain.Book;
import com.virtualpairprogrammers.forms.BookForm;
import com.virtualpairprogrammers.services.BookService;

public class AddBookAction extends Action
{
	public ActionForward execute(ActionMapping mapping,
								 ActionForm form,
								 HttpServletRequest request,
								 HttpServletResponse response)
	{
		BookForm bookToAdd = (BookForm)form;
		
		BookService service = BookService.getService();
		
		Book newBook = new Book(bookToAdd.getIsbn(),
								bookToAdd.getTitle(),
								bookToAdd.getAuthor(),
								new Double(bookToAdd.getPrice()));
		
		service.registerNewBook(newBook);
		
		return mapping.findForward("addBookSuccessful");
	}
}

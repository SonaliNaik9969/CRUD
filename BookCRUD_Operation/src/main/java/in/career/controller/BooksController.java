package in.career.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import in.career.entity.Books;
import in.career.service.BooksService;

@Controller
public class BooksController {
	
	@GetMapping("/")
	public String loadIndex()
	{
		return "index";
	}
	@GetMapping("/NewBook")
	public ModelAndView NewBookDetail()
	{
		ModelAndView mav = new ModelAndView();
		Books book = new Books();
		mav.addObject("book", book);
		mav.setViewName("AddNewBook");
		return mav;
	}
	@GetMapping(value = {"/save","/update/save"})
	public String SaveBookDetail(Books book)
	{
		bService.SaveBookDetail(book);
		System.out.println(book);
		return "redirect:/allBooks";
	}
	@GetMapping("/allBooks")
	public ModelAndView AllBooksDetail()
	{
		ModelAndView mav = new ModelAndView();
		List<Books> allbook = bService.AllBooksDetail();
		mav.addObject("allbook", allbook);
		mav.setViewName("ViewAllBooks");
		return mav;
	}
	@GetMapping("/update/{id}")
	public ModelAndView updateBookDetail(@PathVariable("id") Long id)
	{
		ModelAndView mav = new ModelAndView();
		Books book = bService.findBookById(id);
		mav.addObject("book", book);
		mav.setViewName("AddNewBook");
		return mav;
	}
	@GetMapping("/delete/{id}")
	public String DeleteBookById(@PathVariable("id") Long id)
	{
		bService.DeleteBookById(id);
		return "redirect:/allBooks";
		
	}
	@Autowired
	private BooksService bService;

}

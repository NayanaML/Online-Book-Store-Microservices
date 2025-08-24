package in.onlinebookstore.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.onlinebookstore.entity.Book;
import in.onlinebookstore.serviceImple.BookCatalogImple;

@RestController
@RequestMapping("/catalog/")
public class CatalogController {
	
	@Autowired
private BookCatalogImple bookservice;
	
	@GetMapping("/getMessage")
	public String getinitialMessage() {
		
		return "Hare Krishna ";
	}
@GetMapping("/getAllBooks")
	public List<Book> getBooks(){
		
		return bookservice.bookslist();
	}
}

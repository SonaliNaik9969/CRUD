package in.career.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.career.entity.Books;
import in.career.repo.BooksRepo;

@Service
public class BooksService {
	
	@Autowired
	public BooksRepo bRepo;

	public Books SaveBookDetail(Books book) {
		Books b1 = bRepo.save(book);
		return b1;
		
	}

	public List<Books> AllBooksDetail() {
		List<Books> allbooks = bRepo.findAll();
		return allbooks;
	}

	public void DeleteBookById(Long id) {
		bRepo.deleteById(id);
		
	}

	public Books findBookById(Long id) {
		Optional<Books> findBookById = bRepo.findById(id);
		Books book = findBookById.get();
		return book;
	}

}

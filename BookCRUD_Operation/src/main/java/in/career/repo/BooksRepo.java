package in.career.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.career.entity.Books;

public interface BooksRepo extends JpaRepository<Books, Long> {

}

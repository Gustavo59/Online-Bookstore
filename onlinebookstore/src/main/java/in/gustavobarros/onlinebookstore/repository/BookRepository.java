package in.gustavobarros.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.gustavobarros.onlinebookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}

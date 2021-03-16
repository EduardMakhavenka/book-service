package ru.nonsensemmy.onlineLibrary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.nonsensemmy.onlineLibrary.domain.book.BookImpl;

import java.util.List;

@Repository
public interface BookRepo extends JpaRepository<BookImpl, Long> {

    @Query(value = "SELECT * FROM books WHERE id >= ?1 ORDER BY id LIMIT 10", nativeQuery = true)
    List<BookImpl> findTenById(Long id);

    @Query(value = "SELECT * FROM books WHERE id >= ?1 ORDER BY id LIMIT 20", nativeQuery = true)
    List<BookImpl> findTwentyById(Long id);

    @Query(value = "SELECT * FROM books WHERE id >= ?1 ORDER BY id LIMIT 50", nativeQuery = true)
    List<BookImpl> findFiftyById(Long id);
}

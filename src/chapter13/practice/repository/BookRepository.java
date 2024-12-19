package chapter13.practice.repository;

import chapter13.practice.model.Book;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

// 도서를 저장하고 검색 및 삭제하는 데이터 저장소 (DB 대신)
public class BookRepository {
    private List<Book> books = new ArrayList<>();

    public void save(Book book) {
        books.add(book);
    }

    public void deleteById(int id) {
//        Book bookToRemove = null;
//        for(Book book : books) {
//            if(book.getId() == id) {
//                bookToRemove = book;
//                break;
//            }
//        }
//        if(bookToRemove != null) {
//            books.remove(bookToRemove);
//        }
        for(Book book : books) {
            if(book.getId() == id){
                books.remove(book);
                break;
            }
        }
    }

    public Book findById(int id) {
        for(Book book : books) {
            if(book.getId() == id) {
                return book;
            }
        }
        return null;        // 해당하는 id의 책이 없을 경우
    }

    public List<Book> findAll() {
        return books;
    }

}

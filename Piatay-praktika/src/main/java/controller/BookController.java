package controller;

import model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.BookService;

import java.util.List;

@RestController
//@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public String getAllBooks() {
        System.out.println("Запрос к /books получен");
        return "Hello, world!";
    }
//    public List<Book> getAllBooks() {
//        return bookService.findAll();
//    }

//    @GetMapping("/{id}")
//    public Book getBookById(@PathVariable Long id) {
//        return bookService.findById(id).orElse(null);
//    }
//
//    @PostMapping
//    public Book createBook(@RequestBody Book book) {
//        return bookService.save(book);
//    }
//
//    @PutMapping("/{id}")
//    public Book updateBook(@PathVariable Long id, @RequestBody Book book) {
//        if (bookService.findById(id).isPresent()) {
//            return bookService.save(book);
//        }
//        return null;
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteBook(@PathVariable Long id) {
//        bookService.deleteById(id);
//    }
}

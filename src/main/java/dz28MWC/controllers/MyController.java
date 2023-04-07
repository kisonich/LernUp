package dz28MWC.controllers;

import dz28MWC.entity.Book;
import dz28MWC.service.BookServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
@RequestMapping("/book")
public class MyController {

    @GetMapping("/pop")
    public String test(){
        return "test";
    }
    @Autowired
    public BookServices bookServices;

//    @GetMapping
//    public String getBookFilter(@RequestParam(name = "namebook", required = false) String nameBook,
//                                @RequestParam(name = "cost", required = false) int cost, Model model) {
//
//        List<Book> books = bookServices.getBooksByNameAndCost(nameBook, cost);
//        model.addAttribute("books", books);
//
//        return "Books";
//    }

    @GetMapping("/{namebook}")
    public String getBook(@PathVariable(name = "namebook") String namebook, @RequestParam int cost, Model model){
        List<Book> bookFilter = bookServices.getBooksByNameAndCost(namebook, cost);
        model.addAttribute("books", bookFilter);
        return "Books";
    }
}

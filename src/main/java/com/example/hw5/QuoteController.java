package com.example.hw5;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
@RestController
public class QuoteController {

    private int id = 8;
    private Map <Integer,String> mapQuotes = new HashMap<>();
    {
        mapQuotes.put(1,"Be yourself; everyone else is already taken.");
        mapQuotes.put(2,"So many books, so little time.");
        mapQuotes.put(3,"A room without books is like a body without a soul.");
        mapQuotes.put(4,"You only live once, but if you do it right, once is enough.");
        mapQuotes.put(5,"Be the change that you wish to see in the world.");
        mapQuotes.put(6,"In three words I can sum up everything I've learned about life: it goes on.");
        mapQuotes.put(7,"If you tell the truth, you don't have to remember anything.");
    }
    @GetMapping("/quotes/{id}")
    public String getQuotes(@PathVariable Integer id){
        return mapQuotes.get(id);
    }

    @GetMapping("/quotes")
    public Map<Integer,String> getAllQuotes(){
        return mapQuotes;
    }

    @PostMapping("/quotes")
    public void postQuotes(@RequestBody @Validated Quote quote){
        mapQuotes.put(id++,quote.getQuote());
    }

    @PutMapping ("/quotes/{id}")
    public void updateQuotes(@RequestBody Quote quote, @PathVariable Integer id ){
        mapQuotes.put(id, quote.getQuote());
    }

   @DeleteMapping ("/quotes/{id}")
   public void deleteQuotes (@PathVariable Integer id){
       mapQuotes.remove(id);
   }
}



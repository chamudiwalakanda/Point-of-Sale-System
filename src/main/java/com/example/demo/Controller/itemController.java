package com.example.demo.Controller;

import com.example.demo.Entity.itemEntity;
import com.example.demo.Repository.itemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/")
public class itemController {

        @Autowired
        private itemRepository itemrepository;

        @PostMapping
        public itemEntity addItem(@RequestBody itemEntity item) {
            return itemRepository.save(item);
        }

        @PutMapping("/{id}")
        public itemEntity updateItem(@PathVariable int id, @RequestBody itemEntity item) {
            itemEntity.setId(id);
            return itemRepository.save(item);
        }

        @DeleteMapping("/{id}")
        public void deleteItem(@PathVariable Long id) {
            itemRepository.deleteById(id);
        }
    }
}

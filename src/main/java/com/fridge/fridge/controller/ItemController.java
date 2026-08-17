package com.fridge.fridge.controller;

import com.fridge.fridge.model.Item;
import com.fridge.fridge.service.ItemService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {

    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping
    public List<Item> listarTodos() {
        return itemService.listarTodos();
    }

    @PostMapping
    public Item criar(@RequestBody Item item) {
        return itemService.salvar(item);
    }
}

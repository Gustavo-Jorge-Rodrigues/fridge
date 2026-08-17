package com.fridge.fridge.service;

import com.fridge.fridge.model.Item;
import com.fridge.fridge.repository.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    private final ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public List<Item> listarTodos() {
        return itemRepository.findAll();
    }

    public Item salvar(Item item) {
        return itemRepository.save(item);
    }
}

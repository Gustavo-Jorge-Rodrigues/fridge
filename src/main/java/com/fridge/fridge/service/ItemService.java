package com.fridge.fridge.service;

import com.fridge.fridge.model.Item;
import com.fridge.fridge.repository.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Optional<Item> buscarPorId(Long id) {
        return itemRepository.findById(id);
    }

    public Optional<Item> atualizar(Long id, Item itemAtualizado) {
        return itemRepository.findById(id)
                .map(item -> {
                    item.setNome(itemAtualizado.getNome());
                    item.setQuantidade(itemAtualizado.getQuantidade());
                    item.setDataValidade(itemAtualizado.getDataValidade());
                    item.setCategoria(itemAtualizado.getCategoria());
                    return itemRepository.save(item);
                });
    }

    public boolean deletar(Long id) {
        if (!itemRepository.existsById(id)) {
            return false;
        }

        itemRepository.deleteById(id);
        return true;
    }
}

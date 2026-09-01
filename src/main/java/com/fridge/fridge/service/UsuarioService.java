package com.fridge.fridge.service;

import com.fridge.fridge.model.Usuarios;
import com.fridge.fridge.repository.UsuarioRepository;
import jakarta.persistence.Id;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.Optional;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;


    public UsuarioService(UsuarioRepository usuarioRepository, UsuarioRepository usuarioRepository1) {
        this.usuarioRepository = usuarioRepository1;

    }
    public Usuarios cadastrar(Usuarios usuario) {
        return usuarioRepository.save(usuario);
    }

    public Optional<Usuarios> BuscarPorId(Long id) { return usuarioRepository.findById(id); }


}

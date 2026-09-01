package com.fridge.fridge.controller;

import com.fridge.fridge.model.Usuarios;
import com.fridge.fridge.service.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping("/cadastro")
    public ResponseEntity<Usuarios> cadastrar(@RequestBody Usuarios usuario) {
        Usuarios usuarioCriado = usuarioService.cadastrar(usuario);
        return ResponseEntity.ok(usuarioCriado);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuarios> buscarPorId(@PathVariable Long id) {
        Optional<Usuarios> usuario = usuarioService.BuscarPorId(id);
        return usuario.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}

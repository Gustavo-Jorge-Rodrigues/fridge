package com.fridge.fridge.repository;

import com.fridge.fridge.model.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository <Usuarios, Long> {


}

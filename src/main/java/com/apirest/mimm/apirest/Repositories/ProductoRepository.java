package com.apirest.mimm.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apirest.mimm.apirest.Entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long>{

}

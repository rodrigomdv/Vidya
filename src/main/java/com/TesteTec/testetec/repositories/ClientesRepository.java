package com.TesteTec.testetec.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.TesteTec.testetec.entities.Clientes;

public interface ClientesRepository extends JpaRepository<Clientes, Long> {
	

}

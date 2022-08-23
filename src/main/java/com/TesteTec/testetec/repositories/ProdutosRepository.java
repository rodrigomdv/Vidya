package com.TesteTec.testetec.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.TesteTec.testetec.entities.Licenca;

public interface ProdutosRepository  extends JpaRepository<Licenca, Long> {
	
}



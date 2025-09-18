package com.devsuperior.uri2602.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.uri2602.dto.ProviderDTO;
import com.devsuperior.uri2602.entities.Provider;
import com.devsuperior.uri2602.projections.ProviderMinProjection;

public interface ProviderRepository extends JpaRepository<Provider, Long>{

    @Query(nativeQuery = true, value = "SELECT DISTINCT city FROM providers ORDER BY city ASC")
    List<ProviderMinProjection> search2607();

    @Query("SELECT DISTINCT new com.devsuperior.uri2602.dto.ProviderDTO(obj.city) FROM Provider obj ORDER BY obj.city ASC")
    List<ProviderDTO> search2607X();
}

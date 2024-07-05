package it.epicode.capstone.repository;

import it.epicode.capstone.entity.Recensione;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RecensioneRepository extends JpaRepository<Recensione, Integer> {

    List<Recensione> findByEsperienzaId(int esperienzaId);
}

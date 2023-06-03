package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import francesco.u5_w1_d1.Postazione;

@Repository
public interface PostazioneRepository extends JpaRepository<Postazione, Long> {
	List<Postazione> findByTipoAndEdificio_Citta(String tipo, String citta);

}

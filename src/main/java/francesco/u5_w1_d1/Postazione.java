package francesco.u5_w1_d1;

import org.springframework.data.annotation.Id;

import entities.enums.Tipo;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Postazione<Edificio> {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String codice;
	private String descrizione;
	@Enumerated(EnumType.STRING)
	private Tipo tipo;
	private int numeroMassimoOccupanti;

	@ManyToOne
	@JoinColumn(name = "edificio_id")
	private Edificio edificio;

	// Costruttori, getter e setter
}

package francesco.u5_w1_d1;

import java.util.List;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Utente {

	@Id
	private String username;

	private String nomeCompleto;
	private String email;

	@OneToMany(mappedBy = "utente")
	private List<Prenotazione> prenotazioni;

}

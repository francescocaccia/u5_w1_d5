package entities.enums;

public enum Tipo {
	PRIVATO(1), OPENSPACE(20), SALA_RIUNIONI(30);

	private int numeroMassimo;

	Tipo(int numeroMassimo) {
		this.numeroMassimo = numeroMassimo;
	}

	public int getNumeroMassimo() {
		return numeroMassimo;
	}
}

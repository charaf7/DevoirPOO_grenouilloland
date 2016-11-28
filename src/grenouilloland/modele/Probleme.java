package grenouilloland.modele;

public class Probleme {

	int dimension;
	protected Strategy strategie;

	public Probleme(Strategy strategie) {
		this.strategie = strategie;
	}

	public Strategy getStrategie() {
		return strategie;
	}

	public void setStrategie(Strategy strategie) {
		this.strategie = strategie;
	}

	public void solve() {
		strategie.algorithm(this);
	}
}

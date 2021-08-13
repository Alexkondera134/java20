package Contas;

public class ClienteVip extends Cliente{
	private float limite;
	
	

	public ClienteVip(float limite) {
		super();
		this.limite = limite;
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	

}

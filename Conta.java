
public class Conta {
	
	private Integer numero;
	private String titular;
	private Double saldo;
	private Double limiteRetirada;
	
	public Conta () {
		
	}
	
	public Conta (Integer numero, String titular, Double saldo, Double limiteRetirada) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.limiteRetirada = limiteRetirada;
	}
	
	public Integer getNumero () {
		return numero;
	}
	
	public void setNumero (Integer numero) {
		this.numero = numero;
	}
	
	public String getTitular () {
		return titular;
	}
	
	public void setTitular (String titular) {
		this.titular = titular;
	}
	
	public Double getSaldo () {
		return saldo;
	}
	
	public void setSaldo (Double saldo) {
		this.saldo = saldo;
	}
	
	public Double getLimiteRetirada () {
		return limiteRetirada;
	}
	
	public void setLimiteRetirada (Double limiteRetirada) {
		this.limiteRetirada = limiteRetirada;
	}
	
	public void deposito (Double quantidade) {
		saldo = saldo + quantidade;
	}
	
	public void sacar (Double quantidade) {
		
		if (saldo == 0.0) {
			System.out.print("Erro no saque. Não tem saldo suficiente !");
		}
		else if (quantidade > saldo || quantidade > limiteRetirada) {
			System.out.print("Erro no saque.  A quantia excedeu o limite de saque !");
		}
		else {
			saldo = saldo - quantidade;
			System.out.print("O novo saldo é => " + saldo);
	}
}
	
	public String toString () {
		return "\nNumero => "
				+ numero
				+ "\nTitular => "
				+ titular
				+ "\nSaldo Inicial => "
				+ saldo
				+ "\nlimiteRetirada => "
				+ limiteRetirada;
	}
}
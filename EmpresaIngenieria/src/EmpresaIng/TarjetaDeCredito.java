package EmpresaIng;

public class TarjetaDeCredito extends FormaDePago {

	
	
	public TarjetaDeCredito(int cuotas) {
		super(cuotas);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double monto(Material material) {
		return super.monto(material) * (this.cuotas * 4);
	}

}

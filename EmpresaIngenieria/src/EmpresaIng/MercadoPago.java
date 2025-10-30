package EmpresaIng;

public class MercadoPago extends FormaDePago {

	
	
	public MercadoPago() {
		super(1);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double monto(Material material) {
		// TODO Auto-generated method stub
		return super.monto(material) * 0.97;
	}

}

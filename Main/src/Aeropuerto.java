
public class Aeropuerto {
	String Ciudad;
	int Hora;
	String motor;
	String Empresa;

	public Aeropuerto(int hora) {

		Ciudad = "AREQUIPA";
		Hora = hora;
		Empresa = "Rodr�guez Ball�n";

		Imprimir();
	}

	void Imprimir() {
		System.out.println(Ciudad + " " + Hora + " " + Empresa);
	}
}

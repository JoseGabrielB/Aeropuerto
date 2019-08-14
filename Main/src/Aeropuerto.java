
public class Aeropuerto {
	String Ciudad;
	int Hora;
	String motor;
	String Empresa;

	public Aeropuerto(int hora) {

		Ciudad = "AREQUIPA";
		Hora = hora;
		Empresa = "Rodríguez Ballón";

		Imprimir();
	}

	void Imprimir() {
		System.out.println(Ciudad + " " + Hora + " " + Empresa);
	}
}

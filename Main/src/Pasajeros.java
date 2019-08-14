
public class Pasajeros {
	String nombre;
	String Apellidos;
	int edad;
	String sexo;

	public Pasajeros( String apellidos, String M) {

		this.nombre = "Julio";
		this.Apellidos = apellidos;
		this.edad = 20;
		this.sexo = M;
		Imprimir();
	}

	void Imprimir() {

		System.out.println(nombre +" "+ Apellidos +" "+ edad+" "+ sexo   );

	}

}

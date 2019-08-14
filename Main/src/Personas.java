
public class Personas extends Pasajeros {

	String Nombre;
	int edad;



	public Personas(String apellidos, String m, String nombre) {
		super(apellidos, m);
		Nombre = nombre;
		this.edad = 30;
		
		
		Imprimir();	
	}


	void Imprimir() {
		System.out.println(  Apellidos +" "+ sexo +" "+nombre+" "+edad);
	}
}
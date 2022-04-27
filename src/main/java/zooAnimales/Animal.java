package zooAnimales;
import gestion.Zona;

public class Animal {
	private static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	
	public Animal() {}
	
	public Animal( String nombre, int edad, String habitat, String genero) {
		Animal.totalAnimales++;
		this.nombre=nombre;
		this.edad=edad;
		this.habitat=habitat;
		this.genero=genero;}
	
	public static int getTotalAnimales() {
		return Animal.totalAnimales;}
	
	public String getNombre() {
		return this.nombre;}
	
	public int getEdad() {
		return this.edad;}
	
	public String getHabitat() {
		return this.habitat;}
	
	public String getGenero() {
		return this.genero;}
	
	public Zona getZona() {
		return this.zona;}
	
	public static void setTotalAnimales(int nuevo) {
		Animal.totalAnimales=nuevo;}
	
	public void setNombre(String nuevo) {
		this.nombre=nuevo;}
	
	public void setEdad(int nuevo) {
		this.edad=nuevo;}
	
	public void setHabitat(String nuevo) {
		this.habitat=nuevo;}
	
	public void setGenero(String nuevo) {
		this.genero=nuevo;}
	
	public void setZona(Zona nuevo) {
		this.zona=nuevo;}
	
	public String movimiento() {
		return "desplazarse";}
	
	public static String totalPorTipo() {
		return "Mamiferos: "+Mamifero.cantidadMamiferos()+"\nAves: "+Ave.cantidadAves()+
		"\nReptiles: "+Reptil.cantidadReptiles()+"\nPeces: "+Pez.cantidadPeces()+"\nAnfibios: "+
		Anfibio.cantidadAnfibios();}
	
	public String toString() {
		if (this.zona==null) {
			return "Mi nombre es "+this.nombre+", tengo una edad de "+this.edad+", habito en "+
					this.habitat+" y mi genero es "+this.genero;
			}else {
			return "Mi nombre es "+this.nombre+", tengo una edad de "+this.edad+", habito en "+
			this.habitat+" y mi genero es "+this.genero+", la zona en la que me ubico es "+
			this.zona.getNombre()+", en el "+this.zona.getZoo().getNombre();
			}
		
	}
	
}

package zooAnimales;
import java.util.ArrayList;
public class Pez extends Animal{
	private static ArrayList<Pez> listado=new ArrayList<Pez>();
	public static int salmones=0;
	public static int bacalaos=0;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez() {
		listado.add(this);
		Animal.setTotalAnimales(Animal.getTotalAnimales()+1);}
	
	public Pez(String nombre, int edad, String habitat, String genero,String colorEscamas, int cantidadAletas) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.colorEscamas=colorEscamas;
		this.cantidadAletas=cantidadAletas;
		listado.add(this);
		Animal.setTotalAnimales(Animal.getTotalAnimales()+1);}
	
	public static ArrayList<Pez> getListado(){
		return listado;}
	
	public String getColorEscamas() {
		return colorEscamas;}
	
	public int getCantidadAletas(){
		return cantidadAletas;}
	
	public static void setListado(ArrayList<Pez> nuevo) {
		Pez.listado=nuevo;}
	
	public void setColorEscamas(String nuevo) {
		this.colorEscamas=nuevo;}
	
	public void setCantidadAletas(int nuevo) {
		this.cantidadAletas=nuevo;}
	
	public static int cantidadPeces() {
		return listado.size();}
	
	public String movimiento() {
		return "nadar";}
	
	public static Pez crearSalmon(String nombre, int edad, String genero) {
		Pez.salmones++;
		return new Pez(nombre,edad,"oceano",genero,"rojo",6);
		}
	
	public static Pez crearBacalao(String nombre, int edad, String genero) {
		Pez.bacalaos++;
		return new Pez(nombre,edad,"oceano",genero,"gris",6);}}
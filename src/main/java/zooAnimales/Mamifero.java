package zooAnimales;
import java.util.ArrayList;

public class Mamifero extends Animal{
	private static ArrayList<Mamifero> listado=new ArrayList<Mamifero>();
	public static int caballos=0;
	public static int leones=0;
	private boolean pelaje;
	private int patas;
	
	public Mamifero() {
		listado.add(this);
		Animal.setTotalAnimales(Animal.getTotalAnimales()+1);}
	
	public Mamifero(String nombre, int edad, String habitat, String genero,boolean pelaje, int patas) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.pelaje=pelaje;
		this.patas=patas;
		listado.add(this);
		Animal.setTotalAnimales(Animal.getTotalAnimales()+1);}
	
	public static ArrayList<Mamifero> getListado(){
		return listado;}
	
	public boolean getPelaje() {
		return pelaje;}
	
	public int getPatas(){
		return patas;}
	
	public static void setListado(ArrayList<Mamifero> nuevo) {
		Mamifero.listado=nuevo;}
	
	public void setPelaje(boolean nuevo) {
		this.pelaje=nuevo;}
	
	public void setPatas(int nuevo) {
		this.patas=nuevo;}
	
	public static int cantidadMamiferos() {
		return listado.size();}
	
	public static Mamifero crearCaballo(String nombre, int edad, String genero) {
		Mamifero.caballos++;
		return new Mamifero(nombre,edad,"pradera",genero,true,4);
		}
	
	public static Mamifero crearLeon(String nombre, int edad, String genero) {
		Mamifero.leones++;
		return new Mamifero(nombre,edad,"selva",genero,true,4);}
	
	public boolean isPelaje() {
		return pelaje;}}

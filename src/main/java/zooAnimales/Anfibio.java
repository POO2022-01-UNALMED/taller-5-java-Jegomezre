package zooAnimales;
import java.util.ArrayList;

public class Anfibio extends Animal{
	private static ArrayList<Anfibio> listado=new ArrayList<Anfibio>();
	public static int ranas=0;
	public static int salamandras=0;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio() {
		listado.add(this);
		Animal.setTotalAnimales(Animal.getTotalAnimales()+1);}
	
	public Anfibio(String nombre, int edad, String habitat, String genero,String colorPiel, boolean venenoso) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.colorPiel=colorPiel;
		this.venenoso=venenoso;
		listado.add(this);
		Animal.setTotalAnimales(Animal.getTotalAnimales()+1);}
	
	public static ArrayList<Anfibio> getListado(){
		return listado;}
	
	public String getColorPiel() {
		return colorPiel;}
	
	public boolean getVenenoso(){
		return venenoso;}
	
	public static void setListado(ArrayList<Anfibio> nuevo) {
		Anfibio.listado=nuevo;}
	
	public void setColorPiel(String nuevo) {
		this.colorPiel=nuevo;}
	
	public void setVenenoso(boolean nuevo) {
		this.venenoso=nuevo;}
	
	public static int cantidadAnfibios() {
		return listado.size();}
	
	public String movimiento() {
		return "saltar";}
	
	public static Anfibio crearRana(String nombre, int edad, String genero) {
		Anfibio.ranas++;
		return new Anfibio(nombre,edad,"selva",genero,"rojo",true);}
	
	public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
		Anfibio.salamandras++;
		return new Anfibio(nombre,edad,"selva",genero,"negro y amarillo",false);}
	
	public boolean isVenenoso() {
		return venenoso;}}
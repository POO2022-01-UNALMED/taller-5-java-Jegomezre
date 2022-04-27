package zooAnimales;
import java.util.ArrayList;

public class Ave extends Animal{
	private static ArrayList<Ave> listado=new ArrayList<Ave>();
	public static int halcones=0;
	public static int aguilas=0;
	private String colorPlumas;
	
	public Ave() {
		listado.add(this);
		Animal.setTotalAnimales(Animal.getTotalAnimales()+1);}
	
	public Ave(String nombre, int edad, String habitat, String genero,String colorPlumas) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		super.setGenero(genero);
		this.colorPlumas=colorPlumas;
		listado.add(this);
		Animal.setTotalAnimales(Animal.getTotalAnimales()+1);}
	
	public static ArrayList<Ave> getListado(){
		return listado;}
	
	public String getColorPlumas() {
		return colorPlumas;}
	
	public static void setListado(ArrayList<Ave> nuevo) {
		Ave.listado=nuevo;}
	
	public void setColorPlumas(String nuevo) {
		this.colorPlumas=nuevo;}
	
	public static int cantidadAves() {
		return listado.size();}
	
	public String movimiento() {
		return "volar";}
	
	public static Ave crearHalcon(String nombre, int edad, String genero) {
		Ave.halcones++;
		return new Ave(nombre,edad,"montanas",genero,"cafe glorioso");
		}
	
	public static Ave crearAguila(String nombre, int edad, String genero) {
		Ave.aguilas++;
		return new Ave(nombre,edad,"montanas",genero,"blanco y amarillo");}}

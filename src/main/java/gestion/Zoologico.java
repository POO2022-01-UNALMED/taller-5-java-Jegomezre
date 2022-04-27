package gestion;
import java.util.ArrayList;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas=new ArrayList<Zona>();
	
	public Zoologico() {}
	
	public Zoologico(String nombre, String ubicacion) {
		this.nombre=nombre;
		this.ubicacion=ubicacion;}
	
	public String getNombre() {
		return nombre;}
	
	public String getUbicacion() {
		return ubicacion;}
	 
	public ArrayList<Zona> getZona() {
		return zonas;}
	
	public void setNombre(String nuevo) {
		this.nombre=nuevo;}
	
	public void setUbicacion(String nuevo) {
		this.ubicacion=nuevo;}
	
	public void setZona(ArrayList<Zona> nuevo) {
		this.zonas=nuevo;}
	
	public void agregarZonas(Zona nueva){
		nueva.setZoologico(this);
		this.zonas.add(nueva);}
	
	public int cantidadTotalAnimales() {
		int respuesta = 0;
		for(int i = 0; i < zonas.size(); i++) {
			respuesta += zonas.get(i).cantidadAnimales();
		}
		return respuesta;}}

package gestion;
import zooAnimales.Animal;
import java.util.ArrayList;

public class Zona {
	private String nombre;
	private Zoologico zoo;
	private ArrayList<Animal> animales=new ArrayList<Animal>();
	
	public Zona() {	}
	
	public Zona(String nombre, Zoologico zoo) {
		this.nombre=nombre;
		this.zoo=zoo;}
	
	public String getNombre() {
		return this.nombre;}
	
	public Zoologico getZoo() {
		return this.zoo;}
	
	public ArrayList<Animal> getAnimales() {
		return animales;}
	
	public void setNombre(String nuevo) {
		this.nombre=nuevo;}
	
	public void setZoologico(Zoologico nuevo) {
		this.zoo=nuevo;}
	
	public void setAnimales(ArrayList<Animal> nuevo) {
		this.animales=nuevo;}
	
	public void agregarAnimales(Animal animal) {
		animal.setZona(this);
		this.animales.add(animal);}
	
	public int cantidadAnimales() {
		return animales.size();}}

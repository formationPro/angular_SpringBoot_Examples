package fr.formation.inti.entities;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class player {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_player ;
	private	String nom ;
	private String prenom ;
	private int num ;
	private float poids ;
	private String position ; 
	private float taille ;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_equipe")
	@JsonIgnore
	private Equipe equipe ;
	
	
	
	public player() {
		super();
		// TODO Auto-generated constructor stub
	}
	public player(int id_player, String nom, String prenom, int num, float poids, String position, float taille) {
		super();
		this.id_player = id_player;
		this.nom = nom;
		this.prenom = prenom;
		this.num = num;
		this.poids = poids;
		this.position = position;
		this.taille = taille;
	}
	public player(String nom, String prenom, int num, float poids, String position, float taille) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.num = num;
		this.poids = poids;
		this.position = position;
		this.taille = taille;
	}
	
	public player(int id_player, String nom, String prenom, int num, float poids, String position, float taille,
			Equipe equipe) {
		super();
		this.id_player = id_player;
		this.nom = nom;
		this.prenom = prenom;
		this.num = num;
		this.poids = poids;
		this.position = position;
		this.taille = taille;
		this.equipe = equipe;
	}
	public int getId_player() {
		return id_player;
	}
	public void setId_player(int id_player) {
		this.id_player = id_player;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public float getPoids() {
		return poids;
	}
	public void setPoids(float poids) {
		this.poids = poids;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public float getTaille() {
		return taille;
	}
	public void setTaille(float taille) {
		this.taille = taille;
	}
	public Equipe getEquipe() {
		return equipe;
	}
	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}
	
	

}

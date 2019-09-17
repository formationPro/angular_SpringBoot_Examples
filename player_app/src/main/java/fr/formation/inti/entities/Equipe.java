package fr.formation.inti.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Equipe {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_equipe ;
	private	String nom_equipe ; 
	@OneToMany(mappedBy = "equipe" , fetch=FetchType.LAZY)
	@JsonIgnore
	private List<player> joueurs ;
	private String pays;
	
	
	public Equipe() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Equipe(int id_equipe, String nom_equipe, List<player> joueurs, String pays) {
		super();
		this.id_equipe = id_equipe;
		this.nom_equipe = nom_equipe;
		this.joueurs = joueurs;
		this.pays = pays;
	}

	public int getId_equipe() {
		return id_equipe;
	}
	public void setId_equipe(int id_equipe) {
		this.id_equipe = id_equipe;
	}
	public String getNom_equipe() {
		return nom_equipe;
	}
	public void setNom_equipe(String nom_equipe) {
		this.nom_equipe = nom_equipe;
	}
	public List<player> getJoueurs() {
		return joueurs;
	}
	public void setJoueurs(List<player> joueurs) {
		this.joueurs = joueurs;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}
	
	
	
	

}

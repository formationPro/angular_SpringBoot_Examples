package fr.formation.inti.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.inti.entities.Equipe;

public interface IequipeRepository extends JpaRepository<Equipe, Integer> {

}

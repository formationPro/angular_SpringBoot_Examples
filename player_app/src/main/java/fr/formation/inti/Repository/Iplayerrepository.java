package fr.formation.inti.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.inti.entities.player;

public interface Iplayerrepository extends JpaRepository<player, Integer> {

}

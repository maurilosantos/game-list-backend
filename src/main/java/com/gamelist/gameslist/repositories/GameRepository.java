package com.gamelist.gameslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gamelist.gameslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}

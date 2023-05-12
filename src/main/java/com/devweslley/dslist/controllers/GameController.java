package com.devweslley.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devweslley.dslist.dto.GameMinDTO;
import com.devweslley.dslist.entities.Game;
import com.devweslley.dslist.services.GameService;
@RestController
@RequestMapping(value = "/games")
public class GameController {
	
	@Autowired
	public GameService gameService;
	@GetMapping
	public List<GameMinDTO> findAll(){
		List<GameMinDTO> result = gameService.findAll();
		return result;
	}

}

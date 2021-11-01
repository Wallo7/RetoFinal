package com.usa.ciclo3.retociclo3.controller;

import com.usa.ciclo3.retociclo3.model.Game;
import com.usa.ciclo3.retociclo3.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Game")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class GameController {
    @Autowired
    private GameService gameService;

    @GetMapping("/all")
    public List<Game> getAll(){
        return gameService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Game> getGame(@PathVariable("id")int id){
        return gameService.getGame(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    private Game save(@RequestBody Game game){
        return gameService.save(game);
    }
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Game update(@RequestBody Game game){
        return gameService.update(game);
    }
    @DeleteMapping("{id")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Boolean delete(@PathVariable("id")int id){
        return gameService.dalateGame(id);
    }
}

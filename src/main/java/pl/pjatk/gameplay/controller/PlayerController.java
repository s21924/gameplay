package pl.pjatk.gameplay.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.pjatk.gameplay.model.Player;
import pl.pjatk.gameplay.service.PlayerService;

import java.util.List;

@RestController
@RequestMapping("/player")
public class PlayerController {

    //localhost:8080/player
    // w przypadku wykorzystania powyższego adresu kontroler je przechwytuje i robi z nimi czary mary (czyli to co niżej)

    private PlayerService playerService;

    public PlayerController (PlayerService playerService) {
        this.playerService = playerService;
    }


    @GetMapping
    public ResponseEntity<List<Player>> findAll () {
        return ResponseEntity.ok(playerService.findAll());
    }


}

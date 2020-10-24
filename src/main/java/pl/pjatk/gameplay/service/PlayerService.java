package pl.pjatk.gameplay.service;

import org.springframework.stereotype.Service;
import pl.pjatk.gameplay.model.Player;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlayerService {
    // Player player - new Player () : Player bedzie dostępny dla dowolnej liczby klas (pozniej wpisana wartosc nadpisuje starsza). NIE ROBIC TAK


    public List<Player> findAll () {
        List<Player> players = new ArrayList<>();
        return List.of(
                new Player(1, "Player One", 10, 100),
                new Player(2, "Player Two", 10, 100)); // zwraca dwoch playerow

    }

}
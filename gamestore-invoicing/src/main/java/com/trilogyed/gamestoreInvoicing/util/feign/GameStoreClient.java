package com.trilogyed.gamestoreInvoicing.util.feign;

import com.trilogyed.gamestoreInvoicing.model.Console;
import com.trilogyed.gamestoreInvoicing.model.Game;
import com.trilogyed.gamestoreInvoicing.model.TShirt;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name="game-tore-catalog")
public interface GameStoreClient {

    //console
    @RequestMapping(value="/consoles",method = RequestMethod.GET)
    public List<Console> getAllConsoles();

    @RequestMapping(value="/consoles/{id}",method = RequestMethod.GET)
    public List<Console> getConsole(@PathVariable("id") long consoleId);

    @RequestMapping(value="/consoles",method = RequestMethod.POST)
    public List<Console> createConsole(Console console);

    @RequestMapping(value="/consoles/{id}",method = RequestMethod.PUT)
    public List<Console> updateConsole(Console console);

    @RequestMapping(value="/consoles/{id}",method = RequestMethod.DELETE)
    public List<Console> deleteConsole(@PathVariable("id") long consoleId);

    @RequestMapping(value = "/consoles/manufacturer/{manufacturer}", method = RequestMethod.GET)
    public List<Console> getConsoleByManufacturer(@PathVariable String manufacturer);


    //game

    @RequestMapping(value="/game",method = RequestMethod.GET)
    public List<Game> getAllGames();

    @RequestMapping(value="/game/{id}",method = RequestMethod.GET)
    public List<Game> getGame(@PathVariable("id") long gameId);

    @RequestMapping(value="/game",method = RequestMethod.POST)
    public List<Game> createGame(Game game);

    @RequestMapping(value="/game/{id}",method = RequestMethod.PUT)
    public List<Game> updateGame(Game game);

    @RequestMapping(value="/game/{id}",method = RequestMethod.DELETE)
    public List<Game> deleteGame(@PathVariable("id") long gameId);


    //Tshirt

    @RequestMapping(value="/t-Shirt",method = RequestMethod.GET)
    public List<TShirt> getAllShirts();

    @RequestMapping(value="/t-Shirt/{id}",method = RequestMethod.GET)
    public List<TShirt> getTShirt(@PathVariable("id") long tshirtId);

    @RequestMapping(value="/t-Shirt",method = RequestMethod.POST)
    public List<TShirt> createTShirt(TShirt tshirt);

    @RequestMapping(value="/t-Shirt/{id}",method = RequestMethod.PUT)
    public List<TShirt> updateTShirt(TShirt tshirt);

    @RequestMapping(value="/t-Shirt/{id}",method = RequestMethod.DELETE)
    public List<TShirt> deleteTShirt(@PathVariable("id") long tshirtId);


}

package com.trilogyed.gamestoreInvoicing.util.feign;

import com.trilogyed.gamestoreInvoicing.model.Console;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name="gamestore-catalog")
public interface GameStoreClient {

    //console
    @RequestMapping(value="/console",method = RequestMethod.GET)
    public List<Console> getAllConsoles();

    @RequestMapping(value="/console/{id}",method = RequestMethod.GET)
    public List<Console> getConsole(@PathVariable("id") long consoleId);

    @RequestMapping(value="/console",method = RequestMethod.POST)
    public List<Console> createConsole(Console console);

    @RequestMapping(value="/console/{id}",method = RequestMethod.PUT)
    public List<Console> updateConsole(Console console);

    @RequestMapping(value="/console/{id}",method = RequestMethod.DELETE)
    public List<Console> deleteConsole(@PathVariable("id") long consoleId);


    //game


    //Tshirt
}

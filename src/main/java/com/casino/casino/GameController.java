package com.casino.casino;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GameController {

    @GetMapping("/")
    public String Home(@RequestParam(value = "tall1" , required = false) String tall1,
                       @RequestParam(value = "tall2" , required = false) String tall2,
//                       @RequestParam(value = "tall4" , required = false) String tall4,
                       @RequestParam(value = "mathType" , required = false) String mathType, Model model){


        if(tall1!= null){
            switch (mathType){
                case "pluss":

                    int ta = Integer.parseInt(tall1);
                    int ta2 = Integer.parseInt(tall2);

                    game game = new game();
                    game.startGame();
                    game.setBetAmount(ta2);
                    game.setNumber(ta);

                    if(game.getRouletteNum() == game.getNumber()){
                        int total = (game.getBetAmount() *36) + game.getTotal();
                        model.addAttribute("tree",total);
                        game.setTotal(total);
                        System.out.println(total);
                    }else{
                        int total2 = game.getTotal() - game.getBetAmount();
                        model.addAttribute("four" , total2);
                        game.setTotal(total2);
                        System.out.println(total2);
                    }
                    game game1 = new game();
                    int game3 = game.getRouletteNum();
                    int game4 = game.getNumber();
                    model.addAttribute("one",game3);
                    model.addAttribute("two" , game4);
                    break;
                default:
                    break;
            }
        }



        return "index.html";

    }

}

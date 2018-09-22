package pl.akademiakodu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GifController {

    @RequestMapping("/")
    //@ResponseBody //jak nie ma modelu wiec wyswietlo to co jest tu
    public String listGifts(){
        return "home";
    }
}

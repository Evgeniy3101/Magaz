package com.example.Magazin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

public class Renom {

    @Controller
    public static class Ctran {
        @GetMapping( "/Renome")

        public String Renome(){

            return "Renome";
        }
    }


}

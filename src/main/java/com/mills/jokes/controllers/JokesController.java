package com.mills.jokes.controllers;

import com.mills.jokes.services.JokeService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by rachelmills on 23/6/19.
 */
public class JokesController {

    private JokeService jokeService;

    public JokesController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping("/jokes")
    public String getBooks(Model model) {
        model.addAttribute("joke", jokeService.getJoke());
        return "chucknorris";  //Thymeleaf view
    }
}

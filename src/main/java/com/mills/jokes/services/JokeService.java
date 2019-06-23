package com.mills.jokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/**
 * Created by rachelmills on 23/6/19.
 */
@Service
public class JokeService {

    private guru.springframework.norris.chuck.ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeService(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}

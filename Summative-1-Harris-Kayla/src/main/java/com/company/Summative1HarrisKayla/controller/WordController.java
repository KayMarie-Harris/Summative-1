package com.company.Summative1HarrisKayla.controller;

import com.company.Summative1HarrisKayla.models.Definition;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class WordController
{
    private List<Definition> wordList;
    private static int idCounter = 0;
    WordController()
    {
        wordList = new ArrayList<>();

        wordList.add(new Definition("Efficacious", "(of something inanimate or abstract) successful in producing a desired or intended result; effective.", idCounter++));
        wordList.add(new Definition("Clinomania", "An excessive desire to remain in bed; morbid sleepiness.", idCounter++));
        wordList.add(new Definition("Cantankerous", "bad-tempered, argumentative, and uncooperative.", idCounter++));
        wordList.add(new Definition("Ultracrepidarian", "expressing opinions on matters outside the scope of one's knowledge or expertise.", idCounter++));
        wordList.add(new Definition("Sprezzatura", "studied carelessness, especially as a characteristic quality or style of art or literature.", idCounter++));
        wordList.add(new Definition("Cryptomnesia", "the appearance in consciousness of memory images which are not recognized as such but which appear as original creations.", idCounter++));
        wordList.add(new Definition("Glossolalia", "the phenomenon of (apparently) speaking in an unknown language, especially in religious worship.", idCounter++));
        wordList.add(new Definition("Pauciloquent", "using few words in speech or conversation.", idCounter++));
        wordList.add(new Definition("Pogonotrophy", "The growing or cultivation of a beard.", idCounter++));
        wordList.add(new Definition("Schadenfreude", "pleasure derived by someone from another person's misfortune.", idCounter++));
    }

    @RequestMapping(value = "/word", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Definition getRandomWord()
    {
        Definition retDefinition= null;

        // generating a random number to be used as an index for wordList
        int min = 0;
        int max = wordList.size() - 1;
        int randomIndex = (int)Math.floor(Math.random()*(max-min+1)+min); // https://www.educative.io/answers/how-to-generate-random-numbers-in-java
        // retValue set to Word from wordList with random index
        retDefinition = wordList.get(randomIndex);
        return  retDefinition;
    }

}

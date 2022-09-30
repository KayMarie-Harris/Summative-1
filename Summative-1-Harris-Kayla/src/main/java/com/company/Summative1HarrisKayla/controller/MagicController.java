package com.company.Summative1HarrisKayla.controller;

import com.company.Summative1HarrisKayla.models.Answer;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MagicController
{
    private List<String> magicResponseList;
    private static int idCounter = 0;

    MagicController()
    {
        magicResponseList = new ArrayList<>();

        magicResponseList.add("I think... Yes");
        magicResponseList.add("Definitely");
        magicResponseList.add("Probably not");
        magicResponseList.add("Mayhaps");
        magicResponseList.add("No");
        magicResponseList.add("Ask again later");
    }


    @RequestMapping(value = "/magic", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.OK)
    public Answer createAnswer(@RequestBody Answer question)
    {
        question.setId(idCounter++);

        // generating a random number to be used as an index for magicResponseList
        int min = 0;
        int max = 5;
        int randomIndex = (int)Math.floor(Math.random()*(max-min+1)+min); // https://www.educative.io/answers/how-to-generate-random-numbers-in-java

        // answer set to value at random index of list magicResponseList
        question.setAnswer(magicResponseList.get(randomIndex));

        return question;
    }
}

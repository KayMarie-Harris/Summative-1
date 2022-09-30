package com.company.Summative1HarrisKayla.controller;

import com.company.Summative1HarrisKayla.models.Quote;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class QuoteController
{
    private List<Quote> quoteList;
    private static int idCounter = 0;

    QuoteController()
    {
        quoteList = new ArrayList<>();

        quoteList.add(new Quote("Todd Beamer","Let's Roll.",idCounter++));
        quoteList.add(new Quote("Denzel Washington","You pray for rain, you guys deal with the mud too.",idCounter++));
        quoteList.add(new Quote("Steve Jobs","Your time is limited, don't waste it living someone else's life.",idCounter++));
        quoteList.add(new Quote("Eleanor Roosevelt","Well behaved women rarely make history.",idCounter++));
        quoteList.add(new Quote("Will Rogers","Even if you are on the right track, you'll get run over if you just sit there.",idCounter++));
        quoteList.add(new Quote("Bill Murray","Knowledge is like underwear. It is useful to have it, but not necessary to show it off.",idCounter++));
        quoteList.add(new Quote("H. Jackson Brown Junior","Remember that everyone you meet is afraid of something, loves something, and has lost something.",idCounter++));
        quoteList.add(new Quote("Carl Jung","The shoe that fits one person pinches another; there is no recipe for living that suits all cases.",idCounter++));
        quoteList.add(new Quote("G.K. Nielson","Successful people are not gifted; they just work hard, then succeed on purpose.",idCounter++));
        quoteList.add(new Quote("Pablo Picasso","I am always doing that which I cannot do, in order that I may learn how to do it.",idCounter++));

    }

    @RequestMapping(value = "/quote", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Quote getRandomQuote()
    {
        Quote retQuote = null;
        // generating a random number to be used as an index for quoteList
        int min = 0;
        int max = quoteList.size() - 1;
        int randomIndex = (int)Math.floor(Math.random()*(max-min+1)+min); // https://www.educative.io/answers/how-to-generate-random-numbers-in-java
        // retValue set to Quote from quoteList with random index
        retQuote = quoteList.get(randomIndex);

        return retQuote;
    }
}

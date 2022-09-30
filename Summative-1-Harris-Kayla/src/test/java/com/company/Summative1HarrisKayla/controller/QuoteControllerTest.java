package com.company.Summative1HarrisKayla.controller;

import com.company.Summative1HarrisKayla.models.Quote;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@RunWith(SpringRunner.class)
@WebMvcTest(QuoteController.class)
public class QuoteControllerTest
{
    //Wiring in the MockMVC object
    @Autowired
    private MockMvc mockMVC;


    //ObjectMapper used to convert Java objects to JSON and vice versa
    private ObjectMapper mapper = new ObjectMapper();

    // A list of Quotes for testing purposes
    private List<Quote> quoteList;

    @Before
    public void setUp()
    {

    }

    // Testing GET /quote
    @Test
    public void shouldReturnRandomQuote1() throws Exception
    {
        //ARRANGE
            // No Contents

        //Convert Java object to JSON (and vice versa)
        String outputJson = mapper.writeValueAsString(quoteList);

        //ACT
        mockMVC.perform(get("/quote")) // GET Request
                .andDo(print())         // Prints Results
                .andExpect(status().isOk()); // Asserts status code is OK

    }

    @Test
    public void shouldReturnRandomQuote2() throws Exception
    {
        //ARRANGE
        // No Contents

        //Convert Java object to JSON (and vice versa)
        String outputJson = mapper.writeValueAsString(quoteList);

        //ACT
        mockMVC.perform(get("/quote")) // GET Request
                .andDo(print())         // Prints Results
                .andExpect(status().isOk()); // Asserts status code is OK

    }


    @Test
    public void shouldReturnRandomQuote3() throws Exception
    {
        //ARRANGE
        // No Contents

        //Convert Java object to JSON (and vice versa)
        String outputJson = mapper.writeValueAsString(quoteList);

        //ACT
        mockMVC.perform(get("/quote")) // GET Request
                .andDo(print())         // Prints Results
                .andExpect(status().isOk()); // Asserts status code is OK

    }


    @Test
    public void shouldReturnRandomQuote4() throws Exception
    {
        //ARRANGE
        // No Contents

        //Convert Java object to JSON (and vice versa)
        String outputJson = mapper.writeValueAsString(quoteList);

        //ACT
        mockMVC.perform(get("/quote")) // GET Request
                .andDo(print())         // Prints Results
                .andExpect(status().isOk()); // Asserts status code is OK

    }
}
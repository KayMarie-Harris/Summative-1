package com.company.Summative1HarrisKayla.controller;

import com.company.Summative1HarrisKayla.models.Definition;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@RunWith(SpringRunner.class)
@WebMvcTest(WordController.class)
public class WordControllerTest
{
    //Wiring in MockMVC object
    @Autowired
    private MockMvc mockMvc;

    private ObjectMapper mapper = new ObjectMapper();

    // List of Words for testing purposes
    private List<Definition> wordList;

    // Testing GET /word
    @Test
    public void shouldReturnRandomWord1() throws Exception
    {
        // ARRANGE
            // No Contents

        // Convert Java Object to JSON (and vice versa)
        String outputJson = mapper.writeValueAsString(wordList);

        // ACT
        mockMvc.perform(get("/word")) // GET Request
                .andDo(print()) // Printing results
                .andExpect(status().isOk()); // Asserting status is OK
    }

    @Test
    public void shouldReturnRandomWord2() throws Exception
    {
        // ARRANGE
        // No Contents

        // Convert Java Object to JSON (and vice versa)
        String outputJson = mapper.writeValueAsString(wordList);

        // ACT
        mockMvc.perform(get("/word")) // GET Request
                .andDo(print()) // Printing results
                .andExpect(status().isOk()); // Asserting status is OK
    }

    @Test
    public void shouldReturnRandomWord3() throws Exception
    {
        // ARRANGE
        // No Contents

        // Convert Java Object to JSON (and vice versa)
        String outputJson = mapper.writeValueAsString(wordList);

        // ACT
        mockMvc.perform(get("/word")) // GET Request
                .andDo(print()) // Printing results
                .andExpect(status().isOk()); // Asserting status is OK
    }

    @Test
    public void shouldReturnRandomWord4() throws Exception
    {
        // ARRANGE
        // No Contents

        // Convert Java Object to JSON (and vice versa)
        String outputJson = mapper.writeValueAsString(wordList);

        // ACT
        mockMvc.perform(get("/word")) // GET Request
                .andDo(print()) // Printing results
                .andExpect(status().isOk()); // Asserting status is OK
    }
}
package com.company.Summative1HarrisKayla.controller;

import com.company.Summative1HarrisKayla.models.Answer;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(MagicController.class)
public class MagicControllerTest
{
    @Autowired
    private MockMvc mockMvc;

    private ObjectMapper mapper = new ObjectMapper();


    // List of Magic for testing purposes
   // private List<Magic> magicList;
    // List of responses for testing purposes
    private List<String> responseList;

    // Testing POST /magic
    @Test
    public void shouldCreateAnswerWithRandomResponse1() throws Exception
    {
        // ARRANGE
        Answer inputQuestion = new Answer("Will today be a good day?");

        // Convert Java object to JSON (and vice versa)
        String InputJson = mapper.writeValueAsString(inputQuestion);

        // ACT
        mockMvc.perform(
                post("/magic") // POST Request
                        .content(InputJson) // Set RequestBody
                        .contentType(MediaType.APPLICATION_JSON) // Tells server in JSON format
                )
                .andDo(print()) // Prints Results
                .andExpect(status().isOk());
    }

    @Test
    public void shouldCreateAnswerWithRandomResponse2() throws Exception
    {
        // ARRANGE
        Answer inputQuestion = new Answer("Will I wake up rich?");


        // Convert Java object to JSON (and vice versa)
        String InputJson = mapper.writeValueAsString(inputQuestion);


        // ACT
        mockMvc.perform(
                        post("/magic") // POST Request
                                .content(InputJson) // Set RequestBody
                                .contentType(MediaType.APPLICATION_JSON) // Tells server in JSON format
                )
                .andDo(print()) // Prints Results
                .andExpect(status().isOk());
    }

    @Test
    public void shouldCreateAnswerWithRandomResponse3() throws Exception
    {
        // ARRANGE
        Answer inputQuestion = new Answer("Will my dog talk?");

        // Convert Java object to JSON (and vice versa)
        String InputJson = mapper.writeValueAsString(inputQuestion);


        // ACT
        mockMvc.perform(
                        post("/magic") // POST Request
                                .content(InputJson) // Set RequestBody
                                .contentType(MediaType.APPLICATION_JSON) // Tells server in JSON format
                )
                .andDo(print()) // Prints Results
                .andExpect(status().isOk());
    }
}
package com.ojt.green.eatgo.interfaces;

import org.hamcrest.core.StringContains;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(RestaurantController.class)
class RestaurantControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void list() throws Exception {
        mvc.perform(get("/restaurants"))
        .andExpect(status().isOk())
        .andExpect(content().string(
                containsString("\"name\":\"Green\"")
        ))
        .andExpect(content().string(
                containsString("\"id\":1004")
        ));
    }

    @Test
    public void detail() throws Exception {
        mvc.perform(get("/restaurants/1004"))
                .andExpect(status().isOk())
                .andExpect(content().string(
                        StringContains.containsString("\"id\":1004")
                ))
                .andExpect(content().string(
                        StringContains.containsString("\"name\":\"Green\"")
                ));
        mvc.perform(get("/restaurants/1005"))
                .andExpect(status().isOk())
                .andExpect(content().string(
                        StringContains.containsString("\"id\":1005")
                ))
                .andExpect(content().string(
                        StringContains.containsString("\"name\":\"Shin-jun\"")
                ));
    }

}
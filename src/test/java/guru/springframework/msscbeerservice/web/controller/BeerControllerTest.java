package guru.springframework.msscbeerservice.web.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import guru.springframework.msscbeerservice.web.model.BeerDto;
import guru.springframework.msscbeerservice.web.model.BeerStyleEnum;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.math.BigDecimal;
import java.util.UUID;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(BeerController.class)
class BeerControllerTest {

    @Autowired
    MockMvc  mockMvc;

    @Autowired
    ObjectMapper objectMapper;

    @Test
    void getBeerById() throws Exception {
        mockMvc.perform(
                get("/api/v1/beer/" + UUID.randomUUID().toString()).accept(MediaType.APPLICATION_JSON)
        ).andExpect(status().isOk());
    }

    @Test
    void saveNewBeer() throws Exception {
//        BeerDto beerDto = BeerDto.builder().build(); // this is failing due to constraints added
        String beerDtoJson = objectMapper.writeValueAsString(getValidDto());
        mockMvc.perform(
                post("/api/v1/beer/")
                .contentType(MediaType.APPLICATION_JSON)
                .content(beerDtoJson)
        ).andExpect(status().isCreated());
    }

    @Test
    void updateBeer() throws Exception {
//        BeerDto beerDto = BeerDto.builder().build(); // this is failing due to constraints
        String beerDtoJson = objectMapper.writeValueAsString(getValidDto());
        mockMvc.perform(put("/api/v1/beer/" + UUID.randomUUID().toString())
                .contentType(MediaType.APPLICATION_JSON)
                .content(beerDtoJson)
        ).andExpect(status().isNoContent());
    }

    BeerDto getValidDto() {
        return BeerDto
                .builder()
                .beerName("New beer")
                .beerStyle(BeerStyleEnum.ALE)
                .price(new BigDecimal("1.99"))
                .upc(12345678913L)
                .build();
    }
}
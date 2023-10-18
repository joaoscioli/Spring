package tacos;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import tacos.DesignTacoController;

@SpringBootTest
@AutoConfigureMockMvc
public class DesignTacoControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testShowDesignForm() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/design"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.view().name("design"))
                .andExpect(MockMvcResultMatchers.model().attributeExists("taco"))
                .andExpect(MockMvcResultMatchers.model().attributeExists("tacoOrder"))
                .andExpect(MockMvcResultMatchers.model().attributeExists("wrap"))
                .andExpect(MockMvcResultMatchers.model().attributeExists("protein"))
                .andExpect(MockMvcResultMatchers.model().attributeExists("veggies"))
                .andExpect(MockMvcResultMatchers.model().attributeExists("cheese"))
                .andExpect(MockMvcResultMatchers.model().attributeExists("sauce"));
    }
}

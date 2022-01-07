package coder.navidad.gestioncoder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import coder.navidad.gestioncoder.repositories.Coder;
import coder.navidad.gestioncoder.repositories.CoderRepository;


import static org.hamcrest.Matchers.hasItem;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class ApplicationTests {
    @Autowired
    MockMvc mockMvc;

    @Test
    void loadsTheHomePage() throws Exception {
        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(view().name("home"));
    }
    @Autowired
    CoderRepository coderRepository;

    @Test
    void returnsTheExistingBooks() throws Exception {

        Coder coder = coderRepository.save(new Coder("Carmen'", "J.K. Rowling", "fantasy"));

        mockMvc.perform(get("/coders"))
                .andExpect(status().isOk())
                .andExpect(view().name("coders/all"))
                .andExpect(model().attribute("coders", hasItem(coder)));
    }
    @BeforeEach
    void setUp() {
        coderRepository.deleteAll();
    }
}

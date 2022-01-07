package coder.navidad.gestioncoder.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class SampleDataLoader {
    private  CoderRepository coderRepository;

    @Autowired
    public SampleDataLoader(CoderRepository coderRepository) {
        this.coderRepository = coderRepository;
    }

    @PostConstruct
    public void loadSampleData() {
        coderRepository.saveAll(List.of(
                new Coder("Carmen", "Gamarra", "49","Lope de Vega 62 Barcelona","argentina","Coder", "FemTech2"),
                new Coder("Carolina", "Ocaño", "37", "Cataluña 49 Barcelona", "mexicana", "coder","FemTech1"),
                new Coder("Carlota", "Rodriguez", "22", "San Luis 22 Barcelona", "española", "coder","FemTech1"),
                new Coder("Rafaela", "Nadal", "35", "España 22 Mallorca", "española", "coder","FemTech2"),
                new Coder("Martina", "Del Potro", "29", "San Miguel 25 Junin", "argentina", "coder","FemTech1"),
                new Coder("Andrea", "Murray", "45", "Berlin 115 Inglaterra", "inglesa", "coder","FemTech2")
        ));
    }
}



package inserimento;

import it.devlec.applicazionerestspring.model.Prodotto;
import it.devlec.applicazionerestspring.persistenza.ProdottiRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class RegistrazioneProdotti {
    private static Logger logger = LoggerFactory.getLogger(RegistrazioneProdotti.class);
    @Bean
    CommandLineRunner inserisciProdotti(ProdottiRepository repository){
        return args -> {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

            Prodotto p1 = new Prodotto(null, "Nike", "Palla",
                    sdf.parse("02-02-2020")/* dataDiProduzione */,
                    sdf.parse("03-03-2027")/* dataDiScadenza */,
                    sdf.parse("19-12-2021")/* dataDiPrenotazione */,
                    sdf.parse("30-07-2023")/* dataDiAcquisto */,
                    14.99, "euro", true, 123, 2.1F, "11111", "TB537");

            Prodotto p2 = new Prodotto(null, "Fanta", "Aranciata",
                    sdf.parse("14-01-2022")/* dataDiProduzione */,
                    sdf.parse("01-09-2029")/* dataDiScadenza */,
                    sdf.parse("12-02-2020")/* dataDiPrenotazione */,
                    sdf.parse("23-03-2022")/* dataDiAcquisto */,
                    29.99, "euro", true, 456, 2.2F, "22222", "AP912");

            Prodotto p3 = new Prodotto(null, "Jordan", "Scarpe",
                    sdf.parse("22-11-2021")/* dataDiProduzione */,
                    sdf.parse("12-06-2026")/* dataDiScadenza */,
                    sdf.parse("24-10-2023")/* dataDiPrenotazione */,
                    sdf.parse("29-03-2024")/* dataDiAcquisto */,
                    17.99, "euro", true, 789, 2.3F, "33333", "DL274");

            Prodotto p4 = new Prodotto(null, "Parmareggio", "Formaggio grattugiato",
                    sdf.parse("16-20-2022")/* dataDiProduzione */,
                    sdf.parse("01-09-2028")/* dataDiScadenza */,
                    sdf.parse("06-06-2023")/* dataDiPrenotazione */,
                    sdf.parse("02-03-2024")/* dataDiAcquisto */,
                    23.99, "euro", true, 890, 2.4F, "44444", "UM290");

            Prodotto p5 = new Prodotto(null, "Valfrutta", "Succo",
                    sdf.parse("02-02-2022")/* dataDiProduzione */,
                    sdf.parse("05-02-2028")/* dataDiScadenza */,
                    sdf.parse("01-09-2025")/* dataDiPrenotazione */,
                    sdf.parse("01-12-2026")/* dataDiAcquisto */,
                    10.99, "euro", true, 900, 2.5F, "55555", "HY334");




            List<Prodotto> prodotti = new ArrayList<>(List.of(p1,p2,p3,p4,p5));
            repository.saveAll(prodotti);
        };
    }
}

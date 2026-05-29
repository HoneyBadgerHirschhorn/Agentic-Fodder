package guitarshop;

import guitarshop.model.Guitar;
import guitarshop.repository.GuitarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner seedData(GuitarRepository repo) {
        return args -> {
            // 5 Acoustic Guitars
            repo.save(new Guitar(
                "Martin", "D-28", "D28-STD",
                "ACOUSTIC",
                "Sitka Spruce", "East Indian Rosewood", "East Indian Rosewood",
                2999.00,
                "The Martin D-28 is a legend in acoustic guitars. Its Sitka spruce top and East Indian rosewood back and sides produce a rich, powerful tone with excellent projection. A staple for fingerpickers and strummers alike.",
                10
            ));
            repo.save(new Guitar(
                "Taylor", "814ce", "814CE-V2",
                "ACOUSTIC",
                "Sitka Spruce", "Indian Rosewood", "Indian Rosewood",
                3499.00,
                "The Taylor 814ce features a grand auditorium body with premium tonewoods. The Sitka spruce top and Indian rosewood back and sides deliver balanced tone with sparkling highs and a warm mid-range. Includes ES2 electronics.",
                10
            ));
            repo.save(new Guitar(
                "Gibson", "J-45", "J45-STD",
                "ACOUSTIC",
                "Sitka Spruce", "Mahogany", "Mahogany",
                2499.00,
                "Gibsons J-45 is known as the working mans guitar. Its Sitka spruce top and solid mahogany back and sides provide a warm, full-bodied sound perfect for singer-songwriters. A true American classic since 1942.",
                10
            ));
            repo.save(new Guitar(
                "Yamaha", "LL16", "LL16-ARE",
                "ACOUSTIC",
                "Engelmann Spruce", "Rosewood", "Rosewood",
                999.00,
                "The Yamaha LL16 ARE features A.R.E. technology that replicates the tonal qualities of an aged top. The Engelmann spruce top and rosewood back and sides offer a mature, resonant tone at an accessible price point.",
                10
            ));
            repo.save(new Guitar(
                "Seagull", "S6 Original", "S6-ORIG",
                "ACOUSTIC",
                "Cedar", "Wild Cherry", "Wild Cherry",
                499.00,
                "The Seagull S6 Original is a Canadian-made acoustic with a pressure-tested cedar top and wild cherry back and sides. It offers a warm, articulate tone that belies its affordable price, making it ideal for beginners and intermediate players.",
                10
            ));

            // 5 Electric Guitars
            repo.save(new Guitar(
                "Fender", "American Professional II Stratocaster", "STRAT-AMPII",
                "ELECTRIC",
                "Alder", "Alder", "Alder",
                1649.00,
                "The Fender American Professional II Stratocaster is the pinnacle of the Strat lineage. Its alder body, maple neck, and V-Mod II single-coil pickups deliver the classic Strat tone with modern playability improvements.",
                10
            ));
            repo.save(new Guitar(
                "Gibson", "Les Paul Standard 60s", "LP-STD60",
                "ELECTRIC",
                "Maple", "Mahogany", "Mahogany",
                2799.00,
                "The Gibson Les Paul Standard 60s captures the soul of the early 1960s Les Paul. Its mahogany body with a maple cap, '60s-style slim-taper neck, and Burstbucker pickups produce the warm, thick tones that define rock music.",
                10
            ));
            repo.save(new Guitar(
                "PRS", "SE Custom 24", "SECU24-BL",
                "ELECTRIC",
                "Maple", "Mahogany", "Mahogany",
                849.00,
                "The PRS SE Custom 24 is a versatile double-cutaway electric with a maple top and mahogany back. The 85/15 S pickups and coil-tap switching give players a wide tonal palette from clean jazz tones to full rock distortion.",
                10
            ));
            repo.save(new Guitar(
                "Gretsch", "G2622 Streamliner", "G2622-BG",
                "ELECTRIC",
                "Nato", "Nato", "Nato",
                449.00,
                "The Gretsch G2622 Streamliner delivers authentic hollow-body Gretsch style at an entry-level price. Its nato body and BroadTron pickups produce the warm, twangy tones associated with rockabilly, jazz, and vintage rock and roll.",
                10
            ));
            repo.save(new Guitar(
                "Ibanez", "RG550", "RG550-RF",
                "ELECTRIC",
                "Basswood", "Basswood", "Basswood",
                999.00,
                "The Ibanez RG550 is the quintessential shredder guitar. Its lightweight basswood body, Wizard neck profile, and Edge tremolo system make it the weapon of choice for speed and technical precision. A staple of the metal and fusion genres.",
                10
            ));
        };
    }
}

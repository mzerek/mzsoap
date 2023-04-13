package com.mzerek.mzsoap.country;

import com.mzerek.mzsoap.gen.Country;
import com.mzerek.mzsoap.gen.Currency;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

//import com.mzerek.mzsoap.country;
@Component
public class CountryRepository {

    private static final Map<String, Country> countries = new HashMap<>();

    @PostConstruct
    public void initData() {
        Country spain = new Country();
        spain.setName("Spain");
        spain.setCapital("Madrit");
        spain.setCurrency(Currency.EUR);
        spain.setPopulation(47604314);

        countries.put(spain.getName(), spain);

        Country poland = new Country();
        poland.setName("Poland");
        poland.setCapital("Warsaw");
        poland.setCurrency(Currency.PLN);
        poland.setPopulation(3181234);

        countries.put(poland.getName(), poland);

        Country uk = new Country();
        uk.setName("United Kingdom");
        uk.setCapital("London");
        uk.setCurrency(Currency.GBP);
        uk.setPopulation(63135452);

        countries.put(uk.getName(), uk);

    }

    public Country findCountry(String name) {
        return countries.get(name);
    }
}

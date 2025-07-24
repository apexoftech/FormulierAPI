package sr.unasat.form.api;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

import java.util.Map;
import java.util.HashMap;

/* onze applicatie path start met API dus na je locolhost zet je eerst die API daarna je methode path die je wilt uitvoeren
vb je api zet je / (methode van get path is vb getall (http://localhost:8080/api/getall)) */

@ApplicationPath("/api")
public class ApplicationConfig extends Application {

    /*(alle properties te gebruiken) methode om die eigenschappen op te halen we gaan het overiden van de superclas
    zodat we het kunnen aanpassen in de subklasse*/


    /* goed aangeven  in die package waar jerse moet scannen voor die controllers ("sr.unasat.form.api.controllers") !!!!
     refereer goed naar die package waar je controllers voorkomt */

    // en je controllers zijn niets anders dan je endpionts

    @Override
    public Map<String, Object> getProperties() {
        Map<String, Object> properties = new HashMap<String, Object>();
        properties.put("jersey.config.server.provider.packages", "sr.unasat.form.api.controllers");
        return properties;
    }



}

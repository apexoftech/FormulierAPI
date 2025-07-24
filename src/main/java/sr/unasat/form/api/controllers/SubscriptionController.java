package sr.unasat.form.api.controllers;

import java.util.ArrayList;
import java.util.List;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import sr.unasat.form.api.dto.SubscriptionDTO;

/*dus nadat je API aangeeft zet je / SUBSCRIPTION zoals dit http://localhost:8080/api/subscriptions
zodat je toegang kan krijgen tot die methodes die in deze path voorkomen */
@Path("/subscriptions")
public class SubscriptionController {

    private List<SubscriptionDTO> subscriptionList = new ArrayList<>();

    /* toegang to die methode GET is zo http://localhost:8080/api/subscriptions/all
    eerst die API aangeven dan due Path van SUBSCRIPTION en dan die path van je methode in subscription ALL*/

    // die GET zal jason data produceren
    @Path("/all")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<SubscriptionDTO> findAll() {
        return subscriptionList;
    }

        /* toegang to die methode GET is zo http://localhost:8080/api/subscriptions/add
    eerst die API aangeven dan due Path van SUBSCRIPTION en dan die path van je methode in subscription ALL*/


    /* bij die POST heb je eerst een consumes want deze methode verwacht eerst JASON
    data en hij stuurt PORODUCES jasion data terug */

    // we verwachten een Subscription DTO van je front end daarom zetten we het in de parameter
    // waarom zetten we die naam van die DTO classe als datatype in onzze methode  ??
    @Path("/add")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public SubscriptionDTO add(SubscriptionDTO subscription) {
        subscriptionList.add(subscription);
        return subscription;
    }



}

package za.co.sb.qp.pricing.boundary;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("price")
@RequestScoped
public class PricingResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getCoffeeOfTheDayPrice() {
        return "R 9.90";
    }
}

package com.jaxrs.resource;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/product")
public class ProductResource {

    @GET
    @Path("/info/{product}")
    @Produces(MediaType.APPLICATION_JSON) // http://localhost:8080/api/product/info/laptop
    public Response getProductInformation(@PathParam("product") String product) {
        //this method get the information of the product
        return Response.ok("API for getting information for product " + product).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON) // http://localhost:8080/api/product
    public Response AddNewProduct() {
        //for simplicity, we just return a string
        return Response.ok("Successfully added product via POST request").build();
    }

    @PUT
    @Produces(MediaType.APPLICATION_JSON) // http://localhost:8080/api/product
    public Response updateProduct() {
        return Response.ok("Updated product Info").build();
    }

    @DELETE
    @Path("/{product}")
    @Produces(MediaType.TEXT_PLAIN) // http://localhost:8080/api/product/{product}
    public Response deleteProduct(@PathParam("product") String product) {
        return Response.ok("Successfully deleted product " + product).build();
    }

    @DELETE
    @Produces(MediaType.TEXT_PLAIN) // http://localhost:8080/api/product?product=Jockey
    public Response deleteProductByQueryParam(@QueryParam("product") String product) {
        return Response.ok("Successfully deleted product " + product).build();
    }
}


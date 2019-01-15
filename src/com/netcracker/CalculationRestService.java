package com.netcracker;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/calc")
public class CalculationRestService {
    @GET
    @Path("add/{a}/{b}")
    @Produces(MediaType.TEXT_HTML)
    public String add(@PathParam("a") int a, @PathParam("b") int b) {
        int c = a + b;
        return "<html>"+
                "<body><h1>"+"Calculation : "+ a +
                 " + " + b + " = " + c + "</h1></body>"+
                "</html>";
    }

    @GET
    @Path("sub/{a}/{b}")
    @Produces(MediaType.TEXT_HTML)
    public String subtraction(@PathParam("a") int a, @PathParam("b") int b) {
        int c = a - b;
        return "<html>"+
                "<body><h1>"+"Calculation : "+ a +
                " - " + b + " = " + c + "</h1></body>"+
                "</html>";
    }

    @GET
    @Path("mult/{a}/{b}")
    @Produces(MediaType.TEXT_HTML)
    public String multiply(@PathParam("a") int a, @PathParam("b") int b) {
        int c = a * b;
        return "<html>"+
                "<body><h1>"+"Calculation : "+ a +
                " * " + b + " = " + c + "</h1></body>"+
                "</html>";
    }

    @GET
    @Path("div/{a}/{b}")
    @Produces(MediaType.TEXT_HTML)
    public String division(@PathParam("a") int a, @PathParam("b") int b) {
        int c = a / b;
        return "<html>"+
                "<body><h1>"+"Calculation : "+ a +
                " / " + b + " = " + c + "</h1></body>"+
                "</html>";
    }

}

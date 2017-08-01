package com.jrsoft.poc.mongodb;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.Date;

@Path("/message")
@Produces("application/json")
@Stateless
public class MessageResource {

    @EJB
    MessaggeRepository messaggeRepository;

    @GET
    public void aaaa() {
        for (long i = 0; i < 10000; i++) {
            messaggeRepository.create(new Message("aaa", new Date(), "bbbb", "cccc"));
        }
    }
}

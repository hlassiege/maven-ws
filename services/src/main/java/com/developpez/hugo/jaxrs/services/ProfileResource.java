package com.developpez.hugo.jaxrs.services;

import com.developpez.hugo.model.Profile;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import java.util.Date;

@Path("/profile")
public class ProfileResource {

    @POST
    public Profile create(Profile profile) {
        Date now = new Date();
        return profile.withCreationDate(now).withModificationDate(now);
    }
}


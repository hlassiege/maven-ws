/**
 * Egencia
 */
package com.developpez.hugo.ws.services.impl;

import com.developpez.hugo.model.Profile;
import com.developpez.hugo.ws.services.ProfileResource;

import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.Date;

@WebService(endpointInterface = "com.developpez.hugo.ws.services.ProfileResource")
public class DefaultProfileResource implements ProfileResource {

    @Override
    public Profile create(@WebParam Profile profile) {

        // imagine my profile was persisted here...
        // for the sake of the demo we just return it with its date

        Date now = new Date();
        return profile.withCreationDate(now).withModificationDate(now);
    }
}

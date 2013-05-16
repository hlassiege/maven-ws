package com.developpez.hugo.ws.services;


import com.developpez.hugo.model.Profile;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;


@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, parameterStyle = SOAPBinding.ParameterStyle.WRAPPED, use = SOAPBinding.Use.LITERAL)
public interface ProfileResource {
    Profile create(@WebParam Profile profile);
}

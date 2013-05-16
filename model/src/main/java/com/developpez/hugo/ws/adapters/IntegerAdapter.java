
package com.developpez.hugo.ws.adapters;


public class IntegerAdapter
{
    public static Integer unmarshal(String value) {
        return (javax.xml.bind.DatatypeConverter.parseInt(value));
    }

    public static String marshal(Integer value) {
        if (value == null) {
            return null;
        }
        return (javax.xml.bind.DatatypeConverter.printInt(value));
    }
}



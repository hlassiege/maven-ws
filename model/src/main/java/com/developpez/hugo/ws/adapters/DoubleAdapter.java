package com.developpez.hugo.ws.adapters;


public class DoubleAdapter
{
    public static Double unmarshal(String value) {
        return (javax.xml.bind.DatatypeConverter.parseDouble(value));
    }

    public static String marshal(Double value) {
        if (value == null) {
            return null;
        }
        return (javax.xml.bind.DatatypeConverter.printDouble(value));
    }
  

}

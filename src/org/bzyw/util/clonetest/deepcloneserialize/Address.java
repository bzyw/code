package org.bzyw.util.clonetest.deepcloneserialize;

import java.io.Serializable;

/**
 * Created by bzyw on 2018/5/4.
 */
public class Address implements Serializable {
    private static final long serialVersionUID = 1L;
    private String country;
    private String city;

    public Address(String country, String city) {
        this.country = country;
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}

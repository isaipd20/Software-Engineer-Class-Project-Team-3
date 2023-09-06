package com.Team03.TVFM.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Vendor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "lastname")
    private String lastname;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "vendor")
    private int vendor;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "address")
    private Address address;


    @Override
    public String toString() {
        return getString(this.id, this.name, this.lastname, this.email, this.vendor, this.address);
    }

    static String getString(Long id, String name, String lastname, String email, int vendor, Address address) {
        if(address == null) {
            return "{\"id\":\"" + id + "\"," +
                    "\"name\":\"" + name + "\"," +
                    "\"lastname\":\"" + lastname + "\"," +
                    "\"email\":\"" + email + "\"," +
                    "\"vendor\":\"" + vendor + "\"}";
        } else {
            return  "{\"id\":\"" + id + "\"," +
                    "\"name\":\"" + name + "\"," +
                    "\"lastname\":\"" + lastname + "\"," +
                    "\"email\":\"" + email + "\"," +
                    "\"vendor\":\"" + vendor + "\"," +
                    "\"address\":{" +
                        "\"number\":\"" + address.getNumber() + "\"," +
                        "\"street\":\"" + address.getStreet() + "\"," +
                        "\"city\":\"" + address.getCity() + "\"," +
                        "\"state\":\"" + address.getState() + "\"," +
                        "\"zipcode\":\"" + address.getZipcode() + "\"" +
                        "}" +
                    "}";
        }
    }
}

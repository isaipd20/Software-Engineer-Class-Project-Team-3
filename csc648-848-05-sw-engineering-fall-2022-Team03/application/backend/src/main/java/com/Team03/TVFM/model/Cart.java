package com.Team03.TVFM.model;

import lombok.Data;

import javax.persistence.*;

@Data
public class Cart
{
    private int id;
    private int Customer_id;
    private int Vendor_id;
    private int[] itemids;
}

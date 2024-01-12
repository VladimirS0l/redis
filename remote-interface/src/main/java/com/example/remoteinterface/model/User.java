package com.example.remoteinterface.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class User implements Serializable {
    private int id;
    private String name;
    private double salary;
}

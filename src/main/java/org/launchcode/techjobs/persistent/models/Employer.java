package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {


    @NotNull
    @NotBlank
    @Size(min = 3, max = 150)
    private String location;

//    may need the regular constructor here
//    public Employer(String location){
//        this.location = location;
//    }

    public Employer(){}

    public @NotNull @NotBlank @Size(min = 3, max = 150) String getLocation() {
        return location;
    }

    public void setLocation(@NotNull @NotBlank @Size(min = 3, max = 150) String location) {
        this.location = location;
    }

}

package org.launchcode.techjobs.persistent.models;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Employer extends AbstractEntity {

    @NotNull
    @NotBlank
    @Size(min = 3, max = 150)
    private String location;

    public @NotNull @NotBlank @Size(min = 3, max = 150) String getLocation() {
        return location;
    }

    public void setLocation(@NotNull @NotBlank @Size(min = 3, max = 150) String location) {
        this.location = location;
    }

}

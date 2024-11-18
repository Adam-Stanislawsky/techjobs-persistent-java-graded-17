package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {


    @NotNull(message = "Description is required")
    @NotBlank(message = "Description is required")
    @Size(max = 500)
    public String description;


    //also check here if the regular constructor is needed


    public Skill(String description) {
        this.description = description;
    }

    public Skill(){}

    public @NotNull @NotBlank @Size(max = 500) String getDescription() {
        return description;
    }

    public void setDescription(@NotNull @NotBlank @Size(max = 500) String description) {
        this.description = description;
    }
}

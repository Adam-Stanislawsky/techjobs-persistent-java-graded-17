package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {



    @NotBlank(message = "Name is required")
    @Size(min = 3, max = 150, message = "Location must be between 3 and 150 characters")
    public String location;

    @OneToMany
    @JoinColumn(name = "employer_id")
    private final List<Job> jobs = new ArrayList<>();


    public Employer(){}

    public Employer(String location) {
        super();
        this.location = location;
    }



    public @NotBlank(message = "Name is required") @Size(min = 3, max = 150, message = "Location must be between 3 and 150 characters") String getLocation() {
        return location;
    }

    public void setLocation(@NotBlank(message = "Name is required") @Size(min = 3, max = 150, message = "Location must be between 3 and 150 characters") String location) {
        this.location = location;
    }

    public List<Job> getJobs() {
        return jobs;
    }
}

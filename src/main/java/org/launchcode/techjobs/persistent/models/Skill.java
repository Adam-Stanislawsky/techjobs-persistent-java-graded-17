package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {



    @Size(max = 500, message = "Maximum description length is 500 characters")
    public String description;

    @NotNull
    @ManyToMany(mappedBy="skills")
    private List<Job> jobs = new ArrayList<>();


    public Skill(String description) {
        super();
        this.description = description;
    }

    public Skill(){}

    public @Size(max = 500, message = "Maximum description length is 500 characters") String getDescription() {
        return description;
    }

    public void setDescription(@Size(max = 500, message = "Maximum description length is 500 characters") String description) {
        this.description = description;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }
}

package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job() {
        id = nextId;
        nextId ++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }
    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.
    //Custom Equals
    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }
    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // TODO: Add custom ToString() Method
    @Override
//    public String toString() {
//        return "\n" +
//                "ID: " + this.getId() + "\n" +
//                "Name: " + this.getName() + "\n" +
//                "Employer: " + this.getEmployer() + "\n" +
//                "Location: " + this.getLocation() + "\n" +
//                "Position Type: " + this.getPositionType() + "\n" +
//                "Core Competency: " + this.getCoreCompetency() + "\n";
//    }
    public String toString() {
        String name = this.getName().length() > 0? this.getName() : "Data not available";
        String employer = this.getEmployer().getValue().length() > 0? this.getEmployer().getValue() : "Data not available";
        String location = this.getLocation().getValue().length() > 0? this.getLocation().getValue() : "Data not available";
        String positionType = this.getPositionType().getValue().length() > 0? this.getPositionType().getValue() : "Data not available";
        String coreCompetency = this.getCoreCompetency().getValue().length() > 0? this.getCoreCompetency().getValue() : "Data not available";
        return "\n" +
                "ID: " + this.getId() + "\n" +
                "Name: " + name + "\n" +
                "Employer: " + employer + "\n" +
                "Location: " + location + "\n" +
                "Position Type: " + positionType + "\n" +
                "Core Competency: " + coreCompetency + "\n";
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }
}

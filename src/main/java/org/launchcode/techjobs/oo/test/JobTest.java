package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
    @Test
    public void testSettingJobId() {
        Job jobOne = new Job();
        Job jobTwo = new Job();
        assertNotEquals(jobOne.getId(),jobTwo.getId(), 0.001);
    }

    @Test
    public void testJobsForEquality() {
        Job jobOne = new Job("Product tester", new Employer("Acme"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        Job jobTwo = new Job("Product tester", new Employer("Acme"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        assertFalse(jobOne.equals(jobTwo));
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job jobTest = new Job("Product tester", new Employer("Acme"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));

        assertEquals("Product tester", jobTest.getName());
        assertEquals("Acme", jobTest.getEmployer().getValue());
        assertEquals("Desert", jobTest.getLocation().getValue());
        assertEquals("Quality Control", jobTest.getPositionType().getValue());
        assertEquals("Persistence", jobTest.getCoreCompetency().getValue());
        assertTrue(jobTest instanceof Job);
        assertTrue(jobTest.getEmployer() instanceof Employer);
        assertTrue(jobTest.getLocation() instanceof Location);
        assertTrue(jobTest.getPositionType() instanceof PositionType);
        assertTrue(jobTest.getCoreCompetency() instanceof CoreCompetency);
    }
    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job jobTest = new Job("Product tester", new Employer("Acme"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        char firstChar = jobTest.toString().charAt(0);
        char lastChar = jobTest.toString().charAt(jobTest.toString().length()-1);
        assertEquals(firstChar, '\n');
        assertEquals(lastChar, '\n');
    }
    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job job = new Job("Product tester", new Employer("Acme"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        String jobString = "\n" +
                "ID: " + job.getId() + "\n" +
                "Name: " + job.getName() + "\n" +
                "Employer: " + job.getEmployer() + "\n" +
                "Location: " + job.getLocation() + "\n" +
                "Position Type: " + job.getPositionType() + "\n" +
                "Core Competency: " + job.getCoreCompetency() + "\n";
        assertEquals(jobString, job.toString());
    }



    @Test
    public void testToStringHandlesEmptyField() {
        Job job = new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType(""), new CoreCompetency("Persistence"));
        String jobString = "\n" +
                "ID: " + job.getId() + "\n" +
                "Name: " + job.getName() + "\n" +
                "Employer: " + "Data not available" + "\n" +
                "Location: " + job.getLocation() + "\n" +
                "Position Type: " + "Data not available" + "\n" +
                "Core Competency: " + job.getCoreCompetency() + "\n";
        assertEquals(jobString, job.toString());
    }



}

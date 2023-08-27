package DefSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.Collections;
import java.util.List;

public class StudentsStepsDef {

    @Given("some students")
    public void some_students(Students students) {
        List<String> studentsAge = Collections.singletonList(students.getAge());
        System.out.println(studentsAge);
    }

    @When("sort students by age")
    public void sort_students_by_age(List<String> studentsAge) {
        Collections.sort(studentsAge, Collections.reverseOrder());
        int youngestSt = Integer.parseInt(studentsAge.get(0));

    }

    @Then("check that the youngest student is over {int}")
    public void check_that_the_youngest_student_is_over(Integer int1, int youngStudent) {
        Assert.assertTrue(youngStudent > int1);
    }

}

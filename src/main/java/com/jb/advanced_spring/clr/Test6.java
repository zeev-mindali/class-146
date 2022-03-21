package com.jb.advanced_spring.clr;

import com.jb.advanced_spring.beans.Teacher;
import com.jb.advanced_spring.util.TablePrinter;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Component
@RequiredArgsConstructor
public class Test6 implements CommandLineRunner {
    private final RestTemplate restTemplate;

    @Override
    public void run(String... args) throws Exception {
        //getAllTeachersString();
        //getAllTeacherAsList();
        //getTeacherByID(1);
        //getTeacherByID_v2(1);
        //addTeacher();
        //deleteTeacher(4);
        //updateTeacher(2);
        getOutsideData("27765101");
    }

    private void getOutsideData(String carNumber){
        String url = "https://data.gov.il/api/3/action/datastore_search?resource_id=053cea08-09bc-40ec-8f7a-156f0677aff3&q="+carNumber;
        String carData = restTemplate.getForObject(url,String.class);
        System.out.println(carData);
    }

    private void updateTeacher(int id) {
        Teacher golan = getTeacherByID(id);
        golan.setPhoneNumber("055-555-5555");
        String url = "http://localhost:8080/teacher/update/";
        restTemplate.put(url,golan);

    }

    private void deleteTeacher(int teacherId) {
        String url = "http://localhost:8080/teacher/delete/"+teacherId;
        restTemplate.delete(url);
    }

    private void addTeacher() {
        String url = "http://localhost:8080/teacher/add";
        Teacher teacher = Teacher.builder()
                .phoneNumber("052-404-3142")
                .name("Zeevik")
                .build();

        //post the object using REST with restTemplate :)
        restTemplate.postForEntity(url,teacher,Teacher.class);
    }

    private void getTeacherByID_v2(int teacherID) {
        String url = "http://localhost:8080/teacher/single/" + teacherID;
        ResponseEntity<Teacher> teacher = restTemplate.getForEntity(url,Teacher.class);
        TablePrinter.print(teacher.getBody());
    }

    private Teacher getTeacherByID(int teacherID) {
        String url = "http://localhost:8080/teacher/single/" + teacherID;
        Teacher teacher = restTemplate.getForObject(url, Teacher.class);
        TablePrinter.print(teacher);
        return teacher;
    }

    private void getAllTeacherAsList() {
        String url = "http://localhost:8080/teacher/all";
        ResponseEntity<Teacher[]> lecturerResult = restTemplate.getForEntity(url, Teacher[].class);
        List<Teacher> teacherList = Arrays.asList(lecturerResult.getBody());
        TablePrinter.print(teacherList);
    }


    //get all teacher as string
    private void getAllTeachersString() {
        //define our url location (string)
        String url = "http://localhost:8080/teacher/all";
        //call restTemplate for get on object of type string and move it to our variable
        String result = restTemplate.getForObject(url, String.class);
        System.out.println(result);
    }
}

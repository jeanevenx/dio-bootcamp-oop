package edu.bootcamp.services;

import edu.bootcamp.model.Bootcamp;
import edu.bootcamp.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class StudentServiceImpl implements IStudent{
    List<Student> studentList = new ArrayList<>();
    BootcampServiceImpl service = new BootcampServiceImpl();

    @Override
    public void enrollBootcamp(int bootcampIndex, List<Student> student) {
        service
                .getAllBootcamp()
                .get(bootcampIndex)
                .setStudentList(student);

        //TODO: Criar um set para colocar os bootcamp do estudante
    }

    @Override
    public void unenrollBootcamp(int bootcampIndex) {

    }

    @Override
    public Set<String> getAllBootcamp() {
        return null;
    }
}

package com.school.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.school.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}

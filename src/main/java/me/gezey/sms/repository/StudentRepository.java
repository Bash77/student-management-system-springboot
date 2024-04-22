package me.gezey.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import me.gezey.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}

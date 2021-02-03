package com.acc.au.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acc.au.model.Attendance;

public interface AttendanceRepo extends JpaRepository<Attendance,Integer> {

}

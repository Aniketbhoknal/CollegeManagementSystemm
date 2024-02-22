package com.example.project.Entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "course_enrollment_request")
public class CourseEnrollmentRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int requestId;

    @Column(name = "approve_status")
    private int approveStatus;

    @Column(name = "course_id")
    private int courseId;

    @Column(name = "student_id")
    private int studentId;

    @Column(name = "request_date")
    private LocalDateTime requestDate;

    public CourseEnrollmentRequest() {
        // Default constructor
    }

    public CourseEnrollmentRequest(int approveStatus, int courseId, int studentId, LocalDateTime requestDate) {
        this.approveStatus = approveStatus;
        this.courseId = courseId;
        this.studentId = studentId;
        this.requestDate = requestDate;
    }

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public int getApproveStatus() {
        return approveStatus;
    }

    public void setApproveStatus(int approveStatus) {
        this.approveStatus = approveStatus;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public LocalDateTime getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(LocalDateTime requestDate) {
        this.requestDate = requestDate;
    }
}

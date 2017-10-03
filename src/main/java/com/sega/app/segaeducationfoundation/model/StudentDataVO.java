package com.sega.app.segaeducationfoundation.model;


import com.sega.app.segaeducationfoundation.entities.StudentDataEntity;

public class StudentDataVO {

    private String studentName;
    private String userName;
    private Character gender;
    private String dob;
    private String fatherName;
    private String email;
    private String permanentAddress;
    private String temporaryAddress;
    private String mobileNo;
    private String phoneNo;
    private String academicDetails;
    private String courseCode;
    private String roles;



    public StudentDataVO(StudentDataEntity studentDataEntity){
        this.studentName=studentDataEntity.getStudentName();
        this.userName=studentDataEntity.getUserName();
        this.gender=studentDataEntity.getGender();
        this.dob=studentDataEntity.getDob();
        this.fatherName=studentDataEntity.getFatherName();
        this.email=studentDataEntity.getEmail();
        this.permanentAddress=studentDataEntity.getPermanentAddress();
        this.temporaryAddress=studentDataEntity.getTemporaryAddress();
        this.mobileNo=studentDataEntity.getEmail();
        this.phoneNo=studentDataEntity.getPhoneNo();
        this.academicDetails=studentDataEntity.getAcademicDetails();
        this.courseCode=studentDataEntity.getCourseCode();
        this.roles=studentDataEntity.getRoles();
    }

    public StudentDataVO(){

    }
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public String getTemporaryAddress() {
        return temporaryAddress;
    }

    public void setTemporaryAddress(String temporaryAddress) {
        this.temporaryAddress = temporaryAddress;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getAcademicDetails() {
        return academicDetails;
    }

    public void setAcademicDetails(String academicDetails) {
        this.academicDetails = academicDetails;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }
}
package com.patientManagement.domain;

/**
 * Created by tmoshasha on 2017/08/08.
 */
public class Patient{

    private String id;
    private String name;
    private String surname;
    private String address;
    private String cellNumber;
    private String condition;
    private String attendanceType;

    public String getId() {return id;}

    public String getName() {return name;}

    public String getSurname() {return surname;}

    public String getAddress() {return address;}

    public String getCellNumber() {return cellNumber;}

    public String getCondition() {
        return condition;
    }

    public String getAttendanceType() {
        return attendanceType;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", address='" + address + '\'' +
                ", cellNumber='" + cellNumber + '\'' +
                ", condition='" + condition + '\'' +
                ", attendanceType='" + attendanceType + '\'' +
                '}';
    }

    public Patient(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.surname = builder.surname;
        this.address = builder.address;
        this.cellNumber = builder.cellNumber;
        this.condition = builder.condition;
        this.attendanceType = builder.attendanceType;
    }

    public static class Builder{
        private String id;
        private String name;
        private String surname;
        private String address;
        private String cellNumber;
        private String condition;
        private String attendanceType;


        public Builder id(String value) {
            this.id = value;
            return this;
        }


        public Builder name(String value) {
            this.name = value;
            return this;
        }


        public Builder surname(String value) {
            this.surname = value;
            return this;
        }
        public Builder address(String value) {
            this.address = value;
            return this;
        }
        public Builder cellNumber(String value) {
            this.cellNumber = value;
            return this;

        }

        public Builder condition(String value) {
            this.condition = value;
            return this;
        }

        public Builder attendanceType(String value) {
            this.attendanceType = value;
            return this;
        }

        public Patient build(){
            return new Patient(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Patient patient = (Patient) o;

        return !(id != null ? !id.equals(patient.id) : patient.id != null);

    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}

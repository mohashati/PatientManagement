package com.patientManagement.domain;

/**
 * Created by tmoshasha on 2017/08/08.
 */
public class Doctor  {
    private String id;
    private String name;
    private String surname;
    private String address;
    private String cellNumber;
    private String speciality;
    private String qualification;



    public String getId() {return id;}

    public String getName() {return name;}

    public String getSurname() {return surname;}

    public String getAddress() {return address;}

    public String getCellNumber() {return cellNumber;}

    public String getSpeciality() {return speciality;}

    public String getQualification() {return qualification;}

    public Doctor (Builder builder){
        this.id = builder.id;
        this.name = builder.name;
        this.surname = builder.surname;
        this.address = builder.address;
        this.cellNumber = builder.cellNumber;
        this.qualification = builder.qualification;
        this.speciality = builder.qualification;
    }

    public static class Builder{
        private String id;
        private String name;
        private String surname;
        private String address;
        private String cellNumber;
        private String speciality;
        private String qualification;


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

        public Builder speciality(String value) {
            this.speciality = value;
            return this;
        }
        public Builder qualification(String value) {
            this.qualification = value;
            return this;
        }

        public Doctor build(){
            return new Doctor(this);
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", address='" + address + '\'' +
                    ", cellNumber='" + cellNumber + '\'' +
                    ", speciality='" + speciality + '\'' +
                    ", qualification='" + qualification + '\'' +
                    '}';
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Doctor doctor = (Doctor) o;

        return !(id != null ? !id.equals(doctor.id) : doctor.id != null);

    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}

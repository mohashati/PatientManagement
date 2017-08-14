package com.patientManagement.domain;
/**
 * Created by tmoshasha on 2017/08/08.
 */


public class Appointment {

    private String id;
    private String appointmentDate;

    public String getId() {
        return id;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }


    public Appointment(Builder builder){
        this.id = builder.id;
        this.appointmentDate = builder.appointmentDate;
    }

    public static class Builder{
        private String id;
        private String appointmentDate;

        public Builder id(String value){
            this.id = value;
            return this;
        }

        public Builder appointmentDate(String value){
            this.appointmentDate = value;
            return this;
        }

        public Appointment build(){
            return new Appointment(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Appointment that = (Appointment) o;

        return !(id != null ? !id.equals(that.id) : that.id != null);

    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}

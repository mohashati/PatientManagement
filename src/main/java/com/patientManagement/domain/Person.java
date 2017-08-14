package com.patientManagement.domain;

import java.io.Serializable;

/**
 * Created by tmoshasha on 2017/08/08.
 */
    public class Person implements Serializable{
        private int id;
        private String name;
        private String surname;
        private String address;
        private String cellNumber;


        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getCellNumber() {
            return cellNumber;
        }

        public void setCellNumber(String cellNumber) {
            this.cellNumber = cellNumber;
        }


        public Person(){
        }

        public Person(Builder builder){
            this.id = builder.id;
            this.name = builder.name;
            this.surname = builder.surname;
            this.address = builder.address;
            this.cellNumber = builder.cellNumber;
        }

        public static class Builder{
            private int id;
            private String name;
            private String surname;
            private String address;
            private String cellNumber;


            public Builder id(int value) {
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


            public String address() {
                return address;
            }

            public Builder cellNumber(String value) {
                this.cellNumber = value;
                return this;

            }


            public Person build(){
                return new Person(this);
            }
        }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (id != person.id) return false;
        if (name != null ? !name.equals(person.name) : person.name != null) return false;
        if (surname != null ? !surname.equals(person.surname) : person.surname != null) return false;
        if (address != null ? !address.equals(person.address) : person.address != null) return false;
        return !(cellNumber != null ? !cellNumber.equals(person.cellNumber) : person.cellNumber != null);

    }

    @Override
    public int hashCode() {
        return id;
    }
}


package za.ac.cput.elective.entity;

public class Gender {

    public enum genderIs {
        MALE, FEMALE, UNDEFINED
    }

    private genderIs genderID;
    private String gender;

    private Gender(Builder builder) {
        this.genderID = builder.genderID;
        this.gender = builder.gender;
    }

    public char getGenderID() {
        switch (genderID) {
            case MALE:
                return 'M';
            case FEMALE:
                return 'F';
            case UNDEFINED:
                return 'U';
            default:
                return '0';
        }
    }

    public String getGender() {
        switch (genderID) {
            case MALE:
                return "Male";
            case FEMALE:
                return "Female";
            case UNDEFINED:
                return "Undefined";
            default:
                return gender;
        }
    }

    public static class Builder {
        private genderIs genderID;
        private String gender;

        public Builder setGenderID(genderIs genderID) {
            this.genderID = genderID;
            return this;
        }

        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder copy(Gender gender) {
            this.genderID = gender.genderID;
            this.gender = gender.gender;
            return this;
        }

        public Gender build() {
            return new Gender(this);
        }
    }

    @Override
    public String toString() {
        return "Gender" +
                "\nGenderID: " + genderID +
                "\nGender: '" + gender;
    }

}

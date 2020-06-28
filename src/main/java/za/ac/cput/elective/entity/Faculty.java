package za.ac.cput.elective.entity;

public class Faculty {

    private int facultyID;
    private String facultyName;

    private Faculty(Builder builder) {
        this.facultyID = builder.facultyID;
        this.facultyName = builder.facultyName;
    }

    public static class Builder {

        private int facultyID;
        private String facultyName;

        private Builder() {
        }

        public Builder setFacultyID(int facultyID) {
            this.facultyID = facultyID;
            return this;
        }

        public Builder setFacultyName(String facultyName) {
            this.facultyName = facultyName;
            return this;
        }

        public Faculty build() {
            return new Faculty(this);
        }
    }

    public int getFacultyID() {
        return facultyID;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void CheckRegStatus(long electCode) {
        /*
         * if electCode matches the room num then
         * assign student to room, else
         * change faculty and room
         */
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "facultyID=" + facultyID +
                ", facultyName='" + facultyName + '\'' +
                '}';
    }

}

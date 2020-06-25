package za.ac.cput.elective.entity;

public class Admin {
    private long adminID;
    private String adminName;

    public Admin(AdminBuilder builder) {
        this.adminID = builder.adminID;
        this.adminName = builder.adminName;
    }



    @Override
    public String toString() {
        return "Admin{" +
                "adminID=" + adminID +
                ", adminName='" + adminName + '\'' +
                '}';
    }

    // getters

    public long getAdminID() {
        return adminID;
    }

    public String getAdminName() {
        return adminName;
    }


    // builder class

    public static class AdminBuilder{
        private long adminID;
        private String adminName;

        // setters

        public AdminBuilder setAdminID(long adminID) {
        this.adminID = adminID;
        return this;
    }

    public AdminBuilder setAdminName(String adminName) {
        this.adminName = adminName;
        return this;
    }

    // copy method

    public AdminBuilder copy(Admin admin){
            this.adminID = admin.adminID;
            this.adminName= admin.adminName;
            return this;
    }

    public Admin build(){
            return new Admin(this);
        }


    } // end of AdminBuilder class

} // end of Admin class

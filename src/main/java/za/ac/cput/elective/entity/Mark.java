package za.ac.cput.elective.entity;

public class Mark
{
    private String marksID;

    private Mark(Builder builder)
    {
        this.marksID = builder.marksID;
    }

    public static class Builder
    {
        private String marksID;

        private Builder()
        {
        }

        public String getMarksID()
        {
            return marksID;
        }

        public Builder setMarksID(String markID)
        {
            this.marksID = marksID;
            return this;
        }
        public Mark build()
        {
            return new Mark(this);
        }

        public String ReadSubjectID (Long electCode)
        {
            return "";
        }

        public void CalWeight()
        {

        }

        public void sendMark()
        {

        }

        public void ViewFinalMark()
        {

        }

        @Override
        public String toString()
        {
            return "Mark ID: " + marksID;
        }
    }
}

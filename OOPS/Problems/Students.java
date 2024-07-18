class Students{
    private String firstname,lastname,year,major;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Students{");
        sb.append("firstname=").append(firstname);
        sb.append(", lastname=").append(lastname);
        sb.append(", year=").append(year);
        sb.append(", major=").append(major);
        sb.append('}');
        return sb.toString();
    }

}
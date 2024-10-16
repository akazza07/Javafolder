class Student {
    Student s1 = new Student(123, "John Doe", 85, 90, 95);


    // Private data members
    private int admno;
    private String sname;
    private float eng, math, science;
    private float total;

    // Constructor to initialize the data members
    public Student(int admno, String sname, float eng, float math, float science) {
        this.admno = admno;
        this.sname = sname;
        this.eng = eng;
        this.math = math;
        this.science = science;
    }

    // Private method to calculate the total marks
    private float ctotal() {
        return eng + math + science;
    }

    // Public method to get the total marks
    public float getTotal() {
        return ctotal();
    }

    // Public method to display student details
    public void showData() {
        System.out.println("Admno: " + admno);
        System.out.println("Name: " + sname);
        System.out.println("English: " + eng);
        System.out.println("Math: " + math);
        System.out.println("Science: " + science);
        System.out.println("Total Marks: " + getTotal());
    }
}

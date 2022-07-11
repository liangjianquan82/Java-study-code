package personnel;

import java.util.ArrayList;

public class Employee extends Family implements PersonalInfo, EmploymentInfo, EducationalInfo {

   String [] personal_Info= new String[3];
    String [] employment_Info= new String[2];
    String [] educational_Info= new String[3];



    public Employee() {
    }

    public void promotion() {
        boolean p = true;

        if((Integer.valueOf(this.personal_Info[1])>45 && super.getFamily_members()>=2&& this.employment_Info[0].equalsIgnoreCase("manager"))
                ||(Integer.valueOf(this.personal_Info[1])>50&&educational_Info[0].equalsIgnoreCase("Ph.D")&&Double.valueOf(this.employment_Info[1])<5000)) {
            System.out.println("Promotion ");
        }
        else System.out.println(" No Promotion ");
    }


    @Override
    public String[] getEducationalInfo(String last_degree, String field_of_study, String graduation_year) {
        this.educational_Info = new String[]{last_degree, field_of_study, graduation_year};

        return this.educational_Info;
    }

    @Override
    public String[] getEmploymentInfo(String position, String salary) {
        this.employment_Info = new String[]{position, salary};

        return this.employment_Info;
    }

    @Override
    public String[] getPersonalInfo(String name, String age, String location) {
        this.personal_Info = new String[]{name, age,location};

        return this.personal_Info;
    }
}

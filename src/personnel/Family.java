package personnel;

public class Family {
    int family_members;
    String  family_income_low_or_high;

    public Family() {
    }

    public int getFamily_members() {
        return family_members;
    }

    public void setFamily_members(int family_members) {
        this.family_members = family_members;
    }

    public String  isFamily_income_low_or_high() {
        return family_income_low_or_high;
    }

    public void setFamily_income_low_or_high(String family_income_low_or_high) {
        this.family_income_low_or_high = family_income_low_or_high;
    }

    public String showFamilyInfo() {
        String sh = "Family Information: "+ "\nNumber of family members: "+getFamily_members();
        if(isFamily_income_low_or_high().equalsIgnoreCase("no")){
            sh = sh + "\nFamily not low-income";
        }else
        {sh = sh + "\nFamily low-income";}
        return sh;
    }
}

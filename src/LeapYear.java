public class LeapYear {
    int year;

    void isLeapYear(){
        if(year>1582 && year %400==0 && year%4==0 && year%100!=0){
            System.out.println("Entered year is LEAP YEAR: ");
        }else
        {
            System.out.println("Entered year is NOT A LEAP YEAR");
        }

    }

}

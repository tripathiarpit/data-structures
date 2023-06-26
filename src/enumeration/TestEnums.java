package enumeration;

public class TestEnums {
    public static void main(String[] args) {
        DAYS [] days = DAYS.values();
       for(DAYS d: days) {
           System.out.println(d.number);
       }
    }
}

enum DAYS {
    SUNDAY(1),
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;
    public int number;
    DAYS( int dayNum){
        number = dayNum;
    }
    DAYS(){

    }

}
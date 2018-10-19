public class Main {

    public static int minutes1,minutes2,minutes3,days1,days2,days3,years1,years2,years3,trammel1,trammel2,trammel3,felucca1,felucca2,felucca3,totalminutes1,totalhours1,timeminutes1,totalminutes2,totalhours2,timeminutes2,totalminutes3,totalhours3,timeminutes3,dayofyear1,dayofyear2,dayofyear3;

    public static void main(String[] args) {
        // write your code here
        minutes1 = 168260271;
        minutes2 = 27364375;
        minutes3 = 67294091;

        calc1();
        calc2();
        calc3();

    }

    public static void calc1() {
        days1=(minutes1/1440)+1;
        years1=(days1/365)+1;
        trammel1=days1%9;
        felucca1=days1%14;
        totalminutes1=minutes1%1440;
        totalhours1=totalminutes1/60;
        timeminutes1=totalminutes1%60;
        dayofyear1=days1%365;

        System.out.println("worldTime="+minutes1);
        System.out.println("It is "+totalhours1+":"+timeminutes1+" on day "+dayofyear1+" of the year "+years1+".");
        System.out.println("Trammel is in day "+trammel1+" of its 9 day phase.");
        System.out.println("Felucca is in day "+felucca1+" of its 14 day phase.");
        System.out.println();
        }

    public static void calc2() {
        days2=(minutes2/1440)+1;
        years2=(days2/365)+1;
        trammel2=days2%9;
        felucca2=days2%14;
        totalminutes2=minutes2%1440;
        totalhours2=totalminutes2/60;
        timeminutes2=totalminutes2%60;
        dayofyear2=days2%365;

        System.out.println("worldTime="+minutes2);
        System.out.println("It is "+totalhours2+":"+timeminutes2+" on day "+dayofyear2+" of the year "+years2+".");
        System.out.println("Trammel is in day "+trammel2+" of its 9 day phase.");
        System.out.println("Felucca is in day "+felucca2+" of its 14 day phase.");
        System.out.println();
        }

    public static void calc3() {
        days3=(minutes3/1440)+1;
        years3=(days3/365)+1;
        trammel3=days3%9;
        felucca3=days3%14;
        totalminutes3=minutes3%1440;
        totalhours3=totalminutes3/60;
        timeminutes3=totalminutes3%60;
        dayofyear3=days3%365;

        System.out.println("worldTime="+minutes3);
        System.out.println("It is "+totalhours3+":"+timeminutes3+" on day "+dayofyear3+" of the year "+years3+".");
        System.out.println("Trammel is in day "+trammel3+" of its 9 day phase.");
        System.out.println("Felucca is in day "+felucca3+" of its 14 day phase.");
        }
    }

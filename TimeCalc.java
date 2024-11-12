public class TimeCalc {
    public static void main(String[] args) {
        int currentHour = Integer.parseInt(args[0].substring(0,2));
        int currentMinuts = Integer.parseInt(args[0].substring(3,5));
        //int currentHour = Integer.parseInt("" + args[0].charAt(0)) + (args[0].charAt(1));
        int minutsToAdd = Integer.parseInt(args[1]);

        // Printing chrck of the valus.
        //System.out.println("Hours: " + currentHour);
        //System.out.println("Minuts: " + currentMinuts);
        //System.out.println("addMinuts: " + minutsToAdd);

        // Calculations.
        int totalMinuts = (currentHour * 60) + currentMinuts + minutsToAdd;
        int totalHours = totalMinuts / 60;
        int newHours = totalHours % 24;
        int newMinuts = totalMinuts - (totalHours * 60);

        // Printing final answer.
        if (newHours >= 10){System.out.print(newHours + ":");}
        else               {System.out.print("0" + newHours + ":");}
        if (newMinuts >= 10){System.out.print(newMinuts);}
        else                {System.out.print("0" + newMinuts);}
    }
}
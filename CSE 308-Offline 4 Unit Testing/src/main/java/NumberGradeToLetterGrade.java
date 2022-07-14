
public class NumberGradeToLetterGrade {

    int credit;

    NumberGradeToLetterGrade(String s){
        try{
            credit = Integer.parseInt(s);
        }catch (NumberFormatException numberFormatException){
            throw new IllegalArgumentException("Illegal credit");
        }
        if(credit != 3 && credit != 4){
            throw new IllegalArgumentException("Illegal credit");
        }
    }

    String calculateGrade(String numberStr){
        double number;
        try {
             number = Double.parseDouble(numberStr);
        }catch (NumberFormatException numberFormatException){
            throw new IllegalArgumentException("Non number input");
        }
        if(credit == 3)
            return calculateGrade3Credit(number);
        else
            return calculateGrade4Credit(number);
    }

    private String calculateGrade3Credit(double numberGrade){
        if(numberGrade < 0 || numberGrade > 300){
            throw new IllegalArgumentException("Number can't be negative or over 400");
        }
        int number = (int) Math.ceil(numberGrade);
        if(number >= 240)
            return "A";
        else if(number >= 210)
            return "B";
        else if(number >= 180)
            return "C";
        else
            return "F";
    }

    private String calculateGrade4Credit(double numberGrade){
        if(numberGrade < 0 || numberGrade > 400){
            throw new IllegalArgumentException("Number can't be negative or over 400");
        }
        int number = (int) Math.ceil(numberGrade);
        if(number >= 320)
            return "A";
        else if(number >= 280)
            return "B";
        else if(number >= 240)
            return "C";
        else
            return "F";
    }

}

import java.util.Scanner;
public class Hello {
    public static Candidate getCandidateDetails() throws InvalidInternException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Candidate Details");

        System.out.println("Name");
        String name =scanner.next();

        System.out.println("Gender");
        String gender = scanner.next();

        System.out.println("Enter Percentage in 10th");
        int percentage = scanner.nextInt();

        if (percentage <50){
            throw InvalidInternException("Registration Failed .Percentage cannot be less than 50%.");
        }
        else {
            Candidate candidate = new Candidate();
            candidate.setName(name);
            candidate.setGender(gender);
            candidate.setPercentage(percentage);

            return candidate;
        }
    }


    public static void main(String[]args){
        System.out.println("Welcome to Inter Hiring Tool");

        try{
            Candidate candidate = getCandidateDetails();
            System.out.println("Registration Successful");
        }
        catch (InvalidInternException e){
            System.out.println(e.getMessage());
        }
    }
    
}

public class Candidate {
    private String name;
    private String gender;
    private String percentage;

    public String getName() {
        return name;
   
    }
        public void setName(String name){
            this.name=name;
        }
        public String getGender(){
            return gender;
        }
        public void setGender(String gender){
            this.gender=gender;
        }
        public double getPercentage(){
             return percentage;

        }
        public void setPercentage(int percentage){
            this.percentage=percentage;
        }
    }

    public class InvalidInternException extends Exception {
        public InvalidInternException(String message) {
            super(message);
        }
    }


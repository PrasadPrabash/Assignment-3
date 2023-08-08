import java.util.Scanner;

public class Activity {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String str1 = "SE-";

        /* Name */
        System.out.print("Enter Your Name: ");
        String name = scanner.nextLine();
        if (name.length() == 0 ){
            assert 0 == 100 :  "\033[31mError Invalid Name \033[0m";
              
        } else if (name.startsWith(" ")){
            assert 0 == 100 :  "\033[31mError Invalid Name \033[0m";
        }

        /* Age */
        System.out.print("Enter Your Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        if (age < 10 | age > 18){
            assert 0 == 100 :  "\033[31mError Invalid Age \033[0m";
          
        } 

        /* Subject1 */
        System.out.print("Enter Subject 1: ");
        String subj1 = scanner.nextLine();
        if (str1.equals(subj1.substring(0,3)) == false){
           assert 0 == 100 :  "\033[31mError Invalid Subject As Preffered\033[0m";
        }

        /* Marks for Subject 1 */
        System.out.printf("Enter marks for %s: ", subj1);
        Double marks1 = scanner.nextDouble();
        scanner.nextLine();
        if(marks1 < 0 | marks1 > 100){
            assert 0 == 100 :  "\033[31mError Invalid Marks\033[0m";
        }

        /* Subject 2 */
        System.out.print("Enter Subject 2: ");
        String subj2 = scanner.nextLine();
        if (str1.equals(subj2.substring(0,3)) == false){
           assert 0 == 100 :  "\033[31mError Invalid Subject As Preffered\033[0m";
        }
        else if(subj2.equals(subj1)){
            assert 0 == 100 :  "\033[31mError Invalid Subject As Preffered\033[0m";
        }

        /* Marks for Subject 2 */
        System.out.printf("Enter marks for %s: ", subj2);
        Double marks2 = scanner.nextDouble();
        scanner.nextLine();
        if(marks2 < 0 | marks2 > 100){
            assert 0 == 100 :  "\033[31mError Invalid Marks\033[0m";
        }

        /* Subject 3 */
        System.out.print("Enter Subject 3: ");
        String subj3 = scanner.nextLine();
        if (str1.equals(subj3.substring(0,3)) == false){
           assert 0 == 100 :  "\033[31mError Invalid Subject As Preffered\033[0m";
        }
        else if(subj2.equals(subj1) | subj3.equals(subj2)){
            assert 0 == 100 :  "\033[31mError Invalid Subject As Preffered\033[0m";
        }

        /* Marks for Subject 3 */
        System.out.printf("Enter marks for %s: ", subj3);
        Double marks3 = scanner.nextDouble();
        scanner.nextLine();
        if(marks3 < 0 | marks3 > 100){
            assert 0 == 100 :  "\033[31mError Invalid Marks\033[0m";
        }
        
        String name1 = (name.toUpperCase());
        String finalName = String.format("\033[34;01m%s\033[0m",name1);
        double total = marks1 + marks2 + marks3;
        double avg = total/3;
        
        String tot = String.format("%.2f",total);
        //System.out.println(tot);
        String average = String.format("%.2f",avg);
        String finalAverage = (average+"%");

        String status = "";
        String status1 = "";
        String status2 = "";
        String status3 = "";

        /* Status */
        if (avg >= 75){
            status = String.format("\033[34;01mDistinguished Pass\033[0m");
        }else if (65 <= avg & avg < 75){
            status = String.format("\033[32;01mCredit Pass\033[0m");
        }else if (55 <= avg & avg < 65){
            status = String.format("\033[33;01mPass\033[0m");
        }else if (0 <= avg & avg < 55){
            status = String.format("\033[31;01mFail\033[0m");  
        } 

        /* Mark 1 */
        if (marks1 >= 75){
            status1 = String.format("\033[0;34mDISTINGUISHED PASS\033[0m");
        }else if (65 <= marks1 & marks1 < 75){
            status1 = String.format("\033[0;32mCREDIT PASS\033[0m");
        }else if (55 <= marks1 & marks1 < 65){
            status1 = String.format("\033[0;33mPASS\033[0m");
        }else if (0 <= marks1 & marks1 < 55){
            status1 = String.format("\033[0;31mFAIL\033[0m"); 
        } 

        /* Mark 2 */
        if (marks2 >= 75){
            status2 = String.format("\033[0;34mDISTINGUISHED PASS\033[0m");
        }else if (65 <= marks2 & marks2 < 75){
            status2 = String.format("\033[0;32mCREDIT PASS\033[0m");
        }else if (55 <= marks2 & marks2 < 65){
            status2 = String.format("\033[0;33mPASS\033[0m");
        }else if (0 <= marks2 & marks2 < 55){
            status2 = String.format("\033[0;31mFAIL\033[0m"); 
        } 

        /* Mark 3 */
        if (marks3 >= 75){
            status3 = String.format("\033[0;34mDISTINGUISHED PASS\033[0m");
        }else if (65 <= marks3 & marks3 < 75){
            status3 = String.format("\033[0;32mCREDIT PASS\033[0m");
        }else if (55 <= marks3 & marks3 < 65){
            status3 = String.format("\033[0;33mPASS\033[0m");
        }else if (0 <= marks3 & marks3 < 55){
            status3 = String.format("\033[0;31mFAIL\033[0m"); 
        } 

        /* Output Table */
        System.out.println("\033[0;33m-------------------------------------------------------------------");
        System.out.println(" \033[0;1mName: \033[0;33m"+ finalName+"\033[33m                                    ");
        System.out.println(" \033[0;1mAge: \033[0;33m"+ age +" \033[0myears old\033[33m                                ");
        System.out.printf(" \033[0;1mStatus: \033[0;33m%s \n", status);
        System.out.printf(" \033[0;1mTotal: \033[0;33m%s                            \033[0;1mAverage: \033[0;33m%s         \n", tot,finalAverage);
        System.out.println("\033[0;33m+-----------------+----------------+------------------------------+");
        System.out.println("| \033[0;1mSUBJECT\033[0;33m         |  \033[0;1mMARKS\033[0;33m         |  \033[0;1mSTATUS\033[0;33m                      |");
        System.out.println("\033[0;33m+-----------------+----------------+------------------------------+");
        System.out.printf("| \033[0;0mSE-001\033[0;33m          |  \033[0;0m%.2f\033[0;33m         |  \033[0m%-30s\033[0;33m         %-3s\n",marks1, status1, "|");
        System.out.printf("| \033[0;0mSE-002\033[0;33m          |  \033[0;0m%.2f\033[0;33m         |  \033[0m%-30s\033[0;33m         %-3s\n",marks2, status2, "|");
        System.out.printf("| \033[0;0mSE-003\033[0;33m          |  \033[0;0m%.2f\033[0;33m         |  \033[0m%-30s\033[0;33m         %-3s\n",marks3, status3, "|");
        System.out.println("\033[0;33m+-----------------+----------------+------------------------------+");
    }
}
        


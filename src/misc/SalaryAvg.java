package misc;

import java.util.Arrays;

public class SalaryAvg {
    public double average(int[] salary) {
        if(salary.length<3 || salary.length>100){
            return 0.0;
        }
        double maxSal=0;
        double minSal=0;
        double totalSum= 0;
        maxSal = salary[0];
        minSal = salary[0];
        for(int i= 0 ; i< salary.length;i++) {
            if(salary[i]<1000 || salary[i]>Math.pow(10,6)){
                return 0.0;
            }

            if(salary[i]>maxSal) {
                maxSal= salary[i];
            }
            else  if (salary[i]< minSal) {
                minSal = salary[i];
            }
            totalSum = totalSum + salary[i];
        }
        System.out.println("MIN SAL"+ minSal);
        System.out.println("Max SAL"+ maxSal);
        System.out.println("Total Sum"+ totalSum);
        totalSum = totalSum - (maxSal+minSal);
        double avg = (totalSum)/ (salary.length-2);
        return  avg;
    }

    public static void main(String[] args) {
        SalaryAvg salaryAvg = new SalaryAvg();
        int sal [] = new int[4];
//

        sal[0] = 4000;
        sal[1]= 3000;
        sal[2]= 1000;
        sal[3] = 2000;
        Arrays.stream(sal).forEach(data -> {System.out.print(data); System.out.print(",");});
        System.out.println("Avg Salary is"+salaryAvg.average(sal));

    }
}

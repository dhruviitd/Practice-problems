/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interview.street.problem.pkg1;

/**
 *
 * @author Dhruv
 */
public class InterviewStreetProblem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=578230,i,j ; 
        int[] prime = new int[n];
        for(i=2; i<n; i++){
            if (prime[i] != 1 && n%i == 0){
                System.out.println(i);
                for(j=2*i; j<n; j=j+i){
                    prime[j]=1;
                }
            }
         
        }
    }
}

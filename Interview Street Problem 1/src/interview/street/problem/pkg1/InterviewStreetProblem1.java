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
        int n=5,i,j ; 
        int[] prime = new int[n+1];
        for(i=2; i<=n; i++){
            if (prime[i] != -1){
                prime[i]=(int)n/i;
                System.out.println(i);
                for(j=2*i; j<=n; j=j+i){
                    prime[i]=prime[i]+(int)n/j;
                    prime[j]=-1;
                }
                System.out.println(prime[i]);
            }
         
        }
    }
}

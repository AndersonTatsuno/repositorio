package questao02;

/**
 *
 * @author AndersonTatsuno
 * 
 */
public class Par {
    int[] n = {1,5,3,4,2};
    int x = 2;
    int par = 0;
    int temp;
        
    void par(){
    for (int i = 0; i < n.length; i++){
        temp = i;
        for(int j = 0; j < n.length; j++){
            if (temp == j){
                continue;
            }
            if (n[temp] + x == n[j]){
                par++;
            }
        }
    } 
        
    System.out.println("Saída: " + par);
    }
}

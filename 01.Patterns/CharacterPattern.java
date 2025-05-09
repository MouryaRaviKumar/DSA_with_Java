/*
    A
    BC
    DEF
    GHIJ
    This is the Desired Pattern
 */
public class CharacterPattern {
    public static void main(String args[]){
        int n=4;
        char c='A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(c);
                c++;
            }
            System.out.println();
        }

    }
    
}

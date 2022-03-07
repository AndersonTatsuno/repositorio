package questao03;

/**
 *
 * @author andta
 */
    public class Criptografia {
        String s = "ola mundo";
        //String s = "tenha um bom dia";
        String str = "";

        void criptografia(){
        // Remove todos os espaços da String
        str = s.replaceAll(" ", "");
        System.out.println(str);

        // Grid
        double grid = Math.sqrt(str.length());
        grid = Math.ceil(grid);

        System.out.println("Grid de: " + (int)grid);

        char[] chars = str.toCharArray();

        System.out.println("");

        // Imprimir nas linhas e colunas certas
        int cont = 0;
        for(int i = 0; i < chars.length; i++){

            if(cont < grid){                
                System.out.print(chars[i]);
                cont++;
            } else{
                System.out.println("");
                cont = 0;
                i -= 1;
            }
        }

        System.out.println("\n");        

        for (int i = 0; i < grid; i++) {
            for (int j = i; j < chars.length; j+=grid){
                System.out.print(chars[j]);
            }
            System.out.print(" ");
        }
    }
}

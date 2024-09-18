public class multiarr {
    public static void main(String[] str){
        int[] []x=new int[2][4];
         x[0][0]=10; 
         x[0][1]=20; 
         x[0][2]=30; 
         x[0][3]=40;

         x[1][0]=50; 
         x[1][1]=60; 
         x[1][2]=70; 
         x[1][3]=80;
        for(int i=0; i<x.length; i++){
            for(int j=0; j<x[i].length;j++){
                System.out.println(x[i][j]);
            }
        }
        }
    
}

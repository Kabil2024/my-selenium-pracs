package javatasks;

public class ArrayPractices {
    public static void main(String[] args) {

        int[] a = {554574, 200, 300, 400}; //memory extends according to the value we give
        for (int i = 0; i <= a.length - 1; i++) {

            System.out.println(a[i]);
        }
        String[]name = new String[5];
        name[0]= "vijay";
        name[1]= "vijay";
        name[2]= "kabil";
        name[3]= "vijay";
        name[4]= "vijay";
        for (int i=0;i< name.length;i++) {
            System.out.println(name[i]);
        }
        int [][] kab= new int [2][2];
        kab[0][0] = 100;
        kab[1][0] = 500;
        kab[0][1] = 800;
        kab[1][1] = 900;
        for (int b = 0; b< 2;b++){
            for (int c = 0;c < 2;c++){
                System.out.println(kab[b][c]);
            }
        }
        int[][] kabi = {
                {43,45,45},
                {45,56,78},
                {24,24,4,}
        };
        for (int x = 0;x <3;x++){
            for (int y = 0;y < 3;y++){
                System.out.println(kabi[x][y]);
            }
        }
        int[][] l = {
                {232,224,32},
                {2303,2323,33},
                {2523,767,77},
                {6323,2373,333}
        }; int max = l[0][0];

        for (int u = 0;u<4;u++){
            for (int v = 0;v<3;v++){

                if (max<l[u][v]){
                    max = l[u][v];

                }

            }


        }
        System.out.println(max);


        int[][]kabil={{232,567,676},
                      {98,765,32},
                      {0,6,434,},
                      {11,22,33}};
        int sum = 0;
        for (int i =0;i<4;i++){
            for (int j =0;j<3;j++){
                sum += kabil[i][j];
            }

        } System.out.println(sum);




    }
}

public class sumOfRows {
    public static void main(String[] args){
        int a[][] = {{1,2,3,0},{4,5,6,0},{7,8,9,0},{1,2,3,0}};
        int i,j,sumr=0,sumc=0,sum = 0;
        for(i=0;i<4;i++){
            sumr=0;
            for(j=0;j<4;j++){
                sumr+=a[i][j];
                sumc+=a[j][i];
                if(j<3&&i<3)
                sum+=a[i][j];
            }
            if(i<3){
                a[3][i]= sumr;
                a[3][i]= sumc;
            }

            sumc=0;
        }
    }
}

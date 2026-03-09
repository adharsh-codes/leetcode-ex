class Solution {
    public int[][] transpose(int[][] matrix) {
        //int [] res= nre int[matrix.length];
        int row=matrix.length;
        int col=matrix[0].length;
        int [][] res=new int[col][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                res[j][i] = matrix[i][j];
            }
        }
    return res;
    }
}
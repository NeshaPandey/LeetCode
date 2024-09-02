class Replace-the-chalk {
    public int chalkReplacer(int[] chalk, int k) {
        while(k>=0){
            for (int i=0;i<chalk.length;i++){       
                if(k<chalk[i])
                    return i;
                k=k-chalk[i];
            }
        }
        return -1;
    }
}

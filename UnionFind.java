class UnionFind {
    int numOfUnions;
    int[] parents;
    public UnionFind(int initUnionNum) {
        numOfUnions = initUnionNum;
        parents = new int[initUnionNum];
        for(int i=0; i<parents.length; i++)
            parents[i] = i;
    }
    
    void union(int i, int j) {
        int pi = quickFind(i);
        int pj = quickFind(j);
        parents[pi] = pj;
    }
    
    int quickFind(int i) {
        while(parents[i]!=i) {
            parents[i] = parents[parents[i]];
            i = parents[i];
        }
        return i;
    }
}
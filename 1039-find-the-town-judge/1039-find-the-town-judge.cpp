class Solution {

public:
    int findJudge(int n, vector<vector<int>>& trust) {
        
        //our people level start from 1 so we need to set boundary n+1
        vector<int> trust_count(n+1, 0);
        /* simple concept: 
          1) town judge exist if it's indegree is n-1 and outdegree 0
          so if I get indegree I will increase its value by 1 and if 
          outdegree then decrease by 1 so if for any vertex indegree is n-1 but outdegree
          is 1 then the vertex value will be n-2 
          
          in this approach I can use only one vector instead of using two vector
          for indegree and outdegree

          */
        for(auto x: trust) {
            trust_count[x[0]]--;
            trust_count[x[1]]++;
        }
        for (int i = 1; i <= n; i++) {
            if (trust_count[i] == n - 1)
                return i;
        }
        return -1;
    }
};

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr1.length;
        int[] re = new int[n];

        for(int i : arr1){
            map.put(i, map.getOrDefault(i,0)+1);
        }

        int index = 0;

        for(int i : arr2){
            int f = map.get(i);
            for(int j = 0 ; j < f ; j++){
                re[index++] = i;
            }
            map.remove(i);
        }

        ArrayList<Integer> ar = new ArrayList<>();
        for(int key : map.keySet()){
            int count = map.get(key);
            for (int j = 0; j < count; j++) {
                ar.add(key);
            }
        }

        Collections.sort(ar);

        for (int i : ar) {
            re[index++] = i;
        }

        return re;
    }
}
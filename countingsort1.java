class Result {

    /*
     * Complete the 'countingSort' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> countingSort(List<Integer> arr) {
    // Write your code here
    int [] ar = new int[100];
     for(int i = 0; i<arr.size(); i++){
      ar[arr.get(i)] = ar[arr.get(i)]+1;
 }       
 return Arrays.stream(ar).boxed().collect(Collectors.toList());

    }

}

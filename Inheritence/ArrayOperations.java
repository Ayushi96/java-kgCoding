public class ArrayOperations {
        int array[];
    public static class Statistics {
        public double mean() {
            ArrayOperations arrayObj = new ArrayOperations();
            int sum = 0;
            for(int i = 0; i < arrayObj.array.length; i++){
                    sum += arrayObj.array[i];
            }
            return sum/arrayObj.array.length;
        }

        public double median(){
            ArrayOperations arrayObj = new ArrayOperations();
            int ans = 0;
            int lengthOfArray = arrayObj.array.length;
            // even
            if(lengthOfArray % 2 == 0){
                return (arrayObj.array[lengthOfArray/2] + arrayObj.array[lengthOfArray/2 - 1])/2;
            }
           return arrayObj.array[lengthOfArray/2];
        }
    }
}

public interface IntStack3 {
    void push(int item);
    int pop();


    //a default method that returns an array that contains the top n elements on stack
    default int[] popNElements(int n){
        return getElements(n);
    }

    //A default method that returns an array that contains
    //the next n elements on the stack afer skipping elements
    default int[] skipAndPopNElements(int skip, int n){
        getElements(skip);

        return getElements(n);
        };

    //A private method that returns an array containing the top n elements on the stack
    private int[] getElements(int n){
        int[] elements = new int[n];

        for (int i = 0; i< n; i++){
            elements[i] = pop();
        }
        return elements;
    }

}

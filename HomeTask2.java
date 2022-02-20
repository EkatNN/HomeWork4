public class HomeTask2 {

    public void from100To0 (int counter){
        for(counter = 100; counter >0; counter--){
            AllNumbersDivideBy4(counter);
        }
    }
    public void AllNumbersDivideBy4(int number) {
        if (number%4==0){
            System.out.println(number);
        }
    }
}

public class Main {

    public static void main(String[] args) {
        int i = 400;
        int j = 500;

        //Arrange
        Calculator calculator = new Calculator();
        //Act
        int result = 0;
        try {
            result = calculator.addition(i, j);
        }
        catch(IllegalArgumentException e) {
            System.out.println("Fejl - inputværdier er for høje " + result);
        }
        //Assert
        System.out.println("Resultat " + result);
    }
}

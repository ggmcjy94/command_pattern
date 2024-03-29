public class Client {


    public static void main(String[] args) {
        Computer computer = new Computer();
        ComputerOnCommand computerOnCommand = new ComputerOnCommand(computer);
        ComputerOffCommand computerOffCommand = new ComputerOffCommand(computer);

        Button button = new Button(computerOnCommand);
        button.pressButton();

        button.setCommand(computerOffCommand);
        button.pressButton();
    }
}

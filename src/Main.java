public class Main {
    public static void main(String[] args) {
        //В классе Main в методе main() определите переменную listener
        // типа OnTaskDoneListener через лямбда-выражение
        OnTaskDoneListener listener1 = System.out::println;
        OnTaskErrorListener listener2 = System.out::println;

        //Далее создайте экземпляр класса Worker и передайте в конструктор класса listener
        Worker worker = new Worker(listener1, listener2);
        worker.start();

        //
    }
}

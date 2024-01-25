/*
Для того, чтобы класс Worker мог вернуть результат своей работы,
реализуйте собственный функциональный интерфейс OnTaskDoneListener.
В нем определите только один метод onDone() без реализации
и пометьте интерфейс аннотацией @FunctionalInterface
 */
@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManager taskManager = new TaskManager();


        taskManager.addTask(new Task("Завершить отчет о проекте", "Подготовить и отправить итоговый отчет о проекте клиенту.", 1, "2023-11-15", false));
        taskManager.addTask(new Task("Запланировать встречу с командой", "Организовать встречу с командой для обсуждения задач следующей недели.", 2, "2023-11-16", false));
        taskManager.addTask(new Task("Проверить код", "Выполнить проверку кода для нового функционала.", 3, "2023-11-17", false));
        taskManager.addTask(new Task("Обновить документацию", "Обновить документацию проекта в соответствии с последними изменениями.", 2, "2023-11-18", false));
        taskManager.addTask(new Task("Отправить электронное письмо клиенту", "Отправить клиенту электронное письмо с обновленной информацией о проекте.", 1, "2023-11-19", false));
        taskManager.addTask(new Task("Завершить презентацию", "Подготовить презентацию для встречи с клиентом.", 3, "2023-11-20", false));
        taskManager.addTask(new Task("Протестировать новую функцию", "Протестировать новую функцию перед развертыванием.", 2, "2023-11-21", false));
        taskManager.addTask(new Task("Запланировать резервное копирование базы данных", "Запланировать резервное копирование базы данных на следующую неделю.", 1, "2023-11-22", false));

        String[] menuWithOptions = {
                "Добавить задачу",
                "Удалить задачу",
                "Показать все задачи",
                "Показать выполненные задачи",
                "Показать невыполненные задачи",
                "Отфильтровать задачи",
                "Отсортировать задачи",
                "Выйти"
        };


        while (true) {
            System.out.println("Выберите номер меню с пунктами: ");
            for (int i = 0; i < menuWithOptions.length; i++) {
                System.out.println((i + 1) + ". " + menuWithOptions[i]);
            }

            int selectedNumber = scanner.nextInt();
            scanner.nextLine(); // Очистить буфер после nextInt()

            if (selectedNumber == 1) { // Добавить задачу
                System.out.print("Введите название задачи: ");
                String title = scanner.nextLine();
                System.out.print("Введите описание задачи: ");
                String description = scanner.nextLine();
                System.out.print("Введите приоритет задачи: ");
                int priority = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Введите дату выполнения задачи (ГГГГ-ММ-ДД): ");
                String dueDate = scanner.nextLine();
                taskManager.addTask(new Task(title, description, priority, dueDate, false));
                System.out.println("Задача добавлена.");
            } else if (selectedNumber == 2) { // Удалить задачу
                System.out.print("Введите индекс задачи для удаления: ");
                int index = scanner.nextInt();
                taskManager.removeTaskByIndex(index - 1); // Индексы начинаются с 0
                System.out.println("Задача удалена.");
            } else if (selectedNumber == 3) { // Показать все задачи
                List<Task> allTasks = taskManager.getAllTasks();
                for (int i = 0; i < allTasks.size(); i++) {
                    System.out.println((i + 1) + ". " + allTasks.get(i));
                }
            } else if (selectedNumber == 4) { // Показать выполненные задачи
                List<Task> completedTasks = taskManager.getCompletedTasks();
                for (int i = 0; i < completedTasks.size(); i++) {
                    System.out.println((i + 1) + ". " + completedTasks.get(i));
                }
            } else if (selectedNumber == 5) { // Показать невыполненные задачи
                List<Task> pendingTasks = taskManager.getPendingTasks();
                for (int i = 0; i < pendingTasks.size(); i++) {
                    System.out.println((i + 1) + ". " + pendingTasks.get(i));
                }
            } else if (selectedNumber == 6) { // Отфильтровать задачи
                // Добавьте логику для фильтрации задач
            } else if (selectedNumber == 7) { // Отсортировать задачи
                // Добавьте логику для сортировки задач
            } else if (selectedNumber == 8) { // Выйти
                break;
            } else {
                System.out.println("Некорректный выбор.");
            }
        }
    }
}



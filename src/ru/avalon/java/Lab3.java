package ru.avalon.java;

import ru.avalon.java.console.ConsoleUI;

import java.io.IOException;
import ru.avalon.java.actions.FileAddAction;
import ru.avalon.java.actions.FileCopyAction;
import ru.avalon.java.actions.FileDeleteAction;
import ru.avalon.java.actions.FileMoveAction;

/**
 * Лабораторная работа №3
 * <p>
 * Курс: "Программирование на платформе Java. Разработка
 * многоуровневых приложений"
 * <p>
 * Тема: "Потоки исполнения (Threads) и многозадачность" 
 *
 * @author Daniel Alpatov <danial.alpatov@gmail.com>
 */
public class Lab3 extends ConsoleUI<Commands> {
    /**
     * Точка входа в приложение.
     * 
     * @param args 
     */
    public static void main(String[] args) {
        new Lab3().run();
    }
    /**
     * Конструктор класса.
     * <p>
     * Инициализирует экземпляр базового типа с использоавнием
     * перечисления {@link Commands}.
     */
    Lab3() {
        super(Commands.class);
    }

    /**
     * {@inheritDoc}
     */
   
    @Override
    protected void onCommand(Commands command) throws IOException {
        switch (command) {
            case copy:
                FileCopyAction fileCopy  = new FileCopyAction();
                fileCopy.start();
                /*
                 * TODO №6 Обработайте команду copy
                 */
                break;
                
            case move:
                FileMoveAction fileMove = new FileMoveAction();
                fileMove.start();
                /*
                 * TODO №7 Обработайте команду move
                 */
                break;
                
            case delete:
                FileDeleteAction fileDelete = new FileDeleteAction();
                fileDelete.start();
                break;
                
            case add:
                FileAddAction fileadd = new FileAddAction();
                fileadd.start();
                break;
            
            case exit:
                close();
                break;
                /*
                 * TODO №9 Обработайте необработанные команды
                 */
        }
    }
    
}

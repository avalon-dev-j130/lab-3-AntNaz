package ru.avalon.java.actions;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

/**
 * Действие, которое перемещает файлы в пределах дискового
 * пространства.
 */
public class FileMoveAction implements Action {
    /**
     * {@inheritDoc}
     */
    File in = new File ("File.txt");
    File out = new File ("folderToCopy/File.txt");
    @Override
    public void run() {
        try {
         
         Files.copy(in.toPath(), out.toPath(), StandardCopyOption.REPLACE_EXISTING);
         in.delete();
         
         /*
         * TODO №2 Реализуйте метод run класса FileCopyAction
         */ //throw new UnsupportedOperationException("Not implemented yet!");
     } catch (IOException ex) {
            System.out.println("File was not found");
     }
        
        /*
         * TODO №4 Реализуйте метод run класса FileMoveAction
         */
        //throw new UnsupportedOperationException("Not implemented yet!");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void close() throws Exception {
        /*
         * TODO №5 Реализуйте метод close класса FileMoveAction
         */
        //throw new UnsupportedOperationException("Not implemented yet!");
    }

}

package com.java.assignments;
import java.io.File;
import java.util.Scanner;

public class Assignment1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String folderPath, filename;
        folderPath = "/home/gayathri";
        System.out.println("Enter the filename to search or enter exit");
        filename = sc.nextLine();
        while(!filename.equals("exit")){
            findFileFunction(folderPath,filename);
            System.out.println("Enter the filename to search or enter exit");
            filename = sc.nextLine();
        }
    }

    private static void findFileFunction(String folderPath, String filename){
        File file = new File(folderPath);
        for(File f : file.listFiles()){
            if(f.isDirectory()){
                findFileFunction(f.getAbsolutePath(),filename);
            }else{
                String fileName = f.getName();
                if(fileName.contains(filename)){
                    System.out.println(fileName);
                    System.out.println(f.getAbsolutePath() + "\n");
                }
            }
        }
    }
}

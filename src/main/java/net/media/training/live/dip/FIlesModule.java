package net.media.training.live.dip;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FIlesModule extends EncodingModule{
    String inputFile, outputFile;
    public FIlesModule(String inputFile, String outputFile){
        this.inputFile = inputFile;
        this.outputFile = outputFile;
    }
    public String read(){
        String textDocument = "";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(this.inputFile));
            String aLine;
            while ((aLine = reader.readLine()) != null) {
                textDocument += aLine;
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return textDocument;
    }
    public void write(String text){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(this.outputFile));
            writer.write(text);
            writer.flush();
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

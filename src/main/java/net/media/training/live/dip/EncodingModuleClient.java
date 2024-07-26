package net.media.training.live.dip;

import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 13, 2011
 * Time: 10:20:57 AM
 * To change this template use File | Settings | File Templates.
 */
public class EncodingModuleClient {
    public static void main(String[] args) throws IOException {
        // For File
        String inputFilePath = "src/main/java/net/media/training/live/dip/beforeEncryption.txt";
        String outputFilePath = "src/main/java/net/media/training/live/dip/afterEncryption.txt";
        EncodingModule encodingModuleFileToFile = new FIlesModule(inputFilePath, outputFilePath);
        encodingModuleFileToFile.write(
            new Base64Encoder().encode(
                encodingModuleFileToFile.read()
            )
        );

        // N DB 
        String protocol = "http";
        String host = "myfirstappwith.appspot.com";
        String file = "index.html";
        EncodingModule encodingModuleNetworkToDatabase = new NetworkAndDatabaseModule(protocol, host, file);
        
        encodingModuleNetworkToDatabase.write(
            new Base64Encoder().encode(
                encodingModuleNetworkToDatabase.read()
            )
        );


    }
}

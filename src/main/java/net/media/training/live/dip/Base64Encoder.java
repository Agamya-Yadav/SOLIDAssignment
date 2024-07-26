package net.media.training.live.dip;

import java.util.Base64;

public class Base64Encoder implements Encoder{
    public String encode(String text){
        String encodedLine = Base64.getEncoder().encodeToString(text.getBytes());
        return encodedLine;
    }
}

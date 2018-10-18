package com.company;
import java.util.Base64;

/**
 * Created by tk304 on 10/15/18.
 */
public class Encryption {

    String originalInput, encryptedInput;

    public Encryption(String input)
    {
        originalInput = input;
        Encrypt(input);

    }

    private void Encrypt(String input)
    {
        char[] inp = input.toCharArray();
        String enc = "";
        for (int i = 0; i < inp.length; i++)
        {
            enc += Base64.getEncoder().encodeToString(com.sun.xml.internal.messaging.saaj.util.Base64.encode(Character.toString(inp[i]).getBytes())).replace("=", "");
        }
        encryptedInput = enc;
    }

}

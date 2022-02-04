package com.jan2.stringsdemo;

public class PatternAZ {
    //ABCDEF......Z
    static void generateString(){
        String output = "";
        for(int i=0; i<26; i++){
            //intermediate stage
            // System.out.println(output);
            output = output + (char)('A' + i);
        }
        System.out.println(output);
    }
    static void generateStringUsingSb(){
        StringBuilder sb = new StringBuilder();
        sb.ensureCapacity(26);

        for(int i=0; i<26; i++){
            sb.append((char)('A' + i));
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        //generateString();
        generateStringUsingSb();
    }
}

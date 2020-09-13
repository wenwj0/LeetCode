package string;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class S890_FindAndReplacePatternTest {

    @Test
    void findAndReplacePattern() {
        String[] words = {"ccc","abc","mee","deq","aqq","dkd",};
        String pattern = "abb";
        String[] words1 = {"abc","cba","xyx","yxx","yyx"};
        String pattern1 = "abc";
        S890_FindAndReplacePattern test = new S890_FindAndReplacePattern();
        List<String> res = test.findAndReplacePattern(words1,pattern1);

        for(String r:res){
            System.out.println(r);
        }
    }
}
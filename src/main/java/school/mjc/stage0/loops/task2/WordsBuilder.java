package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        StringBuilder builder = new StringBuilder();
        for (char c : chars) {
            builder.append(c);
        }
        String phrase = builder.toString();
        System.out.println(phrase);
    }

}

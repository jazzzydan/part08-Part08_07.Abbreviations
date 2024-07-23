import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> abbreviationsHashMap;

    public Abbreviations() {
        this.abbreviationsHashMap = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        this.abbreviationsHashMap.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        return this.abbreviationsHashMap.containsKey(abbreviation);
    }

    public String findExplanationFor(String abbreviation) {
        return this.abbreviationsHashMap.get(abbreviation);
    }
}

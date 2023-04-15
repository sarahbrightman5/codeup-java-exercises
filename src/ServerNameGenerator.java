public class ServerNameGenerator {
  private String adjectives;
  private String noun;

    public static int getRandomInt(int min, int max) {
        return (int) (Math.random() * max) + min;
    }
  public static String randomString(String[] randomStrings ){
      int index = ServerNameGenerator.getRandomInt(0, randomStrings.length-1);
      return randomStrings[index];
  }

    public ServerNameGenerator(String adjectives, String noun) {
        this.adjectives = adjectives;
        this.noun = noun;
    }

    public String getAdjectives() {
        return adjectives;
    }

    public void setAdjectives(String adjectives) {
        this.adjectives = adjectives;
    }

    public String getNoun() {
        return noun;
    }

    public void setNoun(String noun) {
        this.noun = noun;
    }

}

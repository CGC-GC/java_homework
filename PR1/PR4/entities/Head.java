package PR4.entities;

public class Head {
    private String hairColor;
    private String eyeColor;

    public Head(String hairColor, String eyeColor) {
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
    }
    public String getHairColor(){
        return hairColor;
    }
    public String getEyeColor(){
        return eyeColor;
    }
    public String toString() {
        return "Head with " + hairColor + " hair and " + eyeColor + " eyes";
    }
}

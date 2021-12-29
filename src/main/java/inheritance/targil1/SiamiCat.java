package inheritance.targil1;

public class SiamiCat extends Cat{
    private String favoriteFood;

    public SiamiCat(String name, int mustache, String color, String favoriteFood) {
        super(name, mustache, color);
        this.favoriteFood = favoriteFood;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    @Override
    public String toString() {
        return "SiamiCat{" +
                "name='" + name + '\'' +
                ", mustache=" + mustache +
                ", color='" + color + '\'' +
                ", favoriteFood='" + favoriteFood + '\'' +
                '}';
    }
}

package javaChallenges.Interface;

abstract class BirdClass implements flyable{
    private final String breed;

    public BirdClass(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public void fly() {
        System.out.println("bird's is flying..");
    }
}

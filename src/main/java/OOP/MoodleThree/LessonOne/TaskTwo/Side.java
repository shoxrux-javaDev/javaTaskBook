package OOP.MoodleThree.LessonOne.TaskTwo;

public enum Side implements PolesName {
    EAST,
    WEST,
    SOUTH,
    NORTH;

    @Override
    public String polesName() {
        switch (this) {
            case EAST:
                return "Sharq";
            case WEST:
                return "G'arb";
            case NORTH:
                return "Shimol";
            case SOUTH:
                return "Janub";
        }
        return null;
    }

}

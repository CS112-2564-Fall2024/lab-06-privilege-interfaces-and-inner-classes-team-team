class PersonIdentity implements Comparable<PersonIdentity> {
    public static final String DEFAULT_NAME = "Jamie Doe";
    public static final String DEFAULT_STORY = "Unknown";
    public static final int DEFAULT_PRIVILEGE = 100;

    private String name;
    private String story;
    private int privilege;
    private String pronouns;
    private String background;

    // Constructor
    public PersonIdentity(String name, String story, int privilege, String pronouns, String background) {
        this.name = name;
        this.story = story;
        this.privilege = privilege;
        this.pronouns = pronouns;
        this.background = background;
    }

    // Default constructor
    public PersonIdentity() {
        this(DEFAULT_NAME, DEFAULT_STORY, DEFAULT_PRIVILEGE, "they/them", DEFAULT_STORY);
    }

    // Mutators/Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public void setPrivilege(int privilege) {
        this.privilege = privilege;
    }

    public void setIdentity(String pronouns, String background) {
        this.pronouns = pronouns;
        this.background = background;
    }

    // Accessors/Getters
    public String getName() {
        return this.name;
    }

    public String getStory() {
        return this.story;
    }

    public int getPrivilege() {
        return this.privilege;
    }

    @Override
    public int compareTo(PersonIdentity other) {
        return Integer.compare(this.privilege, other.privilege);
    }

    @Override
    public String toString() {
        return "My name is " + this.name + " and " + this.story + "\n"
                + "Pronouns: " + this.pronouns + "\n"
                + "Background: " + this.background + "\n"
                + "According to this calculator, I ended up with " + this.privilege + " estimated privilege points.";
    }
}
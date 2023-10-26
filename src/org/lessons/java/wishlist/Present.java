package org.lessons.java.wishlist;

public class Present {
    private String description;
    private String presentFor;

    public Present(String description, String presentFor) {
        this.description = description;
        this.presentFor = presentFor;
    }

    public String getDescription() {
        return description;
    }


    public String getPresentFor() {
        return presentFor;
    }

    @Override
    public String toString() {
        return "\nPresent: " + description + " " + "For: " + presentFor;
    }
}

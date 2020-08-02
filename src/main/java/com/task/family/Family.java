package main.java.com.task.family;

public class Family implements Comparable<Family> {
    private final String name;
    private final int quantityMember;
    private final String title;
    private final String nameOfEmblem;

    public Family(String name, String title, String nameOfEmblem, int quantityMember) {
        this.name = name;
        this.title = title;
        this.nameOfEmblem = nameOfEmblem;
        this.quantityMember = quantityMember;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public String getNameOfEmblem() {
        return nameOfEmblem;
    }

    public int getQuantityMember() {
        return quantityMember;
    }

    @Override
    public int compareTo(Family mapOfFamily) {
        if (this.name.equals(mapOfFamily.name)) {
            return 0;
        }
        if (mapOfFamily.name == null) {
            return 1;
        }
        return name.compareTo(mapOfFamily.name);
    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 37 * result + getTitle().hashCode();
        result = 37 * result + getQuantityMember();
        result = 37 * result + getNameOfEmblem().hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Family family = (Family) obj;

        if (!getName().equals(family.getName())) return false;
        if (getQuantityMember() != family.getQuantityMember()) return false;
        if (!getTitle().equals(family.getTitle())) return false;
        return getNameOfEmblem().equals(family.getNameOfEmblem());
    }

    @Override
    public String toString() {
        return "Family{" +
                "name='" + name + '\'' +
                ", quantityMember=" + quantityMember +
                ", title='" + title + '\'' +
                ", nameOfEmblem='" + nameOfEmblem + '\'' +
                '}';
    }
}
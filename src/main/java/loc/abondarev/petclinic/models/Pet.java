package loc.abondarev.petclinic.models;

/**
 * @author abondarev.
 * @since 30.10.2017.
 */
public abstract class Pet {

    public enum Type {
        CAT,
        DOG
    }

    private Type type;

    private String name;

    private String breed;

    private int age;

    public Pet(String name, Type type, String breed, int age) {
        this.name = name;
        this.type = type;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }
}

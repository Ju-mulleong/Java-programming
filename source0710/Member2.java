package source0710;

public record Member2(String id, String name, int age) {

    @Override
    public String toString() {
        return "Member: [" + id + ", " + name + ", "+ age + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Member target) {
            if(this.name.equals(target.name) &&
                    this.age == target.age)
                    return true;
        }
        return false;
    }
}

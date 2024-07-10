package source0710;

public class Member {
    public String name;
    public int id;

    public Member(String name) {
        this.name = name;
    }

    public Member(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Member target) {
                if(name.equals(target.name)) {
                    return true;
                }
        }
        return false;
    }

}

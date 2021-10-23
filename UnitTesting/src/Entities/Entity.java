package Entities;

public class Entity {
    private int id = 0;
    public Entity(){}
    public Entity(final int id){
        this.assignID(id);
    }
    public int getId(){return this.id;
    }
    public void setId(final int id){
        this.assignID(id);
    }
    public void assignID(final int id){
        if(this.id <= 0)
        this.id = id;
    }
}

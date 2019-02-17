package ua.lviv.iot.ShoesShop.manager;

public class Container<T> {
    private T object;

    public void set(T obj){
        this.object=obj;
    }

    public T getObject(){
        return this.object;
    }

}

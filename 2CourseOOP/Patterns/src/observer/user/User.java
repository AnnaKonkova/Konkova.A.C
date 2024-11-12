package observer.user;

import observer.interfaces.Observer;

public class User implements Observer {
    private final String name;

    public  User (String name){
        this.name =name;
    }
    @Override
    public void update(String task) {
        System.out.println("Ползователь" + name + " получил уведомление о новой задаче: " +task);
    }
}
